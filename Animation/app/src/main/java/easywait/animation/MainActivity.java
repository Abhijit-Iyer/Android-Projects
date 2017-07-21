package easywait.animation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textbox = (EditText) findViewById(R.id.editText);

        ObjectAnimator translate = ObjectAnimator.ofFloat(textbox, "translationX", -50.0f);
        translate.setDuration(5000);
        translate.start();

    }

}