package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class cEasyQ3 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasy_q3);

        question = findViewById(R.id.cEasyCurrentQ);
        QCount = findViewById(R.id.cEasy_qCount);
        timer = findViewById(R.id.cEasyTimer);

        option1 = findViewById(R.id.cEasy3_OptionA);
        option2 = findViewById(R.id.cEasy3_OptionB);
        option3 = findViewById(R.id.cEasy3_OptionC);
        option4 = findViewById(R.id.cEasy3_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("It is a sea serpent deity of Bicolano and Visayan origin.", "Bakunawa", "Kapre", "Dalikamata", "Manananggal", 1));
        questionList.add(new cEasyQ1_List("It is a vampire like creature that’s is capable of severing its upper torso and lower torso.", "Dalikamata", "Bakunawa", "Manananggal", "Kapre", 3));
        questionList.add(new cEasyQ1_List("It is said to have a long, stretched human limbs and the head of a horse.", "Manananggal", "Tikbalang", "Lakapati", "Berbalang", 2));
        questionList.add(new cEasyQ1_List("They are ghoul-like creatures who lurk in graveyards to feast on the blood of corpses.", "Lakapati", "Multo", "Dalikamata", "Berbalang", 4));
        questionList.add(new cEasyQ1_List("This is considered as a multo, usually seen in the Balete drive in Quezon City.", "Dalikamata", "Mangkukulam", "White Lady", "Tikbalang", 3));
        questionList.add(new cEasyQ1_List("It is a one-eyed creature with huge upper lips, humongous teeth and tusk that resembles those of an elephant.", "Manananggal", "Bungisngis", "Amomongo", "Kapre", 2));
        questionList.add(new cEasyQ1_List("They aren’t frightening but they shouldn’t be taken lightly, an example of it is Mariang Makiling.", "Amomongo", "White Lady", "Lakapati", "Diwata", 4));
        questionList.add(new cEasyQ1_List("This is closely associated with the province of Capiz, they consume the innards of a cadaver.", "Aswang", "Multo", "Amomongo", "Lakapati", 1));
        questionList.add(new cEasyQ1_List("It was a harvest deity from the Tagalog pantheon and a symbol of fertility.", "Amomongo", "Lakapati", "Berbalang", "Diwata", 2));
        questionList.add(new cEasyQ1_List("She is said to have a thousands of eyes all over her body and a goddess who can heal.", "Lakapati", "Dalikamata", "Berbalang", "Kapre", 2));

        setQuestion();
    }

    private void setQuestion() {
        timer.setText(String.valueOf(10));

        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOptionA());
        option2.setText(questionList.get(0).getOptionB());
        option3.setText(questionList.get(0).getOptionC());
        option4.setText(questionList.get(0).getOptionD());

        QCount.setText(String.valueOf(1) + "/" + String.valueOf(questionList.size()));

        qNum = 0;
        startTimer();
    }

    private void startTimer() {
        countDown = new CountDownTimer(12000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (millisUntilFinished < 10000) {
                    timer.setText(String.valueOf(millisUntilFinished / 1000));
                }
                if (millisUntilFinished <= 4000) {
                    timer.setTextColor(ColorStateList.valueOf(Color.RED));
                } else {
                    timer.setTextColor(ColorStateList.valueOf(Color.BLACK));
                }
            }

            @Override
            public void onFinish() {
                changeQuestion();
            }
        };
        countDown.start();
    }

    @Override
    public void onClick(View v) {
        int selectedOption = 0;

        switch (v.getId()) {
            case R.id.cEasy3_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cEasy3_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cEasy3_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cEasy3_OptionD:
                selectedOption = 4;
                break;
            default:
        }
        countDown.cancel();
        checkAnswer(selectedOption, v);
    }

    private void checkAnswer(int selectedOption, View view) {
        if (selectedOption == questionList.get(qNum).getCorrectAns()) {
            ((Button) view).setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            cScore++;
        } else {
            ((Button) view).setBackgroundTintList(ColorStateList.valueOf(Color.RED));

            switch (questionList.get(qNum).getCorrectAns()) {
                case 1:
                    option1.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 2:
                    option2.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 3:
                    option3.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 4:
                    option4.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
            }

        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeQuestion();
            }
        }, 1500);
    }

    private void changeQuestion() {
        if (qNum < questionList.size() - 1) {
            qNum++;

            playAnim(question, 0, 0);
            playAnim(option1, 0, 1);
            playAnim(option2, 0, 2);
            playAnim(option3, 0, 3);
            playAnim(option4, 0, 4);

            QCount.setText(String.valueOf(qNum + 1) + "/" + String.valueOf(questionList.size()));

            timer.setText(String.valueOf(10));
            startTimer();
        } else {
            Intent intent = new Intent(cEasyQ3.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cEasyQ3.this.finish();
        }
    }

    private void playAnim(View view, final int value, int viewNum) {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(250)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator()).
                setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        if (value == 0) {
                            switch (viewNum) {
                                case 0:
                                    ((TextView) view).setText(questionList.get(qNum).getQuestion());
                                    break;
                                case 1:
                                    ((Button) view).setText(questionList.get(qNum).getOptionA());
                                    break;
                                case 2:
                                    ((Button) view).setText(questionList.get(qNum).getOptionB());
                                    break;
                                case 3:
                                    ((Button) view).setText(questionList.get(qNum).getOptionC());
                                    break;
                                case 4:
                                    ((Button) view).setText(questionList.get(qNum).getOptionD());
                                    break;
                            }

                            if (viewNum != 0) {
                                ((Button) view).setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                            }

                            playAnim(view, 1, viewNum);
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        countDown.cancel();
    }
}