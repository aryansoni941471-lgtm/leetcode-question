class Solution {
    public boolean isPalindrome(String s) {

        String clean = "";

        // Sirf letters aur numbers rakho
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)) {
                clean = clean + Character.toLowerCase(ch);
            }
        }

        // Reverse string
        String reverse = "";

        for(int i = clean.length() - 1; i >= 0; i--) {
            reverse = reverse + clean.charAt(i);
        }

        // Compare
        return clean.equals(reverse);
    }
}