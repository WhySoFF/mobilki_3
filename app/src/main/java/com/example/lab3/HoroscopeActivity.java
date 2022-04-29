package com.example.lab3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class HoroscopeActivity extends AppCompatActivity {

    RequestQueue rq;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope);
        ConstraintLayout constraintLayout = findViewById(R.id.space);
        constraintLayout.getBackground().setAlpha(150);
        getSupportActionBar().hide();
        Bundle arguments = getIntent().getExtras();
        textView1 = findViewById(R.id.textView10);
        textView1.setText(arguments.getString("name"));
        url=arguments.getString("url");
        textView2 = findViewById(R.id.textView9);
        textView3 = findViewById(R.id.textView11);
        textView4 = findViewById(R.id.textView12);
        textView5 = findViewById(R.id.textView13);
        textView6 = findViewById(R.id.textView14);
        textView7 = findViewById(R.id.textView15);
        textView8 = findViewById(R.id.textView16);
        rq = Volley.newRequestQueue(this);
        sendjsonrequest(1);
    }

    public void sendjsonrequest(int num) {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    textView2.setText(response.getString("current_date"));
                    textView3.setText(response.getString("date_range"));
                    textView4.setText("Compatibility with "+response.getString("compatibility"));
                    textView5.setText("Mood:"+response.getString("mood"));
                    textView6.setText("Lucky number:"+response.getString("lucky_number"));
                    textView7.setText("Lucky time:"+response.getString("lucky_time"));
                    textView8.setText(response.getString("description"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        rq.add(jsonObjectRequest);
    }

}