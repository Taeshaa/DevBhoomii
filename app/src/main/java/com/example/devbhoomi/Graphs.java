package com.example.devbhoomi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Graphs extends AppCompatActivity
{
    PieChart piechart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);

        piechart=(PieChart)findViewById(R.id.piechart);

        ArrayList<PieEntry> records=new ArrayList<>();
        records.add(new PieEntry(32,"Opium"));
        records.add(new PieEntry(12,"Cocaine"));
        records.add(new PieEntry(20,"Heroin"));
        records.add(new PieEntry(38,"Ecstasy"));

        PieDataSet dataSet=new PieDataSet(records,"Pie Chart Report");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(22f);

        PieData pieData=new PieData(dataSet);

        piechart.setData(pieData);
        piechart.getDescription().setEnabled(true);
        piechart.setCenterText("Depiction of drugs found");
        piechart.animate();
    }

}