package com.example.admin.week3daily1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.admin.week3daily1.R;
import com.example.admin.week3daily1.fragments.MyDialogFragment;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddingDialog(View view) {
        final MyDialogFragment dialogFragment = MyDialogFragment.newInstance("Knock Knock");
        FragmentManager fragmentManager = getSupportFragmentManager();
        dialogFragment.show(fragmentManager, "Tag");
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                dialogFragment.dismiss();
            }
        }, 3000);

    }


    public void onGoingListFragment(View view) {
        Intent intent = new Intent(getApplicationContext(), ListFragment.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.ofPreferences){
            Intent intent = new Intent(getApplicationContext(), Preferences.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
