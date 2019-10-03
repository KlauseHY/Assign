package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        //shanghai
        ConstraintLayout chunk1 = findViewById(R.id.shanghai);
        ImageView img1=chunk1.findViewById(R.id.imageView1);
        img1.setImageResource(R.drawable.shanghai);
        TextView tv1=chunk1.findViewById(R.id.textView1);
        tv1.setText("Shanghai");
        TextView tv2=chunk1.findViewById(R.id.textView2);
        Calendar calendar1=Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        tv2.setText(sdf.format(calendar1.getTime()));

        //sydney
        ConstraintLayout chunk2 = findViewById(R.id.sydney);
        ImageView img2=chunk2.findViewById(R.id.imageView1);
        img2.setImageResource(R.drawable.sydney);
        TextView tv3=chunk2.findViewById(R.id.textView1);
        tv3.setText("Sydney");
        TextView tv4=chunk2.findViewById(R.id.textView2);
        Calendar calendar2=Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        tv4.setText(sdf.format(calendar2.getTime()));

        //new york
        ConstraintLayout chunk3 = findViewById(R.id.newyork);
        ImageView img3=chunk3.findViewById(R.id.imageView1);
        img3.setImageResource(R.drawable.newyork);
        TextView tv5=chunk3.findViewById(R.id.textView1);
        tv5.setText("New York");
        TextView tv6=chunk3.findViewById(R.id.textView2);
        Calendar calendar3=Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        tv6.setText(sdf.format(calendar3.getTime()));

        //Los Angeles
        ConstraintLayout chunk4 = findViewById(R.id.la);
        ImageView img4=chunk4.findViewById(R.id.imageView1);
        img4.setImageResource(R.drawable.hollywood);
        TextView tv7=chunk4.findViewById(R.id.textView1);
        tv7.setText("Los Angeles");
        TextView tv8=chunk4.findViewById(R.id.textView2);
        Calendar calendar4=Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        tv8.setText(sdf.format(calendar4.getTime()));

        //Paris
        ConstraintLayout chunk5 = findViewById(R.id.paris);
        ImageView img5=chunk5.findViewById(R.id.imageView1);
        img5.setImageResource(R.drawable.paris);
        TextView tv9=chunk5.findViewById(R.id.textView1);
        tv9.setText("Paris");
        TextView t1=chunk5.findViewById(R.id.textView2);
        Calendar calendar5=Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        t1.setText(sdf.format(calendar5.getTime()));

        //Chicago
        ConstraintLayout chunk6 = findViewById(R.id.chicago);
        ImageView img6=chunk6.findViewById(R.id.imageView1);
        img6.setImageResource(R.drawable.chicago);
        TextView t2=chunk6.findViewById(R.id.textView1);
        t2.setText("Chicago");
        TextView t3=chunk6.findViewById(R.id.textView2);
        Calendar calendar6=Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
        t3.setText(sdf.format(calendar6.getTime()));


    }

    //change to 12hr
    public void buttonClick(View view){
        DateFormat outputformat=new SimpleDateFormat("hh:mm:ss aa");

        //shanghai
        ConstraintLayout chunk1 = findViewById(R.id.shanghai);
        TextView tv1=chunk1.findViewById(R.id.textView2);
        Calendar calendar1=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        tv1.setText(outputformat.format(calendar1.getTime()));

        //sydney
        ConstraintLayout chunk2 = findViewById(R.id.sydney);
        TextView tv2=chunk2.findViewById(R.id.textView2);
        Calendar calendar2=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        tv2.setText(outputformat.format(calendar2.getTime()));

        //new york
        ConstraintLayout chunk3 = findViewById(R.id.newyork);
        TextView tv3=chunk3.findViewById(R.id.textView2);
        Calendar calendar3=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        tv3.setText(outputformat.format(calendar3.getTime()));

        //LA
        ConstraintLayout chunk4 = findViewById(R.id.la);
        TextView tv4=chunk4.findViewById(R.id.textView2);
        Calendar calendar4=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        tv4.setText(outputformat.format(calendar4.getTime()));

        //paris
        ConstraintLayout chunk5 = findViewById(R.id.paris);
        TextView tv5=chunk5.findViewById(R.id.textView2);
        Calendar calendar5=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        tv5.setText(outputformat.format(calendar5.getTime()));

        //Chicago
        ConstraintLayout chunk6 = findViewById(R.id.chicago);
        TextView tv6=chunk6.findViewById(R.id.textView2);
        Calendar calendar6=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
        tv6.setText(outputformat.format(calendar6.getTime()));
    }

    //change to 24hr
    public void buttonClick2(View view){
        DateFormat outputformat=new SimpleDateFormat("HH:mm:ss");
        //shanghai
        ConstraintLayout chunk1 = findViewById(R.id.shanghai);
        TextView tv1=chunk1.findViewById(R.id.textView2);
        Calendar calendar1=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        tv1.setText(outputformat.format(calendar1.getTime()));

        //sydney
        ConstraintLayout chunk2 = findViewById(R.id.sydney);
        TextView tv2=chunk2.findViewById(R.id.textView2);
        Calendar calendar2=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        tv2.setText(outputformat.format(calendar2.getTime()));

        //new york
        ConstraintLayout chunk3 = findViewById(R.id.newyork);
        TextView tv3=chunk3.findViewById(R.id.textView2);
        Calendar calendar3=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        tv3.setText(outputformat.format(calendar3.getTime()));

        //LA
        ConstraintLayout chunk4 = findViewById(R.id.la);
        TextView tv4=chunk4.findViewById(R.id.textView2);
        Calendar calendar4=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        tv4.setText(outputformat.format(calendar4.getTime()));

        //paris
        ConstraintLayout chunk5 = findViewById(R.id.paris);
        TextView tv5=chunk5.findViewById(R.id.textView2);
        Calendar calendar5=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        tv5.setText(outputformat.format(calendar5.getTime()));

        //Chicago
        ConstraintLayout chunk6 = findViewById(R.id.chicago);
        TextView tv6=chunk6.findViewById(R.id.textView2);
        Calendar calendar6=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
        tv6.setText(outputformat.format(calendar6.getTime()));
    }
}
