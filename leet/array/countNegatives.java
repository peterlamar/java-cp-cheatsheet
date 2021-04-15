class Solution {
    public int countNegatives(int[][] grid) {
        return (int)Arrays.stream(grid).flatMapToInt(x->Arrays.stream(x)).filter(x -> x<0).count();
    }
}