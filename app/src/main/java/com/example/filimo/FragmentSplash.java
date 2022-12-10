package com.example.filimo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.airbnb.lottie.LottieAnimationView;

public class FragmentSplash extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash_screen,container,false);



    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //LottieAnimationView animationViewLottie = getView().findViewById(R.id.animationViewLottie);
       // animationViewLottie.




        Handler handler =new Handler();
        handler.postDelayed(() -> {

            FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_main,new FragmentHome());
           // fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();



        },3000);



    }
}
