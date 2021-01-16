package com.example.timetableforwinter_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class displayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent=getIntent();
        String day = intent.getStringExtra(MainActivity.DAY);
        TextView t1=(TextView) findViewById(R.id.textView28);
        TextView t2=(TextView) findViewById(R.id.textView5);
        TextView t3=(TextView) findViewById(R.id.textView6);
        TextView t4=(TextView) findViewById(R.id.textView50);
        TextView t5=(TextView) findViewById(R.id.textView11);
        TextView t6=(TextView) findViewById(R.id.textView12);
        TextView t7=(TextView) findViewById(R.id.textView49);
        TextView t8=(TextView) findViewById(R.id.textView17);
        TextView t9=(TextView) findViewById(R.id.textView18);
        TextView t10=(TextView) findViewById(R.id.textView52);
        TextView t11=(TextView) findViewById(R.id.textView20);
        TextView t12=(TextView) findViewById(R.id.textView22);
        TextView t13=(TextView) findViewById(R.id.textView25);
        TextView t14=(TextView) findViewById(R.id.textView26);
        TextView t15=(TextView) findViewById(R.id.textView53);

        switch(day)
        {
            case "Monday":
                t1.setText("Schedule for Monday");
                t2.setText("IT215");
                t3.setText("Systems Software");
                t4.setText("Prof. Jay Prakash");
                t5.setText("EL213");
                t6.setText("Analog Circuits");
                t7.setText("Prof. Tapas Kumar Maiti");
                t8.setText("SC209");
                t9.setText("Enviromental Studies");
                t10.setText("Prof. Ranendu Ghosh");
                t11.setText("Lab");
                t12.setText("2:00 PM - 4:00 PM");
                t13.setText("CT215");
                t14.setText("Analog Comunication and Transmission Line Theory");
                t15.setText("Prof. Deepak Ghodgaunkar");
                break;
            case "Tuesday":
                t1.setText("Schedule for Tuesday");
                t2.setText("CT215");
                t3.setText("Analog Comunication and Transmission Line Theory");
                t4.setText("Prof. Deepak Ghodgaunkar");
                t5.setText("-");
                t6.setText("No scheduled lecture");
                t7.setText("-");
                t8.setText("SC221");
                t9.setText("Engineered Materials");
                t10.setText("Prof. Anil Roy");
                t11.setText("Lab");
                t12.setText("2:00 PM - 5:00 PM");
                t13.setText("EL213");
                t14.setText("Analog Circuits");
                t15.setText("Prof. Tapas Kumar Maiti");
                break;
            case "Wednesday":
                t1.setText("Schedule for Wednesday");
                t2.setText("SC209");
                t3.setText("Enviromental Studies");
                t4.setText("Prof. Ranendu Ghosh");
                t5.setText("SC222");
                t6.setText("Probability, Statistics and Information Theory");
                t7.setText("Prof. Gagan Garg");
                t8.setText("CS201");
                t9.setText("Introductory Computational Physics");
                t10.setText("Prof. Arnab Ray");
                t11.setText("Tutorial");
                t12.setText("2:00 PM - 3:00 PM");
                t13.setText("SC222");
                t14.setText("Probability, Statistics and Information Theory");
                t15.setText("Prof. Gagan Garg");
                break;
            case "Thursday":
                t1.setText("Schedule for Thursday");
                t2.setText("CT215");
                t3.setText("Analog Comunication and Transmission Line Theory");
                t4.setText("Prof. Deepak Ghodgaunkar");
                t5.setText("IT215");
                t6.setText("Systems Software");
                t7.setText("Prof. Jay Prakash");
                t8.setText("EL213");
                t9.setText("Analog Circuits");
                t10.setText("Prof. Tapas Kumar Maiti");
                t11.setText("No Scheduled Lab or tutorial today");
                t12.setText("-");
                t13.setText("-");
                t14.setText("-");
                t15.setText("-");
                break;
            case "Friday":
                t1.setText("Schedule for Friday");
                t2.setText("SC221");
                t3.setText("Engineered Materials");
                t4.setText("Prof. Anil Roy");
                t5.setText("CS201");
                t6.setText("Introductory Computational Physics");
                t7.setText("Prof. Arnab Ray");
                t8.setText("SC222");
                t9.setText("Probability, Statistics and Information Theory");
                t10.setText("Prof. Gagan Garg");
                t11.setText("Tutorial");
                t12.setText("2:00 PM - 3:00 PM");
                t13.setText("CS201");
                t14.setText("Introductory Computational Physics");
                t15.setText("Prof. Arnab Ray");
        }
    }
}