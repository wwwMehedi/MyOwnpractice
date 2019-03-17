package com.tolet.sajib.abbreviations.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.tolet.sajib.abbreviations.R;

import java.util.HashMap;
import java.util.List;

public class CustomAdapter extends BaseExpandableListAdapter {
    Context context;
    List<String> listdataheader;
    HashMap<String, List<String>> listdatachild;

    public CustomAdapter(Context context, List<String> listdataheader, HashMap<String, List<String>> listdatachild) {
        this.context = context;
        this.listdataheader = listdataheader;
        this.listdatachild = listdatachild;
    }

    @Override
    public int getGroupCount() {
        return listdataheader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listdatachild.get(listdataheader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listdataheader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listdatachild.get(listdataheader.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headetext=(String) getGroup(i);
        if(view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.groplist,null);
        }
        TextView textView=view.findViewById(R.id.parentid);
        textView.setText(headetext);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String childtext=(String) getChild(i,i1);
        if(view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.childgroup,null);
        }
        TextView textView=view.findViewById(R.id.childid);
        textView.setText(childtext);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
