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

public class LHardQ4 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<LEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhard_q4);

        question = findViewById(R.id.LHardCurrentQ);
        QCount = findViewById(R.id.LHard_qCount);
        timer = findViewById(R.id.LHardTimer);

        option1 = findViewById(R.id.LHard4_OptionA);
        option2 = findViewById(R.id.LHard4_OptionB);
        option3 = findViewById(R.id.LHard4_OptionC);
        option4 = findViewById(R.id.LHard4_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getLanEasyQuestions();

        hScore = 0;
    }

    private void getLanEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new LEasyQ1_List("In Noli Me Tangere, who is the merchant from Binondo who became a father figure for Maria Clara.", "Don Rafael", "Kapitan Tiyago", "Tiburcio Espadana", "Filipo Lino", 2));
        questionList.add(new LEasyQ1_List("This character is a biographical representation of Rizal. He became a bandit to fight for the rights of the oppressed.", "Basilio", "Elias", "Linares", "Crisostomo Ibarra", 2));
        questionList.add(new LEasyQ1_List("He is known as a devoted general to the Civil Guards and the one who defended Ibarra.", "Kapitan Tiyago", "Don Marcelo", "Teniente Guevarra", "Padre Salvi", 3));
        questionList.add(new LEasyQ1_List("Pretending to be a physician, lame and submissive to his wife Donya Victorina.", "Don Filipo", "Don Tiburcio", "cDon Tarcilo", "Don Rafael", 2));
        questionList.add(new LEasyQ1_List("Pilosopo Tasyo is a character in Noli Me Tangere personified by whom in reality?", "Chengoy", "Marcelo", "Paciano", "None of the above", 3));
        questionList.add(new LEasyQ1_List("The girlfriend of Isagani who dumped him for another man, believing that she has no future if she marries him. ", "Huli", "Juliana de Dios", "Paulita Gomez", "Victorina de Espedana", 3));
        questionList.add(new LEasyQ1_List("Who is the Dominican Priest who always follows Ibarra?", "Padre Sibyla", "Padre Camorra", "Padre Damaso", "Padre Salvi", 1));
        questionList.add(new LEasyQ1_List("Who is the parish priest in power in San Diego? He is also the wife of Donya Consolacion.", "Don Tiburcio", "Alperes", "Don Filipo", "Kapitan Basilio", 2));
        questionList.add(new LEasyQ1_List("In El Filibusterismo, what do you call these illicit drugs that was said to come from the Chinese?", "Haliso", "Opyo", "Kanabis", "Sedata", 2));
        questionList.add(new LEasyQ1_List("He was the one who found Basillio in the woods.", "Tasyong Baliw", "Basilio", "Elias", "Tandang Selo", 4));
        questionList.add(new LEasyQ1_List("A pro-Spanish native woman who is going to Laguna in search of her henpecked husband.", "Doña Victorina", "Doña Juanita", "Doña Paulina", "Doña Alba", 1));
        questionList.add(new LEasyQ1_List("Who is the Filipino priest who is highly respected by all for his gentleness, inherent kindness, and humility?", "Padre Andres", "Padre Justino", "Padre Florentino", "Padre Jose", 3));
        questionList.add(new LEasyQ1_List("Who is the industrious farmer who became a victim of injustice on the land on which his whole family invested blood, sweat, and life?", "Don Custodio", "Isagani", "Kabesang Tales", "Pasta", 3));
        questionList.add(new LEasyQ1_List("He was the one emphasized by Padre Clemente who allegedly used weapons to guard the land.", "Telesforo Juan de de Dios", "Kabesang Andang", "Padre Bernardo Salvi", "Kapitan Tiyago", 1));
        questionList.add(new LEasyQ1_List("In Florante and Laura, who helped and saved Florante from certain death?", "Menandro", "Aladin", "Adolfo", "Antenor", 2));
        questionList.add(new LEasyQ1_List("Who saved Laura from Adolfo's hands?", "Florante", "Flerida", "Aladin", "Felipe", 2));
        questionList.add(new LEasyQ1_List("He was the young man tied to a higera tree in the middle of a vast forest outside the Kingdom of Albania.", "Adolfo", "Aladin", "Florante", "Balagtas", 3));
        questionList.add(new LEasyQ1_List("It is a river in Espiro with poisonous water.", "Ilog Krotona", "Ilog Cocito", "Ilog Sipresa", "Ilog Keto", 2));
        questionList.add(new LEasyQ1_List("Governor who imposed the punishment of beheading Laura?", "Osmalik", "Miramolin", "Emir", "Oscar", 3));
        questionList.add(new LEasyQ1_List("What kind of poem is Ibong Adarna?", "Awit", "Ballad", "Korido", "Duplo", 3));
        questionList.add(new LEasyQ1_List("Who approached Don Juan when he was traveling to the location of Ibong Adarna?", "tLeproso", "Ermitanyo", "Higante", "Sebyerte", 3));
        questionList.add(new LEasyQ1_List("Name of the tree inhabited by Ibong Adarna.", "Derisenio", "Acacia Correa", "Puno ng Higera", "Piedras Platas", 4));
        questionList.add(new LEasyQ1_List("Decided that Don Juan and Donya Leonora should marry each other.", "Haring Fernando", "Arsobispo", "Donya Valeriana", "Don Pedro", 2));
        questionList.add(new LEasyQ1_List("It tells of adventures and magical powers, romance and love, courage and piety, and treachery and betrayal of highborn characters.", "Biag ni Lam-ang", "Alamat ng Sarimanok", "Ibong Adarna", "Florante at Laura", 3));
        questionList.add(new LEasyQ1_List("Interpretations of this work suggest that the Baltazar used allegory to convey Filipinos' suffering during the Spanish regime.", "El Filibusterismo", "Noli Me Tangere", "Florante at Laura", "Sa Aking Mga Kababayan", 3));
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
            case R.id.LHard4_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard4_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard4_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard4_OptionD:
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
            Intent intent = new Intent(LHardQ4.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //LHardQ4.this.finish();
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
