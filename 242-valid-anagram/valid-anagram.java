class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        // Array to store the frequency of 26 lowercase English letters
        int[] charCounts = new int[26];
        // Increment for string s and decrement for string t
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        // If all counts are zero, the strings are valid anagrams
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
