class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean exp = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                digit = true;
            }
            else if (ch == '+' || ch == '-') {
                // Sign is allowed only at the beginning
                // or immediately after e/E
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            }
            else if (ch == '.') {
                // Dot cannot appear after exponent
                // and only one dot is allowed
                if (dot || exp)
                    return false;
                dot = true;
            }
            else if (ch == 'e' || ch == 'E') {
                // Only one exponent allowed
                // Exponent must come after a digit
                if (exp || !digit)
                    return false;
                exp = true;
                digit = false; // Need at least one digit after e/E
            }
            else {
                return false;
            }
        }

        return digit;
    }
}