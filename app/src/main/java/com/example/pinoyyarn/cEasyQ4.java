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

public class cEasyQ4 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasy_q4);

        question = findViewById(R.id.cEasyCurrentQ);
        QCount = findViewById(R.id.cEasy_qCount);
        timer = findViewById(R.id.cEasyTimer);

        option1 = findViewById(R.id.cEasy4_OptionA);
        option2 = findViewById(R.id.cEasy4_OptionB);
        option3 = findViewById(R.id.cEasy4_OptionC);
        option4 = findViewById(R.id.cEasy4_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("This superstition says that you should go somewhere else before going home after you went to a wake.", "Tao po!", "Sukob", "Pagpag", "Tabi tabi po!", 3));
        questionList.add(new cEasyQ1_List("A common line used by Filipinos when knocking someone’s door that is used to make sure that the person inside is a real person.", "Sukob!", "Tao po!", "Tabi tabi po!", "Pagpag!", 2));
        questionList.add(new cEasyQ1_List("This superstition advises against siblings marrying within the same year as it said to divide the luck between the two marriages.", "Pagpag", "Tabi tabi po!", "Sukob", "Tao po!", 3));
        questionList.add(new cEasyQ1_List("Complete the sentence ‘Kapag naggupit ng kuko sa gabi, may ___ na mahal sa buhay.’.", "Mabubuntis", "Mamamatay", "Babagsak sa pagsusulit", "Malulunod", 2));
        questionList.add(new cEasyQ1_List("Complete the sentence ‘Kung namatay sa sanhi na krimen, nilalagyan ng ______ ang ibabaw ng kabaong.’.", "Pera", "Bulaklak", "Bigas", "Sisiw", 4));
        questionList.add(new cEasyQ1_List("What do you offer to the ‘lamang lupa’ if you disturb them?", "Food", "Money", "Wine", "Alive pig", 1));
        questionList.add(new cEasyQ1_List("We believe that a black cat is?", "Lucky", "Unlucky", "Sign for money", "Sign to pass exams", 2));
        questionList.add(new cEasyQ1_List("What is the number that is believed to be unlucky?", "88", "6", "13", "24", 3));
        questionList.add(new cEasyQ1_List("If you had a bad dream, you should bite a _____?", "Bark of a tree", "Skin of the person next to you", "Pillow", "Fingernails", 1));
        questionList.add(new cEasyQ1_List("Complete the sentence ‘May kinakasal na ______ kapag umaaraw at umuulang nang sabay.’.", "Mangkukulam", "Multo", "Berbalang", "Tikbalang", 4));
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
            case R.id.cEasy4_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cEasy4_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cEasy4_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cEasy4_OptionD:
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
            Intent intent = new Intent(cEasyQ4.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cEasyQ4.this.finish();
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