package com.example.week12;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.userName.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.userDegree.setText(users.get(position).getDegreeProgram());
        holder.userEmail.setText(users.get(position).getEmail());
        holder.userPicture.setImageResource(R.drawable.logo);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}