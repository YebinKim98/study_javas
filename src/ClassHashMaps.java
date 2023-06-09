import java.util.HashMap;
public class ClassHashMaps {
      public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1); // null
            hashMap.put("second", 2); //null
            hashMap.put("third", 3); //null
            hashMap.get("third"); // Integer@24 "3"
            hashMap.put("second", 5); // Integer@34 "2"

            hashMap.keySet(); // HashMap$KeySet@54 size=2 순서는 랜덤임
            HashMap$Values(); // HashMap$Values@61 size=2
            hashMap.clear(); // (void)

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
      }
    }
}