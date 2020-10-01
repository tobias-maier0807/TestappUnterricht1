package com.example.testappunterricht;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    //Außerhalb der Methoden:
    TextView title;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   //drin lassen sunst funktioniert nichts
        setContentView(R.layout.activity_main);   //drin lassen sunst funktioniert nichts
        Button rot = (Button) findViewById(R.id.button_red);
        Button gelb = (Button) findViewById(R.id.button_gelb);
        Button ende = (Button) findViewById(R.id.button_ende);
        title = (TextView) findViewById(R.id.text);
        rot.setOnClickListener(this);
        gelb.setOnClickListener(this);
        ende.setOnClickListener(this);


        //in res/drawable die Grafiken einfügen
        //layout --> Zentrale designdatei
        //mipmap --> nur für die Startelemente --> spezielles design hinzufügen
        //values --> styles.xml funktioniert wie .css
        //values --> strings.xml für die entsprechende Sprache der Name der App
        //values colors.xml sind die farben der app
        //Bei Fehler:
        //File/invalide caches/restart --> neustart des Programms (wenn keine Fehlermeldung kommt aber nicht funkioniert)
        //Build /Rebuild Project
        //test123

    //Grandle rechts oben\Testapp Unterricht\Tasks (kleine Hilfe)
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(getApplicationContext(),  "Sie haben einen Button geklickt", Toast.LENGTH_LONG).show();

    switch(v.getId()) {
        case R.id.button_red:
            title.setBackgroundColor(Color.RED);
        break;

        case R.id.button_gelb:
            title.setBackgroundColor(Color.YELLOW);
         break;

        case R.id.button_ende:
         finish();
    }
    }
}