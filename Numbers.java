package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("one", "lutti", R.drawable.number_one));
        words.add(new word("two", "otiiko", R.drawable.number_two));
        words.add(new word("three", "tolookosu" , R.drawable.number_three));
        words.add(new word("four", "oyyisa", R.drawable.number_four));
        words.add(new word("five", "massokka", R.drawable.number_five));
        words.add(new word("six", "temmokka", R.drawable.number_six));
        words.add(new word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new word("eight", "kawinta", R.drawable.number_eight));
        words.add(new word("nine", "wo'e", R.drawable.number_nine));
        words.add(new word("ten", "na'aacha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

    }

}
