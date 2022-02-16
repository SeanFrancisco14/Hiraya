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

public class cHardQ1 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chard_q1);

        question = findViewById(R.id.cHardCurrentQ);
        QCount = findViewById(R.id.cHard_qCount);
        timer = findViewById(R.id.cHardTimer);

        option1 = findViewById(R.id.cHard1_OptionA);
        option2 = findViewById(R.id.cHard1_OptionB);
        option3 = findViewById(R.id.cHard1_OptionC);
        option4 = findViewById(R.id.cHard1_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("It was built by Miguel López de Legazpi who led the Spanish conquistadors into the city.", "2,000", "15,000", "76,000", "110,000", 3));
        questionList.add(new cEasyQ1_List("When was the WW2 started in the Philippines?", "December 8, 1941", "April 19, 1941", "November 30, 1941", "July 9, 1941", 1));
        questionList.add(new cEasyQ1_List("When was the attack of Pearl Harbor in the US?", "July 9, 1941", "August 21, 1941", "April 19, 1941", "December 8, 1941", 4));
        questionList.add(new cEasyQ1_List("In 1946, the Japanese commander of the march was convicted by a U.S. military commission and executed. What was the name of this commander?", "Akiyama Saneyuki", "Murakami Kakuichi", "Shimamura Hayao", "Homma Masaharu", 4));
        questionList.add(new cEasyQ1_List("When was the Bataan Death March started?", "May 7, 1942", "March 16, 1942", "April 9, 1942", "February 8, 1942", 3));
        questionList.add(new cEasyQ1_List("How long is The Bataan Death March?", "55 miles or 88.5139", "65 miles or 104.607 kilometers", "75 miles or 120.701 kilometers", "85 miles or 136.794 kilometers", 4));
        questionList.add(new cEasyQ1_List("Who is the leader of Hukbalahap?", "Fernando Amorsolo", "Jose Laurel Jr.", "Miguel Malvar", "Luis Taruc", 4));
        questionList.add(new cEasyQ1_List("When was the Japanese commander executed by firing squad?", "July 4, 1946", "May 9, 1946", "December 6, 1946", "April 3, 1946", 4));
        questionList.add(new cEasyQ1_List("Who is the first and last president of the Second Republic of the Philippines?", "Emilio Aguinaldo", "Manuel L. Quezon", "Jose P. Laurel", "Sergio Osmena", 3));
        questionList.add(new cEasyQ1_List("The historic death march started in __________, Bataan.", "Mariveles", "San Francisco", "Capas", "Tarlac", 1));
        questionList.add(new cEasyQ1_List("The following are the cities and places that was bombed by the Japanese except __________.", "Davao", "Baguio", "Cebu", "Manila", 1));
        questionList.add(new cEasyQ1_List("This is the location of the largest US naval base.", "New Mexico", "California", "South Carolina", "Hawaii", 4));
        questionList.add(new cEasyQ1_List("What is the complete name of the combined forces of Filipinos and American soldiers?", "United States Armalite Forces in the Far East", "United States Army Forces in the Far East", "United States Army Forces in the Fair East", "United States Army Facets in the Far East", 2));
        questionList.add(new cEasyQ1_List("What signaled the beginning of the Second World War?", "Bombing of Bataan", "Bombing of USAFFE", "Bombing of Pearl Harbor", "Bombing of Corregidor", 2));
        questionList.add(new cEasyQ1_List("What served as the last defense of our country against the Japanese occupation?", "Bataan", "Manila", "Cebu", "Corregidor", 4));
        questionList.add(new cEasyQ1_List("What is the name of the Camp where prisoners of war walked for days to reach it?", "Camp O’Jonnel", "Camp O’Jenell", "Camp O’Flannel", "Camp O’Donell", 4));
        questionList.add(new cEasyQ1_List("Who was the elected Filipino President of the Japanese Puppet Government?", "Manuel Quezon", "Sergio Osmeña", "Jose P. Laurel", "Jorge Vargas", 3));
        questionList.add(new cEasyQ1_List("What did the Philippine government declare to Manila in order to prevent further destruction of the city during the war?", "It was declared a colony of Japan.", "It was surrendered by the Philippine government to the Japanese.", "They made a truce with the Japanese.", "It was declared as an Open City.", 4));
        questionList.add(new cEasyQ1_List("Where did the Philippine government go when the Japanese attacked Manila?", "Malolos, Bulacan", "Corregidor, Bataan", "San Fernando, Pampanga", "Palo, Leyte", 2));
        questionList.add(new cEasyQ1_List("What force was the US a member of during World War II?", "Axis Forces", "Nazis Forces", "Allied Forces", "Samurai Forces", 3));
        questionList.add(new cEasyQ1_List("What triggered World War II?", "The killing of the Jews.", "The creation of the atomic bombs.", "The bombing of Pearl Harbor", "The territorial dispute on the Philippines.", 3));
        questionList.add(new cEasyQ1_List("What do you call these historical event where American and Filipino war captives were forced to walk from Bataan to Pampanga?", "Comfort Women", "Death March", "Harakiri", "Procession", 2));
        questionList.add(new cEasyQ1_List("Where did the American forces arrive to liberate the Philippines from the Japanese?", "Palo, Leyte", "Intramuros, Manila", "Kawit, Cavite", "Corregidor, Bataan", 1));
        questionList.add(new cEasyQ1_List("What triggered the surrender of the Japanese and ended the war in the Pacific?", "The bombing of Hiroshima and Nagasaki", "The bombing Pearl Harbor", "The bombing of Clark Field.", "The bombing of Manila.", 2));
        questionList.add(new cEasyQ1_List("When was the Philippines declared as a sovereign state?", "February 25, 1986", "June 12, 1898", "July 4, 1946", "December 30, 1896", 3));
        setQuestion();
    }

    private void setQuestion() {
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

    private void startTimer() {
        countDown = new CountDownTimer(12000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (millisUntilFinished < 10000) {
                    timer.setText(String.valueOf(millisUntilFinished / 1000));
                }
                if (millisUntilFinished <= 4000) {
                    timer.setTextColor(ColorStateList.valueOf(Color.RED));
                } else {
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

        switch (v.getId()) {
            case R.id.cHard1_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard1_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard1_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard1_OptionD:
                selectedOption = 4;
                break;
            default:
        }
        countDown.cancel();
        checkAnswer(selectedOption, v);
    }

    private void checkAnswer(int selectedOption, View view) {
        if (selectedOption == questionList.get(qNum).getCorrectAns()) {
            ((Button) view).setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            cScore++;
        } else {
            ((Button) view).setBackgroundTintList(ColorStateList.valueOf(Color.RED));

            switch (questionList.get(qNum).getCorrectAns()) {
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

    private void changeQuestion() {
        if (qNum < questionList.size() - 1) {
            qNum++;

            playAnim(question, 0, 0);
            playAnim(option1, 0, 1);
            playAnim(option2, 0, 2);
            playAnim(option3, 0, 3);
            playAnim(option4, 0, 4);

            QCount.setText(String.valueOf(qNum + 1) + "/" + String.valueOf(questionList.size()));

            timer.setText(String.valueOf(10));
            startTimer();
        } else {
            Intent intent = new Intent(cHardQ1.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cHardQ1.this.finish();
        }
    }

    private void playAnim(View view, final int value, int viewNum) {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(250)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator()).
                setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        if (value == 0) {
                            switch (viewNum) {
                                case 0:
                                    ((TextView) view).setText(questionList.get(qNum).getQuestion());
                                    break;
                                case 1:
                                    ((Button) view).setText(questionList.get(qNum).getOptionA());
                                    break;
                                case 2:
                                    ((Button) view).setText(questionList.get(qNum).getOptionB());
                                    break;
                                case 3:
                                    ((Button) view).setText(questionList.get(qNum).getOptionC());
                                    break;
                                case 4:
                                    ((Button) view).setText(questionList.get(qNum).getOptionD());
                                    break;
                            }

                            if (viewNum != 0) {
                                ((Button) view).setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
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