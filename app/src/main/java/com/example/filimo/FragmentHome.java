package com.example.filimo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class FragmentHome extends Fragment implements OnItemClickListener {


    ArrayList<ModelMovieVizhe> arrayList1 = new ArrayList<>();
    ArrayList<Model_recycler> arrayList2 = new ArrayList<>();
    Button buttonLogIn;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = view.findViewById(R.id.top_toolbar_fragmentHome);
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        //appCompatActivity.setSupportActionBar(toolbar);


        ImageSlider imageSlider = null;
        imageSlider = (ImageSlider) getView().findViewById(R.id.image_slider);
        // imageSlider.findViewById(R.id.image_slider);
        ArrayList<SlideModel> images = new ArrayList<>();
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_K371DtGZdyLBJoEQijo4OR--T3LZasfdBw&usqp=CAU", "PREY", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLAUT7psQzUCqMsK5YIRf5pZ4girJ0L_ynQA&usqp=CAU", "SMILE", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkj5S6wjGM7V078gWsNVztvi1hRagGK45FSw&usqp=CAU", "LIGHT", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXWWyvBmT3Iv_LXeFAkG7XNN1PjXNmdRAPCQ&usqp=CAU", "LAIR Life", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSId6VMQ21z5rZpS22tCpPn1MsjXUSkdqSW_g&usqp=CAU", "LUCA", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0RwTEfPxHyTAyNorZyHsjPQMB7HpaHr2Lnw&usqp=CAU", "SCHOOL", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdzDr3Uf18rKt7HfUryBMDloyl7awiWuehiQ&usqp=CAU", "BLACK LIGHT", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5vUat6DbO-U8a5Qq8Zp2EPsbXa1JjCiybug&usqp=CAU", "WRONG", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzLSIhTDkTKVpHa5T7dV1feIghFUnTypsSrA&usqp=CAU", "DEEP", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQid3xOMfjMM65Ty8Gy1qRrQJ592Ol-2tcwdA&usqp=CAU", "WAKA", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT88zAVYs_Nfb8KAYh227FJlfiI8_BONWXvdg&usqp=CAU", "NEGRO", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYMIIzC0laOCxBbmCDOohOFvwzHeXY8XSEGw&usqp=CAU", "LAYA", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxO-4DNciRYgT1yX7rZecVtfdeXCG_-TKQvQ&usqp=CAU", "IAMX", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ5nB-I3uCki4bWrDBHvwtX1meZwxQq0WZag&usqp=CAU", "24 DAY", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMq436kQzUvudMg7XcqI-i7qRV9mtQiZmfuQ&usqp=CAU", "SHIFT", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiWYFSzC-fuhzVTzSfaEqkmBCM8tyfOnHpsQ&usqp=CAU", "POOR", null));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSU0IhrhdGChYB3V09d1K4Zbjryg-lrRlpJmA&usqp=CAU", "SHOW", null));
        imageSlider.setImageList(images, ScaleTypes.CENTER_INSIDE);


        arrayList1.add(new ModelMovieVizhe(1, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_K371DtGZdyLBJoEQijo4OR--T3LZasfdBw&usqp=CAU", "PREY"));
        arrayList1.add(new ModelMovieVizhe(2, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLAUT7psQzUCqMsK5YIRf5pZ4girJ0L_ynQA&usqp=CAU", "SMILE"));
        arrayList1.add(new ModelMovieVizhe(3, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkj5S6wjGM7V078gWsNVztvi1hRagGK45FSw&usqp=CAU", "LIGHT YEAR"));
        arrayList1.add(new ModelMovieVizhe(4, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXWWyvBmT3Iv_LXeFAkG7XNN1PjXNmdRAPCQ&usqp=CAU", "THE LAIR"));
        arrayList1.add(new ModelMovieVizhe(5, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSId6VMQ21z5rZpS22tCpPn1MsjXUSkdqSW_g&usqp=CAU", "LUCA"));
        arrayList1.add(new ModelMovieVizhe(6, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0RwTEfPxHyTAyNorZyHsjPQMB7HpaHr2Lnw&usqp=CAU", "SCHOOL"));
        arrayList1.add(new ModelMovieVizhe(7, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdzDr3Uf18rKt7HfUryBMDloyl7awiWuehiQ&usqp=CAU", "BLACK LIGHT"));
        arrayList1.add(new ModelMovieVizhe(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5vUat6DbO-U8a5Qq8Zp2EPsbXa1JjCiybug&usqp=CAU", "WONG KAR WAY"));
        arrayList1.add(new ModelMovieVizhe(9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzLSIhTDkTKVpHa5T7dV1feIghFUnTypsSrA&usqp=CAU", "DEEP WATER"));
        arrayList1.add(new ModelMovieVizhe(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQid3xOMfjMM65Ty8Gy1qRrQJ592Ol-2tcwdA&usqp=CAU", "WAKANDA"));
        arrayList1.add(new ModelMovieVizhe(11, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT88zAVYs_Nfb8KAYh227FJlfiI8_BONWXvdg&usqp=CAU", "NEGRO"));
        arrayList1.add(new ModelMovieVizhe(12, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYMIIzC0laOCxBbmCDOohOFvwzHeXY8XSEGw&usqp=CAU", "JAYA HEY"));
        arrayList1.add(new ModelMovieVizhe(13, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxO-4DNciRYgT1yX7rZecVtfdeXCG_-TKQvQ&usqp=CAU", "IMAX"));
        arrayList1.add(new ModelMovieVizhe(14, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ5nB-I3uCki4bWrDBHvwtX1meZwxQq0WZag&usqp=CAU", "INVITATION"));
        arrayList1.add(new ModelMovieVizhe(15, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMq436kQzUvudMg7XcqI-i7qRV9mtQiZmfuQ&usqp=CAU", "COMPOSITION"));
        arrayList1.add(new ModelMovieVizhe(16, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiWYFSzC-fuhzVTzSfaEqkmBCM8tyfOnHpsQ&usqp=CAU", "NOCEBO"));
        arrayList1.add(new ModelMovieVizhe(17, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSU0IhrhdGChYB3V09d1K4Zbjryg-lrRlpJmA&usqp=CAU", "CAPTAIN FANTASTIC"));
        RecyclerView recyclerView1 = view.findViewById(R.id.rv_vizhe);
        recyclerView1.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setAdapter(new Adapter_rv_vizhe(arrayList1, new OnItemClickListenerVizhe() {
            @Override
            public void onItemClick(ModelMovieVizhe item) {

                String title = item.getTitle();
                String image = item.getImage();

                Bundle bundle = new Bundle();
                FragmentDetail fragmentDetail = new FragmentDetail();
                fragmentDetail.setArguments(bundle);


                bundle.putString(FragmentDetail.Key_data_title, title);
                bundle.putString(FragmentDetail.Key_data_image, image);


                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_main, fragmentDetail);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        }));


        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRa_wZzuU1iqxwqM4gXEvpdLmRzarjyDyHLA&usqp=CAU", "KIESLOWSKI"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCoBWcMqsQc4AZiUjkaV6TGm5aa5Zz1haWGw&usqp=CAU", "WAR"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRA7_-BPKkk8Janq46ORDR8Mu5QPzxMxb5G6w&usqp=CAU", "ANGELS"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAzND3jKcse8bW5zmo66VNt79EBMemwND5lQ&usqp=CAU", "WOMEN"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTE90gqlhwnsD0KKS7fcJKQnNN1A9BAMp0qaw&usqp=CAU", "THOR"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTqY3j8XEuaNedQgRURsNvdjLfcjp183RVIQ&usqp=CAU", "BUSH"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8NRVGEjBCbsBS9C45hm5EG4h631H794CU5Q&usqp=CAU", "SPIDERHEAD"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYeD9Y7VhXtqDux0HhfEvEB4gtpArnngrtVQ&usqp=CAU", "BEACH"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFyER85bu2FX7_VEkPb0wDhDn9f7IuU2M0cQ&usqp=CAU", "STRONGER"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRc8_1Xy-v2KpJQVrhw-0lkOXJf9dxGFEYxrw&usqp=CAU", "MIRACLE"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5U8IVvKUq1MwMmySDUfNBEGiPSbdhMr4U_g&usqp=CAU", "28 DAYS"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuRfyW4kzKaYd_LMK0S4c4MN6-9Cb5crLINA&usqp=CAU", "QUANTUMANIA"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkEdvJW5Sft3lgRYI7MPS2s9u-kB0s5wCtVQ&usqp=CAU", "MERU"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRZ94XVpxhgSbDWV9VU_2Tzw_KjWuuR6qbTg&usqp=CAU", "LEFT RIGHT"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT88zAVYs_Nfb8KAYh227FJlfiI8_BONWXvdg&usqp=CAU", "NEGRO"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYMIIzC0laOCxBbmCDOohOFvwzHeXY8XSEGw&usqp=CAU", "JAYA HEY"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxO-4DNciRYgT1yX7rZecVtfdeXCG_-TKQvQ&usqp=CAU", "IMAX"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ5nB-I3uCki4bWrDBHvwtX1meZwxQq0WZag&usqp=CAU", "INVITATION"));
        arrayList2.add(new Model_recycler("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMq436kQzUvudMg7XcqI-i7qRV9mtQiZmfuQ&usqp=CAU", "COMPOSITION"));

        RecyclerView recyclerView2 = view.findViewById(R.id.rv_tazeha);
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setAdapter(new Adapter_rv_tazeha(arrayList2, this));


        ImageView buttonLogIn = getView().findViewById(R.id.button_log_in);
        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_main, new Fragment_Log_In());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        LinearLayout buttonVizhe = getView().findViewById(R.id.button_vizhe_moshahedeBishtar);
        buttonVizhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_main, new Fragment_Vizhe());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        LinearLayout buttonTazeha = getView().findViewById(R.id.button_tazeha_moshahede_bishtar);
        buttonTazeha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame_main, new Fragment_Tazeha());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }


    @Override
    public void onItemClick(String item) {
        FragmentDetail fragmentDetail = new FragmentDetail();
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_main, fragmentDetail);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }


}


