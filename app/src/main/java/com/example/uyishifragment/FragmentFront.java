package com.example.uyishifragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentFront extends Fragment implements AdapterfragFront.OnItemClickList{
   //FragmentFront ning otasi Interface OnItemClickList elon qilingan

   private ArrayList<ModelClass> list;
   private  AdapterfragFront adapter;
   private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentfront_layout,container,false);
        recyclerView=view.findViewById(R.id.fr1r);
        loaddata();
        adapter=new AdapterfragFront(list,inflater.getContext());// adapterga list dagi malumotlarni jo'natdi
        adapter.setListener((AdapterfragFront.OnItemClickList)this); //bosilishini taminlaydi
        GridLayoutManager gridLayoutManager=new GridLayoutManager(inflater.getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }
    public void loaddata(){
        list=new ArrayList<>();
        list.add(new ModelClass("Qushlar","qushlar dunyoda keng tarqalgan jonivorlar bo'lib, ularning turlari juda k'p",R.drawable.chayka));
        list.add(new ModelClass("Baqalar","Suvda va quruqlikda yuruvchi amfibiyalarga turkimiga kiradi",R.drawable.baqa1));
        list.add(new ModelClass("Davlat bayroqlari","Davlat bayrog'i bu davlar ramzlariga kiradi, qaysi davlatga tegishli ekannini bildiradi",R.drawable.flag));
        list.add(new ModelClass("Taom turlari","inson uchun yaratilgan, oziq ovqat maxsulotlariga tegishli",R.drawable.food1));
//        list.add(new ModelClass("Qushlar","qushlar dunyoda keng tarqalgan jonivorlar bo'lib, ularning turlari juda k'p",R.drawable.chayka));
//        list.add(new ModelClass("Baqalar","Suvda va quruqlikda yuruvchi amfibiyalarga turkimiga kiradi",R.drawable.baqa1));
//        list.add(new ModelClass("Davlat bayroqlari","Davlat bayrog'i bu davlar ramzlariga kiradi, qaysi davlatga tegishli ekannini bildiradi",R.drawable.flag));
//        list.add(new ModelClass("Taom turlari","inson uchun yaratilgan, oziq ovqat maxsulotlariga tegishli",R.drawable.food1));
//        list.add(new ModelClass("Qushlar","qushlar dunyoda keng tarqalgan jonivorlar bo'lib, ularning turlari juda k'p",R.drawable.chayka));
//        list.add(new ModelClass("Baqalar","Suvda va quruqlikda yuruvchi amfibiyalarga turkimiga kiradi",R.drawable.baqa1));
//        list.add(new ModelClass("Davlat bayroqlari","Davlat bayrog'i bu davlar ramzlariga kiradi, qaysi davlatga tegishli ekannini bildiradi",R.drawable.flag));
//        list.add(new ModelClass("Taom turlari","inson uchun yaratilgan, oziq ovqat maxsulotlariga tegishli",R.drawable.food1));
//        list.add(new ModelClass("Qushlar","qushlar dunyoda keng tarqalgan jonivorlar bo'lib, ularning turlari juda k'p",R.drawable.chayka));
//        list.add(new ModelClass("Baqalar","Suvda va quruqlikda yuruvchi amfibiyalarga turkimiga kiradi",R.drawable.baqa1));
//        list.add(new ModelClass("Davlat bayroqlari","Davlat bayrog'i bu davlar ramzlariga kiradi, qaysi davlatga tegishli ekannini bildiradi",R.drawable.flag));
//        list.add(new ModelClass("Taom turlari","inson uchun yaratilgan, oziq ovqat maxsulotlariga tegishli",R.drawable.food1));
//        list.add(new ModelClass("Qushlar","qushlar dunyoda keng tarqalgan jonivorlar bo'lib, ularning turlari juda k'p",R.drawable.chayka));
//        list.add(new ModelClass("Baqalar","Suvda va quruqlikda yuruvchi amfibiyalarga turkimiga kiradi",R.drawable.baqa1));
//        list.add(new ModelClass("Davlat bayroqlari","Davlat bayrog'i bu davlar ramzlariga kiradi, qaysi davlatga tegishli ekannini bildiradi",R.drawable.flag));
//        list.add(new ModelClass("Taom turlari","inson uchun yaratilgan, oziq ovqat maxsulotlariga tegishli",R.drawable.food1));
//        list.add(new ModelClass("Qushlar","qushlar dunyoda keng tarqalgan jonivorlar bo'lib, ularning turlari juda k'p",R.drawable.chayka));
//        list.add(new ModelClass("Baqalar","Suvda va quruqlikda yuruvchi amfibiyalarga turkimiga kiradi",R.drawable.baqa1));
//        list.add(new ModelClass("Davlat bayroqlari","Davlat bayrog'i bu davlar ramzlariga kiradi, qaysi davlatga tegishli ekannini bildiradi",R.drawable.flag));
//        list.add(new ModelClass("Taom turlari","inson uchun yaratilgan, oziq ovqat maxsulotlariga tegishli",R.drawable.food1));
//        list.add(new ModelClass("Qushlar","qushlar dunyoda keng tarqalgan jonivorlar bo'lib, ularning turlari juda k'p",R.drawable.chayka));
//        list.add(new ModelClass("Baqalar","Suvda va quruqlikda yuruvchi amfibiyalarga turkimiga kiradi",R.drawable.baqa1));
//        list.add(new ModelClass("Davlat bayroqlari","Davlat bayrog'i bu davlar ramzlariga kiradi, qaysi davlatga tegishli ekannini bildiradi",R.drawable.flag));
//        list.add(new ModelClass("Taom turlari","inson uchun yaratilgan, oziq ovqat maxsulotlariga tegishli",R.drawable.food1));
//        list.add(new ModelClass("Qushlar","qushlar dunyoda keng tarqalgan jonivorlar bo'lib, ularning turlari juda k'p",R.drawable.chayka));
//        list.add(new ModelClass("Baqalar","Suvda va quruqlikda yuruvchi amfibiyalarga turkimiga kiradi",R.drawable.baqa1));
//        list.add(new ModelClass("Davlat bayroqlari","Davlat bayrog'i bu davlar ramzlariga kiradi, qaysi davlatga tegishli ekannini bildiradi",R.drawable.flag));
//        list.add(new ModelClass("Taom turlari","inson uchun yaratilgan, oziq ovqat maxsulotlariga tegishli",R.drawable.food1));

    }

    @Override //v-itemview_fragmentLayout dan malumot olmoqda
    public void onItemCLick(int i, View v) {// interfacega override qilib yozmoqda
        // position i orqali Item dagi malumotlarni olib foydalanish kk
       TextView name=v.findViewById(R.id.nom);
       String s=name.getText().toString();
        Toast.makeText(getContext(), "position"+i+"va ko'rinish "+s, Toast.LENGTH_SHORT).show();


        switch (i){
            case 0:  FragmentQushlar fragmentQushlar=new FragmentQushlar();

                FragmentManager fragmentManager=getParentFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment1,fragmentQushlar,null)
                        .addToBackStack(null)// boshqa bir ko'rsatish kk bo'lgan layout kk
                        .commit(); break;
            case 1: FragmentBaqalar fragmentBaqalar=new FragmentBaqalar();

                FragmentManager fragmentManager1=getParentFragmentManager();
                fragmentManager1.beginTransaction()
                        .replace(R.id.fragment1,fragmentBaqalar,null) // boshqa bir ko'rsatish kk bo'lgan layout kk
                        .addToBackStack(null) //orqaga qaytaradi
                        .commit();  break;
            case 2: FragmentBayroq fragmentBayroq=new FragmentBayroq();

                FragmentManager fragmentManager2=getParentFragmentManager();
                fragmentManager2.beginTransaction()
                        .replace(R.id.fragment1,fragmentBayroq,null) // boshqa bir ko'rsatish kk bo'lgan layout kk
                        .addToBackStack(null) //orqaga qaytaradi
                        .commit(); break;
            case 3:  FragmentTaom fragmentTaom=new FragmentTaom();

                FragmentManager fragmentManager3=getParentFragmentManager();
                fragmentManager3.beginTransaction()
                        .replace(R.id.fragment1,fragmentTaom,null) // boshqa bir ko'rsatish kk bo'lgan layout kk
                        .addToBackStack(null) //orqaga qataradi
                        .commit(); break;
        }
    }
}


