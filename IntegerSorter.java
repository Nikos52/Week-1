package worksheet2;

public class IntegerSorter 
{
	public static void main(String[] args)
	{
		//Declare an array of 10 integers in random order
		int[] numbers = { 3, 2, 1, 4, 7, 8, 6, 5, 10, 9};
		//Output the array before sorting
		System.out.println("Numbers before sorting: ");
		outputArray(numbers);
		//Call bubble sorting function
		bubbleSort(numbers);
		//Output the array after ascending sort
		System.out.println("After ascending sort: ");
		outputArray(numbers);
		//Declare another array for descending
		int[] numbersDescending = { 3, 2, 1, 4, 7, 8, 6, 5, 10, 9};
		//Call bubble sort for descending sort
		bubbleSortDescending(numbersDescending);
		//Output the array after descending sort
		System.out.println("Numbers after descending sorting: ");
		outputArray(numbersDescending);
	}
	//Function to output values of the arrays
	public static void outputArray(int[] arrayParameter)
	{
		for (int i = 0; i < arrayParameter.length; i++)
		{
			System.out.println(arrayParameter[i]);
		}
	}
	//Bubble sorting function for ascending
	public static void bubbleSort(int[] arrayParameter)
	{
		boolean swapped;
		do
		{
			swapped = false;
			for (int i = 0; i < arrayParameter.length - 1; i++)
			{
				if (arrayParameter[i] > arrayParameter[i + 1])
				{
					//swap elements
					int temp = arrayParameter[i];
					arrayParameter[i] = arrayParameter[i + 1];
					arrayParameter[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
	}
	//Bubble sorting for descending order
	public static void bubbleSortDescending(int[] arrayParameter)
	{
		boolean swapped;
		do 
		{
			swapped = false;
			for (int i = 0; i < arrayParameter.length - 1; i++)
			{
				if (arrayParameter[i] < arrayParameter[i + 1])
				{
					//swap elements
					int temp = arrayParameter[i];
					arrayParameter[i] = arrayParameter[i + 1];
					arrayParameter[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
	}
}
