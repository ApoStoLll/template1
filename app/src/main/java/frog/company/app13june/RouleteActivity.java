package frog.company.app13june;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class RouleteActivity extends AppCompatActivity {

    CountDownTimer cTimer;
    int score = 10000;
    Button btnMyMoney;
    ImageView imgRoulette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulete);

        btnMyMoney = findViewById(R.id.btnMyMoney);
        btnMyMoney.setText(String.format("Score: %d",score));

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> onBackPressed());

        imgRoulette = findViewById(R.id.imgRoulette);

        Button btnTwist = findViewById(R.id.btnTwist);
        btnTwist.setOnClickListener(view -> {
            startGame();
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        score = new Utils().onGetScore(this);
        btnMyMoney.setText(String.format("Score: %d",score));
    }

    private void startGame(){
        if(cTimer == null) {
            new Utils().onSetScore(this, score);
            btnMyMoney.setText(String.format("Score: %d", score));

            startTimer();
        }
        else
            Toast.makeText(this,"Game already", Toast.LENGTH_SHORT).show();
    }

    private void startTimer() {
        Random rnd = new Random();

        int timer = 3 + (int)(Math.random() * ((9 - 3) + 1));
        int count = 5 + (int)(Math.random() * ((15 - 5) + 1));

        cTimer = new CountDownTimer(timer*1000, count) {
            @Override
            public void onTick(long l) {
                imgRoulette.setRotation(imgRoulette.getRotation() + 22.5f);
            }

            @Override
            public void onFinish() {
                onResult();
                cTimer = null;
            }
        };
        cTimer.start();

    }

    private void onResult(){
        int[] resultArray = new int[]{200,400,1000,700,400,300,10000,600,400,800,1000,200,100,400,500,900,200};


        while(true){
            if(imgRoulette.getRotation() > 360)
                imgRoulette.setRotation(imgRoulette.getRotation() - 360);
            else
                break;
        }

        int res = (int)(imgRoulette.getRotation()  / 22.5);

        Toast.makeText(this, "You have won ${resultArray[res]} coins!", Toast.LENGTH_SHORT).show();
        score += resultArray[res];
        new Utils().onSetScore(this, score);

        btnMyMoney.setText(String.format("Score: %d", score));
    }
}