package demo.greendao.com.myapplication.modle;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

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

        // 标记是否创建表，默认 true。多实体对应一个表或者表已创建，不需要 greenDAO 创建时设置 false
        createInDb = true,
        // 是否产生所有参数构造器。默认为 true。无参构造器必定产生
        generateConstructors = true,
        // 如果没有 get/set 方法，是否生成。默认为 true
        generateGettersSetters = true
)
public class User {
    @Id(autoincrement = true)
    private Long id;
    // 唯一，默认索引。可另定义属性唯一索引设为主键
    private Long userId;
    // 列名，默认使用变量名。默认变化：userName --> USER_NAME
    private String userName;
    private int age;
    private String gender;
    private String hobby;
    private String weather;
@Generated(hash = 1177118064)
public User(Long id, Long userId, String userName, int age, String gender,
        String hobby, String weather) {
    this.id = id;
    this.userId = userId;
    this.userName = userName;
    this.age = age;
    this.gender = gender;
    this.hobby = hobby;
    this.weather = weather;
}
@Generated(hash = 586692638)
public User() {
}
public Long getUserId() {
    return this.userId;
}
public void setUserId(Long userId) {
    this.userId = userId;
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
public String getHobby() {
    return this.hobby;
}
public void setHobby(String hobby) {
    this.hobby = hobby;
}
public Long getId() {
    return this.id;
}
public void setId(Long id) {
    this.id = id;
}
public String getWeather() {
    return this.weather;
}
public void setWeather(String weather) {
    this.weather = weather;
}


}
