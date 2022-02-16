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

public class hHardQ3 extends AppCompatActivity implements View.OnClickListener {

    private TextView question, QCount, timer;
    private Button option1, option2, option3, option4;
    private List<hEasyQ1_List> questionList;
    private int qNum;
    private CountDownTimer countDown;
    private int hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhard_q3);

        question = findViewById(R.id.hHardCurrentQ);
        QCount = findViewById(R.id.hHard_qCount);
        timer = findViewById(R.id.hHardTimer);

        option1 = findViewById(R.id.hHard3_OptionA);
        option2 = findViewById(R.id.hHard3_OptionB);
        option3 = findViewById(R.id.hHard3_OptionC);
        option4 = findViewById(R.id.hHard3_OptionD);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getHistEasyQuestions();

        hScore = 0;
    }

    private void getHistEasyQuestions() {
        questionList = new ArrayList<>();

        questionList.add(new hEasyQ1_List("What was the rightist wing of La Liga called?", "Cuerpos de Propagandistas", "Cuerpos de Compromisarios", "Cuerpos de Militantes", "Cuerpos de la Revolucionarios", 2));
        questionList.add(new hEasyQ1_List("It referred to provinces not yet fully controlled by the colonial government.", "Alcaldia", "Corregimiento", "Residencia", "Visitador", 2));
        questionList.add(new hEasyQ1_List("The first bishop of Manila in 1581.", "Miguel Lopez de Legazpi", "Domiñgo de Salazar", "Jose Basco Y Vargas", "Pedro de Sarrio", 2));
        questionList.add(new hEasyQ1_List("They accompany the governor general and gobernadorcillo in patroling the town.", "Cuadrilleros", "Guardia Civil", "Guardia Civil Veterana", "Guardia Civil Alcaldia", 1));
        questionList.add(new hEasyQ1_List("Raja Lakandula and Raja Sulayman revolted against Governor Guido de Lavezaris, because of the abuses by the Spaniards. What is the revolt called?", "Manila Revolt", "Tamblot Revolt", "Pampanga Revolt", "Isneg Revolt", 1));
        questionList.add(new hEasyQ1_List("Which one of these Philippine revolts during the Hispanic period lasted longest?", "Dagohoy Revolt", "Parang and Upay Revolt", "Palaris Revolt", "Camerino Revolt", 1));
        questionList.add(new hEasyQ1_List("The Tejeros Convention happened in which Philippine province?", "Manila", "Cavite", "Laguna", "Batangas", 2));
        questionList.add(new hEasyQ1_List("Who was the Spanish governor-general who ordered the deportation of Jose Rizal to Dapitan?", "Camilo de Polavieja", "Fermin Jaudenes", "Carlos Maria dela Torre", "Eulogio Despujol", 1));
        questionList.add(new hEasyQ1_List("What was the name of the Filipino soldier who led the Cavite Mutiny of 1872?", "Lt. Taviel de Andrade", "Fr. Jose Burgos", "Sergeant Lamadrid", "Gen. Mariano Noriel", 3));
        questionList.add(new hEasyQ1_List("Who excommunicated Fr. Gregorio Aglipay?", "Vidal", "Santos", "Norzaleda", "Sin", 3));
        questionList.add(new hEasyQ1_List("Who is the Filipino historian who claimed that there was no Philippine history before the execution of the three nationalist priests?", "Teodoro Agoncillo", "Onofre Corpuz", "Gregorio Zaide", "Fidel Villaruel", 1));
        questionList.add(new hEasyQ1_List("Who established the Spanish colonial rule in the Philippines?", "Miguel Lopez de Legazpi", "Carlos Maria dela Torre", "Andres de Urdaneta", "Ferdinand Magellan", 1));
        questionList.add(new hEasyQ1_List("What economic policy imposed by Spain on the Indios that requires them to do forced labor?", "tribute", "polo y servicios", "bandala", "cedula", 2));
        questionList.add(new hEasyQ1_List("Who were Spaniards born in the Philippines?", "creoles", "peninsulares", "ilustrados", "insulares", 4));
        questionList.add(new hEasyQ1_List("What social class developed the consciousness of the Filipinos to fight Spain?", "mestizos de España", "principalia", "mestizos de sangleys", "ilustrados", 4));
        questionList.add(new hEasyQ1_List("It refers to the highest court of justice in the Philippines during the Spanish occupation", "Real Audiencia", "Ministry of Colonies", "Court of Appeals", "Ombudsman", 1));
        questionList.add(new hEasyQ1_List("An old practice in Spain wherein the King, in an effort to recognize the good deeds, services, and loyalty of his officers and men awarded a piece of land", "Encomienda system", "Kasama system", "Bandala system", "Caste system", 1));
        questionList.add(new hEasyQ1_List("It refers to the obligation of Filipino farmers to sell their products to government at a minimum price.", "Encomienda system", "Kasama system", "Bandala system", "Caste system", 3));
        questionList.add(new hEasyQ1_List("This is the money paid to be exempted from polo.", "falla", "calla", "mella", "libre", 1));
        questionList.add(new hEasyQ1_List("They are a mix of both Spanish and Indio. They were regarded inferior people by both Spanish and Filipinos.", "Peninsulares", "Insulares", "Mestizos", "Indio", 3));
        questionList.add(new hEasyQ1_List("Legazpi took possession of Maynilad in the name of King Philip II on?", "May 19, 1571", "June 3, 1571", "June 24, 1571", "June 1, 1574", 3));
        questionList.add(new hEasyQ1_List("He gave Manila the name, Insigne y Siempre Leal Ciudad.", "King Charles I", "Legazpi", "King Philip II", "Lavezaris", 3));
        questionList.add(new hEasyQ1_List("The wife of Raha Humabon, she was renamed after her baptism for the mother of King Charles I of Spain, Magellan gave her a gift of the image of Sto. Nino.", "Beatriz", "Elizabeth", "Juana", "Gabriela", 3));
        questionList.add(new hEasyQ1_List("A Spanish expedition to the Philippines on 1527, with 3 ships and 110 men. It reached Mindanao but failed to colonize the Philippines.", "Saavedra", "Cabot", "Legazpi", "Villalobos", 4));
        questionList.add(new hEasyQ1_List("A Spanish settlement, the first of its kind in the Philippines, it was established by  Legazpi on 1565.", "Panay ", "Cebu", "Manila", "Sulu", 2));

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
            case R.id.hHard3_OptionA:
                selectedOption = 1;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard3_OptionB:
                selectedOption = 2;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard3_OptionC:
                selectedOption = 3;
                break;
            default:
        }
        switch(v.getId()){
            case R.id.hHard3_OptionD:
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
            Intent intent = new Intent(hHardQ3.this, hScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(hScore) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //hHardQ3.this.finish();
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
