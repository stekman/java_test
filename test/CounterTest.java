/**
 * 
 */
package test;

import exercises.Counter;

/**
 * @author stekman
 *
 */
public class CounterTest extends TestModule {

	/* (non-Javadoc)
	 * @see test.TestModule#Describe()
	 */
	@Override
	public void Test() {
		Describe("a counter");
		
		It("Should be created with start value");
		Counter counter = new Counter(1);
		AssertThat(counter.getValue()==1);
		
		It("Can be increased by one");
		counter.increase();
		AssertThat(counter.getValue()==2);
		
		It("Can be decreased by one");
		counter.decrease();
		AssertThat(counter.getValue()==1);
		
		It("Can be increased two steps");
		counter.increase().increase();
		AssertThat(counter.getValue()==3);
		
		It("Can have lower limit");
		Counter counterWithLimits = new Counter(1,0,2);
		AssertThat(counterWithLimits.getMin()==0);
		
		It("Can have upper limit");
		AssertThat(counterWithLimits.getMax()==2);
		
		It("Throws when to large");
		try
		{
			counterWithLimits.increase().increase();
			AssertThat(false);
		}
		catch(ArithmeticException e)
		{
			AssertThat(true);
		}
	}
}
