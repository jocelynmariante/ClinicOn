package com.example.clinicon.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.clinicon.R;
import com.example.clinicon.responses.Doctor;

import java.util.List;

public class adapterDoctor extends RecyclerView.Adapter<adapterDoctor.ViewHolder> {
    private List<Doctor> mData;
    private LayoutInflater minInflater;
    private Context context;

    public adapterDoctor (List<Doctor> itemList, Context context){
        this.minInflater =LayoutInflater.from(context);
        this.context=context;
        this.mData=itemList;


    }
    @Override
    public int getItemCount(){return mData.size();}

    @Override
    public adapterDoctor.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = minInflater.inflate(R.layout.list_doctor, null);
        return  new adapterDoctor.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(final adapterDoctor.ViewHolder holder, final int position) {
        holder.binData(mData.get(position));

    }

    public void setItem(List<Doctor>items) {mData=items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImagenDoc;
        TextView nombre, rut;

        ViewHolder(View itemView){
            super(itemView);
            iconImagenDoc=itemView.findViewById(R.id.iconImagenDoc);
            nombre=itemView.findViewById(R.id.nombreDocTextView);
            rut=itemView.findViewById(R.id.rutDocTextView);

        }

        void binData(final Doctor item){
            nombre.setText(item.getNombre());
            rut.setText(item.getRut());
        }
    }
}
