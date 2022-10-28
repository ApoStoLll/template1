package frog.company.app13june.cc;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import frog.company.app13june.UtilsEnum;

public class jurtyewsrf {

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
