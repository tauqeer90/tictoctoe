package build.sth.the.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String PLAYER_ONE_TURN = "Player 1 turn";
    private static final String PLAYER_TWO_TURN = "Player 2 turn";
    private static final String PLAYER_ONE_WINS = "Player 1 Wins";
    private static final String PLAYER_TWO_WINS = "Player 2 wins";
    private static final String GAME_DRAWN = "Game Drawn";
    private static final int ANIMATION_DURATION = 1000;
    TextView tvMessage;
    GridLayout gridLayout;
    Button btnRestart;
    int countTurn = 0;

    int[] gameState = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 };

    /**
     * 1 for player 1: red
     * 2 for player 2: yellow
     */
    private int gameTurn = 1;

    private int[][] winCombinations = {{0 , 1 , 2} , {3 , 4 , 5} , {6 , 7 , 8 } , {0 , 3 , 6},
            {1 , 4 , 7} , {2 , 5 , 8} , {0, 4 , 8} , {2 , 4, 6}} ;

    private boolean checkWinner() {

        for(int[] combination: winCombinations) {
            if(gameState[combination[0]] == gameTurn && gameState[combination[1]] == gameTurn
                    && gameState[combination[2]] == gameTurn && gameState[combination[0]] != 0){
                gridLayout.setAlpha(0.2f);
                btnRestart.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                btnRestart.animate().rotation(3600).setDuration(ANIMATION_DURATION);
                return true;
            }
        }
        return false;
    }

    private boolean checkDraw() {
        if(countTurn == 9) {
            gridLayout.setAlpha(0.2f);
            btnRestart.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
            btnRestart.animate().rotation(3600).setDuration(ANIMATION_DURATION);
            return true;
        }

        return false;
    }
    public void restart(View view) {
        this.recreate();
    }

    public void play(View view) {
        ImageView iv = (ImageView) view;
        countTurn++;

        if(gameTurn == 1) {
            iv.setImageResource(R.drawable.red);
            iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
            iv.setClickable(false);

            gameState[Integer.valueOf((String)iv.getTag())] = gameTurn;
            if (checkWinner()) {
                tvMessage.setText(PLAYER_ONE_WINS);
                return;
            }

            if (checkDraw()) {
                tvMessage.setText(GAME_DRAWN);
                return;
            }
            tvMessage.setText(PLAYER_TWO_TURN);
            gameTurn = 2;
        } else {
            iv.setImageResource(R.drawable.yellow);
            iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
            iv.setClickable(false);
            gameState[Integer.valueOf((String)iv.getTag())] = gameTurn;
            if (checkWinner()) {
                tvMessage.setText(PLAYER_TWO_WINS);
                return;
            }

            if (checkDraw()) {
                tvMessage.setText(GAME_DRAWN);
                return;
            }

            tvMessage.setText(PLAYER_ONE_TURN);
            gameTurn = 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = (TextView) findViewById(R.id.tvMessage);
        gridLayout = (GridLayout) findViewById(R.id.gvBoard);
        btnRestart = (Button) findViewById(R.id.btnRestart);
    }
}
