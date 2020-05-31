package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.restaurante.PageViwer.ProductTab;

import java.util.Random;

public class Reservation_details extends AppCompatActivity {

    private Button order,preOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_details);

        final TextView ReservationDetailsName = (TextView) findViewById(R.id.ReservationDetailsName );
        final TextView reservationDetailsResNumber  = (TextView) findViewById(R.id.reservationDetailsResNumber );

        ReservationDetailsName.setText(getIntent().getExtras().getString("name"));
        ReservationDetailsName.setText(getIntent().getExtras().getString("resnumber"));

        order = (Button) findViewById(R.id.button_Order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reservation_details.this, ProductTab.class);
                startActivity(intent);
            }
        });


        //elegxos ama exei erthei h wra tis kratiseis
       /* if(realtime)
        */
    }
}