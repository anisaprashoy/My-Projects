package abstraction;

public class SearchAll extends Google
{
	public void search()
	{
		System.out.println("Search all result");
	}
	public static void main(String args[])
	{
		SearchAll objSearch=new SearchAll();
		objSearch.sayHello();
		objSearch.search();
		
	 
	}
}
