package drawing.teja_kummarikuntla.com.androiddrawing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Doodle doodle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(drawing.teja_kummarikuntla.com.androiddrawing.R.layout.activity_main);

        Drawing drawing = new Drawing(this);
        CustomTextView customTextView = new CustomTextView(this, null);
         doodle = findViewById(drawing.teja_kummarikuntla.com.androiddrawing.R.id.doodlView);

    }
}
