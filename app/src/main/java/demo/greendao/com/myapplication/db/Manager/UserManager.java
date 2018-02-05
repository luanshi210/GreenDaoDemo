package demo.greendao.com.myapplication.db.Manager;

import android.content.Context;
import demo.greendao.com.myapplication.db.BaseDao;
import demo.greendao.com.myapplication.modle.User;

/**
 * Created by zhoujiaqi on 2018/2/5.
 */

public class UserManager extends BaseDao<User>{

    public UserManager(Context context) {
        super(context);
    }



}
