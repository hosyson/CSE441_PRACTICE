package vn.edu.tlu.sv2051060680;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.CafeViewHolder>{




    private List<Mon> cafeList;

    public void setData(List<Mon> list){
        this.cafeList =list;
        notifyDataSetChanged();
    }
    // Constructor
    public CafeAdapter(List<Mon> cafeList) {
        this.cafeList = cafeList;
    }

    @NonNull
    @Override
    public CafeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item_cafe layout for each item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cafe, parent, false);
        return new CafeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CafeViewHolder holder, int position) {
        // Bind data to the view holder
        Mon cafe = cafeList.get(position);
        holder.tvCafeName.setText(cafe.getTenMon());
        holder.tvCafePrice.setText(String.format("%.2f VND", cafe.getDonGia()));

        // Nếu cần, có thể tải hình ảnh vào imgCafe, chẳng hạn qua thư viện Glide hoặc Picasso
        // Glide.with(holder.itemView.getContext()).load(cafe.getHinh()).into(holder.imgCafe);
    }



    @Override
    public int getItemCount() {
        return cafeList.size();
    }

    // ViewHolder class for Cafe items
    public static class CafeViewHolder extends RecyclerView.ViewHolder {
        TextView tvCafeName, tvCafePrice;

        public CafeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCafeName = itemView.findViewById(R.id.tvCafeName);
            tvCafePrice = itemView.findViewById(R.id.tvCafePrice);
        }
    }
}
