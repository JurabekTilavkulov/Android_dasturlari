package com.example.uyishifragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class UmumiyKlass extends Fragment {
       private TextView name, discription;
       private ImageView imageView;

       private String name1, disc1;
       private int image1;

//    public UmumiyKlass(String name1, String disc1, int image1) {
//        this.name1 = name1;
//        this.disc1 = disc1;
//        this.image1 = image1;
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.by_one_by_layout,container,false);
        name=v.findViewById(R.id.name);
        discription=v.findViewById(R.id.disc);
        imageView=v.findViewById(R.id.img);

        name1=getArguments().getString("name");  // joylangan qiymatni olamiz
        disc1=getArguments().getString("Desc");
        image1=getArguments().getInt("Image");

        name.setText(name1);
        discription.setText(disc1);
        imageView.setImageResource(image1);
        Toast.makeText(getContext(), "Umumiy klasgacha yetib keldi", Toast.LENGTH_SHORT).show();

        return v;
    }
    public  static  UmumiyKlass getInstance(String name, String desc, int image){
        UmumiyKlass umumiyKlass=new UmumiyKlass();
        Bundle bundle=new Bundle();
        bundle.putString("name",name);
        bundle.putString("Desc",desc);
        bundle.putInt("Image",image);

        umumiyKlass.setArguments(bundle);  /// argumentga joyladik
        return  umumiyKlass;
    }
}
