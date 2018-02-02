package demo.greendao.com.myapplication.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by zhoujiaqi on 2018/2/2.
 */
@Entity
public class User {
    @Id
    private long id;
    private String userName;
    private int age;
    private String gender;
    @Generated(hash = 1616716831)
    public User(long id, String userName, int age, String gender) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
