package com.example.myapplication9999999999;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton next,back;
    private ImageView views;
    int c=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        views=findViewById(R.id.viewsIMG);
        next=findViewById(R.id.next);
        next.setOnClickListener(this);
        back=findViewById(R.id.back);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.next && c!=5)
            c++;
        else
        {c=1;views.setImageResource(R.drawable.a);}

        if(view.getId()==R.id.back && c!=1)
            c--;
        if (c==1)
            views.setImageResource(R.drawable.a);
        if (c==2)
            views.setImageResource(R.drawable.b);
        if (c==3)
            views.setImageResource(R.drawable.c);
        if (c==4)
            views.setImageResource(R.drawable.d);
        if (c==5)
            views.setImageResource(R.drawable.e);
    }
}