
import java.util.Set;

/**
 * 地点
 *
 * @author wayne
 * @version $Id: Geo.java, v 0.1 2015年9月22日 上午10:44:09 wayne Exp $
 */
public class Geo {
    /**
     *
     */
    private static final long serialVersionUID = -2697743623684446089L;
    private Long             id;
    /**类型*/
    private String           type;
    /** 编号 */
    private String            code;
    /** 名称 */
    private String            name;
    /** 邮编 */
    private String            zipCode;
    /** 电话区号 */
    private String            phoneCode;
    /** 关联父对象 */
    private Geo               parent;
    /** 淘宝地址库ID */
    private String            taoBaoId;
    /** 下级地点列表 */
    private Set<Geo>          children;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Geo getParent() {
        return parent;
    }

    public void setParent(Geo parent) {
        this.parent = parent;
    }

    public String getTaoBaoId() {
        return taoBaoId;
    }

    public void setTaoBaoId(String taoBaoId) {
        this.taoBaoId = taoBaoId;
    }

    public Set<Geo> getChildren() {
        return children;
    }

    public void setChildren(Set<Geo> children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}