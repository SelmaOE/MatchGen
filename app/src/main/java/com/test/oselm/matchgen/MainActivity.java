package com.test.oselm.matchgen;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Spinner numero;
    Button add;
    int notext= 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.grid);
        numero = (Spinner) findViewById(R.id.numeros);
        Integer[] num = new Integer[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, num);
        numero.setAdapter(adapter);
        numero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                 int number = Integer.parseInt(numero.getSelectedItem().toString());
                 AddEditText(number);


             }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {
                AddEditText(3);
             }
        }
        );
        add= (Button) findViewById(R.id.addbutton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] names = new String[]{};
            }
        });


    }

    private void AddEditText(int n){
        int i=notext;
        while(i<n+1){
            EditText e1= new EditText(MainActivity.this);
            e1.setHint("Jugador " +i+" :");
            notext+=1;
            e1.setId(notext);
            layout.addView(e1);
            i++;
        }
    }

    private ArrayList getNombres(){
        ArrayList<String> nombres= new Arraylist<String>();
        return nombres;
    }

}
