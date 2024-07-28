package com.housing;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppComatActivity;
public class SplashActivity extends AppComatActivity {
    @override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
