package com.example.clinicon.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clinicon.R;
import com.example.clinicon.responses.Paciente;

import java.util.List;

public class adapterPaciente extends RecyclerView.Adapter<adapterPaciente.ViewHolder> {
    private List<Paciente> mData;
    private LayoutInflater minInflater;
    private Context context;

    public adapterPaciente (List<Paciente> itemList, Context context){
        this.minInflater =LayoutInflater.from(context);
        this.context=context;
        this.mData=itemList;


    }
    @Override
    public int getItemCount(){return mData.size();}

    @Override
    public adapterPaciente.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = minInflater.inflate(R.layout.list_pacientes, null);
        return  new adapterPaciente.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(final adapterPaciente.ViewHolder holder, final int position) {
    holder.binData(mData.get(position));

    }

    public void setItem(List<Paciente>items) {mData=items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImagen;
        TextView nombre, rut;

        ViewHolder(View itemView){
            super(itemView);
            iconImagen=itemView.findViewById(R.id.iconImagen);
            nombre=itemView.findViewById(R.id.nombreTextView);
            rut=itemView.findViewById(R.id.rutTextView);

        }

        void binData(final Paciente item){
            nombre.setText(item.getNombre());
            rut.setText(item.getRut());
        }

    }
}
