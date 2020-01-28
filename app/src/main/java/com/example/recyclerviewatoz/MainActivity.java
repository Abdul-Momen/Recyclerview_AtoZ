package com.example.recyclerviewatoz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView,recyclerView2,recyclerView3;
    private FoodAdapter adapter,adapter2,adapter3;
    private List<FoodModel> loadlist,loadlist2,loadlist3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //find view
        recyclerView=findViewById(R.id.recylerview);
       recyclerView2=findViewById(R.id.recylerview2);
       recyclerView3=findViewById(R.id.recylerview3);





        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));



//
//





        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //set data in model
        loadlist=new ArrayList<>();
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));      loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));      loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));
        loadlist.add(new FoodModel(R.drawable.lunce1,"Breckfast","84"));

        adapter=new FoodAdapter(this,loadlist,"one");
        recyclerView.setAdapter(adapter);






        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        //set data in model
        loadlist2=new ArrayList<>();

        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));
        loadlist2.add(new FoodModel(R.drawable.lunce5,"lanch","84"));

        adapter2=new FoodAdapter(this,loadlist2,"two");
        recyclerView2.setAdapter(adapter2);

//
//
//
//
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(new GridLayoutManager(this,2));


        //set data in model
        loadlist3=new ArrayList<>();

        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));
        loadlist3.add(new FoodModel(R.drawable.lunce7,"Diner","84"));


        adapter3=new FoodAdapter(this,loadlist3,"three");
        recyclerView3.setAdapter(adapter3);











    }
}
