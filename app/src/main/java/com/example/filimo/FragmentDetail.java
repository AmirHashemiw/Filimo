package com.example.filimo;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;

public class FragmentDetail extends Fragment  {

    public static final String Key_data_title="data_title";
    public static final String Key_data_image="data_image";

    ArrayList<String> arrayListMovie = new ArrayList<>();
    ArrayList<String> arrayListCmt = new ArrayList<>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail,container,false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        CollapsingToolbarLayout collapsingToolbarLayout = view.findViewById(R.id.collapsingToolbarLayout_detail);
        collapsingToolbarLayout.setExpandedTitleColor(ContextCompat.getColor(getContext(), android.R.color.transparent));
        collapsingToolbarLayout.setTitle("Movie Name");




        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_K371DtGZdyLBJoEQijo4OR--T3LZasfdBw&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLAUT7psQzUCqMsK5YIRf5pZ4girJ0L_ynQA&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkj5S6wjGM7V078gWsNVztvi1hRagGK45FSw&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXWWyvBmT3Iv_LXeFAkG7XNN1PjXNmdRAPCQ&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSId6VMQ21z5rZpS22tCpPn1MsjXUSkdqSW_g&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0RwTEfPxHyTAyNorZyHsjPQMB7HpaHr2Lnw&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdzDr3Uf18rKt7HfUryBMDloyl7awiWuehiQ&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5vUat6DbO-U8a5Qq8Zp2EPsbXa1JjCiybug&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzLSIhTDkTKVpHa5T7dV1feIghFUnTypsSrA&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQid3xOMfjMM65Ty8Gy1qRrQJ592Ol-2tcwdA&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT88zAVYs_Nfb8KAYh227FJlfiI8_BONWXvdg&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYMIIzC0laOCxBbmCDOohOFvwzHeXY8XSEGw&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxO-4DNciRYgT1yX7rZecVtfdeXCG_-TKQvQ&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ5nB-I3uCki4bWrDBHvwtX1meZwxQq0WZag&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMq436kQzUvudMg7XcqI-i7qRV9mtQiZmfuQ&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiWYFSzC-fuhzVTzSfaEqkmBCM8tyfOnHpsQ&usqp=CAU");
        arrayListMovie.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSU0IhrhdGChYB3V09d1K4Zbjryg-lrRlpJmA&usqp=CAU");

        RecyclerView recyclerView = view.findViewById(R.id.rv_fragment_detail);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(new AdapterRVFragmentDetail(arrayListMovie));


        arrayListCmt.add("sjkdnvlkjsndvlkjs;dv");
        arrayListCmt.add("sdvlisndvlkjsndoiunsduiovf");
        arrayListCmt.add("sdklvnmslkdnvokshdvou");
        arrayListCmt.add("sdvsdfbvsfd");
        arrayListCmt.add("njsohdfgnoshrgohw");
        arrayListCmt.add("sdmvpoksndvkjbsdikhvbs");
        arrayListCmt.add("sdvsdvsdvsdvsdv");
        arrayListCmt.add("sdvsfbdgjfhk");
        arrayListCmt.add("dsfrhrfykyulyui;");
        arrayListCmt.add("dgjsfrgjhaerhasrth");
        arrayListCmt.add("augwsiuygwqifrjpw");
        arrayListCmt.add("wqetgewrghwergkm");
        arrayListCmt.add("pl[prwkpgjporjh");
        arrayListCmt.add("sd'rkbglns;rngxpwisue");
        arrayListCmt.add("slkdehgvkjsbfdiobnpishgb");
        arrayListCmt.add("kmnoksndfbojniuhiueqwjgirhslkdgosh");

        RecyclerView recyclerView1 = view.findViewById(R.id.rv_fragment_detail_commnet);
        recyclerView1.setLayoutManager(new LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView1.setAdapter(new AdapterRVFragmentDetail(arrayListCmt));


        ImageView imageView = view.findViewById(R.id.imageViewDetailBackground);
        ImageView imageView1 = view.findViewById(R.id.imageViewDetail);
        ImageView imageView2 = view.findViewById(R.id.iv_perview);



        String data = getArguments().getString(Key_data_image);

        if (data!= null && !data.equals(""))
            Glide.with(requireContext()).load(data).into(imageView);
            Glide.with(requireContext()).load(data).into(imageView1);
            Glide.with(requireContext()).load(data).into(imageView2);


        String title = getArguments().getString(Key_data_title);
        collapsingToolbarLayout.setTitle(title);







    }

}



