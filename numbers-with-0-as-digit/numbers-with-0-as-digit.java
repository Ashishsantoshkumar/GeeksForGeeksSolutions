class Solution {
    public int countZero(int n) {
        // Code here
        int count = 0;

                for (int i = 1; i <= n; i++) {
                    int num = i;

                    while (num > 0) {
                        int digit = num % 10;

                        if (digit == 0) {
                            count++;
                            break;
                        }

                        num /= 10;
                    }
                }
                return count;
        
    }
}