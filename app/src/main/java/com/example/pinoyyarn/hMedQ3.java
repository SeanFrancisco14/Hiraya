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

public class hMedQ3 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<hEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmed_q3);

        question = findViewById(R.id.hMedCurrentQ);
        QCount = findViewById(R.id.hMed_qCount);
        timer = findViewById(R.id.hMedTimer);

        option1 = findViewById(R.id.hMed3_OptionA);
        option2 = findViewById(R.id.hMed3_OptionB);
        option3 = findViewById(R.id.hMed3_OptionC);
        option4 = findViewById(R.id.hMed3_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getHistEasyQuestions();

        hScore = 0;
    }

    private void getHistEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new hEasyQ1_List("He is the first president from Pampanga who served during 1961-1965.", "A. Manuel Quezon", "B. Benigno Aquino III", "C. Benigno Aquino Jr.", "D. Diosdado Macapagal", 4));
        questionList.add(new hEasyQ1_List("He served as the 6th Vice President of the Philippines during 1961-1965.", "A. Emmanuel Neri Pelaez", "B. Fernando Lopez", "C. Joseph Estrada", "D. Salvador Laurel", 1));
        questionList.add(new hEasyQ1_List("She is the first female president of the Philippines.", "A. Leni Robredo", "B. Gloria Macapagal Arroyo", "C. Corazon Aquino", "D. Gabriela Silang", 3));
        questionList.add(new hEasyQ1_List("First president who previously served in the Supreme Court of the Philippines as Associate Justice.", "A. Sergio Osmena", "B. Jose P. Laurel", "C. Ramon Magsaysay", "D. Carlos P. Garcia", 2));
        questionList.add(new hEasyQ1_List("He is the first president to wear barong tagalog while taking their oath of office.", "A. Sergio Osmena", "B. Jose P. Laurel", "C. Ramon Magsaysay", "D. Carlos P. Garcia", 3));
        questionList.add(new hEasyQ1_List("He served as the 11th Vice President of the Philippines during 2001-2004.", "Teofisto Guingona Jr.", "B. Noli de Castro", "C. Fernando Lopez", "D. Emmanuel Pelaez", 1));
        questionList.add(new hEasyQ1_List("He is the 2nd vice president of the Philippines and the 6th president of the Philippines.", "A. Elpidio Quirino", "B. Emilio Aguinaldo", "C. Manuel Quezon", "D. Sergio Osmena", 1));
        questionList.add(new hEasyQ1_List("She is the 14th vice president of the Philippines who is the second woman who served as the vice president of the Philippines.", "A. Gloria Macapagal Arroyo", "B. Corazon Aquino", "C. Gabriela Silang", "D. Leni Robredo", 4));
        questionList.add(new hEasyQ1_List("First president to be non-catholic and a protestant.", "A. Rodrigo Duterte", "B. Fidel Ramos", "C. Diosdado Macapagal", "D. Elpidio Quirino", 2));
        questionList.add(new hEasyQ1_List("He is the 8th vice president of the Philippines who is a major leader of the United Nationalist Democratic Organization.", "A. Fernando Lopez", "B. Carlos P. Garcia", "C. Salvador Laurel", "D. Jejomar Binay", 3));
        questionList.add(new hEasyQ1_List("He is the first president who was an actor and undergone an impeachment trial.", "Carlos P. Garcia", "B. Ramon Magsaysay", "C. Diosdado Macapagal", "D. Joseph Estrada", 4));
        questionList.add(new hEasyQ1_List("First President to be a bachelor and childless while in office.", "A. Rodrigo Duterte", "B. Ferdinand Marcos", "C. Benigno Aquino III", "D. Manuel Roxas", 3));
        questionList.add(new hEasyQ1_List("He is the 12th vice president under Gloria Macapagal Arroyo.", "A. Jejomar Binay", "B. Noli de Castro", "C. Salvador Laurel", "D. Fernando Lopez", 2));
        questionList.add(new hEasyQ1_List("First president who met Pope Pius XII and a representative of Ilocos Sur from 1919 to 1925..", "A. Manuel Roxas", "B. Fernando Lopez", "C. Jose P. Laurel", "D. Elpidio Quirino", 4));
        questionList.add(new hEasyQ1_List("The second president and the first president who was a lawyer.", "A. Manuel Quezon", "B. Manuel Roxas", "C. Carlos Garcia", "D. Jose Laurel", 1));

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
            case R.id.hMed3_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed3_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed3_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed3_OptionD:
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
            Intent intent = new Intent(hMedQ3.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //hMedQ3.this.finish();
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
