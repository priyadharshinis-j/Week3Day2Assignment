package org.system;


/*
 * Assignment1 =========== Package :org.system Class :Computer Methods
 * :computerModel()
 * 
 * Class :Desktop Methods :desktopSize()
 * 
 * Description: create above 2 class and call all your class methods into the
 * Desktop using single inheritance.
 */
public class DesktopMethods extends ComputerMethods
{
	public void desktopSize()
	{
		System.out.println("Size of the desktop====>16inch");
	}
	public static void main(String[] args) {
		
		DesktopMethods desktop = new DesktopMethods();
		desktop.computerModel();
		desktop.desktopSize();
		
	}
}