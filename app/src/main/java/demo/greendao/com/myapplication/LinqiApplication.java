package demo.greendao.com.myapplication;

import android.app.Application;
import android.content.Context;

import cube.com.axislibrary.factory.Axis;
import demo.greendao.com.myapplication.db.Manager.DaoCore;

/**
 * Created by zhoujiaqi on 2018/2/5.
 */

public class LinqiApplication extends Application{
    private static LinqiApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Axis.init(this,1080,1920);//适配初始化,基准宽高
        DaoCore.init(this,"linqi-db");
    }

    /**
     * 获取context
     * @return
     */
    public static Context getInstance() {
        if (instance == null) {
            instance = new LinqiApplication();
        }
        return instance;
    }
}
