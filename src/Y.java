
public class Y extends Inher
{
	public void showA(int x)
	{
		System.out.println("I am  Muni   "+x);
	}
	public void showB(int y)
	{
		System.out.println(y+"");
	}
	public static void main(String[] args) 
	{
		Inher i=new Y();
		i.showA(10);
		Y y=new Y();
		y.showA(15);
		y.showB(10);
		
		
	}

}
