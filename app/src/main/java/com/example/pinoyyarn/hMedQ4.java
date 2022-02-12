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

public class hMedQ4 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<hEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmed_q4);

        question = findViewById(R.id.hMedCurrentQ);
        QCount = findViewById(R.id.hMed_qCount);
        timer = findViewById(R.id.hMedTimer);

        option1 = findViewById(R.id.hMed4_OptionA);
        option2 = findViewById(R.id.hMed4_OptionB);
        option3 = findViewById(R.id.hMed4_OptionC);
        option4 = findViewById(R.id.hMed4_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getHistEasyQuestions();

        hScore = 0;
    }

    private void getHistEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new hEasyQ1_List("The president who passed RA 6657 or the Comprehensive Agrarian Reform Law.", "Corazon Aquino", "Fidel Ramos", "Elpidio Quirino", "Ferdinand Marcos", 1));
        questionList.add(new hEasyQ1_List("The Bataan Death March took place in what year?", "1890", "1942", "1950", "1988", 2));
        questionList.add(new hEasyQ1_List("Which of these is not true of the La Solidaridad?", "It was a forum for discussion of the issues concerning the Philippines.", "It was the official organ of the reform movement.", "It was a vehicle for the expression of the political views of the reformers.", "It featured articles about the good deeds of the friars.", 4));
        questionList.add(new hEasyQ1_List("When did Corregidor fall into the hands of the Japanese?", "March 5, 1942", "April 9, 1942", "May 6, 1942", "January 2, 1942", 3));
        questionList.add(new hEasyQ1_List("The first real battle fought between Filipinos and the Spaniards is known as:", "Majayjay", "Pugad Lawin", "Pinaglabanan", "San Juan Del Monte", 4));
        questionList.add(new hEasyQ1_List("In what year did the Portuguese explorer Ferdinand Magellan arrive in the shores of Philippines?", "1521", "1420", "1621", "1528", 1));
        questionList.add(new hEasyQ1_List("When were the 24-hour nationwide emergency hotlines launched?", "July 30, 2016", "August 1, 2016", "July 29, 2016", "August 5, 2016", 2));
        questionList.add(new hEasyQ1_List("He was one of the heroes of the Battle of Hill Eerie during the Korean War as a young lieutenant and later served as a President of the Philippines", "Rodrigo Duterte", "Benigno Aquino III", "Fidel V. Ramos ", "Ferdinand Marcos", 3));
        questionList.add(new hEasyQ1_List("He was a former President of the USA who appointed General MacArthur to rule and govern the Philippines.", "Dwight D. Eisenhower", "Franklin D. Roosevelt", "George Washington", "William Howard Taft", 4));
        questionList.add(new hEasyQ1_List("The date when the Philippines won over the arbitration case regarding the West Philippine Sea on the Permanent Court of Arbitration against China.", "July 13, 2016", "July 11, 2016", "July 12, 2016", "July 14, 2016", 3));
        questionList.add(new hEasyQ1_List("What Treaty of Paris involved Spain seceding most of its territories to United States?", "Treaty of Paris of 1898", "Treaty of Paris of 1763", "Treaty of Paris of 1919", "Treaty of Paris of 1963", 1));
        questionList.add(new hEasyQ1_List("The eight rays represent eight provinces which revolted against the Spaniards. Which among the following is not included to those provinces?", "Cavite", "Bataan", "Nueva Ecija", "Tarlac", 2));
        questionList.add(new hEasyQ1_List("It is one of the pseudonyms of Dr. Jose Rizal.", "Plaridel", "Magdalo", "Hermano Pule", "Laong-laan", 4));
        questionList.add(new hEasyQ1_List("The former President of the US who supported the Tydings-Mcduffie Act of 1934.", "Dwight D. Eisenhower", "Franklin D. Roosevelt", "George Washington", "William Howard Taft", 2));
        questionList.add(new hEasyQ1_List("Written on this famous work by Emilio Jacinto are the fundamental teachings of the Katipunan.", "La Epseranza", "Diariong Tagalog", "Kartilya", "La Solidaridad", 3));
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
            case R.id.hMed4_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed4_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed4_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hMed4_OptionD:
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
            Intent intent = new Intent(hMedQ4.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //hMedQ4.this.finish();
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
