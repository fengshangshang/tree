import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tree {
    public static void main(String[] args) {
        //假设此为从数据库取得的地址列表
        Long sourceParentId = 66l;
        List<Geo> list = new ArrayList<Geo>();
        Map<Long,Map<Long,GeoTreeList>> map = new HashMap<Long, Map<Long, GeoTreeList>>();
        for(Geo geo : list){
            GeoTreeList geoTreeList = new GeoTreeList();
            geoTreeList.setName(geo.getName());
            geoTreeList.setChildren(new ArrayList<GeoTreeList>());
            Map<Long,GeoTreeList> map1 = new HashMap<Long, GeoTreeList>();
            if(geo.getId().equals(sourceParentId)){
                map1.put(0l,geoTreeList);
            }else{
                map1.put(geo.getParent().getId(),geoTreeList);
            }
            map.put(geo.getId(),map1);
        }
        for(Long id : map.keySet()){
           Long parentId = map.get(id).keySet().iterator().next();
           if(!parentId.equals(0l)){
               Long id1 = map.get(parentId).keySet().iterator().next();
               map.get(parentId).get(id1).getChildren().add(map.get(id).get(parentId));
           }
        }
        GeoTreeList geoTreeList = map.get(sourceParentId).get(0l);
    }
}
