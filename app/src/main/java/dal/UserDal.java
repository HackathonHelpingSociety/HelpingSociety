//package dal;
//
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.content.Context;
//import android.content.ContentValues;
//import android.database.Cursor;
//
//import models.User;
//
///**
// * Created by User on 3/4/2018.
// */
//
//public class UserDal extends  SQLiteOpenHelper {
//
//    //information of database
//    private static final int DATABASE_VERSION = 1;
//    private static final String DATABASE_NAME = "HelpSociety.db";
//    public static final String TABLE_NAME = "users";
//    public static final String COLUMN_ID = "userId";
//    public static final String COLUMN_NAME = "userName";
//    public static final String COLUMN_PASSWORD = "userPassword";
//
//    // Initialize the database
//    public UserDal(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
//    }
//
//    // Other metods
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID
//                              + " INTEGER PRIMARYKEY, " + COLUMN_NAME + " TEXT, "
//                              + COLUMN_PASSWORD + " TEXT)";
//        db.execSQL(CREATE_TABLE);
//    }
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}
//
//    public String loadHandler() {
//        return null;
//    }
//    public void addHandler(User student) {}
//
//    public User findHandler(String studentname) {
//        return null;
//    }
//    public boolean deleteHandler(int ID) {
//        return false;
//    }
//    public boolean updateHandler(int ID, String name) {
//        return false;
//    }
//}
