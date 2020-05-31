package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private Button btn_reservation,order_btn,btn_login_employee;

    private CheckBox employee_chk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_reservation = (Button) findViewById(R.id.btn_reservation);
        order_btn = (Button) findViewById(R.id.order_btn);
        employee_chk = (CheckBox) findViewById(R.id.employee_chk);
        btn_login_employee = (Button) findViewById(R.id.btn_login_employee);


        if(employee_chk.isChecked()){

            btn_reservation.setVisibility(View.INVISIBLE);
            order_btn.setVisibility(View.INVISIBLE);
            btn_login_employee.setVisibility(View.VISIBLE);
        }


        btn_reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Reservation.class);
                startActivity(intent);

            }

        });

        order_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserVerify.class);
                startActivity(intent);
            }
        });
    }
}
