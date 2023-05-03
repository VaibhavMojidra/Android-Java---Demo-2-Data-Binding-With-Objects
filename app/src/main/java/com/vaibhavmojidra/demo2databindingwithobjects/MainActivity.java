package com.vaibhavmojidra.demo2databindingwithobjects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.vaibhavmojidra.demo2databindingwithobjects.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.getStudentDataBtn.setOnClickListener(view -> {
            binding.setStudent(new Student("Vaibhav Mojidra","S027"));
        });
    }
}