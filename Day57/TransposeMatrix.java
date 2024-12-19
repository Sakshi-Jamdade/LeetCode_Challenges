public class TransposeMatrix 
{
    public int[][] transpose(int[][] matrix) 
	{
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }

    public static void main(String[] args) 
	{
        TransposeMatrix solution = new TransposeMatrix();
        
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result1 = solution.transpose(matrix1);
        printMatrix(result1);
        
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] result2 = solution.transpose(matrix2);
        printMatrix(result2);
    }
    
    public static void printMatrix(int[][] matrix) 
	{
        for (int[] row : matrix) 
		{
            for (int val : row) 
			{
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
