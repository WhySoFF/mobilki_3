package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

public class FunctionalActivity extends AppCompatActivity {

    FirebaseUser currentUser;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getIntent().getExtras();
        currentUser = (FirebaseUser) arguments.get("current_user");
        setContentView(R.layout.activity_functional);
        player = MediaPlayer.create(this, R.raw.muz);
        player.setLooping(true);
        player.start();
    }

    public void toInfo(View view) {
        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);
    }

    public void toProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("current_user", currentUser);
        startActivity(intent);
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        player.stop();
    }

    public void toDev(View view) {
        Intent intent = new Intent(this, DeveloperActivity.class);
        startActivity(intent);
    }

    public void toSmile1(View view) {
        Intent intent = new Intent(this, RecomendationActivity.class);
        intent.putExtra("title", "Ярость и гнев");
        intent.putExtra("description", "Ликвидируйте источник раздрожения, медитируйте, займитесть прослушиванием музыки");
        startActivity(intent);
    }
    public void toSmile2(View view) {
        Intent intent = new Intent(this, RecomendationActivity.class);
        intent.putExtra("title", "Сонливость и усталость");
        intent.putExtra("description", "Отдохните, хорошо поспите, посмотрите кино, медитируйте");
        startActivity(intent);
    }
    public void toSmile3(View view) {
        Intent intent = new Intent(this, RecomendationActivity.class);
        intent.putExtra("title", "Боль и страдание");
        intent.putExtra("description", "Не опускайте нос, все не так плохо, как могло бы быть, лучше порелаксируйте и вздремните");
        startActivity(intent);
    }
    public void toSmile4(View view) {
        Intent intent = new Intent(this, RecomendationActivity.class);
        intent.putExtra("title", "Весел и бодр");
        intent.putExtra("description", "Так держать, вам все горы по колено, слушайне много музыки и получайте удовольствие от жизни");
        startActivity(intent);
    }

    public void toHoroscopes(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}