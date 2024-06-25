package com.example.delhitravelapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myViewHolder> {

    ArrayList<Place> placeArrayList;
    PlaceDescClickListener placeDescClickListener;

    public void setPlaceDescClickListener(PlaceDescClickListener placeDescClickListener) {
        this.placeDescClickListener = placeDescClickListener;
    }

    public CustomAdapter(ArrayList<Place> places) {
        this.placeArrayList = places;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.card_item_layout,parent,false);

        return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Place p = placeArrayList.get(position);

        myViewHolder h = holder;

        h.t1.setText(p.getName());
        h.t2.setText("Days open\n"+p.getDaysOpen());
        h.i1.setImageResource(p.getImageRes());


    }

    @Override
    public int getItemCount() {
        return placeArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView t1,t2;
        ImageView i1;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            t1 = itemView.findViewById(R.id.place_title);
            t2 = itemView.findViewById(R.id.days_open);
            i1 = itemView.findViewById(R.id.place_image);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(placeDescClickListener != null){
                Place p = placeArrayList.get(getAdapterPosition());

                placeDescClickListener.PlaceDesc_onClick(view, getAdapterPosition(), p.getImageRes(), p.getName() );
            }
        }
    }
}
