package vn.edu.tlu.sv2051060680;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Mon.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MonDao monDao();

    private static AppDatabase instance;



    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "mon_database")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract MonDao monDAO();
}
