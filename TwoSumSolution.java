import java.util.HashMap;

class TwoSumSolution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) 
        {
            int complement = target - nums[i];
            
            if(map.containsKey(complement)) 
            {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) 
    {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        try 
        {
            int[] result = solution.twoSum(nums, target);
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
