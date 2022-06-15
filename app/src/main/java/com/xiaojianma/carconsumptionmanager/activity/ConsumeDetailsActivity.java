package com.xiaojianma.carconsumptionmanager.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.xiaojianma.carconsumptionmanager.R;
import com.xiaojianma.carconsumptionmanager.adapter.ConsumeDetailsAdapter;
import com.xiaojianma.carconsumptionmanager.model.ConsumeItem;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsumeDetailsActivity extends AppCompatActivity {

    /**
     * 消费记录列表
     */
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consume_details);
        listView = findViewById(R.id.consume_details_list);
        List<ConsumeItem> list = new ArrayList<>(50);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        for (int i = 0; i < 50; i++) {
            ConsumeItem item = new ConsumeItem("类型" + i, new BigDecimal(i * i), "position" + i, format.format(new Date()), false);
            list.add(item);
        }
        ConsumeDetailsAdapter adapter = new ConsumeDetailsAdapter(this, list);
        listView.setAdapter(adapter);
    }
}