package com.example.admin.week3daily1.activities;

import com.example.admin.week3daily1.Person;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.week3daily1.R;
import com.example.admin.week3daily1.fragments.PersonFragment;

import java.util.ArrayList;

public class ListFragment extends AppCompatActivity {

    private EditText etPersonGender;
    private EditText etPersonAge;
    private EditText etPersonName;

    private ArrayList<Person> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_list);

        etPersonName = findViewById(R.id.etPersonName);
        etPersonAge = findViewById(R.id.etPersonAge);
        etPersonGender = findViewById(R.id.etPersonGender);
    }
    public void showPeople(View view) {
        if(getSupportFragmentManager().findFragmentByTag("people") == null)
            getSupportFragmentManager().beginTransaction().add(
                    R.id.svDisplayPeople,PersonFragment.newInstance(people), "people")
                 .addToBackStack("people").commit();

    }

    public void addPerson(View view) {
        Person person = new Person(
                etPersonName.getText().toString(),
                etPersonAge.getText().toString(),
                etPersonGender.getText().toString());
        people.add(person);

        Toast.makeText(this, "Person Added",Toast.LENGTH_SHORT).show();
    }
}
