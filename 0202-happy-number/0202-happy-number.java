class Solution {

    public int sod(int n) {
        int s = 0;

        while (n != 0) {
            int digit = n % 10;
            s = s + (digit * digit);
            n = n / 10;
        }

        return s;
    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while (fast != 1) {

            slow = sod(slow);
            fast = sod(sod(fast));

            if (fast == 1) {
                return true;
            }

            if (slow == fast) {
                return false;
            }
        }

        return true;
    }
}