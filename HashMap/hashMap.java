package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "Tam");
        map.put(2, "Lali");
        map.put(3, "Chase");
        System.out.println(map);
        String s=map.get(2);
        System.out.println(s);
        System.out.println(map.containsKey(5));
        Set<Integer> keys=map.keySet();// coz keys are unique so made set of keys
        // agar loop chalana h to set me chala denge
        for(int i:keys){
            System.out.println(map.get(i));
        }    
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry: entries){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }

        
    }
}
