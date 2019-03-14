package com.tolet.sajib.abbreviations.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tolet.sajib.abbreviations.Booklist;
import com.tolet.sajib.abbreviations.R;
import com.tolet.sajib.abbreviations.model.BookModel;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyviewHolder> {
    private Context context;
    private List<BookModel> bmodel;

    public RecyclerAdapter(Context context, List<BookModel> bmodel) {
        this.context = context;
        this.bmodel = bmodel;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardviewlist, viewGroup, false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyviewHolder myviewHolder, final int i) {
//        myviewHolder.textView.setText(bmodel.get(i).getTitle());
        myviewHolder.imageView.setImageResource(bmodel.get(i).getThumbnail());
        myviewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
if(i==0){
    Intent intent=new Intent(context,Booklist.class);
      context.startActivity(intent);
}
else if(i==1){
    Toast.makeText(context, "one", Toast.LENGTH_SHORT).show();
}
else if(i==2){
    Toast.makeText(context, "two", Toast.LENGTH_SHORT).show();
}
else if(i==3){
    Toast.makeText(context, "three", Toast.LENGTH_SHORT).show();
}
else if(i==4){
    Toast.makeText(context, "four", Toast.LENGTH_SHORT).show();
}
else if(i==5){
    Toast.makeText(context, "five", Toast.LENGTH_SHORT).show();
}
else if(i==6){
    Toast.makeText(context, "six", Toast.LENGTH_SHORT).show();
}
//                Intent intent=new Intent(context,Booklist.class);
//                intent.putExtra("title",bmodel.get(i).getTitle());
//                intent.putExtra("description",bmodel.get(i).getDescription());
//                intent.putExtra("thumbnail",bmodel.get(i).getThumbnail());
//                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bmodel.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CardView cardView;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagebookid);
            //textView = itemView.findViewById(R.id.booktitleid);
            cardView=itemView.findViewById(R.id.cardidone);


        }
    }
}
