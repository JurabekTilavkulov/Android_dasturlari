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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentBaqalar extends Fragment implements AdapterfragFront.OnItemClickList {
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
            list.add(new ModelClass("baqa " + i, "Baqalar suvda susuvchi va quruqlikda yuruvchi jonivorlar", R.drawable.baqa2));
            list.add(new ModelClass("baqa" + i + 1, "Baqalar suvda susuvchi va quruqlikda yuruvchi jonivorlar", R.drawable.baqa4));
            list.add(new ModelClass("baqa" + i + 2, "Baqalar suvda susuvchi va quruqlikda yuruvchi jonivorlar", R.drawable.baqa5));
            list.add(new ModelClass("baqa" + i + 3, "Baqalar suvda susuvchi va quruqlikda yuruvchi jonivorlar", R.drawable.baqa6));

        }

    }

    @Override
    public void onItemCLick(int i, View v) {
        ImageView image = v.findViewById(R.id.rasm);
        TextView name = v.findViewById(R.id.nom);
        TextView disc = v.findViewById(R.id.tavsif);

        //int image1=image.getImageAlpha();
        String name1 = name.getText().toString();
        String disc1 = disc.getText().toString();
        UmumiyKlass umumiyKlass = new UmumiyKlass(name1, disc1, R.drawable.flag);
        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment1, umumiyKlass, null)
                .addToBackStack(null)
                .commit();

    }
    }
