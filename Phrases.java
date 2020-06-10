package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Where are you going?", "minto wuksus"));
        words.add(new word("What is your name?", "tinnә oyaase'nә"));
        words.add(new word("My name is ...", "oyaaset..."));
        words.add(new word("How are you feeling?", "michәksәs?"));
        words.add(new word("I'm feeling good.", "kuchi achit"));
        words.add(new word("Are you coming>", "әәnәs'aa?"));
        words.add(new word("Yes, I'm coming", "hәә’ әәnәm"));
        words.add(new word("I'm coming", "әәnәm"));
        words.add(new word("Let's go", "yoowutis"));
        words.add(new word("come here", "әnni'nem"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

    }
}
