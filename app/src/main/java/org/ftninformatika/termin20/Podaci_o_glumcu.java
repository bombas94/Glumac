package org.ftninformatika.termin20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Podaci_o_glumcu extends AppCompatActivity {

    private String Glumac;
    private int position = 0;
    private Datap datap = new Datap().getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podaci_o_glumcu);
    }








}
