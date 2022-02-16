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

public class hHardQ4 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<hEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhard_q4);

        question = findViewById(R.id.hHardCurrentQ);
        QCount = findViewById(R.id.hHard_qCount);
        timer = findViewById(R.id.hHardTimer);

        option1 = findViewById(R.id.hHard4_OptionA);
        option2 = findViewById(R.id.hHard4_OptionB);
        option3 = findViewById(R.id.hHard4_OptionC);
        option4 = findViewById(R.id.hHard4_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getHistEasyQuestions();

        hScore = 0;
    }

    private void getHistEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new hEasyQ1_List("According to the Spanish authorities, what was the main reason for the execution of GOMBURZA?", "Secularization issue", "Conspiracy against Spanish King", "Involvement in Cavite Mutiny", "Failure to follow the Catholic teachings", 3));
        questionList.add(new hEasyQ1_List("Rizal wrote the lines 'If Burgos had shown the courage of Gomez, the Filipinos would have been different from what they are today' on his letter to?", "Harry Sichrovsky on May 23, 1887", "Mariano Ponce on April 18 1889", "Maximo Viola on June 9 1883", "Ferdinand Blumentritt on December 30 1886", 2));
        questionList.add(new hEasyQ1_List("He concluded that the retraction document, said to have been discovered in 1935, was not in Rizal's handwriting.", "Ricardo P. Garcia", "Pio Valenzuela", "Rafael Palma", "Guillermo Masangkay", 1));
        questionList.add(new hEasyQ1_List("He stated 'Surely whether Rizal died as a Catholic or an apostate adds or detracts nothing from his greatness as a Filipino... Catholic or Mason, Rizal is still Rizal.'", "Jose Diokno", "Nicolas Zafra", "Gregorio Zaede", "Marciano Guzman", 1));
        questionList.add(new hEasyQ1_List("Which event paved the way for the influx of liberal ideas from Europe which also influenced the emergence of Filipino consciousness?", "1872 Cavity Mutiny", "Opening of the Suez Canal", "French Revolution", "American Revolution", 2));
        questionList.add(new hEasyQ1_List("All of these are Controversies to arise in Philippine History except one?", "Site of the First Mass", "Cavite Mutiny", "Battle of Tirad Pass", "Cry of Rebellion: Balintawak or Pugadlawin", 3));
        questionList.add(new hEasyQ1_List("What was the punishment given to three Filipino martyr-priests?", "Firing Squad", "Reclusion Perpetua", "Garote", "Silya Elektrika", 3));
        questionList.add(new hEasyQ1_List("In this Controversy, it can be used as benchmark in measuring how present-day society values martyrdrom, courage and bravery in understanding nationalism and patriotism.", "Rizal's Retraction", "First Mass in Limasawa", "Execution of Rizal", "All of the above", 1));
        questionList.add(new hEasyQ1_List("He wrote a letter to Rizal describing the current situation of the Filipinos due to taxes.", "Austin Coates", "Rafael Palma", "Mariano Herbosa", "Macario Sakay", 3));
        questionList.add(new hEasyQ1_List("There are several claims that Bolinao may have been earlier than Limasawa/Masao, but one historian refuted Bolinao’s claim. Who was the explorer that landed on Bolinao?", "Andres de Urdaneta", "Odoric of Pordenone", "Hernandeo de Magallanes", "Miguel Lopez de Legazpi", 2));
        questionList.add(new hEasyQ1_List("The most weighing reason why the Native Heroes did not qualify for the candidacy of National Hero.", "The scale of their movements was only on a baranggay level.", "They were not literate enough to qualify.", "Their resistance was believed to be mostly politically motivated only.", "They did not accept Christianity as a religion.", 3));
        questionList.add(new hEasyQ1_List("In 1996, the National Historical Institute (NHI) has already reaffirmed the popular belief propelled by ___________ that the first Holy Mass was celebrated in Masao in Butuan on March", "Republic Act 7384", "Republic Act 2836", "Republic Act 2733", "Republic Act 6542", 3));
        questionList.add(new hEasyQ1_List("Who was the Spanish governor-general when the Cavite Mutiny happened?", "Miguel Lopez de Legazpi", "Rafael de Izquierdo", "Ramon Blanco", "Camilo de Polavieja", 2));
        questionList.add(new hEasyQ1_List("The Malolos Congress was conceived by Mabini as:", "An advisory body", "A legislative body", "A judicial body", "An executive body", 1));
        questionList.add(new hEasyQ1_List("A political condition common throughout the archipelago that develop nationalism among the Indios.", "Unfair treatment against women ", "Immense church influence over state affairs", "Equal opportunity for all the social classes", "Discrimination by foreign parties", 3));
        questionList.add(new hEasyQ1_List("In __________ , Valenzuela averred that the Katipunan began meeting on 22 August while the Cry took place on 23 August at Apolonio Samson’s house in Balintawak.", "1911", "1909", "1910", "1912", 1));
        questionList.add(new hEasyQ1_List("This person was a 19th-century Katipunero who had rivalries with his group mates. Due to this, he exposed the secret society of Katipunan. Who was he?", "Miguel Vicos", "Pedro Paterno", "Teodoro Patiño", "Mariano Gil", 3));
        questionList.add(new hEasyQ1_List("What was the name of the Filipino soldier who led the Cavite Mutiny of 1872?", "Fr. Jose Burgos", "Lt. Taviel de Andrade", "Gen. Mariano Noriel", "Sergeant Lamadrid", 4));
        questionList.add(new hEasyQ1_List("Below are the literary works of Andres Bonifacio except for?", "Ang Dapat Mabatid ng mga Tagalog", "Katapusang Hibik ng Pilipinas", "Sa Mga Kababayan", "Tapunan ng Lingap", 3));
        questionList.add(new hEasyQ1_List("All of which is true about Antonio Luna except for?", "It is said that Luna was prolific with the gun and rifle.", "Juan Luna killed his wife and mother-in-law.", "Antonio and his brother Juan set up a firing club called Sala de Armas.", "He was assassinated by the order of Aguinaldo.", 3));
        questionList.add(new hEasyQ1_List("A failed uprising in 1872 headed by Seargeat Lamadrid in an attempt to overthrow Spanish regime?", "Gomburza Mutiny", "Philippine Revolution", "Dagohoy Revolt", "Cavite Mutiny", 4));
        questionList.add(new hEasyQ1_List("It is the place claimed by the people of Butuan as the first site of mass in the Philippines.", "Limasawa", "Mazaua", "Cebu", "Panay", 2));
        questionList.add(new hEasyQ1_List("Based on the plan proposed by whom was The Malolos Constitution drafted?", "Paterno", "Calderon", "Mabini", "Aguinaldo", 2));
        questionList.add(new hEasyQ1_List("A body of documents on the Philippine revolutions that contains confidential reports, transcripts, clippings, and photographs from Spanish and Philippine newspapers.", "Cuerpos de Compromisarios de Manila", "Cuerpo de Vigilancia de Manila", "Cuerpos de Propagandistas de Manila", "Cuerpos de Militantes de Manila", 2));
        questionList.add(new hEasyQ1_List("Which is true about Emilio Aguinaldo?", "He saved Bonifacio’s life once.", "He prioritized the investigation for the alleged rape of Bonifacio’s wife.", "He ignored Luna’s advice for guerrilla warfare only to use it in the end.", "He engaged in political mudslinging against Jose P. Laurel.", 3));

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
            case R.id.hHard4_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard4_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard4_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard4_OptionD:
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
            Intent intent = new Intent(hHardQ4.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //hHardQ4.this.finish();
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
