
package vn.edu.tlu.sv2051060680;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ConectCafeAdapterToRecycleViewCafe extends AppCompatActivity {

    private RecyclerView recyclerViewCafes;
    private CafeAdapter cafeAdapter;
    private List<TenMonVaDonGia> cafeTenAndGia;
    private List<Mon> cafeList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        // Ánh xạ RecyclerView từ layout
        recyclerViewCafes = findViewById(R.id.recyclerViewCafes);

        // Tạo danh sách món cafe (tạm thời)

        Mon cafeList1 = new Mon(1, "Cà Phê Sữa", 1, "Món cà phê ngon", 25.0f, "hinh.jpg");




        // Thiết lập Adapter cho RecyclerView
        cafeAdapter = new CafeAdapter(cafeList);
        recyclerViewCafes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewCafes.setAdapter(cafeAdapter);

        AppDatabase.getInstance(this).monDAO().insert(cafeList1);
        cafeTenAndGia = AppDatabase.getInstance(this).monDAO().getAllMonInfo();
       cafeAdapter.setData(cafeList);
    }
}
