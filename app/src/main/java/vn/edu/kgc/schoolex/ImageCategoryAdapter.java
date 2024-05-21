package vn.edu.kgc.schoolex;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageCategoryAdapter extends RecyclerView.Adapter<ImageCategoryAdapter.ImageCategoryViewHolder> {
    private List<CategoryItem> categoryItemList;
    private OnItemClickListener listener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public ImageCategoryAdapter(List<CategoryItem> categoryItemList, OnItemClickListener listener) {
        this.categoryItemList = categoryItemList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ImageCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ImageCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageCategoryViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CategoryItem categoryItem = categoryItemList.get(position);
        holder.imageItemCategory.setImageResource(categoryItem.getImageId());
        holder.nameItemCategory.setText(categoryItem.getName());

        holder.imageItemCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public class ImageCategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageItemCategory;
        TextView nameItemCategory;
        public ImageCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageItemCategory = itemView.findViewById(R.id.imageItemCategory);
            nameItemCategory = itemView.findViewById(R.id.nameItemCategory);
        }
    }
}

