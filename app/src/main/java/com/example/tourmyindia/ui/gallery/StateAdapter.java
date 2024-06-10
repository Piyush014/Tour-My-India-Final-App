package com.example.tourmyindia.ui.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tourmyindia.R;
import com.example.tourmyindia.ui.gallery.State;
import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.StateViewHolder> {

    private final List<State> stateList;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(State state);
    }

    public StateAdapter(List<State> stateList, OnItemClickListener listener) {
        this.stateList = stateList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public StateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_state, parent, false);
        return new StateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateViewHolder holder, int position) {
        State state = stateList.get(position);
        holder.stateName.setText(state.getName());
        holder.stateImage.setImageResource(state.getImageResId());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(state));
    }

    @Override
    public int getItemCount() {
        return stateList.size();
    }

    static class StateViewHolder extends RecyclerView.ViewHolder {
        TextView stateName;
        ImageView stateImage;

        public StateViewHolder(@NonNull View itemView) {
            super(itemView);
            stateName = itemView.findViewById(R.id.state_name);
            stateImage = itemView.findViewById(R.id.state_image);
        }
    }
}
