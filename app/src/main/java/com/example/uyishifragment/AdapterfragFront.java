package com.example.uyishifragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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


    public AdapterfragFront(ArrayList<ModelClass> list, Context context) {
        this.list = list;
        this.context = context;
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
                switch (holder.getLayoutPosition()){
                    case 0:Toast.makeText(context.getApplicationContext(),"0 item bosildi",Toast.LENGTH_LONG).show(); break;
                    case 1: {
                        Toast.makeText(context.getApplicationContext(),"1 item bosildi",Toast.LENGTH_LONG).show();

                       FragmentBaqalar fragmentBaqalar=new FragmentBaqalar();
//
//                    //FragmentFront fragmentFront=new FragmentFront();

//                    fragmentManager.beginTransaction()
//                            .replace(R.id.fragment1,fragmentBaqalar,null)
//                            .commit();
                            } break;
                    case 2: Toast.makeText(context.getApplicationContext(),"2 item bosildi",Toast.LENGTH_LONG).show(); break;
                    case 3: Toast.makeText(context.getApplicationContext(),"3 item bosildi",Toast.LENGTH_LONG).show();
                    }


                }
               // Toast.makeText(context.getApplicationContext(), "Item "+p+" bosildi",Toast.LENGTH_LONG).show();

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
    private  void replaceFragment(Fragment fragment){
        //FragmentTransaction transaction=
    }
}
