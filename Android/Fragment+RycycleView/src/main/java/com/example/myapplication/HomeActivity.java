package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rcvUser = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.srtData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.pic1, "User name 1"));
        list.add(new User(R.drawable.pic2, "User name 2"));
        list.add(new User(R.drawable.pic3, "User name 3"));
        list.add(new User(R.drawable.pic4, "User name 4"));

        list.add(new User(R.drawable.pic1, "User name 1"));
        list.add(new User(R.drawable.pic2, "User name 2"));
        list.add(new User(R.drawable.pic3, "User name 3"));
        list.add(new User(R.drawable.pic4, "User name 4"));

        list.add(new User(R.drawable.pic1, "User name 1"));
        list.add(new User(R.drawable.pic2, "User name 2"));
        list.add(new User(R.drawable.pic3, "User name 3"));
        list.add(new User(R.drawable.pic4, "User name 4"));

        return list;
    }
}