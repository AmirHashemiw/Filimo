package com.example.filimo;

import android.net.wifi.aware.AwareResources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment_Vizhe extends Fragment implements OnItemClickListener{

    ArrayList<Model_recycler> arrayList2 = new ArrayList<>();




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vizhe,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRa_wZzuU1iqxwqM4gXEvpdLmRzarjyDyHLA&usqp=CAU","KIESLOWSKI"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCoBWcMqsQc4AZiUjkaV6TGm5aa5Zz1haWGw&usqp=CAU","WAR"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRA7_-BPKkk8Janq46ORDR8Mu5QPzxMxb5G6w&usqp=CAU","ANGELS"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAzND3jKcse8bW5zmo66VNt79EBMemwND5lQ&usqp=CAU","WOMEN"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTE90gqlhwnsD0KKS7fcJKQnNN1A9BAMp0qaw&usqp=CAU","THOR"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTqY3j8XEuaNedQgRURsNvdjLfcjp183RVIQ&usqp=CAU","BUSH"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8NRVGEjBCbsBS9C45hm5EG4h631H794CU5Q&usqp=CAU","SPIDERHEAD"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYeD9Y7VhXtqDux0HhfEvEB4gtpArnngrtVQ&usqp=CAU","BEACH"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFyER85bu2FX7_VEkPb0wDhDn9f7IuU2M0cQ&usqp=CAU","STRONGER"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRc8_1Xy-v2KpJQVrhw-0lkOXJf9dxGFEYxrw&usqp=CAU","MIRACLE"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5U8IVvKUq1MwMmySDUfNBEGiPSbdhMr4U_g&usqp=CAU","28 DAYS"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuRfyW4kzKaYd_LMK0S4c4MN6-9Cb5crLINA&usqp=CAU","QUANTUMANIA"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkEdvJW5Sft3lgRYI7MPS2s9u-kB0s5wCtVQ&usqp=CAU","MERU"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRZ94XVpxhgSbDWV9VU_2Tzw_KjWuuR6qbTg&usqp=CAU","LEFT RIGHT"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT88zAVYs_Nfb8KAYh227FJlfiI8_BONWXvdg&usqp=CAU","NEGRO"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYMIIzC0laOCxBbmCDOohOFvwzHeXY8XSEGw&usqp=CAU","JAYA HEY"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxO-4DNciRYgT1yX7rZecVtfdeXCG_-TKQvQ&usqp=CAU","IMAX"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ5nB-I3uCki4bWrDBHvwtX1meZwxQq0WZag&usqp=CAU","INVITATION"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMq436kQzUvudMg7XcqI-i7qRV9mtQiZmfuQ&usqp=CAU","COMPOSITION"));

        RecyclerView recyclerViewFragmentvizhe = view.findViewById(R.id.rv_fragment_vizhe);
        recyclerViewFragmentvizhe.setLayoutManager(new GridLayoutManager(requireContext(),2));
        recyclerViewFragmentvizhe.setAdapter(new Adapter_rv_tazeha(arrayList2,this));




    }

    @Override
    public void onItemClick(String item) {

        FragmentDetail fragmentDetail = new FragmentDetail();
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
fragmentTransaction.add(R.id.frame_main,fragmentDetail);
fragmentTransaction.addToBackStack(null);
fragmentTransaction.commit();


    }
}
