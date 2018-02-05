package demo.greendao.com.myapplication.modle;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by zhoujiaqi on 2018/2/5.
 */
@Entity(
        nameInDb = "Area"
)
public class Area {
    @Id(autoincrement = true)
    private Long id;
    private String province;
    private String city;
    private String area;
    @Generated(hash = 1053798981)
    public Area(Long id, String province, String city, String area) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.area = area;
    }
    @Generated(hash = 179626505)
    public Area() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProvince() {
        return this.province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getArea() {
        return this.area;
    }
    public void setArea(String area) {
        this.area = area;
    }
}
