class Shit
{
	public static int[] testSequence = {45, 12, 12, 12, 31, 41, 42};

	public static void main(String[] args)
	{
		int[] subSeqArr = genArrIncSubseq(testSequence);
		int maxSubSeqLength = findArrMaxValue(subSeqArr);

		int minElsAmount = testSequence.length - maxSubSeqLength;

		System.out.println(minElsAmount);
	}

	public static int[] genArrIncSubseq(int[] testSeq)
	{
		int[] subSeqArr;
		subSeqArr = new int[testSeq.length];
		int incElsCnt;
		int currSeqEl;

		for (int i = 0; i < testSeq.length - 1; ++i)
		{
			incElsCnt = 1;
			currSeqEl = testSeq[i];
			for (int j = i; j < testSeq.length - 2; ++j)
			{
				if (currSeqEl < testSeq[j + 1])
				{
					incElsCnt++;
					currSeqEl = testSeq[j + 1];
				}
			}
			subSeqArr[i] = incElsCnt;
		}
		subSeqArr[testSeq.length - 1] = 1;
		return subSeqArr;
	}

	public static int findArrMaxValue(int[] arr)
	{
		int maxVal = arr[0];
		for (int i = 1; i < arr.length -1; ++i)
		{
			if (maxVal < arr[i])
				maxVal = arr[i];
		}
		return maxVal;
	}

	public static void printArr(int[] arr)
	{
		for (int i = 0; i < arr.length -1; ++i)
			System.out.print(arr[i]);
		System.out.println();
	}
}
