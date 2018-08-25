package ph.edu.iicsust.tuble.johranel.myfirstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button pressMeButton = (Button)findViewById(R.id.pressMeButton);

        pressMeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                String result = "";
                int i;

                for (i = 2 ; i <= 20 ; i+=2){
                    result += Integer.toString(i) + "\n";
                }
                resultTextView.setText(result);
            }
        });
    }


}
