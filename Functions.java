package worksheet1;

public class Functions 
{
	public static void main(String[] args)
	{
		//Declare first aray with 10 integers
		int[] intArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//Declare second aray with 5 integers
		int[] intArray2 = { 11, 12, 13, 14, 15};
		//Call the function for each aray
		outputArrays (intArray1);
		outputArrays (intArray2);
	}
	//Function to ouput values of the arays
	public static void outputArrays(int[] arrayParameter)
	{
		//For loop for both arays
		for (int i = 0; i < arrayParameter.length; i++)
		{
			//Prints out the arrays
			System.out.println(arrayParameter[i]);
		}
	}
}
