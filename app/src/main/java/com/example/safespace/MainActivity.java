package com.example.safespace;
//testingMerge
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void login( View view) {
        String email = "womxnhacks@ucsb.edu";
        String password = "womxnhacks";

        EditText et= (EditText) findViewById(R.id.editText2);
        String checkEmail = et.getText().toString();

        EditText et2 = (EditText) findViewById(R.id.editText);
        String checkPassword = et2.getText().toString();

        if (checkEmail.equals("admin")) {
            Intent login = new Intent(this, ChooseOption.class);
            startActivity(login);
        } else if (email.equals(checkEmail) && password.equals(checkPassword)) {
            Intent login = new Intent(this, ChooseOption.class);
            startActivity(login);
        } else {
            Button butt = (Button)findViewById(R.id.button);
            butt.setText("Incorrect Email/Password!");
        }
    }
}
