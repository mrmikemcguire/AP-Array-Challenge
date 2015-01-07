
public class APArrayChallenge
	{
	static int [ ] [ ] myArray = {{3, 5, 9, 2, -1, 8, 13}, {-2, 5, 1, 11, 8, 2, 0}, {9, 1, -3, 4, 8, 4, 8}, {6, 0, 0, -1, 4, 12, 7},
				{2, 6, -1, 5, 3, 10, 1}, {2, 5, 1, 2, 9, 2, 3}, {-3, 1, 1, 4, 11, 12, 4}};

	public static void main(String[] args)
		{
		findAverage();
		findMin();
		findMax();
		}
	
	public static void findAverage()
		{
		int sum = 0;
		for (int r = 0; r < myArray.length; r++)
			{
			for (int c = 0; c < myArray[0].length; c++)
				{
				sum += myArray[r][c];
				}
			}
		double average = (double) sum / (double) (myArray.length * myArray[0].length);
		System.out.println("The average is " + average);
		}
	
	public static void findMin()
		{
		int min = myArray[0][0];
		for (int r = 0; r < myArray.length; r++)
			{
			for (int c = 0; c < myArray[0].length; c++)
				{
				if (myArray[r][c] < min)
					{
					min = myArray[r][c];
					}
				}
			}
		System.out.println("The smallest number in the array is " + min);
		}
	
	public static void findMax()
		{
		int max = myArray[0][0];
		for (int r = 0; r < myArray.length; r++)
			{
			for (int c = 0; c < myArray[0].length; c++)
				{
				if (myArray[r][c] > max)
					{
					max = myArray[r][c];
					}
				}
			}
		System.out.println("The largest number in the array is " + max);
		}

	}
