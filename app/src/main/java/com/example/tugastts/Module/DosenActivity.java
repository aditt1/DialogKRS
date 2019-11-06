package com.example.tugastts.Module;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.tugastts.R;

public class DosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen);

        ImageButton krsBtn = findViewById(R.id.btnDaftarKrs);
        ImageButton dataDiriBtn = findViewById(R.id.btnData);
        ImageButton dataKelasBtn = findViewById(R.id.btnLihat);
        ImageButton outBtn = findViewById(R.id.btnLogout);

        krsBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,ListKRSActivity.class);
                startActivity(i);
            }
        });

        dataDiriBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,DataDosenActivity.class);
                startActivity(i);
            }
        });

        dataKelasBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,LihatKelasActivity.class);
                startActivity(i);
            }
        });

        outBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(DosenActivity.this);
                builder.setMessage("Apakah anda yakin untuk Keluar?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DosenActivity.this, "Tidak jadi keluar",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DosenActivity.this, "Melakukan Keluar !!",
                                        Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(DosenActivity.this, MainActivity.class);
                                startActivity(i);
                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }}
