package com.xiaojianma.carconsumptionmanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.xiaojianma.carconsumptionmanager.R;
import com.xiaojianma.carconsumptionmanager.model.ConsumeItem;

import java.util.List;
import java.util.Map;

public class ConsumeDetailsAdapter extends BaseAdapter {
    private Context context;
    private List<ConsumeItem> list;
    private LayoutInflater inflater;

    public ConsumeDetailsAdapter(Context context, List<ConsumeItem> list) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItem listItem = null;
        if (convertView == null) {
            listItem = new ListItem();
            convertView = inflater.inflate(R.layout.consume_details_adapter, null);
            listItem.type = convertView.findViewById(R.id.consume_type);
            listItem.money = convertView.findViewById(R.id.consume_money);
            listItem.date = convertView.findViewById(R.id.consume_date);
            listItem.position = convertView.findViewById(R.id.consume_position);
            convertView.setTag(listItem);
        } else {
            listItem = (ListItem) convertView.getTag();
        }
        ConsumeItem consumeItem = list.get(position);
        listItem.type.setText(consumeItem.getType());
        listItem.money.setText(consumeItem.getMoney().toString());
        listItem.date.setText(consumeItem.getDate());
        listItem.position.setText(consumeItem.getPosition());
        return convertView;
    }

    class ListItem {
        TextView type;
        TextView money;
        TextView date;
        TextView position;
    }
}
