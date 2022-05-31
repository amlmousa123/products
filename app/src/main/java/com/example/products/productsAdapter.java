package com.example.products;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class productsAdapter extends RecyclerView.Adapter<productsAdapter.productViewHolder> {
    ArrayList <Product> products;

    public productsAdapter(ArrayList<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.product_layout,parent,false);
        productViewHolder viewHolder =new productViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {
        holder.image.setImageResource(products.get(position).getImageId());
        holder.txt1.setText(products.get(position).getName());
        holder.txt2.setText("$"+products.get(position).getPrice());
    }

    @Override
    public int getItemCount() {

        return products.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView txt1 ,txt2 ;

        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img);
            txt1 = itemView.findViewById(R.id.nameTxt);
            txt2 = itemView.findViewById(R.id.priceTxt);
        }
    }
}
