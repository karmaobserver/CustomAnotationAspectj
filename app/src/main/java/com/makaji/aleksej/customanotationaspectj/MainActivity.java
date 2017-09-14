package com.makaji.aleksej.customanotationaspectj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.makaji.aleksej.customannotation.annotation.DebugTrace;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Student student = new Student("Pera", "Peric");

        final View button = findViewById(R.id.click);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                profile("String as param for method");

            }
        });
    }

    @DebugTrace
    public void profile(String nesto) {
        Log.d("MAIN", "U methodi vrednost: " + nesto);
        Toast toast = Toast.makeText(getBaseContext(), nesto, Toast.LENGTH_LONG);
        toast.show();
    }
}
