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

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


        ImageButton dosenBtn = findViewById(R.id.btnDosen);
        ImageButton dataBtn = findViewById(R.id.btnData);
        ImageButton matkulBtn = findViewById(R.id.btnMatkul);
        ImageButton krsBtn = findViewById(R.id.btnKRS);
        ImageButton mhsBtn = findViewById(R.id.btnMhs);
        ImageButton outBtn = findViewById(R.id.btnLogout);

        dosenBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this, ListDosenActivity.class);
                startActivity(i);
            }
        });

        dataBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this, DataDosenActivity.class);
                startActivity(i);
            }
        });

        matkulBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this, ListMatkulActivity.class);
                startActivity(i);
            }
        });

        krsBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this, ListKRSActivity.class);
                startActivity(i);
            }
        });

        mhsBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this, ListMahasiswaActivity.class);
                startActivity(i);
            }
        });
        outBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(AdminActivity.this);
                builder.setMessage("Apakah anda yakin untuk Keluar?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AdminActivity.this, "Tidak jadi keluar",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AdminActivity.this, "Melakukan Keluar !!",
                                        Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(AdminActivity.this, MainActivity.class);
                                startActivity(i);
                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }}
