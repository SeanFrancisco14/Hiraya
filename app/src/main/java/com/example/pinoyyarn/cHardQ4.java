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

public class cHardQ4 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chard_q4);

        question = findViewById(R.id.cHardCurrentQ);
        QCount = findViewById(R.id.cHard_qCount);
        timer = findViewById(R.id.cHardTimer);

        option1 = findViewById(R.id.cHard4_OptionA);
        option2 = findViewById(R.id.cHard4_OptionB);
        option3 = findViewById(R.id.cHard4_OptionC);
        option4 = findViewById(R.id.cHard4_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("It is a bamboo polychordal tube zither of Bagobo. It is called as kolitong in Cordillera region.", "Kudyapi", "Kugot", "Saluroy", "Sahunay", 3));
        questionList.add(new cEasyQ1_List("A lip-valley flute, it is considered the toughest of the three bamboo to use because of the way one must shape one's lips against its tip to make a sound.", "Duwagey", "Gabbang", "Suling", "Palendag", 4));
        questionList.add(new cEasyQ1_List("A one -stringed fiddle instrument of Bilaans.", "Suling", "Aduwag-ay", "Kugot", "Babandil", 2));
        questionList.add(new cEasyQ1_List("The Maguindanaon and the Banuwaen use it in the rice paddies to guard against voracious birds, using the sound it produces to scare them away.", "Dadabuan", "Kagul", "Gandang", "Kudlung", 2));
        questionList.add(new cEasyQ1_List("The smallest bamboo flute of the Maguindanaon and the only one classified as a ring-flute.", "Kulintang", "Gabbang", "Gandang", "Suling", 4));
        questionList.add(new cEasyQ1_List("A goblet -shaped drum of Maguindanao and Maranao, which has a single head covered with goat, lizard or snakeskin.", "Dabakan", "Duwagey", "Gandang", "Gandingan", 1));
        questionList.add(new cEasyQ1_List("It is a set a two wide rimmed bossed-gongs hangs from horizontal pole or wooden frame.", "Kagong", "Babandil", "Kagul", "Agung", 4));
        questionList.add(new cEasyQ1_List("A single, narrow-rimmed Philippine gong used primarily as the 'timekeeper' of the Maguindanao kulintang ensemble.", "Banduria", "Gandingan", "Babandil", "Palindag", 3));
        questionList.add(new cEasyQ1_List("The membrane is made of carabao skin. Decorated with carvings and painted. This drum is part of the Kulintang ensemble.", "Dadabuan", "Kudlung", "Gandingan a Kayo", "Kulintang", 1));
        questionList.add(new cEasyQ1_List("It is an ensemble of string instruments with a pick.", "Angklung Ensemble", "Musikong Bumbong", "Rondalla", "Kulintang", 3));

        questionList.add(new cEasyQ1_List("A 14-stringed pear-shaped lute with a round sound hole, played with a plectrum.", "Banduria", "Laud", "Octavina", "Palendag", 1));
        questionList.add(new cEasyQ1_List("A 14-stringed pear-shaped lute with f-shaped sound holes, played with a plectrum.", "Bajo de Unas", "Octavina", "Laud", "Kulintang", 3));
        questionList.add(new cEasyQ1_List("A 14-stringed lute, shaped like a small guitar, and played with a plectrum.", "Bajo de Unas", "Banduria", "Octavina", "Laud", 3));
        questionList.add(new cEasyQ1_List("This is also called 'The Jew's harp of the Tagbanua's'", "Babendil", "Aruding", "Tubuldu", "Tipanu", 2));
        questionList.add(new cEasyQ1_List("This is the polychordal zither of Tagbanua's and is made of bamboo and rattan.", "Aroder", "Tipanu", "Tubuldu", "Pagang", 4));
        questionList.add(new cEasyQ1_List("A nose flute that originated from the Batak’s of Palawan.", "Lampang", "Gimbal", "Lantoy", "Sabangan", 3));
        questionList.add(new cEasyQ1_List("This is a wooden guitar that originated from the Batak's of Palawan", "Kadiape", "Budlong", "Gimbal", "Aroder", 1));
        questionList.add(new cEasyQ1_List("A long drum from the Tagbanuas. Its drumhead is made from animal skins such as big lizards.", "Beberek", "Gimbal", "Pagang", "Agung", 2));
        questionList.add(new cEasyQ1_List("It is a three-stringed bamboo violin of the Aeta people.", "Tulali", "Litguit", "Lutes", "Libbit", 2));
        questionList.add(new cEasyQ1_List("It is set of eight, tuned knobbed metal plates strung on a wooden frame crafted by the Maguindanaon.", "Kulintang a tiniok", "Luntang", "Agung a tamlang", "Gabbang", 1));
        questionList.add(new cEasyQ1_List("It is a bamboo flute with three holes of the Negrito people in Zambales.", "Budlong", "Tambuli", "Tongali", "Bansik", 4));
        questionList.add(new cEasyQ1_List("_________ is a two-stringed, lute-like instrument of the B'laan that was made in 1997.", "Budlong", "Kolitong", "Faglong", "Kalagong", 3));
        questionList.add(new cEasyQ1_List("__________ is a two-stringed bamboo with a hole in the middle from Apayao people.", "Butling", "Bansik", "Pas-ing", "Luntang", 3));
        questionList.add(new cEasyQ1_List("A two-headed cylindrical drum of Tausug, Samal, Badjao, Maranao and Maguindanao.", "Gandang", "Dabakan", "Kagul", "Tongatong", 1));
        questionList.add(new cEasyQ1_List("________ is a set of four small narrow-rimmed and suspended gongs.", "Tambuli", "Sulibao ", "Gandingan", "Saronay", 3));
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
            case R.id.cHard4_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cHard4_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cHard4_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cHard4_OptionD:
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
            Intent intent = new Intent(cHardQ4.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cHardQ4.this.finish();
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