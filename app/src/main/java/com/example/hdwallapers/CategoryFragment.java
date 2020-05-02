package com.example.hdwallapers;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {
    private View view;
    private RecyclerView recyclerView;
    private CategoryRecycle adpater;
    private ArrayList<category_model> category_modelArrayList;

    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_category, container, false);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //
        Setimages();

    }

    private void Setimages() {
        recyclerView = view.findViewById(R.id.categoryR);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        category_modelArrayList = new ArrayList<>();
        category_modelArrayList.add(new category_model(R.drawable.cars, "Cars"));
        category_modelArrayList.add(new category_model(R.drawable.animal, "Animals"));
        category_modelArrayList.add(new category_model(R.drawable.fashion, "Fashion"));


        //
        adpater = new CategoryRecycle(category_modelArrayList, getActivity());
        recyclerView.setAdapter(adpater);


    }
}
