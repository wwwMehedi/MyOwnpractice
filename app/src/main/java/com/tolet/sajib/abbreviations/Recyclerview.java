package com.tolet.sajib.abbreviations;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.tolet.sajib.abbreviations.adapter.RecyclerAdapter;
import com.tolet.sajib.abbreviations.model.BookModel;

import java.util.ArrayList;
import java.util.List;

public class Recyclerview extends AppCompatActivity {
   List<BookModel> lstBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        lstBook=new ArrayList<>();
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.lettera));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.letterb));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.letterc));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.letterd));
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.lte));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.ltf));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.ltg));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.lth));
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.lti));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.ltj));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.ltk));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.ltl));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.ltm));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.ltn));
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.lto));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.ltp));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.ltq));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.ltr));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.lts));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.ltt));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.ltu));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.ltv));
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.ltw));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.ltx));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.lty));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.ltz));

        RecyclerView myrv =findViewById(R.id.recycleid);
        RecyclerAdapter madapter=new RecyclerAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv .setAdapter(madapter);



    }
}
