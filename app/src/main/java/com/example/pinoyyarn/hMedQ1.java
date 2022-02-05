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

public class hMedQ1 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<hEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmed_q1);

        question = findViewById(R.id.hMedCurrentQ);
        QCount = findViewById(R.id.hMed_qCount);
        timer = findViewById(R.id.hMedTimer);

        option1 = findViewById(R.id.hMed1_OptionA);
        option2 = findViewById(R.id.hMed1_OptionB);
        option3 = findViewById(R.id.hMed1_OptionC);
        option4 = findViewById(R.id.hMed1_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getHistEasyQuestions();

        hScore = 0;
    }

    private void getHistEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new hEasyQ1_List("The president who passed RA 6657 or the Comprehensive Agrarian Reform Law.", "Corazon C. Aquino", "Fidel V. Ramos", "Elpidio R. Quirino", "Ferdinand Marcos", 1));
        questionList.add(new hEasyQ1_List("When were the 24-hour nationwide emergency hotlines launched?", "July 30, 2016", "August 1, 2016", "July 29, 2016", "August 5, 2016", 2));
        questionList.add(new hEasyQ1_List("The Bataan Death March took place in what year?", "1890", "1950", "1950", "1942", 4));
        questionList.add(new hEasyQ1_List("Which of these is not true of the La Solidaridad?", "It was the official organ of the reform movement.", "It was a vehicle for the expression of the political views of the reformers.", "It featured articles about the good deeds of the friars.", "It was a forum for discussion of the issues concerning the Philippines.", 3));
        questionList.add(new hEasyQ1_List("When did Corregidor fall into the hands of the Japanese?", "March 5, 1942", "April 9, 1942", "January 2, 1942", "May 6, 1942", 4));
        questionList.add(new hEasyQ1_List("The first real battle fought between Filipinos and the Spaniards is known as:", "San Juan Del Monte", "Pugad Lawin", "Majayjay", "Pinaglabanan", 1));
        questionList.add(new hEasyQ1_List("In what year did the Portuguese explorer Ferdinand Magellan arrive in the shores of Philippines?", "1420", "1621", "1521", "1528", 3));
        questionList.add(new hEasyQ1_List("He was one of the heroes of the Battle of Hill Eerie during the Korean War as a young lieutenant and later served as a President of the Philippines", "Fidel V. Ramos ", "Benigno Aquino III", "Rodrigo Duterte", "Ferdinand Marcos", 2));
        questionList.add(new hEasyQ1_List("He was a former President of the USA who appointed General MacArthur to rule and govern the Philippines.", "Dwight D. Eisenhower", "Franklin D. Roosevelt", "William Howard Taft", "George Washington", 3));
        questionList.add(new hEasyQ1_List("The date when the Philippines won over the arbitration case regarding the West Philippine Sea on the Permanent Court of Arbitration against China.", "July 13, 2016", "July 11, 2016", "July 14, 2016", "July 12, 2016", 4));
        questionList.add(new hEasyQ1_List("Who are the Malay?", "Americans who founded settlements in the Philippines", "Austronesian people inhabiting the Malay Peninsula’10", "Anglo-Saxon women who traded with natives", "Spaniards who founded settlements in the Philippines", 2));
        questionList.add(new hEasyQ1_List("Who is  the 9th vice President of the Philippines?", "Corazon C. Aquino", "Diosdado Macapagal Jr.", "Elpidio R. Quirino", "Ferdinand Marcos", 2));
        questionList.add(new hEasyQ1_List("It is the first political party in the Philippines", "Federal Party", "Makabayan Party", "Nacionalista Party", "Liberal Party", 1));
        questionList.add(new hEasyQ1_List("What was the password used for the codes of 'Katipon'?", "Rizal", "Gomburza", "Anak ng Bayan", "Katipunan", 3));
        questionList.add(new hEasyQ1_List("Ang namuno sa pinakamatagal na pag-aalsa ay si:", "Gregorio del Pilar", "Diego Silang", "Hermano Pule", "Francisco Dagohoy", 4));
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
            case R.id.hMed1_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed1_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed1_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed1_OptionD:
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
            Intent intent = new Intent(hMedQ1.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //hMedQ1.this.finish();
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
