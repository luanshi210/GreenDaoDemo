package demo.greendao.com.myapplication.modle;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;

/**
 * Created by zhoujiaqi on 2018/2/2.
 */
@Entity(
        // schema 名，多个 schema 时设置关联实体。插件产生不支持，需使用产生器
        // schema = "myschema",
        // 标记一个实体是否处于活动状态，活动实体有 update、delete、refresh 方法。默认为 false
        active = false,
        // 表名，默认为类名
        nameInDb = "User",
        // 定义多列索引
        indexes = {
                @Index(value = "userName DESC", unique = true)
        },
        // 标记是否创建表，默认 true。多实体对应一个表或者表已创建，不需要 greenDAO 创建时设置 false
        createInDb = true,
        // 是否产生所有参数构造器。默认为 true。无参构造器必定产生
        generateConstructors = true,
        // 如果没有 get/set 方法，是否生成。默认为 true
        generateGettersSetters = true
)
public class User {
    // 数据库主键，autoincrement设置自增，只能为 long/ Long 类型
    @Id(autoincrement = true)
    private long id;
    // 唯一，默认索引。可另定义属性唯一索引设为主键
    @Unique
    private String userId;
    // 列名，默认使用变量名。默认变化：userName --> USER_NAME
    @Property(nameInDb = "USERNAME")
    private String userName;
    private int age;
    private String gender;
    @Generated(hash = 2034634710)
    public User(long id, String userId, String userName, int age, String gender) {
        this.id = id;
        this.userId = userId;
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
    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
