//package com.midterm.ecommerceplants;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.fragment.app.Fragment;
//
//import com.midterm.ecommerceplants.databinding.FragmentDetailItemBinding;
//import com.midterm.ecommerceplants.model.Plant;
//
//public class DetailFragment extends Fragment {
//    private Plant plant;
//    private FragmentDetailItemBinding binding;
//    private String mName, Price, Image;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            plant = D;etailFragmentArgs.fromBundle(getArguments()).getPlant();
//            Log.d("DEBUG1", plant.getName());
//        } else {
//            Log.d("DEBUG2", "nohope");
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_detail_item, container, false);
//        return view;
//    }
//
////    public void onBackPressed(){
////        AppCompatActivity activity = (AppCompatActivity)getContext();
////        activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new HomeFragment()).addToBackStack(null).commit();
////    }
//}