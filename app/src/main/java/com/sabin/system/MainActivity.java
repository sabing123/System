package com.sabin.system;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DBConnection myDB;
    private EditText etusrname, etpassword;
    private Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB = new DBConnection(this);

        etusrname = (EditText) findViewById(R.id.username);
        etpassword = (EditText) findViewById(R.id.pass);
        btnregister = (Button) findViewById(R.id.btnregister);


            btnregister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isInserted = myDB.insertdata(etusrname.getText().toString(), etpassword.getText().toString());

                    if (isInserted = true)
                        Toast.makeText(MainActivity.this, "Data is inserted", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this, "Data is not inserted", Toast.LENGTH_LONG).show();
                }
            });

    }
}
