
public class MaxOccuringChar {

	static final int ASCII_SIZE=256;
	static char getMaxOccuringChar(String str)
	{
		int count[]=new int[ASCII_SIZE];
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			count[str.charAt(i)]++;
		}
		
		int max=-1;
		char result=' ';
		
		for(int i=0;i<len;i++)
		{
			if(max<count[str.charAt(i)])
			{
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="sample string";
		String str="Vv";
		System.out.println("Max occuring character is "+getMaxOccuringChar(str));
	}

}
