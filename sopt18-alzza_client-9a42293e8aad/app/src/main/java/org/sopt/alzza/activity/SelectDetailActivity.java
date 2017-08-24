package org.sopt.alzza.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.sopt.alzza.R;

/**
 * Created by win10_pc on 2016-07-07.
 */
public class SelectDetailActivity  extends Activity implements AdapterView.OnItemClickListener {
    //서버랑 값 연결
    String subject;
    int subject_id;
    Button button;
    String[] arrlist = new String[]
            {
                    "데이터베이스",
                    "이산수학",
                    "알고리즘",
                    "운영체제",
                    "프로그래밍"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tableview_select2);


        // 데이터를 저장하고 세팅하는 곳, 스트링형식의 배열어뎁터 만들기
        ArrayAdapter<String> Adapter;

        // android.R.layout.simple_list_item_1형식으로 arrlist 넘겨줌줌
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrlist);

        //리스트 뷰 형식의 list에 ListView 뿌려주기
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);

        button = (Button)findViewById(R.id.storebutton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "onClick: " );
                Intent intent = getIntent();
                intent.putExtra("subject",subject);
                intent.putExtra("subject_id", subject_id);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

        TextView a =(TextView) findViewById(R.id.storetext);
        TextView tv = (TextView) view;
        subject = tv.getText().toString();
        subject_id = i;
        a.setText("선택한 과목 :" + tv.getText() + "\n (선택된 id 값 : " + i + ")");


    }
}
