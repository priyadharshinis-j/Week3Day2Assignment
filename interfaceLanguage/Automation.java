package interfaceLanguage;

/*Assignment3
============
 Interface
Interface :Language
     Methods   :Java()
     Methods   :javaScript()
     Methods   : ruby()
     Interface :TestTool
     Methods   :Selenium()
     Class :MultipleLangauge
     Methods   :python() 
  Execution class: Automation 
Implement all the methods of interface and excute in Automation class*/
public class Automation extends MultipleLanguage implements Language,TestTool
{
	public void java() {
		System.out.println("I'm Java Programming Language");
	}
	public void javaScript()
	{
		System.out.println("I'm JavaScript Programming Language");
	}
	public void ruby()
	{
		System.out.println("I'm Ruby Programming Language");
	}
	public void selenium()
	{
		System.out.println("I'm Selenium testing automation framework");
	}
	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.java();
		automation.javaScript();
		automation.ruby();
		automation.selenium();
		automation.python();
	}
	

}
