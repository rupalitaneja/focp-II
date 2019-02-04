class rectangle
{
	int length;
	int width;
	rectangle()
	{
	length=30;
	width=30;
	}
	int Area()
	{
		return length*width;
	}
}

class box extends rectangle
{
	int height;
	box()
	{
	height=10;
	}
	int vol()
	{
	return length*width*height;
	}
	void displaydim()
	{
	System.out.println("length" +length+ "width" +width+ "height" +height);
	}
}

class boxmain
{
	public static void main(String args[])
	{
	box B =new box();
	B.displaydim();
	System.out.println(B.vol());
	System.out.println(B.Area());
	}
}