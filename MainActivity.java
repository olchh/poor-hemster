package com.example.clown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnAddStudents(View view) {
        counter+=1;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if (counter >= 10){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams rectangle = layout.getLayoutParams();
            rectangle.height = 100;
            rectangle.width = 100;
            layout.setLayoutParams(rectangle);
        }
    }
}