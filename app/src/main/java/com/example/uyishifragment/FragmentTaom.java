package com.example.uyishifragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentTaom extends Fragment implements AdapterfragFront.OnItemClickList {
    private ArrayList<ModelClass> list;
    private AdapterfragFront adapter;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentfront_layout, container, false);


        recyclerView = view.findViewById(R.id.fr1r);
        loaddata();
        adapter = new AdapterfragFront(list, inflater.getContext());// adapterga list dagi malumotlarni jo'natdi
        adapter.setListener((AdapterfragFront.OnItemClickList) this); //bosilishini taminlaydi
        GridLayoutManager gridLayoutManager = new GridLayoutManager(inflater.getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }

    public void loaddata() {
        list = new ArrayList<>();
        for (int i = 0; i < 30; i += 4) {
            list.add(new ModelClass("Taom1 " + i, "Taom bu odamlarni tirik turishi uchun kerak", R.drawable.food1));
            list.add(new ModelClass("Taom2 " + i + 1, "Taom bu odamlarni tirik turishi uchun kerak", R.drawable.food2));
            list.add(new ModelClass("Taom3 " + i + 2, "Taom bu odamlarni tirik turishi uchun kerak", R.drawable.food7));
            list.add(new ModelClass("Taom4 " + i + 3, "Taom bu odamlarni tirik turishi uchun kerak", R.drawable.food10));

        }



    }

    @Override
    public void onItemCLick(int i, View v) {
        ImageView image = v.findViewById(R.id.rasm);
        TextView name = v.findViewById(R.id.nom);
        TextView disc = v.findViewById(R.id.tavsif);

        int image1= list.get(i).getImage();
        String name1 = list.get(i).getName();
        String disc1 = list.get(i).getDisc();

        UmumiyKlass umumiyKlass =  UmumiyKlass.getInstance(name1, disc1, image1);
        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment1, umumiyKlass, null)
                .addToBackStack(null) // orqaga qaytish imkonini beradi
                .commit();

    }
}