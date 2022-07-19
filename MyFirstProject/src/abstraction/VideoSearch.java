package abstraction;

public class VideoSearch extends Google
{
	public void search()
	{
		System.out.println("Video Result");
	}
	public static void main(String args[])
	{
		VideoSearch objVideo=new VideoSearch();
		objVideo.search();
		objVideo.sayHello();
	}
}
