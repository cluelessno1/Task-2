package shashwat.com.task2;

import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button_on_click_responder);

        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView t1 = findViewById(R.id.text_to_change_with_button);
                if (t1.getText() == "Hello World") {
                    t1.setText("Bye World");
                } else {
                    t1.setText("Hello World");
                }

            }
        });


    }


}

