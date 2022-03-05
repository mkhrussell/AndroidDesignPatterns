package com.kamrul.knownspies.Activities.SpyList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.kamrul.knownspies.Helpers.CustomItemClickListener;
import com.kamrul.knownspies.ModelLayer.Database.Realm.Spy;
import com.kamrul.knownspies.R;

import java.util.List;

public class SpyViewAdapter extends RecyclerView.Adapter<SpyViewHolder> {

    List<Spy> spies;
    CustomItemClickListener listener;

    public SpyViewAdapter(List<Spy> spies, CustomItemClickListener listener) {
        this.spies = spies;
        this.listener = listener;
    }

    @Override
    public SpyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View spyView = LayoutInflater.from(parent.getContext()).inflate(R.layout.spy_cell, parent, false);

        final SpyViewHolder spyViewHolder = new SpyViewHolder(spyView);

        spyView.setOnClickListener(v -> listener.onItemClick(v, spyViewHolder.getAdapterPosition()));

        return spyViewHolder;
    }

    @Override
    public void onBindViewHolder(SpyViewHolder holder, int index) {
        Spy spy = spies.get(index);
        holder.configureWith(spy);
    }

    @Override
    public int getItemCount() {
        return spies.size();
    }
}

