package Parte1;

import java.util.HashMap;

public class KeySet {

    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        hash.put("foo", 1);
        hash.put("bar", 2);
        hash.put("foobar", 3);

        System.out.println(hash.keySet());
    }

}
