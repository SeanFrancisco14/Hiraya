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

public class hHardQ2 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<hEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhard_q2);

        question = findViewById(R.id.hHardCurrentQ);
        QCount = findViewById(R.id.hHard_qCount);
        timer = findViewById(R.id.hHardTimer);

        option1 = findViewById(R.id.hHard2_OptionA);
        option2 = findViewById(R.id.hHard2_OptionB);
        option3 = findViewById(R.id.hHard2_OptionC);
        option4 = findViewById(R.id.hHard2_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getHistEasyQuestions();

        hScore = 0;
    }

    private void getHistEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new hEasyQ1_List("Who is the highest American military official that was killed in action during the Filipino-American war?", "Col. Grayson", "Gen. Pershing", "Gen. Lawton", "Gen. Merrit", 3));
        questionList.add(new hEasyQ1_List("What is the name of Filipino armed contingent that helped the Americans capture Aguinaldo?", "Fire Brigade", " Balangiga Rangers", "Macabebe Scouts", "Abu Sayyaf", 3));
        questionList.add(new hEasyQ1_List("One of the last Filipino generals who fought the Americans and established the so-called 'Tagalog Republic’.", "Macario Sakay", "Manuel Tinio", "Miguel Malvar", "Gregorio del Pilar", 1));
        questionList.add(new hEasyQ1_List("Who was the last general of the Filipino-American revolution to surrender to the Americans?", "Miguel Malvar", "Cornelio Felizardo", "Artemio Ricarte", "Simeon Ola", 4));
        questionList.add(new hEasyQ1_List("It is the law which allowed the establishment of American Civil Government in the Philippines.", "Tydings-McDuffie Law", "Jone’s Law of 1916", "Taft’s Law", "Warren Law", 2));
        questionList.add(new hEasyQ1_List("He was a former President of the USA who appointed General MacArthur to rule and govern the Philippines.", "Dwight D. Eisenhower", "Franklin D. Roosevelt", "George Washington", "William Howard Taft", 4));
        questionList.add(new hEasyQ1_List("Who was the American President who declared the Benevolent Assimilation?", "William McKinley", "Theodore Roosevelt", "Franklin Roosevelt", "Warren Harding", 1));
        questionList.add(new hEasyQ1_List("Which recommended that US should remain in the Philippines since our country was not yet ready for independence?", "Jones Law", "Tydings-McDuffie Law", "Schurman Commission", "Taft Commission", 2));
        questionList.add(new hEasyQ1_List("Which provided for a 10-year transition period under Commonwealth?", "Tydings-McDuffie Law", "Jones Law", "Schurman Commission", "Taft Commission", 1));
        questionList.add(new hEasyQ1_List("Which of the following laws of the Americans defined the structure, the power and duties of the three branches of government in the Philippines?", "Jones Law", "Hare-Hawes Cutting Act", "Tydings-McDuffie Law", "Cooper Act", 1));
        questionList.add(new hEasyQ1_List("__________________ provided the US bill of rights for the Filipino people", "Cooper Act", "Taft Commission", "Hare-Hawes Cutting Act", "Tydings-McDuffie", 2));
        questionList.add(new hEasyQ1_List("_________________ established a civil government and train Filipinos for self-government.", "Cooper Act", "Jones Law", "Taft Commission", "Wood-Forbes Mission", 1));
        questionList.add(new hEasyQ1_List("What was the evidence that the Americans dominate the provincial government?", "The Filipinos are not allowed to vote for the provincial government", "The officers for the provincial government were appointed by the Central Government", "The influential positions were under the Americans", "The American Commissioner supervise the provincial government", 3));
        questionList.add(new hEasyQ1_List("Why did the elite dominate the local government?", "Because they had the money to buy votes", "Because they are the well-educated", "Because the masses had no interest", "Because of the qualifications for suffrage", 4));
        questionList.add(new hEasyQ1_List("When was the civil government in the Philippines officially inaugurated?", "August 9, 1991", "May 16, 1901", "July 4, 1901", "July 4, 1908", 3));
        questionList.add(new hEasyQ1_List("This amendment called for the establishment of a civil government in the Philippines. ", "Taft Amendment", "Spooner Amendment", "Mckinley Amendment", "Jones Amendment", 2));
        questionList.add(new hEasyQ1_List("He was the US President who ordered the colonization of the Philippines.", "Henry Cooper", "William Mckinley", "Theodore Roosevelt", "Jacob Schurman", 2));
        questionList.add(new hEasyQ1_List("What was the name of the United States Navy ship that sank in Havana Harbor in February 1898, contributing to the outbreak of the Spanish–American War?", "USS Dolphin", "USS Maine", " U.S.S. Brooklyn", "U.S.S. Marblehead", 2));
        questionList.add(new hEasyQ1_List("Where was the USS Maine anchored?", "Trinidad, Cuba", "Los Angeles", "Corregidor Island", "Havana, Cuba", 4));
        questionList.add(new hEasyQ1_List("Who led the American fleet who arrived at the Manila bay on May 1, 1898?", "General Fermin Faudenes", "Major General Wesley Merritt", "Commodore George Dewey", "General Francis Green", 3));
        questionList.add(new hEasyQ1_List("When did the Mock battle took place?", "August 13,", "August 13,1898", "August 14,1898", "August 13,1897", 2));
        questionList.add(new hEasyQ1_List("Who is the Spanish fleet commander who fought against the American fleet led by Commodore George Dewey?", "General Francis Green", "Emilio Aguinaldo", "Governor General Fermin Jaudenes", "Admiral Patricio Montojo", 4));
        questionList.add(new hEasyQ1_List("He is a Spanish commander and also one of the people who knew about the Mock battle in Manila.", "General Francis Green", "General Wesley Merritt", "Governor General Fermin Jaudenes", "Admiral Patricio Montojo", 3));
        questionList.add(new hEasyQ1_List("Theodore Roosevelt and his 'Rough Riders' fought at which battle?", "The Battle of Sand Wand Hill", "The Battle of Manila Bay", "The Battle of Madrid", "The Battle of San Juan Hill", 4));
        questionList.add(new hEasyQ1_List("_____________ was elected as the president of the Constitutional Convention in 1934.", "Manuel Quezon", "Emilio Aguinaldo", "Claro Recto", "Cayetano Arellano", 3));

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
            case R.id.hHard2_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard2_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard2_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard2_OptionD:
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
            Intent intent = new Intent(hHardQ2.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //hHardQ2.this.finish();
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
