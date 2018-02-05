package demo.greendao.com.myapplication.db;

import android.content.Context;

import demo.greendao.com.myapplication.db.Manager.UserManager;

/**
 * Created by zhoujiaqi on 2018/2/5.
 */

public class DaoCore {
    private  static UserManager userManager;
    public  static Context context;

    public static void init(Context context,String DB_NAME){
        DaoCore.context = context.getApplicationContext();
        DaoManager.getInstance().init(DaoCore.context,DB_NAME);
    }

    /**
     * 单列模式获取UserManager对象
     * @return
     */
    public static UserManager getUserInstance(){
        if (userManager == null) {
            userManager = new UserManager(context);
        }
        return userManager;
    }


}
