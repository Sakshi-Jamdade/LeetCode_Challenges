public class SpiralMatrixII 
{
    public static int[][] generateMatrix(int n) 
	{
        int[][] matrix = new int[n][n];
        int num = 1, row = 0, col = 0, layer = 0;

        while (num <= n * n) 
		{
            for (col = layer; col < n - layer; col++) 
			{
                matrix[row][col] = num++;
            }
            col--;
            for (row = layer + 1; row < n - layer; row++) 
			{
                matrix[row][col] = num++;
            }
            row--;
            for (col = n - layer - 2; col >= layer; col--) 
			{
                matrix[row][col] = num++;
            }
            col++;
            for (row = n - layer - 2; row > layer; row--) 
			{
                matrix[row][col] = num++;
            }
            layer++;
            row = layer;
            col = layer;
        }

        return matrix;
    }

    public static void main(String[] args) 
	{
        int n = 3;
        int[][] result = generateMatrix(n);

        for (int[] row : result) 
		{
            for (int num : row) 
			{
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
