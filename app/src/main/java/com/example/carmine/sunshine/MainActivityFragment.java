package com.example.carmine.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main,container);
        String[] forecastArray={
                "Today -sunny -88/63",
                "Tomorrow -Foggy-70/40",
                "Weds- Cloudy-75&70",
                "Fri-Clll-56/88",
                "Sat-S-88/77"
        };
        List<String> weekForecast =new ArrayList<>(
                Arrays.asList(forecastArray)
        );

        mForecastAdapter=new ArrayAdapter<String>(
                //The current context
                getActivity(),
                //ID of list item layout
                R.layout.list_item_forecast,
                //ID of the textView to populate
                R.id.list_item_forecast_textview,
                //Forecast data
                weekForecast
        );
        //get a reference to the ListView, and attach this adapter
        ListView listView=(ListView) rootView.findViewById(
                R.id.listView_forecast);
            listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
