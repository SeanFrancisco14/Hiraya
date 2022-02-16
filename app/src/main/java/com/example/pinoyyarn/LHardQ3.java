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

public class LHardQ3 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<LEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhard_q3);

        question = findViewById(R.id.LHardCurrentQ);
        QCount = findViewById(R.id.LHard_qCount);
        timer = findViewById(R.id.LHardTimer);

        option1 = findViewById(R.id.LHard3_OptionA);
        option2 = findViewById(R.id.LHard3_OptionB);
        option3 = findViewById(R.id.LHard3_OptionC);
        option4 = findViewById(R.id.LHard3_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getLanEasyQuestions();

        hScore = 0;
    }

    private void getLanEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new LEasyQ1_List("These are words that tell something about the subject (simuno).", "Pang-uri", "Panagur", "Adhetibo", "Paksa", 2));
        questionList.add(new LEasyQ1_List("In Filipino grammar, it is a type of sentence wherein the predicate precedes the subject.", "Matuwid", "Karaniwan", "Sukat", "Diretso", 2));
        questionList.add(new LEasyQ1_List("It is a type of sentence wherein the subject goes before the predicate.", "Baliktad", "Kabaligtaran", "Hindi Tuwid", "Saliwaan", 2));
        questionList.add(new LEasyQ1_List("It is a sentence that expresses presence and being.", "Pagmamayroon", "Eksistensyal", "Kontekstwal", "Kongkreto", 2));
        questionList.add(new LEasyQ1_List("It refers to single or double syllables that express intense emotion.", "Padamdam", "Sambitlang", "Pandamdam", "Pasambit", 2));
        questionList.add(new LEasyQ1_List("In Filipino grammar, what are routine greetings and salutations called?", "Pormularyong panlipunan", "Pambungad na pangngalan", "Pangngalang Panambit", "Pananalitang Pambungad", 1));
        questionList.add(new LEasyQ1_List("It is a type of sentence that states a fact or an event.", "Pagbibigay ng Impormasyon", "Pagbibigay ng Katunayan", "Pasalaysay", "Pakuwento", 3));
        questionList.add(new LEasyQ1_List("It is a sentence expresses only one thought. Example: “Maganda ang Panahon”.", "Isahang Pangungusap", "Payak na Pangungusap", "Karaniwang Pangungusap", "Isahang Yari ng Pangungusap", 2));
        questionList.add(new LEasyQ1_List("Consists of one clause that can unite and one or more clauses that cannot unite.", "Tambalan", "Hugnayan", "Dalawahan", "Langkapan", 2));
        questionList.add(new LEasyQ1_List("Consists of two or more clauses that can stand alone and one or more clauses that cannot stand alone.", "Langkapan", "Tambalan", "Hugnayan", "Dalawahan", 1));

        questionList.add(new LEasyQ1_List("It expresses the different parts of a sentence efficiently.", "Pang-ugnay", "Pandiwang", "Pananda", "Pang-angkop", 3));
        questionList.add(new LEasyQ1_List("Experiencing one of the five senses and having a physical nature.", "Basal", "Lansak", "Kongkreto", "Tahas", 4));
        questionList.add(new LEasyQ1_List("Refers to concepts that are not experienced by the five senses and have no physical properties. ", "Di-Kongkreto", "Tasal", "Lansak", "Basal", 4));
        questionList.add(new LEasyQ1_List("Refers to a conglomerate (kalipunan) or majority (karamihan). Example:” tropa”,” barkada”", "Maramihan", "Lansak", "Kabuuan", "Kolektibo", 2));
        questionList.add(new LEasyQ1_List("These are words or phrases that are figurative and abstract.", "Metapora", "Patalinghaga", "Simili", "Idiyoma", 2));

        questionList.add(new LEasyQ1_List("Terms used to add meaning but can be omitted from the sentence without destroying the meaning of the message.", "A. Gregorio del Pilar", "B. Andres Bonifacio", "C. Antonio Luna", "D. Emilio Jacinto", 4));
        questionList.add(new LEasyQ1_List("It connects two words, phrases or clauses in a sentence.", "A. Dipolog", "B. Ipil", "C. Dagonoy", "D. Dapitan", 3));
        questionList.add(new LEasyQ1_List("It connects the modifier (panuring) and the word being treated (salitang tinuturingan)", "A. Mi Ultimo Adios", "B. La Solidaridad", "C. Noli Me Tangere", "D. Ibong Adarna", 4));
        questionList.add(new LEasyQ1_List("It connects a noun to another word in the sentence.", "A. Felipe Calderon", "B. Apolinario Mabini", "C. Pedro Paterno", "D. Jose Rizal", 3));
        questionList.add(new LEasyQ1_List("It always precedes the noun (paksa) or pronoun (panghalip) used in the subject.", "A. February 27", "B. April 9", "C. June 24", "D. December 30", 3));
        questionList.add(new LEasyQ1_List("These are words or phrases that express a specific attitude or intense feeling.", "A. Apolinario Mabini", "B. Emilio Jacinto", "C. Andres Bonifacio", "D. Jose Rizal", 2));
        questionList.add(new LEasyQ1_List("What do you call the relationship of the verb (pandiwa) to the subject (paksa) of the sentence?", "A. Andres Bonifacio", "B. Jose Rizal", "C. Emilio Aguinaldo", "D. Gregorio Del Pilar", 2));
        questionList.add(new LEasyQ1_List("It is the study of how words and morphemes combine to form larger units such as phrases and sentences", "A. Emilio Aguinaldo", "B. Manuel L. Quezon", "C. Andres Bonifacio", "D. Manuel Roxas", 2));
        questionList.add(new LEasyQ1_List("____________ is a set of conventions for writing a language, including norms of spelling, emphasis, and punctuation.", "A. Teodora Alonso", "B. Gregoria de Jesus", "C. Gabriela Silang", "D. Leonor Rivera", 4));
        questionList.add(new LEasyQ1_List("__________ is the study of a language that includes morphology, syntax, semantics, and etymology.", "A. Gregoria de Jesus", "B. Segunda Katikbak", "C. Gabriela Silang", "D. Marina Dizon", 3));

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
            case R.id.LHard3_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard3_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard3_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.LHard3_OptionD:
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
            Intent intent = new Intent(LHardQ3.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //LHardQ3.this.finish();
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
