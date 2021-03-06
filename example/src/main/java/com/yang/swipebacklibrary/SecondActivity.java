package com.yang.swipebacklibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.yang.swipeback.library.ISwipeBackActivity;
import com.yang.swipeback.library.SwipeBackActivityImpl;

public class SecondActivity extends SwipeBackActivityImpl {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("second activity");
        setSupportActionBar(toolbar);
    }

    @Override
    public ISwipeBackActivity getPreActivity() {
        return (ISwipeBackActivity) AppApplication.getInstance().getStack().getBackActivity();
    }
}
