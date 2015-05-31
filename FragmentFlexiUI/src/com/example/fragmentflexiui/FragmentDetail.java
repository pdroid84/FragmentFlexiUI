package com.example.fragmentflexiui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class FragmentDetail extends Fragment {
	TextView tview;
	String [] detail;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view= inflater.inflate(R.layout.fragment_detail, container, false);
		tview = (TextView) view.findViewById(R.id.detailTextView);
		detail = getResources().getStringArray(R.array.details);
		return view;
	}
	public void displayDetail(int index){
		tview.setText(detail[index]);
	}
}
