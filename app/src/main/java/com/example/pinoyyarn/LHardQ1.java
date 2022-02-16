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

public class LHardQ1 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<LEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhard_q1);

        question = findViewById(R.id.LHardCurrentQ);
        QCount = findViewById(R.id.LHard_qCount);
        timer = findViewById(R.id.LHardTimer);

        option1 = findViewById(R.id.LHard1_OptionA);
        option2 = findViewById(R.id.LHard1_OptionB);
        option3 = findViewById(R.id.LHard1_OptionC);
        option4 = findViewById(R.id.LHard1_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getLanEasyQuestions();

        hScore = 0;
    }

    private void getLanEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new LEasyQ1_List("This word means carpenter", "Kaluwage", "Anluwage", "Manluwage", "Naliwage", 2));
        questionList.add(new LEasyQ1_List("The filipino term for “charger”", "Bateryador", "Saksakan", "Tablayan", "Pantablay", 4));
        questionList.add(new LEasyQ1_List("This word means “goodbye” or “farewell”", "Pahimakas", "Pamuhina", "Pasamay", "Parisaya", 1));
        questionList.add(new LEasyQ1_List("What kind of person is an “ulayaw”?", "An enemy", "A good friend", "A stranger", "A neighbor", 2));
        questionList.add(new LEasyQ1_List("This means to break lose or to be set free.", "Alpas", "Kawali", "Palapas", "Muwarin", 1));
        questionList.add(new LEasyQ1_List("This word can be used to show that you are attracted to someone.", "Munimuni", "Sinain", "Pagwiling", "Marahuyo", 4));
        questionList.add(new LEasyQ1_List("What does the word Kinaiya mean?", "Characteristics", "Hardworking", "Knowledge", "Meal", 1));
        questionList.add(new LEasyQ1_List("It is the Filipino term for “hyperlink”", "Hawingan", "Kawingan", "Tugunan", "Sanggunian", 2));
        questionList.add(new LEasyQ1_List("WIt means infinity or boundless.", "Hangganan", "Awanggan", "Kalangitan", "Salayaran", 2));
        questionList.add(new LEasyQ1_List("What is a paliya?", "Cabbage", "Ampalaya", "Lettuce", "Eggplant", 4));
        questionList.add(new LEasyQ1_List("What kind of vegetable is a tambaliong?", "Turnip", "Carrot", "Radish", "Squash", 4));
        questionList.add(new LEasyQ1_List("The Filipino term for the chemical element “Mercury”", "Merkura", "Asoge", "Asoke", "Mirkyurar", 2));
        questionList.add(new LEasyQ1_List("The Filipino term for the word “arithmetic”", "Binluran", "Sipnayan", "Kapnayan", "Hulligan", 1));
        questionList.add(new LEasyQ1_List("This term means addicted or obsessed", "Gumon", "Pagkalurong", "Pananaligin", "Humon", 1));
        questionList.add(new LEasyQ1_List("This word means “to avoid shame”", "Takas", "Sulyap ", "Ulaw", "Tumangaw", 3));
        questionList.add(new LEasyQ1_List("The other term for the word “tinidor”", "Sambat", "Panusok", "Panturok", "Patinis", 1));
        questionList.add(new LEasyQ1_List("The other term for the word “kusina”", "Paningganan", "Kinakainan", "Paminggalan", "Linulutuan", 3));
        questionList.add(new LEasyQ1_List("This word means “one who climbs up, or rises”", "Pagtalas", "Gumirang", "Hakin", "Sakada", 4));
        questionList.add(new LEasyQ1_List("It is a personal daily record or a diary.", "Talasulatan", "Talaarawan", "Talasarili", "Talasulatin", 3));
        questionList.add(new LEasyQ1_List("This means to sharpen something.", "Yakis", "Talig", "Simat", "Piskil", 1));
        questionList.add(new LEasyQ1_List("The Filipino term for “menstrual period”", "Masarilang", "Karumalan", "Pagluluran", "Pananandulan", 2));
        questionList.add(new LEasyQ1_List("What does the word “pook-sapot” means?", "Meeting spot", "Website", "Zoo", "Bookstore", 2));
        questionList.add(new LEasyQ1_List("The Filipino term for e-mail is?", "Panayaman", "Talingsulat", "Magaliham", "Sulatroniko", 4));
        questionList.add(new LEasyQ1_List("The Filipino term for headset is?", "Pang-taingang hatinig", "Pang-ulong hatinig", "Saliktinig", "Pang-ulong saliktinig", 2));
        questionList.add(new LEasyQ1_List("This word means you are extremely fond of someone to the point of obsession.", "Kamaling", "Pagsinta", "Pagsamo", "Humaling", 4));

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
            case R.id.LHard1_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard1_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard1_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard1_OptionD:
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
            Intent intent = new Intent(LHardQ1.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //LHardQ1.this.finish();
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
