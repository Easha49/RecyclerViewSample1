package com.example.recyclerviewsample1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter_1 extends RecyclerView.Adapter<ProductAdapter_1.ProductViewHolderownmake>{
    private Context mCtx;
    private List<Product1> product1List;

    public ProductAdapter_1(Context mCtx, List<Product1> product1List) {
        this.mCtx = mCtx;
        this.product1List = product1List;
    }

    @NonNull
    @Override
    public ProductViewHolderownmake onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater =LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_recyclerview, null);
        return new ProductViewHolderownmake(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolderownmake holder, int position) {

//getting the product1 of the specified position
        Product1 product1 = product1List.get(position);  //position

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product1.getTitle());
        holder.textViewShortDesc.setText(product1.getShortDesc());
        holder.textViewRating.setText(String.valueOf(product1.getRating()));
        holder.textViewPrice.setText(String.valueOf(product1.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product1.getImage()));




    }

    @Override
    public int getItemCount() {
        return product1List.size();
    }

    class ProductViewHolderownmake extends RecyclerView.ViewHolder{

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;


        public ProductViewHolderownmake(@NonNull View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
        }


    }

}