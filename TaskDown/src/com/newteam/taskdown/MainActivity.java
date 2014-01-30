package com.newteam.taskdown;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.newteam.taskdown.R.menu.main, menu);
        return true;
    }
    
    /** Llamado cuando el usuario hace clic en el boton Login Usuario */
    public void goScrLoginUser(View view) {
    	Intent intent = new Intent(this, LoginUserActivity.class);
    	startActivity(intent);
    }
    
    /** Llamado cuando el usuario hace clic en el boton Nuevo Usuario */
    public void goScrRegisterUser(View view) {
    	Intent intent = new Intent(this, RegisterUserActivity.class);
    	startActivity(intent);
    }
}
