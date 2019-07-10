import org.junit.jupiter.api.Test;

import java.util.HashMap;


class KeyTest {
    @Test
    public void Hashalg(){
    HashMap map = new HashMap();
    map.put (new Key("visual"), 20);
    map.put (new Key("sachin"), 30);
    map.put (new Key("vaibhav"), 40);

    System.out.println();
    System.out.println("value for key sachin: " + map.get(new Key("sachin")));
    System.out.println("value for key vaibhav: " + map.get(new Key("vaibhav")));
    }

}