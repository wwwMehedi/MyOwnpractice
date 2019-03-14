package com.tolet.sajib.abbreviations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Booklist extends AppCompatActivity {

    private TextView tvtitle, tvdescription, tvcategory;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);
//        tvtitle = findViewById(R.id.txttitle);
//        tvdescription = findViewById(R.id.txtDesc);
//        tvcategory = findViewById(R.id.txtCat);
//        imageView = findViewById(R.id.bookthumbnail);
//
//        Intent intent=getIntent();
//        String title=intent.getExtras().getString("title");
//        String description=intent.getExtras().getString("description");
//        int thumbnail=intent.getExtras().getInt("thumbnail");
//tvtitle.setText(title);
//tvdescription.setText(description);
//imageView.setImageResource(thumbnail);

    }
}
