package danieeelfr.pocs.android.sunshine.sunshinet2;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        Intent intent = getActivity().getIntent();
        String forecastSt = intent.getStringExtra("forecastSt");

        TextView tvDetail = (TextView)view.findViewById(R.id.tvDetail);
        tvDetail.setText(forecastSt);
        return view;
    }
}
