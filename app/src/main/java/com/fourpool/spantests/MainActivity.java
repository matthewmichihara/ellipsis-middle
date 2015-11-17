package com.fourpool.spantests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This won't have middle ellipsis.
        TextView tv1 = (TextView) findViewById(R.id.text1);

        // This will have middle ellipsis.
        TextView tv2 = (TextView) findViewById(R.id.text2);

        tv1.setMovementMethod(LinkMovementMethod.getInstance());
//        tv2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
