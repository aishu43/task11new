package task11;

public class ArrayIndexOfBoundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = new int[3];
		arr[0]=3;
		arr[1]=2;
		arr[2]=1;
		//try
		{
		arr[3]=0;
		}
		
		//catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e);
		}
		

	

}
}