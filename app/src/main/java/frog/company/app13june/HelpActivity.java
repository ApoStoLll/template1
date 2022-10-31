package frog.company.app13june;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }
}