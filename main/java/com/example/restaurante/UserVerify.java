package com.example.restaurante;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.restaurante.PageViwer.ProductTab;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class UserVerify extends AppCompatActivity {
    private EditText editTextresnumber,editTextname;
    private Button go_btn;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_verify);


       final TextView editTextname = (TextView) findViewById(R.id.editTextname);
       final TextView editTextresnumber = (TextView) findViewById(R.id.editTextresnumber);
       Button go_btn = (Button) findViewById(R.id.go_btn);


       //userAuthedication mesw firebase
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if( mFirebaseUser != null ){
                    Toast.makeText(UserVerify.this,"You are logged in",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(UserVerify.this, ProductTab.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(UserVerify.this,"Please Login",Toast.LENGTH_SHORT).show();
                }
            }
        };

        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextname.getText().toString();
                String resnumber = editTextresnumber.getText().toString();
                if(name.isEmpty()){
                    name.setError("Please enter email id");
                    name.requestFocus();
                }
                else  if(resnumber.isEmpty()){
                    resnumber.setError("Please enter your password");
                    resnumber.requestFocus();
                }
                else  if(name.isEmpty() && resnumber.isEmpty()){
                    Toast.makeText(UserVerify.this,"Fields Are Empty!",Toast.LENGTH_SHORT).show();
                }
                else  if(!(name.isEmpty() && resnumber.isEmpty())){
                    mFirebaseAuth.signInWithEmailAndPassword(name, resnumber).addOnCompleteListener(UserVerify.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(UserVerify.this,"Login Error, Please Login Again",Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Intent intToHome = new Intent(UserVerify.this,ProductTab.class);
                                startActivity(intToHome);
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(UserVerify.this,"Error Occurred!",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
