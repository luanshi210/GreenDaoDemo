package demo.greendao.com.myapplication.dbCore.manager;

import android.content.Context;

import demo.greendao.com.myapplication.dbCore.BaseDao;
import demo.greendao.com.myapplication.modle.User;

/**
 * Created by zhoujiaqi on 2018/2/5.
 */

public class UserManager extends BaseDao<User> {

    public UserManager(Context context) {
        super(context);
    }



}
