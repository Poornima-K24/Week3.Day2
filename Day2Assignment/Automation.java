package week3.Day2Assignment;

public class Automation 
{
	public static void main(String[] args) 
	{
		
		MultipleLangauge ml= new MultipleLangauge();
		ml.python();
		ml.ruby();
		ml.Java();
		ml.javaScript();
		ml.Selenium();
		System.out.println("-----------------------------");			
		System.out.println("creating object of the interface- Language with class details - method implemented");
		Language lang= new MultipleLangauge();
		lang.Java();
		lang.javaScript();
		lang.ruby();
		System.out.println("-----------------------------");		
		System.out.println("creating object of the interface- TestTool with class details - method implemented");
		TestTool tool=new MultipleLangauge();
		tool.Selenium();
		
		
		
	}


}
