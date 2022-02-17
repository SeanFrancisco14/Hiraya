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

public class cHardQ3 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chard_q3);

        question = findViewById(R.id.cHardCurrentQ);
        QCount = findViewById(R.id.cHard_qCount);
        timer = findViewById(R.id.cHardTimer);

        option1 = findViewById(R.id.cHard3_OptionA);
        option2 = findViewById(R.id.cHard3_OptionB);
        option3 = findViewById(R.id.cHard3_OptionC);
        option4 = findViewById(R.id.cHard3_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("It is worn by women in Batanes and it is made of palm leaves?", "Yakan", "Urian", "Vakul", "Hudlon", 3));
        questionList.add(new cEasyQ1_List("It refers to a wrap-around piece of cloth worn by women as a skirt and is usually paired with Kimona.", "Hablon", "Patadyong", "Piña", "Sinamay", 2));
        questionList.add(new cEasyQ1_List("It is a quintessential headgear worn by Ivatan men.", "Voyavoy", "Talugong", "Kanayi", "Valik", 2));
        questionList.add(new cEasyQ1_List("It is considered the finest of Philippine textiles mainly because of its delicacy and its natural creamy hue.", "Hablon", "Patadyong", "Piña", "Sinamay", 1));
        questionList.add(new cEasyQ1_List("It is a hand-woven fabric used for clothes and table cloths, taken from a Hiligaynon word which means “to weave”.", "Hablon", "Patadyong", "Piña", "Sinamay", 1));
        questionList.add(new cEasyQ1_List("They wear tight trousers (kuput) matched with collarless, short tailored jacket.", "Yakan", "Tausug", "Tiruray", "T'Boli", 2));
        questionList.add(new cEasyQ1_List("What is the name of the sacred clothing worn by T'Boli people?", "T'nalak", "Semmek", "Kuput", "Kanayi", 1));
        questionList.add(new cEasyQ1_List("Yakan women traditionally made textiles for their cultural dress known as?", "T'nalak", "Semmek", "Vakul", "Tapis", 2));
        questionList.add(new cEasyQ1_List("The __________ women wear blouses made of plain material like satin.", "Yakan", "T'boli", "Tiruray", "Tausug", 4));
        questionList.add(new cEasyQ1_List("The women of _______ use body accessories which include colorful necklaces with lots of beads, shells and coins.", "T'boli", "Tiruray", "Yakan", "Ati", 3));
        questionList.add(new cEasyQ1_List("For accessories, they use simple pieces of jewelry made flowers or animal bones like pig’s teeth for bracelets.", "Yakan", "Ati", "Tausug", "T'boli", 2));
        questionList.add(new cEasyQ1_List("_______ is when only the vertical yarn, the warp, is tie-dyed for weaving. It’s practiced in natural patterns.", "Double ikat", "Weft ikat", "Warp Ikat", "Single Ikat", 1));
        questionList.add(new cEasyQ1_List("Ikat of Ifugao characterized by the following, except for?", "Dominant blue stripes", "Repetitive pattern", "Tedious colors", "Solid Colors", 3));
        questionList.add(new cEasyQ1_List("Created initially in Lubuagan, the _______ which is the wraparound skirt is now more known as the Kalinga.", "Siniwsiwan", "Ka-in", "Ikat", "Inawin", 4));
        questionList.add(new cEasyQ1_List("Kalinga textiles characterized by the following, except for?", "mestizos de España", "principalia", "mestizos de sangleys", "ilustrados", 4));
        questionList.add(new cEasyQ1_List("What is an example of Bontoc blanket and clothing?", "Real Audiencia", "Ministry of Colonies", "Court of Appeals", "Ombudsman", 1));
        questionList.add(new cEasyQ1_List("______ hand woven fabrics are characterized by motifs that include geometric shapes of things around them such as man, lizard, mountain, rains, and flower.", "Encomienda system", "Kasama system", "Bandala system", "Caste system", 1));
        questionList.add(new cEasyQ1_List("The motifs of the Bontocs are the following, except?", "Encomienda system", "Kasama system", "Bandala system", "Caste system", 3));
        questionList.add(new cEasyQ1_List("What do you call to this traditional Filipino tube skirt that is made of hand-woven or machine-woven multi collored cotton cloth made of geometric or floral design?", "falla", "calla", "mella", "libre", 1));
        questionList.add(new cEasyQ1_List("Yakan fabrics are traditionally used as garments. Which among the choices below are not made of Yakan?", "Peninsulares", "Insulares", "Mestizos", "Indio", 3));
        questionList.add(new cEasyQ1_List("It is a kind of weaving that is a primary form of arts and crafts in Panay Island.", "May 19, 1571", "June 3, 1571", "June 24, 1571", "June 1, 1574", 3));
        questionList.add(new cEasyQ1_List("Traditional material used for patadyong weaving are cotton and _____________.", "King Charles I", "Legazpi", "King Philip II", "Lavezaris", 3));
        questionList.add(new cEasyQ1_List("It is a handwoven Philippine textile produced mostly by the Aklanon in the province of Aklan in Western Visayas.", "Beatriz", "Elizabeth", "Juana", "Gabriela", 3));
        questionList.add(new cEasyQ1_List("It is a necklace or bracelet of beads from Mindanao and is made from dried fruit seeds to protect from illness caused by evil spirits.", "Saavedra", "Cabot", "Legazpi", "Villalobos", 4));
        questionList.add(new cEasyQ1_List("This is a type of T’nalak woven from deep brown abaca treated in the ikat process to obtain intricate design.", "Panay ", "Cebu", "Manila", "Sulu", 2));
        setQuestion();
    }
z
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
            case R.id.cHard3_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard3_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard3_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard3_OptionD:
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
            Intent intent = new Intent(cHardQ3.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cHardQ3.this.finish();
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