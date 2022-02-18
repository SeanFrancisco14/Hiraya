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

public class cMedQ3 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmed_q3);

        question = findViewById(R.id.cMedCurrentQ);
        QCount = findViewById(R.id.cMed_qCount);
        timer = findViewById(R.id.cMedTimer);

        option1 = findViewById(R.id.cMed3_OptionA);
        option2 = findViewById(R.id.cMed3_OptionB);
        option3 = findViewById(R.id.cMed3_OptionC);
        option4 = findViewById(R.id.cMed3_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("Known as the ‘Grand Old Man of Philippine Art’.", "a.\tJose Jaya", "b.\tPacita Abad", "c.\tAng Kiukok", "d.\tFernando Amorsolo", 4));
        questionList.add(new cEasyQ1_List("He is the best-selling commercial painter of his generation and a prominent head of the local contemporary art scene.", "a.\tBenedicto Cabrera", "b.\tKidlat Tahimik", "c.\tAgnes Arellano", "d.\tRoberto Chabet", 1));
        questionList.add(new cEasyQ1_List("Noted as the Father of Modern Filipino sculpture.", "a.\tRoberto Chavet", "b.\tNapoleon Abueva", "c.\tAng Kiukok", "d.\tJose Jaya", 2));
        questionList.add(new cEasyQ1_List("The series of ______, which connects both energy, faith and the struggle of fishermen under a vibrant crimson sun labouring together to bring in the haul for the day", "a.\tFishermen and the haul", "b.\tFishermen at the boat", "c.\tFishermen at Sea", "d.\tFishermen at Ocean", 3));
        questionList.add(new cEasyQ1_List("What is Jose Joya’s most notable painting from 1958?", "a.\tGranadean Arabesque", "b.\tGrande Arabe", "c.\tTrapunto", "d.\tThe Great Trapunto", 1));
        questionList.add(new cEasyQ1_List("Best known for her surrealist and expressionist work in plaster, bronze and cold-cast marble.", "a.\tAgnes Arellano", "b.\tAng Kiukok", "c.\tPacita Abad", "d.\tKidlat Tahimik", 1));
        questionList.add(new cEasyQ1_List("He is the one who introduced modern visual art in the country through his exhibition", "a.\tFernando Amorsolo", "b.\tRoberto Chabet", "c.\tVicente Manansala", "d.\tDiosdado Lorenzo", 3));
        questionList.add(new cEasyQ1_List("Who was considered as Father of Indigenous Art?", "a.\tDiosdado Lorenzo", "b.\tElito Circa", "c.\tTeofilo Garcia ", "d.\tFernando Amorsolo", 2));
        questionList.add(new cEasyQ1_List("In 1984, she became the first woman to win the Ten Outstanding Young Men (TOYM) Award.", "a.\tAng Kiukok", "b.\tPacita Abad", "c.\tAngela Silva", "d.\tLou Lim", 2));
        questionList.add(new cEasyQ1_List("Famous for his work ‘The Bonifacio Monument’, which became the symbol of the freedom struggle of the Philippines. ", "a.\tJuan Luna", "b.\tFernando Amorsolo", "c.\tBenedicto Cabrera", "d.\tGuillermo Tolentino", 4));
        questionList.add(new cEasyQ1_List("He is prodigious artist who received a six-month grant from UNESCO.", "a.\tBenedicto Cabrera", "b.\tVicente Manansala", "c.\tVictorio Edades", "d.\tAng Kiukok", 2));
        questionList.add(new cEasyQ1_List("She explores themes that thrive on femininity, sensuality, sexuality, and mental health", "a.\tKrista Nogueras", "b.\tKarina Gonzaga", "c.\tJan Sunday", "d.\tLou Lim", 1));
        questionList.add(new cEasyQ1_List("Isay Rodriguez’s work ____, featured augmented and virtual realities that allow humans to simulate the struggles of a bee.", "A.\tDaily flight", "B.\tDoon", "C.\tDark Nights", "D.\tDetailed Flights", 2));
        questionList.add(new cEasyQ1_List("Her first solo exhibition, ‘Slips and Pitfall’, the artist used the pitcher plant as a symbol of how the body can capture and control perceptions of the self.", "a.\tJan Sunday", "b.\tKarina Gonzaga", "c.\tNoelle Varela", "d.\tBea Camacho", 3));
        questionList.add(new cEasyQ1_List("He made the masterpiece ‘Genesis’ in 1968.", "a.\tHernando Ocampo", "b.\tJan Sunday", "c.\tNapoleon Abueva", "d.\tVictorio Edades", 1));


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
            case R.id.cMed3_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed3_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed3_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cMed3_OptionD:
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
            Intent intent = new Intent(cMedQ3.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cMedQ3.this.finish();
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
