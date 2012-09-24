package es.netrunners.uilab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class login extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void loginEvent(View v) {
		Toast.makeText(getApplicationContext(), "Login Succesfull",
				Toast.LENGTH_SHORT).show();
	}
}