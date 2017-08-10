package com.example.rpl.coba2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    TextView output;
    private EditText nis, nama;
    private Button input_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_activity2);
        nis = (EditText) findViewById(R.id.nis);
        nama = (EditText) findViewById(R.id.nama);
       /*output = (TextView) findViewById(R.id.output);*/
        input_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kirimdata();
            }
        });
    }

    public void kirimdata() {
        Toast.makeText(MainActivity.this,
                "Data Sudah selesai diinput" +
                        nis.getText().toString() +
                        nama.getText().toString(), Toast.LENGTH_LONG).show();

        Log.d(TAG, nis.getText().toString() + nama.getText().toString());

        Log.i(TAG, "input : Data sudah terinput " + "\n" + nama.getText().toString());
        output.setText("Data Sudah selesai diinput" + "\n" + nis.getText().toString() +
                nama.getText().toString());
    }

       /*Toast.makeText(this,
                "Data Sudah selesai diinput" + nis.getText().toString()+
                        nama.getText().toString()+
                        alamat.getText().toString()+
                        gender.getText().toString(),
                        Toast.LENGTH_LONG).show();
        Log.d(TAG,nis.getText().toString() + nama.getText().toString()+
                alamat.getText().toString()+
                gender.getText().toString());
        Log.i(TAG, "input : Data sudah terinput "+nama.getText().toString());*/



/* dibuat dgn ctrl+shit+/*/

}