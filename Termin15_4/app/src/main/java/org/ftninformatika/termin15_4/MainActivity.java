package org.ftninformatika.termin15_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    List<Person> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = getData();
        lvItems = findViewById(R.id.lvItems);
        MyAdapter adapter= new MyAdapter(this, data);
        lvItems.setAdapter(adapter);
    }

    List<Person> getData(){
        List<Person> dummyData = new ArrayList<>();
        for(int i = 0 ; i<20; i ++){
            dummyData.add(new Person("Name " + i, "Description" + i));
        }
        return dummyData;
    }
}
