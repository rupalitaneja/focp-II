class pointmain{
	public static void main(String[] args){
		point p1=new point();
		point p2=new point();
		p1.set(10.45,87.45);
		p2.set(45.33,67.55);
		double dist;
		dist = p1.calDist(p2);
		System.out.println(dist);
	}
		
}

	
	
