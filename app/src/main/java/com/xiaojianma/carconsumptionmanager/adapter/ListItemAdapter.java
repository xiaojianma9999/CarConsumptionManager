package com.xiaojianma.carconsumptionmanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.xiaojianma.carconsumptionmanager.R;

import java.util.List;
import java.util.Map;

public class ListItemAdapter extends BaseAdapter {
    private Context context;
    private List<Map<String, String>> list;
    private LayoutInflater inflater;

    public ListItemAdapter(Context context, List<Map<String, String>> list) {
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
            convertView = inflater.inflate(R.layout.listitem_adapter, null);
//            listItem.name = convertView.findViewById(R.id.name);
//            listItem.age = convertView.findViewById(R.id.age);
//            listItem.gender = convertView.findViewById(R.id.gender);
//            listItem.number = convertView.findViewById(R.id.number);
            convertView.setTag(listItem);
        } else {
            listItem = (ListItem) convertView.getTag();
        }
        listItem.name.setText(list.get(position).get("name").toString());
        listItem.age.setText(list.get(position).get("age").toString());
        listItem.gender.setText(list.get(position).get("gender").toString());
        listItem.number.setText(list.get(position).get("number").toString());
        return convertView;
    }

    class ListItem {
        TextView name;
        TextView age;
        TextView gender;
        TextView number;
    }
}
