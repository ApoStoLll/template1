package frog.company.app13june.kyf;

import android.content.Context;
import android.util.Log;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import frog.company.app13june.ISelectCard;
import frog.company.app13june.Model;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class srtrhju {
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {
        return this.client;
    }

    String url = "https://deckofcardsapi.com/api/deck/new/draw/?count=30";

    public final void onSelectCard(@NotNull Context context, @Nullable final ISelectCard mOnListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("onSelectCard", "fail");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String strRes = response.body().string();
                try {
                    JSONObject obj = new JSONObject(strRes);
                    JSONArray array = obj.getJSONArray("cards");
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString("value")){
                            case "ACE" : { value = 14; break; }
                            case "KING" : { value = 13; break; }
                            case "QUEEN" : { value = 12; break; }
                            case "JACK" : { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString("value")); break; }
                        }
                        arrayList.add(new Model(res.getString("image"), value, res.getString("suit")));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
