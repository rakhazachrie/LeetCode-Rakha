public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while(true){
            if(numbers[i] + numbers[j] == target){
                return new int[]{++i, ++j};
            }
            
            if (numbers[i] + numbers[j] < target){
                i++;
            }
            if(numbers[i] + numbers[j] > target){
                j--;
            }

        }      
    }   
}
