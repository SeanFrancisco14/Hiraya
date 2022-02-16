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

public class LHardQ2 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<LEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhard_q2);

        question = findViewById(R.id.LHardCurrentQ);
        QCount = findViewById(R.id.LHard_qCount);
        timer = findViewById(R.id.LHardTimer);

        option1 = findViewById(R.id.LHard2_OptionA);
        option2 = findViewById(R.id.LHard2_OptionB);
        option3 = findViewById(R.id.LHard2_OptionC);
        option4 = findViewById(R.id.LHard2_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getLanEasyQuestions();

        hScore = 0;
    }

    private void getLanEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new LEasyQ1_List("Let's say you are in Cebu and spot a fantastic locally-made guitar you wish to purchase. What phrase would come in useful?", "Palihog lingkod? ", "Muadto mo sa pista?", "Dili ko?", "Tag-pila ni?", 4));
        questionList.add(new LEasyQ1_List("What is the Visayan word for bird?", "Ibon", "Iro", "Halas", "Langgam", 4));
        questionList.add(new LEasyQ1_List("When you are in Cagayan de Oro, what would you call something nice?", "Galling", "Maganda", "Chada", "Gumirang", 3));
        questionList.add(new LEasyQ1_List("How do you say “How old are you?” in Cebuano?", "eda man ka?", "Ikaw unsa imu?", "unsa imu edad?", "pila na imu edad?", 3));
        questionList.add(new LEasyQ1_List("How do you say “I need a doctor” in Cebuano?", "Wa ko kasabot duktor", "Nanginahanglan ko ug duktor", "Tabangko ug duktor", "Gihilantan ko ug duktor", 2));
        questionList.add(new LEasyQ1_List("How do you say” what is your name?” in Cebuano?", "pwede ko makatabang ko pangalan?", "Unsa imu pangalan?", "Pangalan ka nako?", "Asa man ang pangalan?", 2));
        questionList.add(new LEasyQ1_List("How do you say “how much is this?” in Cebuano?", "Asa man ka gikan?", "Asa ka nagpuyo?", "Tagpila man ni?", "Unsa man imu panginabuhi?", 3));
        questionList.add(new LEasyQ1_List("How do you say “Happy Birthday” in Cebuano?", "Malipayong kaarawan", "Malipayong kaadrawan", "Malipayong kaadlawan", "Maayong kaarawan", 3));
        questionList.add(new LEasyQ1_List("How do you say “how” in Cebuano?", "Unsa", "Kinsa", "Nganu", "Giunsa", 1));
        questionList.add(new LEasyQ1_List("How do you say the word “yesterday” in Cebuano?", "Karon adlawa", "Unya gabi-e", "Ugma na hapon", "Gahapon", 2));
        questionList.add(new LEasyQ1_List("How do you say “Do you speak English?” in Cebuano?", "Makausap ka ug Ingles?", "Makastorya ka ug Iningles?", "Salita man ug Ingles?", "Makasalita ka ug Ingles?", 2));
        questionList.add(new LEasyQ1_List("How do you say “a little bit” in Cebuano?", "Kaunti lamang", "Ginagmay lamang", "Katamtam lamang", "Kaliit lamang", 2));
        questionList.add(new LEasyQ1_List("How do you say “It was nice talking to you” in Cebuano?", "Makigstorya nindot nimu", "Nindot kaau makigstorya nimu ", "Makigusap ug nimu", "Nindot makigusap kauu nimu", 2));
        questionList.add(new LEasyQ1_List("How do you say “what do you mean?” in Cebuano?", "Untay buot pasabi?", "Unsay imu buot pasabot?", "Unsay buot man pasan?", "Untay man pasabi?", 2));
        questionList.add(new LEasyQ1_List("What exactly does 'nasipnget'' mean?", "Hard of hearing", "Good-person quality, kind, obedient", "Arrival", "The darkness of outside at night", 4));
        questionList.add(new LEasyQ1_List("When Ilocano women get angry, they put the front of their wrists on the sides of their waists, making their elbows form a 90-degree angle. What is that stance called in Ilocano?", "Bannikes", "ag-paparaw", "idda", "akimbo", 2));
        questionList.add(new LEasyQ1_List("In Ilocano, which of the following Ilocano words means 'to get knocked down, as in an upright object being toppled'?", "Awan", "Itnag", "Tuwang", "Tiro", 3));
        questionList.add(new LEasyQ1_List("Which Ilocano word most accurately describes a child's hyperactivity?", "Rugit", "Kuti", "Ranggas", "Napuskol", 2));
        questionList.add(new LEasyQ1_List("In Ilocano, what does it mean when a girl is said to be 'arjud'?", "the way she carries herself, as seen in her efforts to make herself look beautiful by over adornment", "in the state of feeling unwanted by men, but yet happy about it", "purposely staying away from men for the sole purpose of self-confidence and prestige", "angry at the world because she'd rather be a man", 1));
        questionList.add(new LEasyQ1_List("In Ilocano, the word 'kapsot' has three meanings. Which of the following is NOT a meaning of the word 'kapsot'?", "Physically weak", "Dumb", "Slow", "Small", 4));
        questionList.add(new LEasyQ1_List("When Ilocano people mention 'kimat' and 'kurruog', what are they talking about?", "Wind and rain", "Plants and animals", "Thunder and lightning", "Air and water", 3));
        questionList.add(new LEasyQ1_List("In Ilocano, which of the following is an expression of pity?", "Ubet apo na'n!", "Pakawanan berde!", "Ta ushang na't tuyen!", "Ay, piman!", 4));
        questionList.add(new LEasyQ1_List("In Ilocano, which of the following is the best definition for 'kano'?", "Activity that describes child's play", "An American", "Indicating that what is being said has a news source", "A copycat", 3));
        questionList.add(new LEasyQ1_List("How do you say “what do you do for a living?” in Cebuano?", "Unsa man imu panginabuhi? ", "Unsa man ika trabaho?", "Unsa man imu trabaho?", "Unsa man panginabi?", 1));
        questionList.add(new LEasyQ1_List("How do you say “can you help me?” in Cebuano?", "Pwede ko makatabang ko nimu?", "Makabang ug nimu?", "Makanabang ug nako?", "Makatabang ka nako?", 4));
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
            case R.id.LHard2_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard2_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard2_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard2_OptionD:
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
            Intent intent = new Intent(LHardQ2.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //LHardQ2.this.finish();
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
