package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        String[] countries = getResources().getStringArray(R.array.countries);
        CountryAdapter countryAdapter =new CountryAdapter( this,R.layout.layout_custom, getListCountries());
        autoCompleteTextView.setAdapter(countryAdapter);

    }
    private List<Country> getListCountries() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("Madagascar"));
        list.add(new Country("Malawi"));
        list.add(new Country("Malaysia"));
        list.add(new Country("Maldives"));
        list.add(new Country("Mali"));
        return list;
    }
}