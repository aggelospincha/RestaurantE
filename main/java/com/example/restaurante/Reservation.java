package com.example.restaurante;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.restaurante.Models.Reservations;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Reservation extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private EditText editText_Name,EditText_Phone;
    private Button button_OkReservation;
    private Spinner spinner_time,spinner_table;

    private FirebaseDatabase rootNode;
    private DatabaseReference reference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        //anazitontas ta elements sto reservation activity
        editText_Name = (EditText) findViewById(R.id.editText_Name);
        EditText_Phone = (EditText) findViewById(R.id.EditText_Phone);
        button_OkReservation = (Button) findViewById(R.id.button_OkReservation);
        spinner_table = (Spinner) findViewById(R.id.spinner_table);
        spinner_time = (Spinner) findViewById(R.id.spinner_time);


        // picker imerominias me xrisi tou textView
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY a");
        final String dateTime = simpleDateFormat.format(calendar.getTime());
        TextView.setText(dateTime);


        //Vazontas ta Strings pou dhlosame sto stings array sta spinner mas

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.String_tables, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_table.setAdapter(adapter);
        spinner_table.setOnItemSelectedListener(this);



        adapter = ArrayAdapter.createFromResource(this, R.array.String_hours, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_time.setAdapter(adapter);
        spinner_time.setOnItemSelectedListener(this);




        public String generateString (int length) {
            char [] chars = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890".toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            Random random= new Random;

            for (int i=0; i<length;i++)
            {
                char c = chars[random.nextInt(chars.length)];
                stringBuilder.append(c);

            }
            return stringBuilder.toString();
        }


        final String resNumber;
        resNumber= generateString(length: 5);







            button_OkReservation.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference= rootNode.getReference("Restaurant");

                //get all the values
                String name = editText_Name.getText().toString();
                String phone = EditText_Phone.getText().toString();
                String date = dateTime.getBytes().toString();
                String table = spinner_table.getAccessibilityClassName().toString();
                String hours = spinner_time.getAccessibilityClassName().toString();
                String resnumber = resNumber.getText().toString();



                Reservations helperClass = new Reservations(name,phone,date,table,hours,resnumber);


                reference.setValue(helperClass);

                Intent intent = new Intent(Reservation.this, Reservation_details.class);
                intent.putExtra("name" editText_Name.getText().toString() );
                intent.putExtra( "phone " EditText_Phone.getText().toString() );
                intent.putExtra("date" dateTime.getBytes().toString() );
                intent.putExtra("table " spinner_table.getAccessibilityClassName().toString() );
                intent.putExtra("time" spinner_time.getAccessibilityClassName().toString() );
                intent.putExtra("resnumber" resNumber.getText().toString());
                startActivity(intent);
            }


        });

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();


        String text2 = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }





}
