package frog.company.app13june;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WActivity extends AppCompatActivity {

    WebView we;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        we = findViewById(R.id.wfwe);
    }

    void sett(){

    }
}
