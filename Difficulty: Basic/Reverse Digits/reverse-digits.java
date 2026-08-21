class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        while (n > 0) {
            int digit = n % 10;   // get last digit
            rev = rev * 10 + digit;
            n /= 10;              // remove last digit
        }
        return rev;
        
    }
}