import java.util.HashSet;

public class LongestConsecutiveSequence 
{
    public int longestConsecutive(int[] nums) 
	{
        if (nums.length == 0) return 0; 

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num); // Add all elements to the set

        int longest = 0;

        for (int num : set) 
		{
            if (!set.contains(num - 1)) 
			{ 
                int currentNum = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) 
				{
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count); 
            }
        }

        return longest;
    }

    public static void main(String[] args) 
	{
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(nums)); // Output: 4
    }
}
