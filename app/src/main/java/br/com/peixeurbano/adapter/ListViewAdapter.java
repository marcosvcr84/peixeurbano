package br.com.peixeurbano.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.peixeurbano.R;
import br.com.peixeurbano.model.Data;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.MyViewHolder>  {

    private List<Data> mDataList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name, description, price;
        public ImageView imageView;

        public MyViewHolder(View view){
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            description = (TextView) view.findViewById(R.id.description);
            price= (TextView) view.findViewById(R.id.price);
            imageView = (ImageView) view.findViewById(R.id.image);
        }
    }

    public ListViewAdapter(List<Data> dataList){
        this.mDataList = dataList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = mDataList.get(position);
        holder.name.setText(data.getName());
        holder.description.setText(data.getDescription());
        holder.price.setText(data.getPrice());
        Picasso.get().load(data.getImage()).into(holder.imageView);
        //holder.imageView.setImageResource(data.getImageId());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
