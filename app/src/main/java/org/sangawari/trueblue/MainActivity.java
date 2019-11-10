package org.sangawari.trueblue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showText;



        showText=findViewById(R.id.show);





    }

    public void nextScreen(View view){

        Intent i=new Intent(MainActivity.this,Home.class);
        startActivity(i);
        finish();

    }

    public void display(View ab){

        EditText email;
        email=findViewById(R.id.email);

        String text= email.getText().toString();

        if (text.length()<6){
            Toast.makeText(MainActivity.this,"Size is less than 6",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
        }

    }


}
