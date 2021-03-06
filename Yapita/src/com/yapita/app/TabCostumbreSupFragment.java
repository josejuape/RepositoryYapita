package com.yapita.app;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass. Activities that contain this fragment
 * must implement the
 * {@link TabCostumbreSupFragment.OnFragmentInteractionListener} interface to
 * handle interaction events. Use the
 * {@link TabCostumbreSupFragment#newInstance} factory method to create an
 * instance of this fragment.
 * 
 */
public class TabCostumbreSupFragment extends Fragment {
	// TODO: Rename parameter arguments, choose names that match
	// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
	private static final String ARG_PARAM1 = "param1";
	private static final String ARG_PARAM2 = "param2";

	// TODO: Rename and change types of parameters
	private String mParam1;
	private String mParam2;

//	private OnFragmentInteractionListener mListener;

	/**
	 * Use this factory method to create a new instance of this fragment using
	 * the provided parameters.
	 * 
	 * @param param1
	 *            Parameter 1.
	 * @param param2
	 *            Parameter 2.
	 * @return A new instance of fragment TabCostumbreSupFragment.
	 */
	// TODO: Rename and change types and number of parameters
	public static TabCostumbreSupFragment newInstance(String param1,
			String param2) {
		TabCostumbreSupFragment fragment = new TabCostumbreSupFragment();
		Bundle args = new Bundle();
		args.putString(ARG_PARAM1, param1);
		args.putString(ARG_PARAM2, param2);
		fragment.setArguments(args);
		return fragment;
	}

	public  TabCostumbreSupFragment() {
//		TabCostumbreSupFragment fragment = new TabCostumbreSupFragment();		
//		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
			mParam1 = getArguments().getString(ARG_PARAM1);
			mParam2 = getArguments().getString(ARG_PARAM2);
		}
	}

	View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment		
		view= inflater.inflate(R.layout.fragment_tab_costumbre_sup, container,false);		
		return view;
	}

	TextView lblBienvenido ;
	TextView lblDenominacion;
	TextView lblCiudad;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		lblBienvenido = (TextView)view.findViewById(R.id.lblBienvenido);
		Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "style_bienvenido.ttf");
		Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(), "dancingd.ttf");
		Typeface font3 = Typeface.createFromAsset(getActivity().getAssets(), "tipo_ciudad.ttf");
				
		lblBienvenido.setTypeface(font);
		lblDenominacion=  (TextView)view.findViewById(R.id.lblDenominacion);
		lblDenominacion.setTypeface(font);
		lblCiudad = (TextView)view.findViewById(R.id.lblCiudad);
		lblCiudad.setTypeface(font3);
	}
	
//
//	// TODO: Rename method, update argument and hook method into UI event
//	public void onButtonPressed(Uri uri) {
//		if (mListener != null) {
//			mListener.onFragmentInteraction(uri);
//		}
//	}
//
//	@Override
//	public void onAttach(Activity activity) {
//		super.onAttach(activity);
//		try {
//			mListener = (OnFragmentInteractionListener) activity;
//		} catch (ClassCastException e) {
//			throw new ClassCastException(activity.toString()
//					+ " must implement OnFragmentInteractionListener");
//		}
//	}
//
//	@Override
//	public void onDetach() {
//		super.onDetach();
//		mListener = null;
//	}
//
//	public interface OnFragmentInteractionListener {
//		// TODO: Update argument type and name
//		public void onFragmentInteraction(Uri uri);
//	}

}
