package test;

public abstract class TestModule implements ITestModule {
	private boolean testOK = true;	
	@Override
	public boolean run()
	{
		testOK = true;
		SetUp();
		Test();
		TearDown();
		return testOK;
	}
	
	protected void AssertThat(boolean test)
	{
		if(test)
			System.out.println("✔");
		else
			System.out.println("✗");
		testOK = test;
	}
	
	protected void It(String title)
	{
		System.out.print(title+": ");
	}
	
	protected void Describe(String object)
	{
		System.out.println("Tests on "+object+": ");
	}
	
	abstract public void Test();
	private void SetUp() {}
	private void TearDown() {}
}
