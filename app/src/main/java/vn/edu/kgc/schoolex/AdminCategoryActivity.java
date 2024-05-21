package vn.edu.kgc.schoolex;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdminCategoryActivity extends AppCompatActivity {
    RecyclerView categoryRecyclerView;
    ImageCategoryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_category);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        categoryRecyclerView = findViewById(R.id.category_recycler_view);
        categoryRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        //Danh mục hàng
        List<CategoryItem> categoryItems = new ArrayList<>();
        categoryItems.add(new CategoryItem(R.drawable.tshirts, "Thời trang nam"));
        categoryItems.add(new CategoryItem(R.drawable.shoess, "Giày dép"));
        categoryItems.add(new CategoryItem(R.drawable.laptops, "Laptop"));
        categoryItems.add(new CategoryItem(R.drawable.glasses, "Kính"));
        categoryItems.add(new CategoryItem(R.drawable.hats, "Nón"));
        categoryItems.add(new CategoryItem(R.drawable.books, "Sách"));

        adapter = new ImageCategoryAdapter(categoryItems,new ImageCategoryAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Xử lý sự kiện khi người dùng nhấn vào một item trong danh mục hàng
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", categoryItems.get(position).getName());
                startActivity(intent);
            }
        });
        categoryRecyclerView.setAdapter(adapter);
    }
}