package com.example.uyishifragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterfragFront extends RecyclerView.Adapter<AdapterfragFront.FrntViewHolder> {
   private ArrayList<ModelClass>list;
   private Context context;
   private OnItemClickList listener;


    public AdapterfragFront(ArrayList<ModelClass> list, Context context,OnItemClickList listener) {
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    public void setListener(OnItemClickList listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public FrntViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.itemview_fragmentfront_layout,parent,false);

        return new FrntViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FrntViewHolder holder, int position) {
        int p=position;
        String name=list.get(position).getName();
        String disc=list.get(position).getDisc();
        int image=list.get(position).getImage();
        holder.image.setImageResource(image);
        holder.name.setText(name);
        holder.disc.setText(disc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemCLick(p);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class FrntViewHolder extends RecyclerView.ViewHolder{
        private TextView name,disc;

        private ImageView image;
        public FrntViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.nom);
            disc=itemView.findViewById(R.id.tavsif);
            image=itemView.findViewById(R.id.rasm);
        }
    }
    private  void replaceFragment(Fragment fragment){  // ishlamadi

    }

    interface OnItemClickList{
        void onItemCLick(int i);
    }
}
