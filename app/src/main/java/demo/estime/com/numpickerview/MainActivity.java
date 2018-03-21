package demo.estime.com.numpickerview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private PickerView minute_pv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minute_pv = (PickerView) findViewById(R.id.minute_pv);

        List<String> data = new ArrayList<String>();
        for (int i = 61; i < 120; i++) {
            data.add("" + i);//添加da
        }
        minute_pv.setData(data);


        minute_pv.setOnSelectListener(new PickerView.onSelectListener()
        {

            @Override
            public void onSelect(String text) {
                Toast.makeText(MainActivity.this, "选择了 " + text + " 分",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
