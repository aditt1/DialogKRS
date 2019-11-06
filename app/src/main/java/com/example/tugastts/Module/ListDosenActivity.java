package com.example.tugastts.Module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.tugastts.R;

public class ListDosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_dosen);

        ImageView dsnImg1 = findViewById(R.id.imgDosen);
        ImageView dsnImg2 = findViewById(R.id.imgDosen2);

        dsnImg1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(ListDosenActivity.this,UpdateDosenActivity.class);
                startActivity(i);
            }
        });

        dsnImg2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(ListDosenActivity.this,UpdateDosenActivity.class);
                startActivity(i);
            }
        });
    }
}
