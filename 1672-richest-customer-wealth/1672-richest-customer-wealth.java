import java.util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] maxwealth =new int[accounts.length];
        for (int i=0;i<accounts.length;i++){
            int sum=0;
            for (int j=0;j<accounts[i].length;j++){
                sum =sum+accounts[i][j];
                maxwealth[i] =sum;
            }
            
        }
        int high  =0;
        for (int i=0;i<maxwealth.length;i++){
            if(maxwealth[i]>high){
                high=maxwealth[i];
            }
        }
        return high;

        
        
    }
}