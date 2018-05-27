package com.example.lee.customlistview;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListView listview ;
    ListViewAdapter adapter;
    Button additem1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        additem1 = (Button) findViewById(R.id.additem1);
        additem1.setOnClickListener(additem1Listener);

        // Adapter 생성
        adapter = new ListViewAdapter() ;
        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position) ;

                String pubStr = item.getPub() ;
                String subStr = item.getSub() ;

                Toast.makeText(MainActivity.this,pubStr,Toast.LENGTH_SHORT).show();

                //TODO : use item data
            }
        }) ;

    }

    public View.OnClickListener additem1Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Setting2Activity.class);
            intent.putExtra("request",0);
            startActivityForResult(intent,200);

        }

    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 200){
            if(resultCode == RESULT_OK){
                String pub = data.getStringExtra("pub");
                String sub = data.getStringExtra("sub");

                adapter.addItem(pub,sub);
                adapter.notifyDataSetChanged();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }



}

