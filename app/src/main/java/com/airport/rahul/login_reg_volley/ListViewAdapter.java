package com.airport.rahul.login_reg_volley;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RAHUL on 10/13/2017.
 */

public class ListViewAdapter extends ArrayAdapter<Hero> {
    private List<Hero> herolist;
    private Context context;
    public ListViewAdapter(List<Hero> herolist,Context context) {
        super(context,R.layout.list_items,herolist);
        this.herolist=herolist;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater lf= LayoutInflater.from(context);
        View listViewItem=lf.inflate(R.layout.list_items,null,true);

        TextView nm=(TextView)convertView.findViewById(R.id.textViewName);
        TextView imgurl=(TextView)convertView.findViewById(R.id.textViewImageUrl);

        Hero hero=herolist.get(position);
        nm.setText(hero.getName());
        imgurl.setText(hero.getImageurl());

        return listViewItem;
    }
}
