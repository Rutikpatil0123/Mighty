package com.example.data.Adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.data.DataActivity;
import com.example.data.Place;
import com.example.data.R;

import java.util.List;

public class ItemListAdapter extends RecyclerView.Adapter<ItemsViewHolder>{

    private Context context;
    private List<Place> list;

    public ItemListAdapter(Context context) {
       this.context = context;

    }
    public void setItemList(List<Place> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.items_list, parent,false);
        return new ItemsViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {

        holder.textView_Title.setText(this.list.get(position).getName());
        holder.desc_Title.setText(this.list.get(position).getDesc());
        holder.textView_Date.setText(this.list.get(position).getDate());
        holder.textView_Location.setText(this.list.get(position).getLocation());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}

class ItemsViewHolder extends RecyclerView.ViewHolder {

    CardView items_Container;
    TextView textView_Title, textView_Location, textView_Date, desc_Title;
    ImageView image_Title;
    public ItemsViewHolder(@NonNull View itemView) {
        super(itemView);
        items_Container = itemView.findViewById(R.id.items_Container);
        textView_Title = itemView.findViewById(R.id.textView_Title);
        textView_Location = itemView.findViewById(R.id.textView_Location);
        textView_Date = itemView.findViewById(R.id.textView_Date);
        desc_Title = itemView.findViewById(R.id.desc_Title);
        image_Title = itemView.findViewById(R.id.image_Title);


    }
}
