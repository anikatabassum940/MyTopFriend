package com.anika.mytopfriend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CustomAdopter extends RecyclerView.Adapter<CustomAdopter.MyViewHolder> {

    Context context;
    String friendList[];
    int image[];
    String number[];

    public CustomAdopter(Context context, String[] friendList, int[] image, String[] number) {
        this.context = context;
        this.friendList = friendList;
        this.image = image;
        this.number=number;
    }

    @NonNull
    @Override
    public CustomAdopter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_items, parent, false);
        MyViewHolder vh = new MyViewHolder(view);


        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdopter.MyViewHolder holder, final int position) {

        holder.imgIcon.setImageResource(image[position]);
        holder.txtName.setText(friendList[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, friendList[position],Toast.LENGTH_SHORT).show();
                //ek page theke onno page jete hole

                Intent intent = new Intent(context, DetalisActivity.class);
                intent.putExtra("id", ""+position);
                intent.putExtra("phone", number[position]);


                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return friendList.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgIcon;
        TextView txtName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //initialization
            imgIcon = itemView.findViewById(R.id.img_icon);
            txtName = itemView.findViewById(R.id.txt_name);
        }
    }
}
