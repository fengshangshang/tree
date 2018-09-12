import java.util.List;

public class GeoTreeList {
    private Long id;
    private String name;
    private List<GeoTreeList> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GeoTreeList> getChildren() {
        return children;
    }

    public void setChildren(List<GeoTreeList> children) {
        this.children = children;
    }
}
