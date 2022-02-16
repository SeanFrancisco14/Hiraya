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

        questionList.add(new cEasyQ1_List("It was built by Miguel López de Legazpi who led the Spanish conquistadors into the city.", "Fort San Pablo", "Fort San Pedro", "Fort Santiago", "Fort Bonifacio", 2));
        questionList.add(new cEasyQ1_List("Located at 155-Lopez Jaena corner Mabini Street in Parian, a couple of meters from the Heritage Monument of Cebu.", "Casa Gorordo", "Yap-Sandiego Ancestral House", "Archbishop's Palace of Cebu", "Museo de Parian", 2));
        questionList.add(new cEasyQ1_List("It was home to the highest Jesuit official in the country. It showcases important artifacts and remnants of old Cebu.", "Museo Sugbo", "Museo Colon", "Museo Osmeña", "Museo Parian", 4));
        questionList.add(new cEasyQ1_List("This place is considered as one of the most significant sites in the history of Cebu.", "Plaza Sugbu", "Plaza Independencia", "City Square Plaza", "Cebu Pension Plaza", 2));
        questionList.add(new cEasyQ1_List("The official Sinulog flower is called __________.", "Sunflower", "Celosia", "Rose", "Sampaguita", 2));
        questionList.add(new cEasyQ1_List("Cebu's ruler when Magellan and his men arrived was __________.", "Bulakna", "Lapu-Lapu", "Dagohoy", "Jumabon", 4));
        questionList.add(new cEasyQ1_List("A sub-form of Bikol languages spoken by people in the northern part of Catanduanes is called?", "Rinconada Bikol", "Pandan Bikol", "Albay Bikol", "Catanduanes Bikol", 2));
        questionList.add(new cEasyQ1_List("What is the oldest church in Bicol region?", "Basilica of Our Lady of Penafrancia", "Daraga Church", "Church of Magarao", "Quipayo Church", 2));
        questionList.add(new cEasyQ1_List("Who is the composer of the most popular song in Bicol, Sarung Banggi (One Evening)?", "Jude Michael", "Paolo Clemente", "Fr. Jessel Gonzales, SJ", "Potenciano Gregorio", 4));
        questionList.add(new cEasyQ1_List("According to the Creation story from the Igorot, what was the name of the Great Spirit who created people?", "Samoki", "Babaylan", "Bathala", "Lumawig", 4));
        questionList.add(new cEasyQ1_List("This is a symbolic plate or basket of food for the spirits of Igorot ancestors.", "Atang", "Bayya-o", "Borbon", "Serbesa", 1));
        questionList.add(new cEasyQ1_List("Igorots sing a Eulogy called?", "Menpalti", "Atang", "Bayya-o", "Tengaw", 4));
        questionList.add(new cEasyQ1_List("For Igorots, 'Menpalti/ Menkanyaw', is an act of?", "butchering and offering animals", "praying to the Gods at night", "praying to the Gods at day", "sending condolences to the families", 1));
        questionList.add(new cEasyQ1_List("The prayers are usually performed by an elderly person of the town called?", "Panginaan", "Pangamaen", "Pangamenan", "Panginaen", 2));
        questionList.add(new cEasyQ1_List("Their tataya is round-bottomed head so that it can withstand the strong waves of the sea.", "Ivatan", "Agta", "Mangyan", "Gaddang", 1));
        questionList.add(new cEasyQ1_List("They believe their tattoos will help them in entering heaven.", "Gaddang", "Kalinga", "Bontoc", "Mangyan", 1));
        questionList.add(new cEasyQ1_List("They live in a house like the Ifugaos but theirs has a cage that serve as granary.", "Agta", "Bontoc", "Mangyan", "Kalinga", 2));
        questionList.add(new cEasyQ1_List("Geographic location of the literary work, 'Pamulinawen'?", "Bicol Region", "Ifugao", "Ilocos", "Benguet", 3));
        questionList.add(new cEasyQ1_List("Which of the following is used as a death blanket by the Ifugaos?", "Burnay", "Kinuttiyan", "Abel", "Binakul", 2));
        questionList.add(new cEasyQ1_List("What do you call the g-string worn by Ifugao men?", "Tapis", "Wanno", "Batek", "Bahag", 2));
        questionList.add(new cEasyQ1_List("Geographic location of the literary work, 'Alim'?", "Bicol Region", "Ifugao", "Ilocos", "Benguet", 2));
        questionList.add(new cEasyQ1_List("What is the generic name for tattoo in Kalinga?", "Fikum", "Batok", "Vakul", "Callado", 2));
        questionList.add(new cEasyQ1_List("In Igorot culture,It is a tattoo that signifies that one has beheaded an enemy in protection of their village?", "Khaman", "Pinipingao", "Chaklag", "Sorag", 3));
        questionList.add(new cEasyQ1_List("What do you call this warrior tattoo that recognizes his exceptional and unsurpassed bravery?", "Dakag", "Gayaman", "Sinokray", "Sorag", 1));
        questionList.add(new cEasyQ1_List("Geographic location of the literary work, 'Tigsik'?", "Bicol Region", "Ifugao", "Ilocos", "Benguet", 1));
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