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

public class hEasyQ3 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<hEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heasy_q3);

        question = findViewById(R.id.hEasyCurrentQ);
        QCount = findViewById(R.id.hEasy_qCount);
        timer = findViewById(R.id.hEasyTimer);

        option1 = findViewById(R.id.hEasy3_OptionA);
        option2 = findViewById(R.id.hEasy3_OptionB);
        option3 = findViewById(R.id.hEasy3_OptionC);
        option4 = findViewById(R.id.hEasy3_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getHistEasyQuestions();

        hScore = 0;
    }

    private void getHistEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new hEasyQ1_List("Sino ang utak ng Katipunan?", "A. Jose Rizal", "B. Andres Bonifacio", "C. Emilio Jacinto", "D. Marcelo del Pilar", 3));
        questionList.add(new hEasyQ1_List("Sino ang nag pinta ng 'Spolarium' ", "A. Juan Luna", "B. Ang Kiukok", "C. Fernando Amorsolo", "D. Delfina Herbosa de Natividad", 1));
        questionList.add(new hEasyQ1_List("Sino ang sumulat ng Lupang  Hinirang?", "A. Apolinario Mabini", "B. Emilio Aguinaldo", "C. Juan Felipe", "D. Marcela Mariño Agoncillo ", 3));
        questionList.add(new hEasyQ1_List("Kailan nangyari ang Peoples’ Power Revolution?", "A. February 9-11, 1986 ", "B. February 22-25, 1986 ", "C. February 26-28, 1986", "D. February 6-9, 1986", 2));
        questionList.add(new hEasyQ1_List("It is the date which marked the Philippine Independence Day when Emilio Aguinaldo waved the Philippine Flag for the first time in Kawit, Cavite.", "A. June 12, 1896 ", "B. June 12, 1899 ", "C. June 12, 1895", "D. June 12, 1898", 4));
        questionList.add(new hEasyQ1_List("The Fall of Bataan which we celebrate every 9th of April is also regarded as _________.", "A. Araw ng Kabayanihan", "B. Araw ng Kagitingan", "C. Araw ng Katapangan", "D. Araw ng mga Bayani", 2));
        questionList.add(new hEasyQ1_List("Where was the Rizal's novel 'Noli Mi Tangere' published?", "A. Berlin", "B. Barcelona", "C. Philippines", "D. Paris", 1));
        questionList.add(new hEasyQ1_List("One of Dr. Jose Rizal's objective as a propagandist is the assimilation of the Philippines to Spain.", "A. Misleading", "B. True", "C. Fake News", "D. False", 2));
        questionList.add(new hEasyQ1_List("The battle fought on 1 May 1898 between American and Spanish forces during the Spanish-American War. It is also known as the Battle of Cavite.", "A. Battle of Corregidor", "B. Battle of Bacoor", "C. Battle of Manila Bay", "D. Battle of Imus", 3));
        questionList.add(new hEasyQ1_List("Katipunan literally means:", "A. Kataastaasang kagalanggalangang Katipunan ng mga anak ng pawis", "B. Kataastaasang kagalanggalangang Katipunan ng mga anak ng Pilipinas", "C. Kataastaasang kagalanggalangang Katipunan ng mga anak ng kapatiran", "D. Kataastaasang kagalanggalangang Katipunan ng mga anak ng bayan", 4));

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
            case R.id.hEasy3_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hEasy3_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hEasy3_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hEasy3_OptionD:
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
            Intent intent = new Intent(hEasyQ3.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //hEasyQ3.this.finish();
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
