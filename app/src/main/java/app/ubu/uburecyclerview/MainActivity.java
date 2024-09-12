package app.ubu.uburecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import app.ubu.uburecyclerview.model.Food;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Food 3 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        //
        List<Food> foods = new ArrayList<Food>();
        Food food = new Food();
        food.setFood_name("ผัดไทย");
        food.setFood_image("https://c0.wallpaperflare.com/preview/718/943/615/pad-thai-thai-food-thailand-asian-food.jpg");
        food.setFood_price(45);
        foods.add(food);

        Food food2 = new Food();
        food2.setFood_name("กระเพราหมูกรอบ");
        food2.setFood_image("https://img.wongnai.com/p/1920x0/2021/01/17/c95146b336274b0283b92b6943d289d8.jpg");
        food2.setFood_price(50);
        foods.add(food2);

        Food food3 = new Food();
        food3.setFood_name("พะแนงไก่");
        food3.setFood_image("https://cms.dmpcdn.com/food/2021/10/12/7e8c8750-2b36-11ec-bfd9-97090d4e24ba_original.jpg");
        food3.setFood_price(40);
        foods.add(food3);

        Food food4 = new Food();
        food4.setFood_name("เคบับ");
        food4.setFood_image("https://media.istockphoto.com/id/860985288/th/%E0%B8%A3%E0%B8%B9%E0%B8%9B%E0%B8%96%E0%B9%88%E0%B8%B2%E0%B8%A2/%E0%B8%A0%E0%B8%B2%E0%B8%9E%E0%B8%A3%E0%B8%B0%E0%B8%A2%E0%B8%B0%E0%B9%83%E0%B8%81%E0%B8%A5%E0%B9%89%E0%B8%82%E0%B8%AD%E0%B8%87%E0%B9%81%E0%B8%8B%E0%B8%99%E0%B8%A7%E0%B8%B4%E0%B8%8A%E0%B9%80%E0%B8%84%E0%B8%9A%E0%B8%B1%E0%B8%9A.jpg?s=612x612&w=0&k=20&c=3XXME7u-cy7gjz94nitzIcBu64JdWLh8e4YX2Oc8EJQ=");
        food4.setFood_price(60);
        foods.add(food4);

        Food food5 = new Food();
        food5.setFood_name("ข้าวมันไก่");
        food5.setFood_image("https://img.pikbest.com/wp/202343/steamed-rice-thai-style-khao-mun-gai-a-delectable-dish-with-tender-chicken_9976093.jpg!w700wp");
        food5.setFood_price(55);
        foods.add(food5);

        Food food6 = new Food();
        food6.setFood_name("ข้าวผัด");
        food6.setFood_image("https://media.istockphoto.com/id/507155407/th/%E0%B8%A3%E0%B8%B9%E0%B8%9B%E0%B8%96%E0%B9%88%E0%B8%B2%E0%B8%A2/%E0%B8%82%E0%B9%89%E0%B8%B2%E0%B8%A7%E0%B8%9C%E0%B8%B1%E0%B8%94%E0%B9%82%E0%B8%AE%E0%B8%A1%E0%B9%80%E0%B8%A1%E0%B8%94%E0%B9%80%E0%B8%9E%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%AA%E0%B8%B8%E0%B8%82%E0%B8%A0%E0%B8%B2%E0%B8%9E.jpg?s=612x612&w=0&k=20&c=Xq3-ahGEL0Zv3c1FGIliqVZWRLa4lsBuvC1mhk5yXYo=");
        food6.setFood_price(45);
        foods.add(food6);


        // ส่ง foods ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);
    }
}
