package demo.greendao.com.myapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demo.greendao.com.myapplication.R;
import demo.greendao.com.myapplication.db.DaoCore;
import demo.greendao.com.myapplication.modle.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button addData,deleteData,queryData,updateData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        initEvent();
        initData();
    }

    //控件初始化
    private void InitView(){
        addData = findViewById(R.id.addData);
        deleteData = findViewById(R.id.deleteData);
        queryData = findViewById(R.id.queryData);
        updateData = findViewById(R.id.updateData);

    }

    //初始化点击事件
    private void  initEvent(){
        addData.setOnClickListener(this);
        deleteData.setOnClickListener(this);
        queryData.setOnClickListener(this);
        updateData.setOnClickListener(this);
    }

    //初始化数据
    private void  initData(){
        DaoCore.getUserInstance().insertObject(new User(null,(long) 10001,"大乔",23,"female","短笛","晴天"));
        DaoCore.getUserInstance().insertObject(new User(null,(long) 10002,"小乔",22,"female","琵琶","晴天"));
        DaoCore.getUserInstance().insertObject(new User(null,(long) 10003,"曹操",30,"male","舞剑","阴天"));
        DaoCore.getUserInstance().insertObject(new User(null,(long) 10004,"刘备",31,"male","带兵","晴天"));
        DaoCore.getUserInstance().insertObject(new User(null,(long) 10005,"孙权",32,"male","皇帝","阴天"));
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addData:
                break;
            case R.id.deleteData:
                break;
            case R.id.queryData:
                break;
            case R.id.updateData:
                break;
             default:
                 break;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        DaoCore.getUserInstance().CloseDataBase();
    }
}
