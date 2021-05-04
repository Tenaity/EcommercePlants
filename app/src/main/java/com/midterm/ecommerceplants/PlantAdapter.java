package com.midterm.ecommerceplants;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.midterm.ecommerceplants.model.Plant;

public class PlantAdapter extends FirebaseRecyclerAdapter<Plant, PlantAdapter.ViewHolder> {

    private PlantAdapterInterface mPlantAdapterInterface;

    public PlantAdapter(@NonNull FirebaseRecyclerOptions<Plant> options, PlantAdapterInterface plantAdapterInterface) {
        super(options);
        mPlantAdapterInterface = plantAdapterInterface;
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Plant model) {
        holder.mTvName.setText(model.getName());
        holder.mTvPrice.setText(model.getPrice());
        Glide.with(holder.mImgAvatar).load(model.getImage()).into(holder.mImgAvatar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlantAdapterInterface.onItemClick(model);
            }
        });
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImgAvatar;
        TextView mTvName, mTvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImgAvatar = itemView.findViewById(R.id.iv_avatar);
            mTvPrice = itemView.findViewById(R.id.tv_price);
            mTvName = itemView.findViewById(R.id.tv_name);
        }
    }

    public interface PlantAdapterInterface {
        void onItemClick(Plant plant);
    }
}
