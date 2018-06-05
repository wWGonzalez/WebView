package com.example.wer.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.txt_web);
    }

    //Metodo botón ir
    public void Navegar(View view){
        Intent i = new Intent(this, ActivityWeb.class);
        i.putExtra("sitioWeb",et1.getText().toString());
        startActivity(i);

    }

}
