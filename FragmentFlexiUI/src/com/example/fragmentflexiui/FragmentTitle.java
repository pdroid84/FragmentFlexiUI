package com.example.fragmentflexiui;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentTitle extends Fragment implements OnItemClickListener{
	String [] titles;
	ListView lview;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_title, container,false);
		titles = getResources().getStringArray(R.array.title);
		ArrayAdapter<String> myadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, titles);
		lview = (ListView) view.findViewById(R.id.listView1);
		lview.setAdapter(myadapter);
		lview.setOnItemClickListener(this);
		return view;
	}
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Log.d("DEB", "Item clicked from the list, item number= "+position);
		Communicator comm=null;
		comm = (Communicator) getActivity();
		comm.sendPos(position);
	}
}
