package com.thomasle.factoids;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FactoidsActivity extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();
    private TextView mFactTextView; // Android prefix guidelines
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factoids);

        // Assign the Views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactsButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_factoids);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Updates screen with new fact
                mFactTextView.setText(mFactBook.getFact());

                final int color = mColorWheel.getColor();
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
