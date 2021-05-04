package com.midterm.ecommerceplants;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.midterm.ecommerceplants.model.Plant;
import com.midterm.ecommerceplants.model.PlantEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;


public class CartFragment extends Fragment {
    private List<Plant> mPlantList;

    public CartFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(PlantEvent plantEvent) {
        if (mPlantList == null) {
            mPlantList = new ArrayList<>();
        }
        mPlantList.add(plantEvent.getPlant());
        Log.d("ttt", mPlantList.toString());
        // do something
    }

    @Override
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }
}