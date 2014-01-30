package com.newteam.taskdown;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginUserActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_user);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}



	
    /** Llamado cuando el usuario hace clic en el boton Login */
    public void execValidateUser(View view) {
    	EditText editText = (EditText) findViewById(R.id.username);
        String username = editText.getText().toString();
        editText = (EditText) findViewById(R.id.password);
        String password = editText.getText().toString();        
    	//Validamos usuario
        boolean user = validateUser(username, password);
    	Intent intent = null;
    	if(user)	{
    		intent = new Intent(this, ListTaskActivity.class);
    		startActivity(intent);
    	}
    	else	{
    		intent = new Intent(this, LoginUserActivity.class);
    		// 1. Instantiate an AlertDialog.Builder with its constructor
    		AlertDialog.Builder builder = new AlertDialog.Builder(this);

    		// 2. Chain together various setter methods to set the dialog characteristics
    		builder.setMessage(R.string.user_not_valid)
    		       .setTitle(R.string.alert);

    		builder.show();
    	}   	
    	
    }
    
    private boolean validateUser(String username, String password)	{
    	if(username.equals("1") && password.equals("1"))
    		return true;
    	else
    		return false;
    }
    
}
