class Solution {
    public int maximumWealth(int[][] accounts) {
        int rtn=0;
        for (int i=0; i<accounts.length; i++){
            int sum=0;
            for(int x=0; x< accounts[i].length; x++){
                sum += accounts[i][x];
            }
            rtn = Math.max(sum, rtn);
        }
        return rtn;
    }
}


class Solution {
    public int maximumWealth(int[][] accounts) {
        int rtn=0;
        for (int[] account : accounts){
            int sum=0;
            for(int x : account){
                sum += x;
            }
            rtn = Math.max(sum, rtn);
        }
        return rtn;
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int rtn=0;
        for (int[] account : accounts){
            rtn = Math.max(rtn, Arrays.stream(account).sum());
        }
        return rtn;
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(x -> Arrays.stream(x).sum()).max().getAsInt();
    }
}