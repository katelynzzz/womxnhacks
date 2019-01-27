package com.example.safespace;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PartyPicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party_picker);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* TextView textView = (TextView)(4082158548); findViewById(R.id.number_to_call);
                // Use format with "tel:" and phone number to create phoneNumber.
                String phoneNumber = String.format("tel: %s",
                        textView.getText().toString());
                // Create the intent.
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                // Set the data for the intent as the phone number.
                dialIntent.setData(Uri.parse(phoneNumber));
                // If package resolves to an app, send intent.
                if (dialIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(dialIntent);
                } else {
                    Log.e(TAG, "Can't resolve app for ACTION_DIAL Intent.");
                } */



                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
