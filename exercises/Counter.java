/**
 * 
 */
package exercises;

/**
 * @author stekman
 *
 */
public class Counter {
	private int value;
	private int max;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	private int min;
	public Counter(int value)
	{
		this(value, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public Counter(int value, int min, int max) throws ArithmeticException
	{
		
		if(max<min)
			throw new ArithmeticException("Max is less than min");
		if(value<min||value>max)
			throw new ArithmeticException("Bad start-value");
		this.value = value;
		this.max=max;
		this.min=min;
	}	
	/**
	 * @param value
	 * @param max
	 * @param min
	 */
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Counter increase()  throws ArithmeticException
	{ 
		if(value+1>max)
			throw new ArithmeticException("Value to big");
		value ++;
		return this; 
	}
	public Counter decrease()  throws ArithmeticException
	{ 
		if(value-1<min)
			throw new ArithmeticException("Value to small");
		value --; 
		return this; 
	}            
}