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

        questionList.add(new hEasyQ1_List("When did Japan seized the Philippines?", "1941", "1951", "1942", "1952", 1));
        questionList.add(new hEasyQ1_List("On what year did Ferdinand Marcos declare the Martial law?", "September 22, 1972", "September 22, 1971", "September 21, 1972", "September 21, 1971", 3));
        questionList.add(new hEasyQ1_List("On June 15, 1991, what volcano erupted?", "Bulkang Taal", "Mt. Kanlaon", "Bulkang Pinatubo", "Mayon Volcano", 3));
        questionList.add(new hEasyQ1_List("When did the assassination of Benigno Aquino Jr.?", "August 21, 1983", "August 22, 1983", "August 23, 1984", "August 23, 1985", 1));
        questionList.add(new hEasyQ1_List("Who led the EDSA Revolution on 1986?", "Juan Ponce Enrile", "Corazon Aquino", "Fidel V. Ramos", "Jaime Cardinal Sin", 2));
        questionList.add(new hEasyQ1_List("Who was elected president on 1944?", "Emilio Aguinaldo", "Manuel L Quezon", "Ferdinand Marcos", "Sergio Osmena", 4));
        questionList.add(new hEasyQ1_List("When did Ferdinand Magellan died?", "April 27, 1522", "April 28, 1522", "April 27, 1521", "April 28, 1521", 3));
        questionList.add(new hEasyQ1_List("The first agreement for peace in the Philippine happened when?", "June 7, 1564 ", "June 6, 1563", "June 5, 1566", "June 4, 1565", 4));
        questionList.add(new hEasyQ1_List("On February 19, 1897, the Battle of _____ happened.", "Lumang Bato", "Zapote Bridge", "Pinaglabanan", "Tejeros Convention", 2));
        questionList.add(new hEasyQ1_List("The Battle of Tirad pass happened during?", "December 2, 1899", "December 3, 1899", "December 4, 1899", "December 5, 1899", 1));
        questionList.add(new hEasyQ1_List("On March 17, 1957, which president died?", "Sergio Osmena", "Ferdinand Marcos", "Manuel Roxas", "Ramon Magsaysay", 4));
        questionList.add(new hEasyQ1_List("On February 9, 1986, how many computer technicians of the Commission of Elections walked out of their job?", "10", "17", "30", "27", 3));
        questionList.add(new hEasyQ1_List("When was the flag day proclaimed by the National Assembly?", "October 29, 1919", "October 31, 1919", "October 29, 1920", "October 31, 1920", 2));
        questionList.add(new hEasyQ1_List("On May 1, 1903, the first Labor day rally was organized by?", "Iglesia Filipina Independiente", "El Renacimiento", "Congreso Obrero de Filipinas", "Union Obrero Democratica de Filipinas", 4));
        questionList.add(new hEasyQ1_List("What law was signed by Theodore Roosevelt on March 25, 1934?", "Law on women’s suffrage", "Tagalog as official language", "Tydings-Mcduffie Law", "Pensionado Law", 3));
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
