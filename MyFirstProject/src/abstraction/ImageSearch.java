package abstraction;

public class ImageSearch extends Google
{
	public void search()
	{
		System.out.println("Image Search Result");
	}
	public static void main(String args[])
	{
		ImageSearch objImage=new ImageSearch();
		objImage.sayHello();
		objImage.search();
		
	}
}
