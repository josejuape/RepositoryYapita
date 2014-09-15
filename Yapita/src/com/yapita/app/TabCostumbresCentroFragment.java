package com.yapita.app;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass. Activities that contain this fragment
 * must implement the
 * {@link TabCostumbresCentroFragment.OnFragmentInteractionListener} interface
 * to handle interaction events. Use the
 * {@link TabCostumbresCentroFragment#newInstance} factory method to create an
 * instance of this fragment.
 * 
 */
public class TabCostumbresCentroFragment extends Fragment {
	// TODO: Rename parameter arguments, choose names that match
	// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
	private static final String ARG_PARAM1 = "param1";
	private static final String ARG_PARAM2 = "param2";

	// TODO: Rename and change types of parameters
	private String mParam1;
	private String mParam2;

	public static TabCostumbresCentroFragment newInstance(String param1,
			String param2) {
		TabCostumbresCentroFragment fragment = new TabCostumbresCentroFragment();
		Bundle args = new Bundle();
		args.putString(ARG_PARAM1, param1);
		args.putString(ARG_PARAM2, param2);
		fragment.setArguments(args);
		return fragment;
	}

	public TabCostumbresCentroFragment() {
		// Required empty public constructor
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
		view= inflater.inflate(R.layout.fragment_tab_costumbres_centro,
				container, false);
		return view;
	}
	
	TextView lblPlatos;
	TextView lblBebidas;
	TextView lblPostres;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		lblPlatos = (TextView)view.findViewById(R.id.lblPlatos);
		Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "style_bienvenido.ttf");
		Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(), "dancingd.ttf");
		Typeface font3 = Typeface.createFromAsset(getActivity().getAssets(), "tipo_ciudad.ttf");
				
		lblPlatos.setTypeface(font3);
		lblBebidas=  (TextView)view.findViewById(R.id.lblBebidas);
		lblBebidas.setTypeface(font3);
		lblPostres = (TextView)view.findViewById(R.id.lblPostres);
		lblPostres.setTypeface(font3);
	}

	// TODO: Rename method, update argument and hook method into UI event
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

	/**
	 * This interface must be implemented by activities that contain this
	 * fragment to allow an interaction in this fragment to be communicated to
	 * the activity and potentially other fragments contained in that activity.
	 * <p>
	 * See the Android Training lesson <a href=
	 * "http://developer.android.com/training/basics/fragments/communicating.html"
	 * >Communicating with Other Fragments</a> for more information.
	 */
//	public interface OnFragmentInteractionListener {
//		// TODO: Update argument type and name
//		public void onFragmentInteraction(Uri uri);
//	}

}
