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

import com.tolet.sajib.abbreviations.ActivityB;
import com.tolet.sajib.abbreviations.ActivityC;
import com.tolet.sajib.abbreviations.ActivityD;
import com.tolet.sajib.abbreviations.ActivityE;
import com.tolet.sajib.abbreviations.ActivityF;
import com.tolet.sajib.abbreviations.ActivityG;
import com.tolet.sajib.abbreviations.ActivityH;
import com.tolet.sajib.abbreviations.ActivityI;
import com.tolet.sajib.abbreviations.ActivityJ;
import com.tolet.sajib.abbreviations.ActivityK;
import com.tolet.sajib.abbreviations.ActivityL;
import com.tolet.sajib.abbreviations.ActivityM;
import com.tolet.sajib.abbreviations.ActivityN;
import com.tolet.sajib.abbreviations.ActivityO;
import com.tolet.sajib.abbreviations.ActivityP;
import com.tolet.sajib.abbreviations.ActivityQ;
import com.tolet.sajib.abbreviations.ActivityR;
import com.tolet.sajib.abbreviations.ActivityS;
import com.tolet.sajib.abbreviations.ActivityT;
import com.tolet.sajib.abbreviations.ActivityU;
import com.tolet.sajib.abbreviations.ActivityV;
import com.tolet.sajib.abbreviations.ActivityW;
import com.tolet.sajib.abbreviations.ActivityX;
import com.tolet.sajib.abbreviations.ActivityY;
import com.tolet.sajib.abbreviations.ActivityZ;
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
    Intent intent=new Intent(context, ActivityB.class);
    context.startActivity(intent);
}
else if(i==2){
    Intent intent=new Intent(context, ActivityC.class);
    context.startActivity(intent);
}
else if(i==3){
    Intent intent=new Intent(context, ActivityD.class);
    context.startActivity(intent);
}
else if(i==4){
    Intent intent=new Intent(context, ActivityE.class);
    context.startActivity(intent);
}
else if(i==5){
    Intent intent=new Intent(context, ActivityF.class);
    context.startActivity(intent);
}
else if(i==6){
    Intent intent=new Intent(context, ActivityG.class);
    context.startActivity(intent);
}
else if(i==7){
    Intent intent=new Intent(context, ActivityH.class);
    context.startActivity(intent);
}
else if(i==8){
    Intent intent=new Intent(context, ActivityI.class);
    context.startActivity(intent);
}
else if(i==9){
    Intent intent=new Intent(context, ActivityJ.class);
    context.startActivity(intent);
}
else if(i==10){
    Intent intent=new Intent(context, ActivityK.class);
    context.startActivity(intent);
}
else if(i==11){
    Intent intent=new Intent(context, ActivityL.class);
    context.startActivity(intent);
}
else if(i==12){
    Intent intent=new Intent(context, ActivityM.class);
    context.startActivity(intent);
}
else if(i==13){
    Intent intent=new Intent(context, ActivityN.class);
    context.startActivity(intent);
}
else if(i==14){
    Intent intent=new Intent(context, ActivityO.class);
    context.startActivity(intent);
}
else if(i==15){
    Intent intent=new Intent(context, ActivityP.class);
    context.startActivity(intent);
}
else if(i==16){
    Intent intent=new Intent(context, ActivityQ.class);
    context.startActivity(intent);
}
else if(i==17){
    Intent intent=new Intent(context, ActivityR.class);
    context.startActivity(intent);
}
else if(i==18){
    Intent intent=new Intent(context, ActivityS.class);
    context.startActivity(intent);
}
else if(i==19){
    Intent intent=new Intent(context, ActivityT.class);
    context.startActivity(intent);
}
else if(i==20){
    Intent intent=new Intent(context, ActivityU.class);
    context.startActivity(intent);
}
else if(i==21){
    Intent intent=new Intent(context, ActivityV.class);
    context.startActivity(intent);
}
else if(i==22){
    Intent intent=new Intent(context, ActivityW.class);
    context.startActivity(intent);
}
else if(i==23){
    Intent intent=new Intent(context, ActivityX.class);
    context.startActivity(intent);
}
else if(i==24){
    Intent intent=new Intent(context, ActivityY.class);
    context.startActivity(intent);
}
else if(i==25){
    Intent intent=new Intent(context, ActivityZ.class);
    context.startActivity(intent);
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
