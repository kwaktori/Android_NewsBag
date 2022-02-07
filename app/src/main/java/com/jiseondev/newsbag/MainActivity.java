package com.jiseondev.newsbag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jiseondev.newsbag.newsBag.NewsBagListActivity;
import com.jiseondev.newsbag.newsList.NewsListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        View newsListView = findViewById(R.id.cl_news_list);
        View newsBagView = findViewById(R.id.cl_news_bag);

        newsListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newsListIntent = new Intent(getApplicationContext(), NewsListActivity.class);
                startActivity(newsListIntent);
            }
        });

        newsBagView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newsBagListIntent = new Intent(getApplicationContext(), NewsBagListActivity.class);
                startActivity(newsBagListIntent);
            }
        });
    }
}