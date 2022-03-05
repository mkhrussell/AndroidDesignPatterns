package com.kamrul.knownspies.Activities.SpyList;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.kamrul.knownspies.Helpers.Helper;
import com.kamrul.knownspies.ModelLayer.Database.Realm.Spy;
import com.kamrul.knownspies.R;

public class SpyViewHolder extends RecyclerView.ViewHolder {
    Context context;
    CardView cv;
    TextView personName;
    TextView personAge;
    ImageView personPhoto;

    public SpyViewHolder(View itemView) {
        super(itemView);

        this.context = itemView.getContext();
        this.cv = (CardView) itemView.findViewById(R.id.card_view);
        this.personName = (TextView) itemView.findViewById(R.id.person_name);
        this.personAge = (TextView) itemView.findViewById(R.id.person_age);
        this.personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
    }

    public void configureWith(Spy spy) {
        int imageId = Helper.resourceIdWith(context, spy.imageName);
        String age = String.valueOf(spy.age);

        personName.setText(spy.name);
        personAge.setText(age);
        personPhoto.setImageResource(imageId);
    }

}

