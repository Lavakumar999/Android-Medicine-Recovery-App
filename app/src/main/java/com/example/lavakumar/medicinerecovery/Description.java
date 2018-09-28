package com.example.lavakumar.medicinerecovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Button btnClickpre=(Button)findViewById(R.id.btnCLickpre);
        Button btnDataBase=(Button)findViewById(R.id.btnCLickdata);
        btnClickpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpre=new Intent(Description.this,MedicineAvail.class);
                startActivity(intentpre);
            }
        });
        btnDataBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentData=new Intent(Description.this,DataBaseActivityMedicine.class);
                startActivity(intentData);
            }
        });
    }
}
