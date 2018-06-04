package com.prince.carl.easysnackbar;

import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.prince.carl.easysnackbar.EasySnackBar.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    private Button _btnOrigin;
    private Button _btnTop;
    private Button _btnBottom;
    private Button _btnLeft;
    private Button _btnRight;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViews();
        bindDatas();
        bindEvent();
    }
    
    private void findViews() {
        _btnOrigin = findViewById(R.id.btn_origin);
        _btnTop = findViewById(R.id.btn_top);
        _btnBottom = findViewById(R.id.btn_bottom);
        _btnLeft = findViewById(R.id.btn_left);
        _btnRight = findViewById(R.id.btn_rignt);
    }
    
    private void bindDatas() {}
    
    private void bindEvent() {
        _btnOrigin.setOnClickListener(this);
        _btnTop.setOnClickListener(this);
        _btnBottom.setOnClickListener(this);
        _btnLeft.setOnClickListener(this);
        _btnRight.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_origin:
                Snackbar.make(v, "HAHAHA", Snackbar.LENGTH_LONG).show();
                break;
    
            case R.id.btn_top:
                break;
    
            case R.id.btn_bottom:
                EZSnackBar.make(v, "Bottom", 10 * 1000).setAction("Hello", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    
                    }
                }).show();
                break;
    
            case R.id.btn_left:
                break;
    
            case R.id.btn_rignt:
                break;
                
            case R.id.btn_center:
                break;
    
            default:
                    break;
        }
    }
}
