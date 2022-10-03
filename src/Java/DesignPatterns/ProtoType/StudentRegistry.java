package Java.DesignPatterns.ProtoType;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    void register(String Key, Student student){
        map.put(Key,student);
    }

    Student get(String Key)
    {
        return map.get(Key);
    }


}
