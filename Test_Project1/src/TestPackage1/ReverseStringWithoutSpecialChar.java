package TestPackage1;

public class ReverseStringWithoutSpecialChar {
	
	public static void revString(char[] arr)
	{
		int l=0;
		int r=arr.length-1;
		
		while(l<r)
		{
			if(!Character.isAlphabetic(arr[l]))
			{
				l++;
			}
			
			else if(!Character.isAlphabetic(arr[r]))
			{
				r--;
			}
			
			else
			{
				char temp= arr[r];
				arr[r]= arr[l];
				arr[l]=temp;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "abcd@# ghj^& jkldasd)kjandskjs&";
		char[] ch = str.toCharArray();
		
		revString(ch);
		String reversedString = new String(ch);
		System.out.println(reversedString);
		
	}

}
