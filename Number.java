public class Number
{
	
	private DigitVector number;
	
	public Number(int digits)
	{
		number = new DigitVector(digits);
	}
	
	public Number(int digits, byte d)
	{
		number = new DigitVector(digits, d);
	}
	
	public Number(byte... val)
	{
		number = new DigitVector(val);
	}
	
	public byte addOnce()
	{
		for(int i = number.length() - 1; i >= 0; i--)
		{
			Digit d = number.getValue(i);
			byte overflow = d.addOnce();
			number.replace(i, d);
			if(overflow == 0) return (byte) 0;
		}
		return (byte) 1;
	}
	
	public byte subtractOnce()
	{
		for(int i = number.length() - 1; i >= 0; i--)
		{
			Digit d = number.getValue(i);
			byte overflow = d.subtractOnce();
			number.replace(i, d);
			if(overflow == 0) return (byte) 0;
		}
		return (byte) -1;
	}
	
	public String getValue()
	{
		return number.getValue();
	}
	
}