package com.example.week12;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userPicture;
    TextView  userName, userDegree, userEmail;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userPicture = itemView.findViewById(R.id.userPicture);
        userName = itemView.findViewById(R.id.userName);
        userDegree = itemView.findViewById(R.id.userDegree);
        userEmail = itemView.findViewById(R.id.userEmail);

    }
}
