package com.example.lee.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lee.customlistview.preference.AddressPreference;

public class Setting2Activity extends AppCompatActivity {

    Button additem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting2);

        Button saveButton1 = (Button) findViewById(R.id.saveButton1);
        saveButton1.setOnClickListener(saveButtonListener);

    }

    public View.OnClickListener saveButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            EditText pubID = (EditText) findViewById(R.id.pubID);
            String pub = pubID.getText().toString();

            EditText subID = (EditText) findViewById(R.id.subID);
            String sub = subID.getText().toString();

            Intent intent = getIntent();
            intent.putExtra("pub", pub);
            intent.putExtra("sub",sub);
            setResult(RESULT_OK,intent);

            finish();


        }
    };


}
