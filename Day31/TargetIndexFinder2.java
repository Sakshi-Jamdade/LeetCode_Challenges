import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndexFinder2
{   
    public List<Integer> targetIndices(int[] nums, int target) 
	{
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) 
		{
            if (nums[i] == target) 
			{
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) 
	{
        TargetIndexFinder2 finder = new TargetIndexFinder2();
        
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
        
        List<Integer> indices = finder.targetIndices(nums, target);
        System.out.println("Target indices: " + indices);
    }
}
