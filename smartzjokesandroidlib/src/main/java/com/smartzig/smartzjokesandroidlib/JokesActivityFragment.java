package com.smartzig.smartzjokesandroidlib;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokesActivityFragment extends Fragment {


    public JokesActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.content_jokes, container, false);

        String gce_result = getActivity().getIntent().getStringExtra("gce_result");
        TextView gce_result_show = v.findViewById(R.id.jokes_text_view);
        gce_result_show.setText(gce_result);

        return v;
    }

}
