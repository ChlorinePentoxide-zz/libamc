public class Main
{
	
	public static void main(String[] args)
	{
		System.out.println("Protonite Standard Compiler");
		Number number = new Number((byte) 3,(byte) 0,(byte) 0,(byte) 0);
		for(int i = 0; i < 3001; i++) {
			number.subtractOnce();
			System.out.println(number.getValue());
		}
	}
	
}