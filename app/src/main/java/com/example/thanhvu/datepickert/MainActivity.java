package com.example.thanhvu.datepickert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private DatePicker dp;
    private TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=(DatePicker)findViewById(R.id.datepicker);
        tp=(TimePicker)findViewById(R.id.timepicker);
        initdatepicket();
        inittimepicker();

    }
    public void initdatepicket(){
        Calendar lich = Calendar.getInstance();
        int year = lich.get(Calendar.YEAR);
        int Month=lich.get(Calendar.MONTH);
        int Day=lich.get(Calendar.DATE);
        dp.init(year, Month, Day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(MainActivity.this, year+monthOfYear+dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void inittimepicker(){
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this,hourOfDay+minute, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
