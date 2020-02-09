package org.ftninformatika.termin14;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.ftninformatika.termin14.model.Fruit;

import java.io.InputStream;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int id = getIntent().getIntExtra("id",-1);
        Fruit fruit = null;
        for(Fruit f : Fruit.fruits) {
            if (f.getId() == id){
                fruit = f;
            }
        }
        TextView tv = findViewById(R.id.textViewNaslov);
        tv.setText(fruit.getName());
        TextView tv2 = findViewById(R.id.textViewOpis);
        tv2.setText(fruit.getDescription());

        ImageView iv = findViewById(R.id.imageView);
        try{
            InputStream is = getAssets().open(fruit.getImageFilename());
            Drawable drawable = Drawable.createFromStream(is,"");
            iv.setImageDrawable(drawable);
        }catch (Exception e){
            e.printStackTrace();
        }
        RatingBar rb = findViewById(R.id.ratingBar);
        rb.setRating(fruit.getRating());
        rb.setIsIndicator(true);
    }

}
