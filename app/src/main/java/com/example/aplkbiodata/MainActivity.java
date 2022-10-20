package com.example.aplkbiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button setMaps, setPhone, setEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan button di xml dengan logic di java
        setMaps=findViewById(R.id.mapsBtn);
        setEmail=findViewById(R.id.emailBtn);
        setPhone=findViewById(R.id.kontakBtn);

        //set onclicklistener untuk tiap button
        setMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGmaps();
            }
        });

        setPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhone();
            }
        });

        setEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGmail();
            }
        });
    }

    //fungsi untuk membuka phone app
    public void openPhone(){
        Uri callNumber=Uri.parse("tel:08121888912");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,callNumber);
        startActivity(callIntent);
    }

    //fungsi untuk membuka email app
    public void openGmail(){
        Uri tujuanEmail=Uri.parse("mailto:111201912355@mhs.dinus.ac.id");
        String subjek = "coba email";
        Intent callIntent=new Intent(Intent.ACTION_SENDTO,tujuanEmail);
        startActivity(callIntent);
    }

    //fungsi untuk membuka mail apps
    public void openGmaps(){
        String latnLong="@-7.0258396,110.4697273,15z";
        String location="Tegalsari,+Kec.+Candisari,+Kota+Semarang,+Jawa+Tengah";
        Uri locations = Uri.parse("geo:-7.0258396,110.4697273?Tegalsari,+kec.+Candisari,+Kota+Semarang,+Jawa+Tengah");
        Intent intentPeta = new Intent(Intent.ACTION_VIEW, locations);
        startActivity(intentPeta);
    }
}