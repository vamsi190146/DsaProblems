class Solution {
    public int passThePillow(int n, int time) {
        int chunks = time / (n - 1); // chunks = 5 / 3 = 1
        return chunks % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1)); // 1 % 2 != 0, so return 4 - 5 % 3 = 4 - 2 = 2
    }
}
