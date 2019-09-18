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

public class ActivityD extends Activity {
    private static final String tag="启动模式ActivityD";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_activity);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"打开活动D");
    }
    public void ClickD(View view){
        switch (view.getId()){
            case R.id.buttonD:
                Intent intent=new Intent(ActivityD.this,ActivityA.class);
                startActivity(intent);
                break;
        }
    }
}
