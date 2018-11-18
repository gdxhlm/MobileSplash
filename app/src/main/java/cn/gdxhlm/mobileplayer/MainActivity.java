package cn.gdxhlm.mobileplayer;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("主界面");
        textView.setTextColor(Color.RED);
        setContentView(textView);

    }
}

