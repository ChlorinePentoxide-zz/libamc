public class DigitVector
{
	
	private Digit[] arr;
	
	public DigitVector(int init_sz)
	{
		arr = new Digit[init_sz];
		for(int i = 0; i < init_sz; i++)
			arr[i] = new Digit((byte) 0);
	}
	
	public DigitVector(int init_sz, byte init_val)
	{
		arr = new Digit[init_sz];
		for(int i = 0; i < init_sz; i++)
			arr[i] = new Digit(init_val);
	}
	
	public DigitVector(byte... val)
	{
		arr = new Digit[val.length];
		for(int i = 0; i < val.length; i++)
			arr[i] = new Digit(val[i]);
	}
	
	public void appendForward(Digit d)
	{
		Digit[] narr = new Digit[arr.length+1];
		narr[0] = d;
		for(int i = 1; i < arr.length+1; i++)
			narr[i] = arr[i-1];
		arr = narr;
	}
	
	public int length()
	{
		return arr.length;
	}
	
	public void replace(int index, Digit newDigit)
	{
		arr[index] = newDigit;
	}
	
	public Digit getValue(int index)
	{
		return arr[index];
	}
	
	public String getValue()
	{
		String st = "";
		for(int i = 0; i < arr.length; i++) st += getValue(i).getValue() ;
		return st;
	}
	
	public void reset()
	{
		for(int i = 0; i < arr.length; i++)
			arr[i] = new Digit((byte) 0);
	}
	
}