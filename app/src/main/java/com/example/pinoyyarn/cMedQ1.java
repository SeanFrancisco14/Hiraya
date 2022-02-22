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

public class cMedQ1 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmed_q1);

        question = findViewById(R.id.cMedCurrentQ);
        QCount = findViewById(R.id.cMed_qCount);
        timer = findViewById(R.id.cMedTimer);

        option1 = findViewById(R.id.cMed1_OptionA);
        option2 = findViewById(R.id.cMed1_OptionB);
        option3 = findViewById(R.id.cMed1_OptionC);
        option4 = findViewById(R.id.cMed1_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("A series of recordings made on music played on the spot and has to be performed once.", "Primal Music", "Gong Music", "Indigenous Music", "Rondalla Music", 1));
        questionList.add(new cEasyQ1_List("Racked gong chime instrument played in the southern islands of the Philippines.", "Gangsa", "Kulintang", "Rondalla", "Tinikling", 2));
        questionList.add(new cEasyQ1_List("Rooted in the Mexican-Spanish tradition and based on the rhythmic patterns of the habanera.", "Gangsa", "Harana", "Kundiman", "Rondalla", 2));
        questionList.add(new cEasyQ1_List("He is known for the witty song ‘Butse Kik’.", "Willie Revillame", "Rey Valera", "Yoyoy Villame", "Ely Buendia", 3));
        questionList.add(new cEasyQ1_List("His songs are ‘Maging Sino Ka Man’, ‘Pangako Sa’yo’, ‘Kahit Wala Ka Na’ and many more.", "Willie Revillame", "Rey Valera", "Yoyoy Villame", "Ely Buendia", 2));
        questionList.add(new cEasyQ1_List("He has 39 Albums and won the Awit Award for the ‘Best Male Performer’ 12 times.", "Ely Buendia", "Gary Valenciano", "Ryan Cayabyab", "Ogie Alcasid", 2));
        questionList.add(new cEasyQ1_List("What is the term that gave rise to songs using colloquial language?", "Manila Sound", "OPM", "Rap", "Pinoy Rock", 1));
        questionList.add(new cEasyQ1_List("He led the first Philippine performance of Bach's Christmas Oratorio.", "Rey Valera", "Antonio Molina", "Jose Maceda", "Gary Valenciano", 2));
        questionList.add(new cEasyQ1_List("It is a two-stringed boat-shaped lute.", "Kudyapi", "Rondalla", "Kudlung", "Saludoy", 1));
        questionList.add(new cEasyQ1_List("She was known for being instrumental to the development of Philippine music and culture.", "Lucresia Roces Kasipag", "Lucresia Roses Kasipag", "Lucresia Roces Kasilag", "Lucresia Roses Kasilag", 3));
        questionList.add(new cEasyQ1_List("The Golden Era of ballad in the Philippines is during ____.", "1980s", "1990s", "1970s", "1960s", 1));
        questionList.add(new cEasyQ1_List("These are instruments that are plucked.", "Idiophones", "Chordophones", "Aerophones", "Membranophones", 3));
        questionList.add(new cEasyQ1_List("She was hailed as 'The Queen of Filipino Jazz' and as 'The Queen of Bodabil'.", "Ciara Sotto", "Lucresia Roces Kasilag", "Katy dela Cruz", "Ayen Laurel", 3));
        questionList.add(new cEasyQ1_List("He was named as the National Artist of the Philippines for Music in 2018.", "Ely Buendia", "Rico Blanco", "Jay-R Siaboc", "Rey Cayabyab", 4));
        questionList.add(new cEasyQ1_List("Who is the first Filipino singer to do a local version of an English rock song?", "Ariel Rivera", "Rico Blanco", "Rico Pun", "Bobby Gonzales", 4));

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
            case R.id.cMed1_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed1_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed1_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed1_OptionD:
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
            Intent intent = new Intent(cMedQ1.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cMedQ2.this.finish();
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
