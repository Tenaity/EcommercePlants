//package com.midterm.ecommerceplants;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
//
//public class HomeFragment extends Fragment {
//    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment selectedFragment = null;
//            switch (item.getItemId()){
//                case R.id.item_bottommenu_home:
//                    selectedFragment = new PlantFragment();
//                    break;
//                case R.id.item_bottommenu_cart:
//                    selectedFragment = new CartFragment();
//                    break;
//                case R.id.item_bottommenu_person:
//                    selectedFragment = new PersonFragment();
//                    break;
//            }
//            getChildFragmentManager().beginTransaction().replace(R.id.fragment, selectedFragment).commit();
//            return true;
//        }
//    };
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_plant, container, false);
//        BottomNavigationView bottomNavigationView = container.findViewById(R.id.bottomBar);
//        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
//        return view;
//    }
//}