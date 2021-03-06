package com.example.nasir.myparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class ReceiptActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);


        Random random= new Random();

        int number=random.nextInt(1000000000)+1000000000;
        String myString=String.valueOf(number);


        Intent getMessage = getIntent();
        String name= getMessage.getStringExtra("Name");
        String parkingLotName=getMessage.getStringExtra("parkingLotName");
        String parkingAddress=getMessage.getStringExtra("parkingAddress");
        TextView display=(TextView)findViewById(R.id.displayTxt);

        display.setText("Customer Name: "+"\t\t\t\t\t\t"+name+"\n\n"+"Receipt ID"+"\t\t\t\t\t\t\t\t\t\t\t\t\t"+
                myString+"\n\n"+"Parking Lot Name:"+"\t\t\t\t"+parkingLotName+
                "\n\n"+"Parking Lot Address:"+"\t\t\t"+parkingAddress);
    }
}
