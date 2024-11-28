public class AverageSalary 
{
    public static double average(int[] salary) 
	{
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long sum = 0;
        
        for (int sal : salary) {
            sum += sal;
            min = Math.min(min, sal);
            max = Math.max(max, sal);
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) 
	{
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary)); // Output: 2500.0
    }
}