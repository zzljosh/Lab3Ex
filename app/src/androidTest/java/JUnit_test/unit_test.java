package JUnit_test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import com.example.zhz256.add.MainActivity;
import com.example.zhz256.add.R;

/**
 * Created by zhz256 on 4/19/2016.
 */
public class unit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public unit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        mainActivity.runOnUiThread(new Runnable() {
            public void run() {
                TextView textView1 = (TextView) mainActivity.findViewById(R.id.number1);
                TextView textView2 = (TextView) mainActivity.findViewById(R.id.number2);
                TextView textView3 = (TextView) mainActivity.findViewById(R.id.sum_result);
                Button btn = (Button) mainActivity.findViewById(R.id.button);

                textView1.setText("5");
                textView2.setText("100");
                btn.performClick();
                String tester = textView3.getText().toString();
                assertEquals("105", tester);

            }
        });

    }
}
