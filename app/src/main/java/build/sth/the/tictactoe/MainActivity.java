package build.sth.the.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private boolean playerOneTurn = true;
    private static final String PLAYER_ONE_TURN = "Player 1 turn";
    private static final String PLAYER_TWO_TURN = "Player 2 turn";
    private static final String PLAYER_ONE_WINS = "Player 1 Wins";
    private static final String PLAYER_TWO_WINS = "Player 2 wins";
    private static final int ANIMATION_DURATION = 1000;
    TextView tvMessage;
    boolean gameOver = false;

    private boolean checkHorizonalMatching(final int boxId , final int color) {
        switch (boxId) {

            /**
             * Create scenario for each box and then also create vertical and diagnol scenarios
             */
            case R.id.iv11:
                ImageView iv12 = (ImageView) findViewById(R.id.iv12);
                ImageView iv13 = (ImageView) findViewById(R.id.iv13);
                if(!iv12.isClickable() && !iv13.isClickable() && (int) iv12.getTag() == color && (int) iv13.getTag() == color)
                {
                    return true;
                }
                break;
        }

        return false;

    }

    public void play(View view) {
        if(gameOver) {
            return ;
        }

        switch (view.getId()) {
            case R.id.iv11:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    if(checkHorizonalMatching(R.id.iv11 , R.drawable.red)) {
                        tvMessage.setText(PLAYER_ONE_WINS);
                        gameOver = true;
                        return;
                    }
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;

            case R.id.iv12:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;

            case R.id.iv13:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;

            case R.id.iv21:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;

            case R.id.iv22:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;

            case R.id.iv23:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;

            case R.id.iv31:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;

            case R.id.iv32:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;

            case R.id.iv33:
                if (playerOneTurn) {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.red);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.red);
                    tvMessage.setText(PLAYER_TWO_TURN);
                    playerOneTurn = false;
                } else {
                    ImageView iv =(ImageView) view;
                    iv.setImageResource(R.drawable.yellow);
                    iv.animate().alpha(1.0f).setDuration(ANIMATION_DURATION);
                    iv.setClickable(false);
                    iv.setTag(R.drawable.yellow);
                    tvMessage.setText(PLAYER_ONE_TURN);
                    playerOneTurn = true;
                }
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = (TextView) findViewById(R.id.tvMessage);
    }
}
