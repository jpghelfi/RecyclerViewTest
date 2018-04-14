package com.example.juanpabloghelfi.recyclerviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by juanpabloghelfi on 114//18.
 */

public class AdapterComputadora extends RecyclerView.Adapter {

    private Context unContexto;
    private List<Computadora> listaComputadora;

    public AdapterComputadora(Context contextoRecivido, List<Computadora>unaLista){
        unContexto = contextoRecivido;
        listaComputadora= unaLista;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ComputadorasViewHolder(0);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ComputadorasViewHolder computadorasViewHolder = (ComputadorasViewHolder) holder;
        computadorasViewHolder.cargarComputadora(listaComputadora.get(position));

    }

    @Override
    public int getItemCount() {
        return this.listaComputadora.size();
    }

    private class ComputadorasViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewComputadora;

        public ComputadorasViewHolder(View itemView){
            super(itemView);
            textViewComputadora = (TextView) itemView.findViewById(R.id.textViewNombreCompu);

        }

        public void cargarComputadora(Computadora compu){
            textViewComputadora.setText(compu.getNombre());
        }


    }
}
