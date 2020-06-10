package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                {
                    Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
                    startActivity(numbersIntent);
                }
            }
        });

        TextView members= (TextView)findViewById(R.id.family);
        members.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                {
                    Intent membersIntent = new Intent(MainActivity.this, Members.class);
                    startActivity(membersIntent);
                }
            }
        });

        TextView colors= (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                {
                    Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
                    startActivity(colorsIntent);
                }
            }
        });

        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                {
                    Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);
                    startActivity(phrasesIntent);
                }
            }
        });
    }

}