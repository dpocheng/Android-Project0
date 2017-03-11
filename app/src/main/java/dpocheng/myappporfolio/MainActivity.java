package dpocheng.myappporfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        LinearLayout buttonList = (LinearLayout) findViewById(R.id.button_list);
        for (int i = 0; i < buttonList.getChildCount(); i++) {
            final Button button = (Button) buttonList.getChildAt(i);
			button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					String toast_msg = button.getContentDescription().toString();
					onClickCreateToast(toast_msg);
				}
			});
        }
    }

    private void onClickCreateToast(String toast_msg) {
        if (mToast != null) {
            mToast.cancel();
        }
        mToast = Toast.makeText(this, toast_msg, Toast.LENGTH_SHORT);
        mToast.show();
    }
}