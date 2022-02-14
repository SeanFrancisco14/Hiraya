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

public class cMedQ4 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmed_q4);

        question = findViewById(R.id.cMedCurrentQ);
        QCount = findViewById(R.id.cMed_qCount);
        timer = findViewById(R.id.cMedTimer);

        option1 = findViewById(R.id.cMed4_OptionA);
        option2 = findViewById(R.id.cMed4_OptionB);
        option3 = findViewById(R.id.cMed4_OptionC);
        option4 = findViewById(R.id.cMed4_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("It is known as the City of Smiles.", "Bacolod", "Cebu", "Zamboanga", "Zambales", 1));
        questionList.add(new cEasyQ1_List("This is Luzon’s summer capital. ", "Zambales", "Tarlac", "Baguio", "Quezon", 3));
        questionList.add(new cEasyQ1_List("Hailed as the Queen City of the South.", "Navotas", "Marikina", "Makati", "Cebu", 4));
        questionList.add(new cEasyQ1_List("Cagayan De Oro is known for _______.", "City of New Shoes", "City of Golden Friendships", "City of hot balloon", "City of Art", 2));
        questionList.add(new cEasyQ1_List("This is the Asia’s Latin’s City.", "Angono", "Navotas", "Capiz", "Zamboanga", 4));
        questionList.add(new cEasyQ1_List("Angono is known for being the ______. ", "Art Capital of the Philippines", "Whale Capital of the Philippines", "Fishing Capital of the Philippines", "Bangus Capital of the Philippines", 1));
        questionList.add(new cEasyQ1_List("Cadiz is know for being the city of ____. ", "Whales", "Bangus", "Whale Shark", "Tilapia", 1));
        questionList.add(new cEasyQ1_List("What is known for being the Pearl of the Orient.", "Cebu City", "Zamboanga", "Bataan", "Manila", 4));
        questionList.add(new cEasyQ1_List("What is the Fishing Capital of the Philippines", "Marikina", "Quezon", "Navotas", "Nueva Ecija", 3));
        questionList.add(new cEasyQ1_List("Marikina is the _______.", "Bangus capital of the Philippines", "Shoe capital of the Philippines", "Food capital of the Philippines", "Business capital of the Philippines", 2));
        questionList.add(new cEasyQ1_List("What is known for being the Business capital of the Philippines.", "Makati", "Marikina", "Quezon", "Laguna", 1));
        questionList.add(new cEasyQ1_List("Imus is known for being the ___ capital of the Philippines.", "Slippers", "Art", "Flag", "Narra ", 3));
        questionList.add(new cEasyQ1_List("Where is the whale shark capital of the world?", "Donsol", "Iba", "Tondo", "Bangsamoro", 1));
        questionList.add(new cEasyQ1_List("Known for being the Bangus capital of the Philippines", "Pangasinan", "Navotas", "icol", "Palawan", 1));
        questionList.add(new cEasyQ1_List("It is the Islamic City of the Philippines.", "Zamboanga", "Davao", "Marawi", "General Santos", 3));

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
            case R.id.cMed4_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed4_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed4_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed4_OptionD:
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
            cScore++;
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
            Intent intent = new Intent(cMedQ4.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cMedQ4.this.finish();
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
