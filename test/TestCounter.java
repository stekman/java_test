/**
 * 
 */
package test;
import test.CounterTests;
/**
 * @author stekman
 *
 */
public class TestCounter extends TestRunner {

	/**
	 * @param args Not used
	 */
	public static void main(String[] args) {
		TestRunner testRunner = new TestCounter();
		testRunner.run();
	}
	
	public void setupTestModules()
	{
		add(new CounterTest());
	}
}
