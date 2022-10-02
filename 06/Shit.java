import java.util.*;
import java.lang.Math;

class Shit
{
	public static double[][] matrix;

	public static void main(String[] args)
	{
		double[] testArr = {34.3, 20.5, 12.23, 54.75, 12.0, 25.5};
		matrix = new double[(int)Math.sqrt(numsLength)][(int)Math.sqrt(numsLength)];
		fillMatrix(testArr);
		printMatrix((int)Math.sqrt(testArr.length));
	}

	public static void fillMatrix(double[] nums)
	{
		for (int i = 0; i < Math.sqrt(nums.length); ++i)
		{
			for (int j = 0; j < Math.sqrt(nums.length); j++)
			{
				matrix[i][j] =nums[j + i * (int)Math.sqrt(nums.length)];
			}
		}
	}

	public static void printMatrix(int matrixSideSize)
	{
		for (int i = 0; i < matrixSideSize; ++i)
		{
			for (int j = 0; j < matrixSideSize; ++j)
			{

				System.out.print(matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
