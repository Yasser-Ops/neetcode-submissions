class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);
    }
}
