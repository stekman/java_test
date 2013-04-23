/**
 * 
 */
package test;

import java.util.LinkedList;
import java.util.List;


/**
 * @author stekman
 *
 */
public abstract class TestRunner {
	/**
	 * @param args
	 */
	private List<ITestModule> modules = new LinkedList<ITestModule>();
	
	
	public boolean run()
	{
		setupTestModules();
		boolean result = true;
		for(ITestModule module : modules)
		{	
			if(module.run())
			{
				System.out.println("Module: Success");
			}
			else
			{
				System.out.println("Module: FAIL");
				result = false;
			}
			System.out.println();
		}
		return result;
	}
	
	public void add(ITestModule module)
	{
		modules.add(module);
	}
	
	public abstract void setupTestModules();
}
