public class Digit
{
	
	private byte digit;
	
	public Digit(byte d)
	{
		digit = d;
	}
	
	public byte addOnce()
	{
		if(digit == 9) {
			digit = 0;
			return (byte) 1;
		} 
		digit++;
		return (byte) 0;
	}
	
	public byte subtractOnce()
	{
		if(digit == 0) {
			digit = 9;
			return (byte) -1;
		}
		digit--;
		return (byte) 0;
	}
	
	public byte getValue()
	{
		return digit;
	}
	
}