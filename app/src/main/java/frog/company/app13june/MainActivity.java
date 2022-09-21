package frog.company.app13june;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGame = findViewById(R.id.btnGame);
        Button btnRoulette = findViewById(R.id.btnRoulette);
        Button btnHelp = findViewById(R.id.btnHelp);

        btnGame.setOnClickListener(view -> {
            startActivity(new Intent(this, GameActivity.class));
        });

        btnRoulette.setOnClickListener(view -> {
            startActivity(new Intent(this, RouleteActivity.class));
        });

        btnHelp.setOnClickListener(view -> {
            startActivity(new Intent(this, HelpActivity.class));
        });
    }
}