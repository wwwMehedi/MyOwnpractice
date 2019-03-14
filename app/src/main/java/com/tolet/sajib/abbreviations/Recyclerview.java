package com.tolet.sajib.abbreviations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

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
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.letterd));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.themartian));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.thevigitarian));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.themartian));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.themartian));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.thevigitarian));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.themartian));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.themartian));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.themartian));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new BookModel("The Vegitarian","Categorie Book","Description book",R.drawable.thevigitarian));
        lstBook.add(new BookModel("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new BookModel("The Martian","Categorie Book","Description book",R.drawable.themartian));
        lstBook.add(new BookModel("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));

        RecyclerView myrv =findViewById(R.id.recycleid);
        RecyclerAdapter madapter=new RecyclerAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv .setAdapter(madapter);



    }
}
