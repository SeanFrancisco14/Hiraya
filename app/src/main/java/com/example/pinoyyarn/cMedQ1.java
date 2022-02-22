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

        questionList.add(new cEasyQ1_List("The dance's place of origin is at Lingayen, Pangasinan and dancers are using sticks to perform.", "Tinikling", "Sua-ku-sua", "Pangalay", "Biniskalan", 4));
        questionList.add(new cEasyQ1_List("Philippine Folk Dance mirrors the _____ of the Filipinos.", "Beliefs", "Value and moral", "Culture and Tradition", "Knowledge and wisdom", 3));
        questionList.add(new cEasyQ1_List("It is performed mainly during weddings and other festive events.", "Binislakan", "Pangalay", "Tinikling", "Bahay-Kubo", 2));
        questionList.add(new cEasyQ1_List("One of the most famous dances in the Philippines that uses bamboo poles.", "Tinikling", "Itik-Itik", "Maglalatik", "Pantomina", 1));
        questionList.add(new cEasyQ1_List("A folk dance in Luzon that is a mock dance over a fight over coconut meat, a highly prized food.", "Maglalatik", "Itik-itik", "Pantomina", "Binasuan", 1));
        questionList.add(new cEasyQ1_List("This dance is performed on the top of a narrow chair that originated in Pangasinan.", "Itik-itik", "Pantomina", "Sayaw sa Bangko", "Binasuan", 3));
        questionList.add(new cEasyQ1_List("A folk dance from Pangasinan that uses drinking glasses that the dancers balances in their head and hand as they move.", "Pantomina", "Itik-itik", "Pantomina", "Binasuan", 4));
        questionList.add(new cEasyQ1_List("Is a cultural dance in the Philippines influenced by Muslims that is originated by the Maranao tribe in Mindanao.", "Kappa Malong-malong", "Binasuan", "Pantomina", "Itik-itik", 1));
        questionList.add(new cEasyQ1_List("This is typically performed by fishermen to celebrate a bountiful catch.", "Itik-itik", "Pantomina", "Pandanggo Oasiwas", "Kuratsa", 3));
        questionList.add(new cEasyQ1_List("It is another courtship dance in the Philippines that is said to mimic the movement of doves in courtship.", "Pantomina", "Pandaggo sa Ilaw", "Kuratsa", "Itik-Itik", 1));
        questionList.add(new cEasyQ1_List("Where does Kuratsa originated from?", "Bicol Region", "Pangasinan", "Samar Island", "Batanes", 3));
        questionList.add(new cEasyQ1_List("Known for her abstract ballets to music Rhapsody in Blue, Rhapsody on a Theme of Paganini, Serenade for Strings, Cappriccio Espagnol.", "Rosalia Merino Santos", "Julie Borromeo", "Leonor Orosa Goquingco", "Remedios de Oteyza", 4));
        questionList.add(new cEasyQ1_List("Which of these is not a step of Polkabal?", "uksong Uwak", "Corriba", "Paseo", "Ensayo", 2));
        questionList.add(new cEasyQ1_List("It is a comic dance from Ilocos sur that depicts the movement of a person bitten by ants.", "Kinoton", "Habanera", "Kuratsa", "Itik-itik", 1));
        questionList.add(new cEasyQ1_List("It is a mix of Cuban, Spanish and African rhythms and dance moves.", "Kinoton", "Kuratsa", "Habanera", "Itik-itik", 3));

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
