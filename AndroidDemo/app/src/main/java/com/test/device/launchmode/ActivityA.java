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

public class ActivityA extends Activity {
    private static final String tag="启动模式ActivityA";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"打开活动A");
    }

    public void ClickA(View view){
        switch (view.getId()){
            case R.id.buttonA:
                Intent intent=new Intent(ActivityA.this,ActivityB.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Log.d(tag,"销毁活动A");
    }
}
