package demo.greendao.com.greendaolibrary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.greenrobot.greendao.query.QueryBuilder;

import greendao.DaoMaster;
import greendao.DaoSession;

/**
 * Created by zhoujiaqi on 2018/2/5.
 */

public class DaoManager {
    private static  final String   TAG = DaoManager.class.getSimpleName();
    private    String  DB_NAME="linqi-db";//数据库名称
    private volatile  static DaoManager mDaoManager;//多线程访问
    private  static MySQLiteOpenHelper mHelper;
    private static  DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;
    private static SQLiteDatabase db;
    //private Context context;

    /**
     * 使用单例模式获得操作数据库的对象
     * @return
     */
    public  static DaoManager getInstance(){
        DaoManager instance = null;
        if (mDaoManager==null){
            synchronized (DaoManager.class){
                if (instance==null){
                    instance = new DaoManager();
                    mDaoManager = instance;
                }
            }
        }
        return mDaoManager;
    }

    /**
     * 初始化Context对象
     * @param context
     */
    public  void init(Context context,String DB_NAME){
        this.DB_NAME = DB_NAME;
        getDaoMaster(context,DB_NAME);
    }

    /**
     * 判断数据库是否存在，如果不存在则创建
     * @return
     */
    public DaoMaster getDaoMaster(Context context,String DB_NAME){
        if (null == mDaoMaster){
            mHelper = new MySQLiteOpenHelper(context, DB_NAME,null);
            mDaoMaster = new DaoMaster(mHelper.getWritableDatabase());
        }
        return mDaoMaster;
    }

    /**
     * 完成对数据库的增删查找
     * @return
     */
    public DaoSession getDaoSession(Context context){
        if (null == mDaoSession){
            if (null == mDaoMaster){
                mDaoMaster = getDaoMaster(context,DB_NAME);
            }
            mDaoSession = mDaoMaster.newSession();
        }
        return mDaoSession;
    }

    /**
     * 设置debug模式开启或关闭，默认关闭
     * @param flag
     */
    public void setDebug(boolean flag){
        QueryBuilder.LOG_SQL = flag;
        QueryBuilder.LOG_VALUES = flag;
    }

    /**
     * 关闭数据库
     */
    public void closeDataBase(){
        closeHelper();
        closeDaoSession();
    }

    public void closeDaoSession(){
        if (null != mDaoSession){
            mDaoSession.clear();
            mDaoSession = null;
        }
    }

    public  void  closeHelper(){
        if (mHelper!=null){
            mHelper.close();
            mHelper = null;
        }
    }
}
