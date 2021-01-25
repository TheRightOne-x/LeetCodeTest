import java.util.*;

class P{
    String name = null;
    int age;

    @Override
    public int hashCode() {
//        int h = 0;
//        h = 31*h + name.hashCode(); // NullPointerException
//        h = 31*h + age;
//        return h;
        return Objects.hash(name,age);
    }
}
public class MapTest {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("test",1);
        for (Map.Entry<String,Integer> m:map.entrySet()){
            m.getKey();
            m.getValue();
        }
        SortedMap<P,String> map1 = new TreeMap(new Comparator<P>() {

            public int compare(P o1, P o2) {
                return o1.age > o2.age ? -1 : 1;
            }
        });
    }
}
