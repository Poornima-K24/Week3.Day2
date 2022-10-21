package week3.Day2Assignment;

public class MultipleLangauge implements Language,TestTool
{
	public void python()
	{
		System.out.println("Method only from class level");
		System.out.println("Class MultipleLangauge- method -"+"python");
	}

	public void Selenium() 
	{
		System.out.println("Selenium method from TestTool interface");
		
	}

	public void Java() 
	{
		System.out.println("Java method from Language interface");
	}

	public void javaScript() 
	{
		System.out.println("javaScript method from Language interface");
		
	}

	public void ruby() 
	{
		System.out.println("ruby method from Language interface");
		
	}
}
