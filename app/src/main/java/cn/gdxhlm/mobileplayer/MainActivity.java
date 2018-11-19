package cn.gdxhlm.mobileplayer;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    private FrameLayout fl_1;
    private RadioGroup rg_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg_1=findViewById(R.id.rg_1);
        rg_1.check(R.id.rb_video);

    }
}

