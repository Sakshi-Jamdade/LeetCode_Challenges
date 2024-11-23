import java.util.ArrayList;
import java.util.List;

public class TargetIndexFinder 
{

    public List<Integer> targetIndices(int[] nums, int target) 
	{
        List<Integer> result = new ArrayList<>();
        int small = 0;
        int large = 0;
        int n = nums.length;

        for (int i : nums) 
		{
            if (i < target) 
			{
                small++;
            } 
			else if (i > target) 
			{
                large++;
            }
        }

        for (int i = small; i <= n - large - 1; i++) 
		{
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) 
	{
        TargetIndexFinder finder = new TargetIndexFinder();

        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        List<Integer> indices = finder.targetIndices(nums, target);
        System.out.println("Target indices: " + indices);
    }
}
