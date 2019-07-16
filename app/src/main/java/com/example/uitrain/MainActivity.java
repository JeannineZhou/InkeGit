package com.example.uitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText ed;
    private ImageView igview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        Button bt = findViewById(R.id.bt1);
        ed = findViewById(R.id.edtx);
        igview = findViewById(R.id.imageview);

        bt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
       switch(view.getId()) {
           case R.id.bt1:
              // String text = ed.getText().toString();
              // Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
               igview.setImageResource(R.mipmap.ic_launcher_round);
               break;
               default:
                   break;
       }
    }
}
