package frog.company.app13june;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import frog.company.app13june.databinding.ActivityGameBinding;

public class GameActivity extends AppCompatActivity implements IResultDialog, ISelectCard {

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnBet.setOnClickListener(view -> {
            step++;

            runOnUiThread(() -> {
                switch (step) {
                    case 1: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card4);
                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy4);
                        onAddCard(true);
                    }
                    case 2: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card5);
                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy5);
                        onAddCard(true);

                        onStopGame();
                    }
                    default: step = 0;
                }
            });
        });

        onStartGame();
    }
    private void onStartGame(){
        runOnUiThread(() -> {
            new HelperJ().onSelectCard(this, this);
        });
    }

    private void onStopGame(){

        int myResult = 0;
        int emyResult = 0;

        for(Model i : myCard)
            myResult += i.getValue();

        for(Model i : emyCard)
            emyResult += i.getValue();

        step = 0;
        index = 0;
        models = new ArrayList<>();
        emyCard = new ArrayList<>();
        myCard = new ArrayList<>();

        int finalMyResult = myResult;
        int finalEmyResult = emyResult;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new DialogsJ().dialogResult(this, "You won. Do you want to try again?\n", this);
            else
                new DialogsJ().dialogResult(this, "Your combination has lost. Do you want to try again?\n", this);
        });
    }

    private void onAddCard(Boolean emy){
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card2);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card3);
            onAddCard(false);

            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy1);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy2);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy3);
            onAddCard(true);
        });


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
                binding.cardEmy3.setImageDrawable(null);
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);

                binding.card1.setImageDrawable(null);
                binding.card2.setImageDrawable(null);
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
                binding.card5.setImageDrawable(null);

                onStartGame();
            }
        });
    }
}