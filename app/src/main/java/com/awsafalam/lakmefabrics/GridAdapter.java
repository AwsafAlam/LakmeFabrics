package com.awsafalam.lakmefabrics;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;



public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder>{


    private List<Listitem> ListItems = new ArrayList<>();
    private Context context;


    public GridAdapter(Context mContext, List<Listitem> listitems) {
        ListItems = listitems;
        this.context = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v1 = inflater.inflate(R.layout.listitem, parent, false);
        viewHolder = new ViewHolder(v1 , context , ListItems);

        return (ViewHolder) viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Listitem listitem = (Listitem) ListItems.get(position);
        holder.Price.setText(listitem.getPrice());
        holder.Description.setText(listitem.getDescription());
        Picasso.with(context).load(listitem.getImageuri()).into(holder.Dressimg);
    }


    @Override
    public int getItemCount() {
        return ListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private CardView cv;

        TextView Price;
        TextView Description;
        ImageView Dressimg;

        List<Listitem> griditems = new ArrayList<>();
        Context context;

        ViewHolder(View itemView , final Context context , List<Listitem> listitems) {
            super(itemView);

            griditems =  listitems;
            this.context = context;
            cv = (CardView) itemView.findViewById(R.id.Cardview);
            Price = (TextView) itemView.findViewById(R.id.Price);
            Description = (TextView) itemView.findViewById(R.id.Description);
            Dressimg = (ImageView) itemView.findViewById(R.id.Dressimg);



            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context , ScrollingActivity.class));
                }
            });




        }


    }
}
