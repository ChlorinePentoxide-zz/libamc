/**
 *
 *   Copyright 2020, ChlorinePentoxide
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *
 *
 *
 *
 **/

/**
 *	Part of the Advanced Mathematics Computation Library (amc-lib) 
 *	https://www.github.com/ChlorinePentoxide/amc-lib/
 *
 *
 *
 *  Also Licensed under Apache License, Version 2.0
 *	Copyright 2020, ChlorinePentoxide
 **/

/*
 *  This class is part of the AMC library
 *  The following class implements the "infinte" numeric length numbers.
 *  
 *  Section 1 - Constructors
 *   Part 1 - Creating a number of a specified length (Starting Size) which increases on further computation.
 *            The following example creates 8 spaces ( 00000000 ) of 0 digits.
 *    	      Example: Number n = new Number(8);
 *
 *   Part 2 - Creating a number of a specified length (Starting Size) of a specified initial value which
 *            increases on further computation.
 *            The following example creates 4 spaces ( 5555 ) of value 5.
 *            Example: Number n = new Number(4, 5);
 *
 */
public class Number
{
	
	private DigitVector number;
	
	/*
	 *	Implementation of Documentation Part 1.1
	 *  Creating a number of a specified length (Starting Size) which increases on further computation.
	 *  See Section 1 Part 1 for examples
	 *
	 *  @author ChlorinePentoxide
	 *  @since beta-0.1
	 *  @beta
	 */
	public Number(int digits)
	{
		number = new DigitVector(digits);
	}
	
	/* 
	 * Implementation of Documentation Part 1.2
	 *  Creating a number of a specified length (Starting Size) which increases on further computation.
	 *  See Section 1 Part 2 for examples
	 *
	 *  @author ChlorinePentoxide
	 *  @since beta-0.1
	 *  @beta
	 */
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