import java.util.*;
import java.lang.Math;

class Shit
{
	public static double[] testArr = {45, 24, 13, 41, 45};

	public static void main(String[] args)
	{
		shellSort(testArr);
		printArr(testArr);
	}

	public static void shellSort(double[] unsortedArr)
	{
		for (int step = unsortedArr.length / 2; step > 0; step /= 2)
		{
			for (int i = step; i < unsortedArr.length; i++)
			{
				for (int j = i - step; j >= 0 && unsortedArr[j] > unsortedArr[j + step] ; j -= step)
				{
					double x = unsortedArr[j];
					unsortedArr[j] = unsortedArr[j + step];
					unsortedArr[j + step] = x;
				}
			}
		}
	}

	public static void printArr(double[] arr)
	{
		for (int i = 0; i < arr.length; ++i)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
