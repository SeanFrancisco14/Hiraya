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

public class LEasyQ2 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<LEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leasy_q2);

        question = findViewById(R.id.LEasyCurrentQ);
        QCount = findViewById(R.id.LEasy_qCount);
        timer = findViewById(R.id.LEasyTimer);

        option1 = findViewById(R.id.LEasy2_OptionA);
        option2 = findViewById(R.id.LEasy2_OptionB);
        option3 = findViewById(R.id.LEasy2_OptionC);
        option4 = findViewById(R.id.LEasy2_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getLanEasyQuestions();

        hScore = 0;
    }

    private void getLanEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘electricity or spark’. ", "Tagitab", "Dagitab", "Dagatab", "Dugitab", 2));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘last farewell’", "Pakimas", "Pahikimas", "Pahikamas", "Pahukamis", 3));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘Calendar’", "Talarawan", "Talaaraw-araw", "Talaaraw", "Talaarawan", 4));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘Agriculture’.", "Dalsakahan", "Dalubsakahan", "Dalubdubsaka", "Dalubsakasaka", 2));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘Charger’. ", "Pantablay", "Pantabla", "Panablay", "Pantabay", 1));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘Morning’. ", "Liwayway", "Bukhang Liwayway", "Bukang Liwayway", "Bukay Liwliway", 3));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘Faucet’", "Batalaan", "Bataan", "Baatan", "Batalan", 4));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘Someone you’re talking too”.", "Kalipun", "Kalipon", "Kulipon", "Kulipun", 2));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘Integer’", "Buongbilang", "Bumbilang", "Buumbilang", "Buobilang", 3));
        questionList.add(new LEasyQ1_List("Pick the right correct spelling for ‘to continue’.", "Padayon", "Padahyun", "Padayun", "Padayeon", 1));

        setQuestion();
    }

    private void setQuestion(){
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

    private void startTimer(){
        countDown = new CountDownTimer(12000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished < 10000){
                    timer.setText(String.valueOf(millisUntilFinished/ 1000));}
                if(millisUntilFinished <= 4000){
                    timer.setTextColor(ColorStateList.valueOf(Color.RED));
                }
                else
                {
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

        switch(v.getId()){
            case R.id.LEasy2_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LEasy2_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LEasy2_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LEasy2_OptionD:
                selectedOption =4;
                break;
            default:
        }
        countDown.cancel();
        checkAnswer(selectedOption, v);
    }

    private void checkAnswer(int selectedOption, View view){
        if(selectedOption == questionList.get(qNum).getCorrectAns()){
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            hScore++;
        }
        else{
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.RED));

            switch (questionList.get(qNum).getCorrectAns()){
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

    private void changeQuestion(){
        if(qNum < questionList.size() - 1){
            qNum++;

            playAnim(question, 0, 0);
            playAnim(option1, 0, 1);
            playAnim(option2, 0, 2);
            playAnim(option3, 0, 3);
            playAnim(option4, 0, 4);

            QCount.setText(String.valueOf(qNum + 1) + "/" + String.valueOf(questionList.size()));

            timer.setText(String.valueOf(10));
            startTimer();
        }
        else{
            Intent intent = new Intent(LEasyQ2.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //LEasyQ2.this.finish();
        }
    }

    private void playAnim(View view, final int value, int viewNum){
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(250)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator()).
                setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        if(value == 0){
                            switch (viewNum){
                                case 0:
                                    ((TextView)view).setText(questionList.get(qNum).getQuestion());
                                    break;
                                case 1:
                                    ((Button)view).setText(questionList.get(qNum).getOptionA());
                                    break;
                                case 2:
                                    ((Button)view).setText(questionList.get(qNum).getOptionB());
                                    break;
                                case 3:
                                    ((Button)view).setText(questionList.get(qNum).getOptionC());
                                    break;
                                case 4:
                                    ((Button)view).setText(questionList.get(qNum).getOptionD());
                                    break;
                            }

                            if (viewNum != 0){
                                ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
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
