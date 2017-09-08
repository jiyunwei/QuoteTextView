package com.sxm.example.quotetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private QuoteTextView mText, mText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        mText = (QuoteTextView) findViewById(R.id.quote);
        mText.setText("这是一间营业时间从午夜十二点到早上七点的特殊食堂这");

        mText2 = (QuoteTextView) findViewById(R.id.quote2);
        mText2.setQuoteTextView("这是一间营业时间从午夜十二点到早上七点的特殊食堂这这是一间营业这这是一间营业时间从午夜十二点到早上七点的特殊食堂这","","rating_star");

    }
}
