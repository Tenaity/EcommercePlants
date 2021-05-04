package com.midterm.ecommerceplants;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.midterm.ecommerceplants.model.Plant;


public class PlantFragment extends Fragment {
    private RecyclerView mRvPlant;
    private PlantAdapter mPlantAdapter;

    private final PlantAdapter.PlantAdapterInterface mPlantAdapterInterface = plant -> {
        Intent intent = new Intent(getActivity(), PlantDetailActivity.class);
        intent.putExtra("plant", plant);
        startActivity(intent);
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_plant, container, false);
        mRvPlant = view.findViewById(R.id.recycler_main);
        mRvPlant.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        FirebaseRecyclerOptions<Plant> options =
                new FirebaseRecyclerOptions.Builder<Plant>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Plant"), Plant.class)
                        .build();

        mPlantAdapter = new PlantAdapter(options, mPlantAdapterInterface);
        mRvPlant.setAdapter(mPlantAdapter);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        mPlantAdapter.startListening();// cai nay de lam gi
    }

    @Override
    public void onStop() {
        super.onStop();
        mPlantAdapter.stopListening();
    }
}