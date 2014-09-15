package com.yapita.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import com.yapita.adapter.AdapterListaPlatosHorizontal;

/**
 * A simple {@link Fragment} subclass. Activities that contain this fragment
 * must implement the
 * {@link TabCostumbresInfFragment.OnFragmentInteractionListener} interface to
 * handle interaction events. Use the
 * {@link TabCostumbresInfFragment#newInstance} factory method to create an
 * instance of this fragment.
 * 
 */
public class TabCostumbresInfFragment extends Fragment{
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
	 * @return A new instance of fragment TabCostumbresInfFragment.
	 */
	// TODO: Rename and change types and number of parameters
	public static TabCostumbresInfFragment newInstance(String param1,
			String param2) {
		TabCostumbresInfFragment fragment = new TabCostumbresInfFragment();
		Bundle args = new Bundle();
		args.putString(ARG_PARAM1, param1);
		args.putString(ARG_PARAM2, param2);
		fragment.setArguments(args);
		return fragment;
	}

	public TabCostumbresInfFragment() {
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

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		
		return inflater.inflate(R.layout.fragment_tab_costumbres_inf,
				container, false);		
	}	
	
	String[] lista = {"papa_huancaina_miniatura","aji_de_gallina_miniatura",
	"marisco_miniatura",
	"papa_huancaina_miniatura","aji_de_gallina_miniatura",
	"marisco_miniatura",
	"papa_huancaina_miniatura","aji_de_gallina_miniatura",
	"marisco_miniatura"};
	
	Gallery lstPlato;
//	ListView lst;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		AdapterListaPlatosHorizontal adap = 
				new AdapterListaPlatosHorizontal(lista, lista,getActivity().getBaseContext());
		lstPlato = (Gallery)getActivity().findViewById(R.id.galeriaPlatos);
		lstPlato.setAdapter(adap);
	}

	
	
	// TODO: Rename method, update argument and hook method into UI event
//	public void onButtonPressed(Uri uri) {
//		if (mListener != null) {
//			mListener.onFragmentInteraction(uri);
//		}
//	}

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
