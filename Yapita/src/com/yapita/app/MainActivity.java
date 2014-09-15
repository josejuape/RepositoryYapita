package com.yapita.app;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class MainActivity extends Activity {

	SharedPreferences prefs ;
	SharedPreferences.Editor editor;
	
	static EditText txtCorreo;
	static EditText txtClave;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		prefs=getSharedPreferences(getString(R.string.archivo_preferencias),Context.MODE_PRIVATE);
		
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		String valorPref = prefs.getString(getString(R.string.preferencias_correo), "");
		if(valorPref.length()>0){
			Intent i = new Intent(MainActivity.this, TabsPrincipalActivity.class);
			startActivity(i);
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		View rootView;
		
		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			 rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
		
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onActivityCreated(savedInstanceState);
			txtCorreo = (EditText)rootView.findViewById(R.id.txtCorreo);
			txtClave = (EditText)rootView.findViewById(R.id.txtClave);
		}
	}
	
	
	public void login(View view){
        
        editor= prefs.edit();
		editor.putString(getString(R.string.preferencias_correo), txtCorreo.getText().toString());
		editor.putString(getString(R.string.preferencias_clave), txtClave.getText().toString());
		editor.commit();
		
		Intent intent_principal = new Intent(MainActivity.this,TabsPrincipalActivity.class);
		startActivity(intent_principal);
    }
}
