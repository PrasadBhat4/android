package org.posenet.compare;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

import java.util.HashMap;


public final class MainActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initUI();
    }

    private final void initUI() {
        Button btnGallery = (Button)this.findViewById(R.id.btn_gallery);
        btnGallery.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent i = new Intent((Context)MainActivity.this, MyGalleryActivity.class);
                MainActivity.this.startActivity(i);
            }
        }));
    }}
