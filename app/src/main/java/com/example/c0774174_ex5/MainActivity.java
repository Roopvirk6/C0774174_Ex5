package com.example.c0774174_ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editText1;
    private TextInputEditText editText2;
    private TextInputEditText editText3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (TextInputEditText)findViewById(R.id.editText1);
        editText2 = (TextInputEditText)findViewById(R.id.editText2);
        editText3 = (TextInputEditText)findViewById(R.id.editText3);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Submit", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                ContentDisplay cnt = new ContentDisplay();

                String s = editText3.getText().toString();
                String s1 = editText2.getText().toString();
                String s2 = editText1.getText().toString();
                cnt.setFirstName(s);
                cnt.setLastName(s1);
                cnt.setAddress(s2);
                Log.d("test11111",s);
                Log.d("test1",s1);
                Log.d("test2",s2);
                intent.putExtra("details",cnt);
                intent.putExtra("details1",cnt);
                intent.putExtra("details2",cnt);
                //data.putString("Last Name",editText2.getText().toString());
             //   data.putString("Address",editText3.getText().toString());

//Add the bundle to the intent
            //    intent.putExtras(data);
             //   intent.putExtra("Content",data);

              //  intent.putExtra("Content", new ContentDisplay("lily","Mike","6 vanview"));
              //  intent.putExtra("Content",new ContentDisplay("priya","riie","3 address"));
                startActivity(intent);
            }
        });

    }
}
