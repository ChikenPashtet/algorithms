import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, Character[]> map = new HashMap<>();

        map.put(2,new Character[]{'a','b','c'});
        map.put(3,new Character[]{'d','e','f'});
        map.put(4,new Character[]{'g','h','i'});
        map.put(5,new Character[]{'j','k','l'});
        map.put(6,new Character[]{'m','n','o'});
        map.put(7,new Character[]{'p','q','r','s'});
        map.put(8,new Character[]{'t','u','v'});
        map.put(9,new Character[]{'w','x','y','z'});


    }

}
