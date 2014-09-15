package com.yapita.adapter;
import java.util.zip.Inflater;

import com.yapita.app.R;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class AdapterListaPlatosHorizontal extends BaseAdapter {

	private String[] nombres;
	private String[] nombreImagen;
	Context context;
	
	
	public AdapterListaPlatosHorizontal(String[] nombres,String[] nombreImagen,
			Context contexto){
		this.nombres= nombres;
		this.nombreImagen= nombreImagen;
		this.context = contexto;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return nombres.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return nombres[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertView==null){
			LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView= inflater.inflate(R.layout.fila_lista,parent,false);			
		}				
		ImageView icono = (ImageView)convertView.findViewById(R.id.icLista);		
//		if(nombres[position].toString().equals("espesado_chiclayano.png")){
		int res_imagen = context.getResources().getIdentifier("drawable/" + nombres[position], null, context.getPackageName());
//			icono.setBackgroundResource(Integer.parseInt());
//		}else{
			icono.setBackgroundResource(res_imagen);
//		}		
			
		return convertView;	
	}
	

}
