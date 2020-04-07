package com.lambton.love_canada_application.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lambton.love_canada_application.R;
import com.lambton.love_canada_application.models.CanadaAttraction;

import java.util.ArrayList;

public class CanadaAttractionAdapter extends RecyclerView.Adapter<CanadaAttractionAdapter.CanadaViewHolder> {

    private ArrayList<CanadaAttraction> canadaAttractionArrayList;

    public CanadaAttractionAdapter(ArrayList<CanadaAttraction> canadaAttractionArrayList) {
    this.canadaAttractionArrayList = canadaAttractionArrayList;
    }

    @NonNull
    @Override
    public CanadaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View attractionView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_canada_attraction,parent,false);
        CanadaViewHolder myViewHolder = new CanadaViewHolder(attractionView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CanadaViewHolder holder, final int position) {
        CanadaAttraction canadaObject = this.canadaAttractionArrayList.get(position);
        holder.attractionNameText.setText(canadaObject.getPlaceName());
        holder.attractionImage.setImageResource(canadaObject.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CanadaAttraction name = canadaAttractionArrayList.get(position);
                Toast.makeText(holder.itemView.getContext(), "Address: "+name.getAddress(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return canadaAttractionArrayList.size();
    }

    public class CanadaViewHolder extends RecyclerView.ViewHolder {

        TextView attractionNameText;
        ImageView attractionImage;

        public CanadaViewHolder(@NonNull View itemView) {
            super(itemView);
            attractionNameText = itemView.findViewById(R.id.attractionName);
            attractionImage = itemView.findViewById(R.id.imgAttraction);
        }
    }
}
