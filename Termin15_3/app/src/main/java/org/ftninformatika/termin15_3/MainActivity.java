package org.ftninformatika.termin15_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private List<String>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        data = getData();
        setupSpinner();
    }
    private  void setupSpinner(){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                data);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        MainActivity.this,
                        data.get(position),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(
                        MainActivity.this,
                        "Nothing selected",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }


    private List<String>getData(){
        List<String>dummyData = new ArrayList<>();
        for (int i= 0; i<20; i++){
            dummyData.add("Element " +i);
        }
        return dummyData;
    }
}
