class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while( i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            System.out.println("init: " +i + " " + j );
            i = j + 1;
            j = i + length;
            System.out.println("2nd init: " +i + " " + j + " " + length);
            list.add(str.substring(i, j));
            i = j;
        }
        return list;
    }
}
