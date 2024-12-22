public class RotateImage 
{
    public static void rotate(int[][] matrix)
	{
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) 
		{
            for (int j = i + 1; j < n; j++) 
			{
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) 
		{
            int start = 0, end = n - 1;
            while (start < end) 
			{
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) 
	{
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);

        // Print the rotated matrix
        for (int i = 0; i < matrix.length; i++) 
		{
            for (int j = 0; j < matrix[i].length; j++) 
			{
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
