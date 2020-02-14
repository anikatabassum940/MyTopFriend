package com.anika.mytopfriend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalisActivity extends AppCompatActivity {

    ImageView imgFriend;
    TextView txtName;
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis);

        imgFriend=findViewById(R.id.img_friend);
        txtName=findViewById(R.id.txt_name);
        btnCall=findViewById(R.id.btn_call);

        final String getId=getIntent().getExtras().getString("id");
        final String getPhone=getIntent().getExtras().getString("phone");

        if(getId.equals("0"))
        {
            imgFriend.setImageResource(R.drawable.buban);
            txtName.setText("Hurenaz Rayana Ahmed");


        }
        if(getId.equals("1"))
        {
            imgFriend.setImageResource(R.drawable.roshni);
            txtName.setText("Ommey Sayima Roshni");


        }
        if(getId.equals("2"))
        {
            imgFriend.setImageResource(R.drawable.tuli);
            txtName.setText("Rehnuma Tabassum Tuli");


        }
        if(getId.equals("3"))
        {
            imgFriend.setImageResource(R.drawable.payel);
            txtName.setText("Ishrat Jahan");


        }
        if(getId.equals("4"))
        {
            imgFriend.setImageResource(R.drawable.moni);
            txtName.setText("Monirunnesa Khanam");


        }
        if(getId.equals("5"))
        {
            imgFriend.setImageResource(R.drawable.sadia1);
            txtName.setText("Sadia Zaker");


        }
        if(getId.equals("6"))
        {
            imgFriend.setImageResource(R.drawable.stuart1);
            txtName.setText("Halima tus Sadia");


        }

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+getPhone));

                    startActivity(callIntent);


            }
        });
    }
}
