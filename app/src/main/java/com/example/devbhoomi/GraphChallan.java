package com.example.devbhoomi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class GraphChallan extends AppCompatActivity
{
    BarChart bar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_challan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        bar=(BarChart)findViewById(R.id.barchart);


        ArrayList<BarEntry> information=new ArrayList<>();
        information.add(new BarEntry(50,1000));
        information.add(new BarEntry(20,2200));
        information.add(new BarEntry(30,1400));
        information.add(new BarEntry(43,1700));
        information.add(new BarEntry(67,300));
        information.add(new BarEntry(34,1100));
        information.add(new BarEntry(18,1800));
        information.add(new BarEntry(17,170));
        information.add(new BarEntry(54,1900));
        information.add(new BarEntry(61,200));

        BarDataSet dataset=new BarDataSet(information,"Report");
        dataset.setColors(ColorTemplate.MATERIAL_COLORS);
        dataset.setValueTextColor(Color.BLACK);
        dataset.setValueTextSize(20f);

        BarData barData=new BarData(dataset);

        bar.setFitBars(true);
        bar.setData(barData);
        bar.getDescription().setText("Age Vs No. of Challans");
        bar.animateY(2000);


    }
}