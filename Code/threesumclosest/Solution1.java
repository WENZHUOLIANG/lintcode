package threesumclosest;
public class Solution1 {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers ,int target) {
        // write your code here
        int min = Integer.MAX_VALUE;
        int temp = 0;
        int result = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                for(int k = j + 1; k < numbers.length; k++){
                    temp = numbers[i] + numbers[j] + numbers[k];
                    if(Math.abs(target - temp) < min){
                        min = Math.abs(target - temp);
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
