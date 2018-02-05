package demo.greendao.com.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import demo.greendao.com.myapplication.R;
import demo.greendao.com.myapplication.db.GreenDaoHelper;
import demo.greendao.com.myapplication.modle.User;
import greendao.UserDao;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button addData,deleteData,queryData,updateData;
    private UserDao mUserDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserDao = GreenDaoHelper.getDaoSession().getUserDao();
        InitView();

    }

    //控件初始化
    private void InitView(){
        addData = findViewById(R.id.addData);
        deleteData = findViewById(R.id.deleteData);
        queryData = findViewById(R.id.queryData);
        updateData = findViewById(R.id.updateData);
        initEvent();
    }

    private void  initEvent(){
        addData.setOnClickListener(this);
        deleteData.setOnClickListener(this);
        queryData.setOnClickListener(this);
        updateData.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addData:
                mUserDao.insert(new User(null,10001,"david",23,"male","basketball"));//id传null 即自增。==> 这里是Long类型而不是long
                break;
            case R.id.deleteData:
                User user = mUserDao.queryBuilder().where(UserDao.Properties.Id.eq(2)).build().unique();
                if (user == null) {
                    Toast.makeText(MainActivity.this,"用户不存在!",Toast.LENGTH_LONG).show();
                } else {
                    mUserDao.deleteByKey(user.getId());
                }


                break;
            case R.id.queryData:
                //User user = mUserDao.queryBuilder().where(UserDao.Properties.Id.eq(3)).build().unique();
                break;
            case R.id.updateData:
                user = new User((long) 2, 10002,"meimei", 24, "female","football");
                mUserDao.update(user);
                break;

             default:
                 break;
        }
    }




}
