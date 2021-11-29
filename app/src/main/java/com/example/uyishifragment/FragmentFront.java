package com.example.uyishifragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentFront extends Fragment implements AdapterfragFront.OnItemClickList{

   private ArrayList<ModelClass> list;
   private  AdapterfragFront adapter;
   private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentfront_layout,container,false);
        recyclerView=view.findViewById(R.id.fr1r);
        loaddata();
        adapter=new AdapterfragFront(list,inflater.getContext(),this::onItemCLick);

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

    @Override
    public void onItemCLick(int i) {
        FragmentBaqalar fragmentFront=new FragmentBaqalar();
        FragmentManager fragmentManager=getChildFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment1,fragmentFront,null)
                .commit();
    }
}
