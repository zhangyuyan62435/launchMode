package com.test.device.launchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

/**
 * Created by zyy on 2019/9/18.
 */

public class ActivityC extends Activity {
    private static final String tag="启动模式ActivityC";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_activity);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"打开活动C");
    }
    public void ClickC(View view){
        switch (view.getId()){
            case R.id.buttonC:
                Intent intent=new Intent(ActivityC.this,ActivityD.class);
                startActivity(intent);
                break;
        }
    }
}
