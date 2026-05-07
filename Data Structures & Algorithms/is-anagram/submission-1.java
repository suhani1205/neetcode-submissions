class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))) {
                int count = map.get(t.charAt(i));
                count--;
                map.put(t.charAt(i), count);
            } else return false;
        }

        for(int count : map.values()) {
            if(count!=0) return false;
        }
        return true;
     }
}
