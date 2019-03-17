package com.tolet.sajib.abbreviations;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;

import com.tolet.sajib.abbreviations.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActivityW extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private CustomAdapter customAdapter;
    private Toolbar mtoolbar;
    List<String> listdataheader;
    HashMap<String, List<String>> listdatachild;
    int colapseposition = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w);
        mtoolbar=findViewById(R.id.toolbarid);
        mtoolbar.setTitle("Abbreviations:W");
        mtoolbar.setTitleTextColor(Color.WHITE);
        preparelistdata();
        expandableListView = findViewById(R.id.expandibleid);
        customAdapter = new CustomAdapter(this, listdataheader, listdatachild);
        expandableListView.setAdapter(customAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if(colapseposition!=-1 &&colapseposition!=i){
                    expandableListView.collapseGroup(colapseposition);
                }
                colapseposition=i;
            }
        });
    }
    public void preparelistdata() {

        String[] headerString = getResources().getStringArray(R.array.wparent);
        String[] childString = getResources().getStringArray(R.array.wchild);

        listdataheader = new ArrayList<>();
        listdatachild = new HashMap<>();
        for (int i = 0; i < headerString.length; i++) {
            listdataheader.add(headerString[i]);
            List<String> child = new ArrayList<>();
            child.add(childString[i]);
            listdatachild.put(listdataheader.get(i), child);
        }
    }
}
