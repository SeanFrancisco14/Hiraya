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

public class cHardQ2 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<cEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int cScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chard_q2);

        question = findViewById(R.id.cHardCurrentQ);
        QCount = findViewById(R.id.cHard_qCount);
        timer = findViewById(R.id.cHardTimer);

        option1 = findViewById(R.id.cHard2_OptionA);
        option2 = findViewById(R.id.cHard2_OptionB);
        option3 = findViewById(R.id.cHard2_OptionC);
        option4 = findViewById(R.id.cHard2_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getCultEasyQuestions();

        cScore = 0;
    }

    private void getCultEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new cEasyQ1_List("Who was the first Philippine National Artist in 1972, recognized for outstanding contribution to Philippine art??", " Fernando C. Amorsolo", "Lázaro Francísco", "Federico Aguilar Alcuaz", "Manuel Conde", 1));
        questionList.add(new cEasyQ1_List("Which Philippine national artist used the pen name Doveglion?", " F. Sionil Jose", "Jose Garcia Villa", "Edilberto Tiempo", "Francisco Arcellana", 2));
        questionList.add(new cEasyQ1_List("Who created the famous Bamboo Organ of Las Piñas?", "Architect Ludwig Alvarez", "Fray Luca Pacioli", "Father Diego Cera", "Architect Francisco Mañosa", 3));
        questionList.add(new cEasyQ1_List("Who was the first National Artist for Historical Literature in the Philippines?", "Carlos Quirino", "Carlos P. Romulo", "Amado V. Hernandez", "Nestor Vicente Madali Gonzales", 1));
        questionList.add(new cEasyQ1_List("This writer received a rare achievement after two of his short stories won first prizes at the Don Carlos Palanca Memorial Awards for Literature two years in a row (1970 and 1971).", "Jose Garcia Villa", "Amado Hernandez", "Ricky Lee", "Virgilio Almario", 3));
        questionList.add(new cEasyQ1_List("Which national dance artist of the Philippines had the pen name Cristina Luna?", "Leonor Orosa-Goquingco", "Diana Toy", "Francisca Reyes-Aquino", "Atang dela Rama", 1));
        questionList.add(new cEasyQ1_List("Which national music artist of the Philippines studied at Escuela Catolica de Nuestra Padre Jesus Nazareno?", "Ernani Joson Cuenco", "Jose Maceda", "Antonio Molina", "Levi Celerio", 3));
        questionList.add(new cEasyQ1_List("The famous sarsuela in the country entitled 'Walang Sugat' was written by?", "Howie Severino", "Precioso Palma", "Severino Reyes", "Ryan Cayabyab", 3));
        questionList.add(new cEasyQ1_List("He is a prolific Filipino writer whose works have been translated in more than 20 languages.", "Nick Joaquin", "F. Sionil Jose", "N.V.M Gonzalez", "Francisco Arcellana", 2));
        questionList.add(new cEasyQ1_List("He is an award-winning poet, librettist and scholar.", "Bienvenido Lumbera", "Cirilo F. Bautista", "Lazaro Francisco", "Carlos L. Quirino", 1));
        questionList.add(new cEasyQ1_List("He is a highly praised poet, fictionist and essayist.", "Bienvenido Lumbera", "Cirilo F. Bautista", "Lazaro Francisco", "Carlos L. Quirino", 2));
        questionList.add(new cEasyQ1_List("He was imprisoned for his participation in the communist movement.", "Virgilio Almario", "Carlos P. Romulo", "Jose Garcia Villa", "Amado V. Hernandez", 4));
        questionList.add(new cEasyQ1_List("He is also known as Rio Alma.", "Edith Ocampo", "Carlos Garcia", "Virgilio S. Almario", "Jose Villa", 3));
        questionList.add(new cEasyQ1_List("If you will study about his works, you will notice his use of comma in every word.", "Jose Garcia Villa", "Edith L. Tiempo", "Nick Joaquin", "F. Sionil Jose", 1));
        questionList.add(new cEasyQ1_List("He also used the pen name Quijano de Manila for some of his works.", "Amado V. Hernandez", "Nick Joaquin", "Virgilio Almario", "Carlos Romulo", 2));
        questionList.add(new cEasyQ1_List("He is a famed poet, short story writer, essayist, professor and recipient of numerous recognitions.", "Nick Joaquin", "N. V. M. Gonzalez", "Francisco Arcellana", "F. Sionil Jose", 2));
        questionList.add(new cEasyQ1_List("He is a courageous Filipino writer well-known for his disapproval of social injustices in the country.", "Virgilio S. Almario", "Amado V. Hernandez", "Carlos P. Romulo", "Rio Alma", 2));
        questionList.add(new cEasyQ1_List("He is also the founder of the Boy scouts of the Philippines.", "Carlos P. Romulo", "Amado V. Hernandez", " Virgilio S. Almario", "Nick Joaquin", 1));
        questionList.add(new cEasyQ1_List("One of the most talented biographers of his time.", "Lazaro Francisco", "Carlos P. Romulo", "Carlos L. Quirino", "Cirilo F. Bautista", 3));
        questionList.add(new cEasyQ1_List("He is considered to be an icon in Tagalog writing through his nationalist and social criticisms.", "Amado V. Hernandez", "Lazaro Fancisco", "Bienvenido Lumbera", "Carlos L. Quirino", 2));
        questionList.add(new cEasyQ1_List("Who is the National Artist that composed the accompaniment to the folkdance 'Pandango sa Ilaw'?", "Jose Maceda", "Ernani Cuenco", "Antonio Buenaventura", "Levi Celerio", 3));
        questionList.add(new cEasyQ1_List("Who is the National Artist that is known for incorporating indigenous Filipino instruments into orchestral productions?", "Jose Maceda", "Honorata Dela Rama", "Antonio Molina", "Lucrecia Kasilag", 4));
        questionList.add(new cEasyQ1_List("Who is the National Artist that introduced the French style of piano playing in the Philippines?", "Antonio Buenaventura", "Jose Maceda", "Ryan Cayabyab", "Antonio Molina", 2));
        questionList.add(new cEasyQ1_List("Who is the National Artist that showcased the Filipino love ballad songs by adding the elements of Kundiman to it?", "Ryan Cayabyab", "Levi Celerio", "Ernani Cuenco", "Antino Molina", 3));
        questionList.add(new cEasyQ1_List("Who is the National Artist that used impressionism style of music in his works?", "Jose Maceda", "Ryan Cayabyab", "Levi Celerio", "Antonio Molina", 4));

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
            case R.id.cHard2_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard2_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard2_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch (v.getId()) {
            case R.id.cHard2_OptionD:
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
            Intent intent = new Intent(cHardQ2.this, cScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(cScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //cHardQ2.this.finish();
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