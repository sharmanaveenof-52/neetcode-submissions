class Solution {
    public boolean isAnagram(String s, String t) {

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        if (c1.length == c2.length) {

            for (int i = 0; i < c1.length; i++) {

                if (map.containsKey(c1[i])) {
                    map.put(c1[i], map.get(c1[i]) + 1);
                } else {
                    map.put(c1[i], 1);
                }

                if (map.containsKey(c2[i])) {
                    map.put(c2[i], map.get(c2[i]) - 1);
                } else {
                    map.put(c2[i], -1);
                }
            }

            for (int value : map.values()) {
                if (value != 0) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }
}