package vn.edu.tlu.sv2051060680;



import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MonDao {

    // Thêm một món vào bảng
    @Insert
    void insert(Mon mon);

    // Lấy tất cả các món
    @Query("SELECT * FROM mon")
    List<Mon> getAllMon();

    // Cập nhật một món
    @Update
    void update(Mon mon);

    // Xóa một món
    @Delete
    void delete(Mon mon);

    @Query("SELECT tenMon, donGia FROM mon")
    List<TenMonVaDonGia> getAllMonInfo();


}

