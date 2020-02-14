package com.anika.mytopfriend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewActivity extends AppCompatActivity {

    String friendList[]={"Buban","Roshni","Tuli","Payel","Moni","Sadia","Stuart"};
    int image[]={R.drawable.buban1,R.drawable.roshni1,R.drawable.tuli,R.drawable.payel,R.drawable.moni,R.drawable.sadia1,R.drawable.stuart1};

    String number[]={"01521485570","01731971160","01792265369","01890082465","01858759289","01880919780","01704075374"};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
         recyclerView=findViewById(R.id.recyclerview);
        //LinearLayoutManager layoutManager=new LinearLayoutManager(RecyclerViewActivity.this,LinearLayoutManager.HORIZONTAL,false);

        GridLayoutManager layoutManager=new GridLayoutManager(RecyclerViewActivity.this,2);


        recyclerView.setLayoutManager(layoutManager);

        CustomAdopter customAdopter=new CustomAdopter(RecyclerViewActivity.this,friendList,image,number);
        recyclerView.setAdapter((customAdopter));

    }
}
