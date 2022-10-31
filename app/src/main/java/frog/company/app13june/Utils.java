package frog.company.app13june;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class Utils {

    public void onSetScore(Activity context, int score){
        SharedPreferences sPref;

        sPref = context.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putInt(UtilsEnum.SCORE, score);
        ed.apply();
    }

    public int onGetScore(Activity context) {
        SharedPreferences sPref;

        sPref = context.getPreferences(Context.MODE_PRIVATE);
        return sPref.getInt(UtilsEnum.SCORE, 50000);
    }

}
