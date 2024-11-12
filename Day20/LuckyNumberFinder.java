class LuckyNumberFinder 
{
    public int findLargestLuckyNumber(int[] arr) 
    {
        int largestLuckyNumber = -1;
        int i = 0;

        // Outer loop to iterate over each element in arr
        while (i < arr.length) 
        {
            int count = 0;
            int j = 0;

            // Inner loop to count occurrences of arr[i]
            while (j < arr.length) 
            {
                if (arr[j] == arr[i]) 
                {
                    count++;
                }
                j++;
            }

            // Check if arr[i] is a lucky number
            if (arr[i] == count) 
            {
                largestLuckyNumber = Math.max(largestLuckyNumber, arr[i]);
            }
            
            i++;
        }
        
        return largestLuckyNumber;
    }

    public static void main(String[] args) 
    {
        LuckyNumberFinder finder = new LuckyNumberFinder();
        
        int[] arr = {2, 2, 3, 4};
        int result = finder.findLargestLuckyNumber(arr);
        
        System.out.println("Largest Lucky Number: " + result);
    }
}
