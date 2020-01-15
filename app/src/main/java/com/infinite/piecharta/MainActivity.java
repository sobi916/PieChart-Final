package com.infinite.piecharta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PieChart one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (PieChart) findViewById(R.id.one);
        TestEntity entity = new TestEntity(50, "#FF7F50", "断了的弦");
        TestEntity entity1 = new TestEntity(38, "#DC143C", "以父之名");
        TestEntity entity2 = new TestEntity(79, "#00008B", "青花瓷");
        TestEntity entity3 = new TestEntity(20, "#A9A9A9", "夜的第七章");
        TestEntity entity4 = new TestEntity(105, "#8B0000", "东风破");
        TestEntity entity5 = new TestEntity(53, "#9400D3", "稻香");
        TestEntity entity6 = new TestEntity(80, "#FFD700", "七里香");

        TestEntity entity7 = new TestEntity(100, "#FF7F50", "断了的弦");
        TestEntity entity8 = new TestEntity(38, "#DC143C", "以父之名");
        TestEntity entity9 = new TestEntity(79, "#00008B", "青花瓷");
        TestEntity entity10 = new TestEntity(20, "#A9A9A9", "夜的第七章");
        TestEntity entity11 = new TestEntity(105, "#8B0000", "东风破");
        TestEntity entity12= new TestEntity(53, "#9400D3", "稻香");
        TestEntity entity13 = new TestEntity(80, "#FFD700", "七里香");

        final List<IPieElement> list = new ArrayList<>();
        list.add(entity);
        list.add(entity1);
        list.add(entity2);
        list.add(entity3);
        list.add(entity4);
        list.add(entity5);
//        list.add(entity6);
//        list.add(entity7);
//        list.add(entity8);
//        list.add(entity9);
//        list.add(entity10);
//        list.add(entity11);
//        list.add(entity12);
//        list.add(entity13);
        one.setData(list);
        one.setTitleText("-1.1K");
        one.setAnimEnable(true);
        one.enableLegend(true);
        one.setOnItemClickListener(new PieChart.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Log.e("pos", position + "");
//                Toast.makeText(MainActivity.this,"position="+position+"\n"+list.get(position).getValue(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
