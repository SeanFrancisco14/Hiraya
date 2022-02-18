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
import java.util.Timer;

public class cEasyQ1 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasy_q1);

        question = findViewById(R.id.cEasyCurrentQ);
        QCount = findViewById(R.id.cEasy_qCount);
        timer = findViewById(R.id.cEasyTimer);

        option1 = findViewById(R.id.cEasy1_OptionA);
        option2 = findViewById(R.id.cEasy1_OptionB);
        option3 = findViewById(R.id.cEasy1_OptionC);
        option4 = findViewById(R.id.cEasy1_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("The most famous Filipino food that’s is often seen in every Filipino household.", "Sinigang", "Lechon", "Adobo", "Tinola", 3));
        questionList.add(new cEasyQ1_List("2. It is a noodle dish layered with a rich orange sauce made from shrimp broth, pork hard-boiled egg, shrimps, chicharon, and sometimes it has oysters and squid.", "Pancit", "Palabok", "Pancit Malabon", "Mami", 2));
        questionList.add(new cEasyQ1_List("3. This dish is often eaten with rice, it’s much better when tamarind is used in it but Kamias and tomatoes do fit in with this stew.", "Sinigang", "Adobo", "Tinola", "Dinuguan", 1));
        questionList.add(new cEasyQ1_List("4. This is often seen in fiestas as the main attraction and the center of everything as it has an apple on its mouth.", "Crispy Pata", "Kamaro", "Betute", "Lechon", 4));
        questionList.add(new cEasyQ1_List("5. This dish is called as “gulay na lada” for the Bicolanos and perfect for people who love coconut and a spicy stew.", "Pinakbet", "Bicol Express", "Bicol Kinilaw", "Sinanglay", 2));
        questionList.add(new cEasyQ1_List("6. It would be impossible if you haven’t heard of this food as it is sold around the streets. Boiled 17 days old duck embryo topped with salt or vinegar, familiar is it?", "Balut", "Lumpiang Buod", "Bagnet", "Sinugno", 1));
        questionList.add(new cEasyQ1_List("7. This dish does not look appetizing especially it’s color black and made from pork and pig innards, stewed with pig blood and often eaten with puto.", "Betute", "Tapa", "Dinuguan", "Sinanglay", 3));
        questionList.add(new cEasyQ1_List("8. Often heard when vendors shout this during early morning, made from soybean custard topped with sago and brown sugar syrup.", "Pan de sal", "Halayang ube", "Sinanglay", "Taho", 4));
        questionList.add(new cEasyQ1_List("9. Originated from Pampanga, mole crickets are cooked and are called as _______.", "Kamaro", "Sinigang", "Betute", "Laing", 1));
        questionList.add(new cEasyQ1_List("10. It is a chocolate rice porridge and to balance the sweetness it is often served with dried fish.", "Halo-halo", "Sinanglay", "Champorado", "Kuhol sa gata", 3));
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
            case R.id.cEasy1_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cEasy1_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cEasy1_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.cEasy1_OptionD:
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
            //Go to Score Activity
            Intent intent = new Intent(cEasyQ1.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cEasyQ1.this.finish();
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
