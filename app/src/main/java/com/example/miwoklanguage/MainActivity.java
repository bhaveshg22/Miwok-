package com.example.miwoklanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view of the particular view
        TextView numbers=(TextView)findViewById(R.id.numbers);

        //passing the instance of the class so that message could be popped up
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Open the list of Numbers",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }
        });

        //find the view of the family view
        TextView family=(TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Open the list of Family",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(i);
            }
        });


        //find the view of the phrases activty
        TextView phrases=(TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Open the list of Phrases",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
            }
        });

        //find the view of the colors activity
        TextView colors=(TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Open the list of Colors",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
            }
        });

    }
//    public void openNumbersList(View v){
//        Intent i=new Intent(this,NumbersActivity.class);
//        startActivity(i);
//    }
}