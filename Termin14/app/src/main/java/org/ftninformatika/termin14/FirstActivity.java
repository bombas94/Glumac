package org.ftninformatika.termin14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.ftninformatika.termin14.model.Fruit;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        LinearLayout ll = findViewById(R.id.linearLayout);


        for(final Fruit fruit : Fruit.fruits) {
            Button button = new Button(this);
            button.setText(fruit.getName());
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                    intent.putExtra("id", fruit.getId());
                    startActivity(intent);
                }
            });
            ll.addView(button);
        }

    }
}
