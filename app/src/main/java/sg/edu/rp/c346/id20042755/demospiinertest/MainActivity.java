package sg.edu.rp.c346.id20042755.demospiinertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spin;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin = findViewById(R.id.spinner);
        tv = findViewById(R.id.TextView);

        spin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        tv.setText("Spinner item Yes Selected");
                        break;
                    case 1:
                        tv.setText("Spinner item No Selected");
                        break;
                }
            }
            @Override
            public void onNothingSelcted(AdapterView<?> parent)   {

                }

        });

    }





}