package com.example.woy.toolbar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    RadioGroup rg;

    TextView t1, t2, t3, s1, s2, s3;
    Button button;
    TableLayout tabL;
    TableRow tabR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);

        rg = (RadioGroup) findViewById(R.id.radioGroup);

        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);

//        button = (Button) findViewById(R.id.button);

        tabL = (TableLayout) findViewById(R.id.tabLayout);
        tabL.setColumnStretchable(0,true);
        tabL.setColumnStretchable(1,true);
        tabL.setColumnStretchable(2,true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.add:
                tabR = new TableRow(this);
                s1 = new TextView(this);
                s2 = new TextView(this);
                s3 = new TextView(this);

                int rid = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(rid);

//  read text from editTexts, create tableRow, and add it to tableLayout

//                EditText e1 = (EditText) findViewById(R.id.editText);
//                s1.setText(e1.getText());
//                s1.setTextSize(15);
//                s1.setGravity(Gravity.CENTER);
//                tabR.addView(s1);

                tabL.addView(tabR);
                return true;

// uncomment this part to conduct toolbar delete button action
//            case R.id.delete:
//                if(tabL.getChildCount() > 0) tabL.removeViewAt(0);
//                Toast.makeText(MainActivity.this,"Delete Menu Selected", Toast.LENGTH_LONG).show();
//                return true;


            default:
                return super.onOptionsItemSelected(item);

        }
    }
// add function inserting a new tableRow to tableLayout

//    public void onClick(View view){
//        switch(view.getId()){
//            case R.id.button:
//                break;
//            default:
//                break;
//        }
//    }
}
