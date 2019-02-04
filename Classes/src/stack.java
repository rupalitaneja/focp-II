class stack{
	int tos;
	int arr[]= new int[10];
	void push(int a){
	  if(!isFull())
	     {
	     tos++;
	     arr[tos]=a;
	     }
	}
	void pop(){
	    tos--;

	}
	boolean isEmpty(){
	if(tos>=1)
	return false;
	else
	return true;
	
	}
	boolean isFull(){
		if(tos==9)
			return true;
		else
			return false;
	}
	boolean spaceLeft(){
	if(tos<9)
	return true;
	else 
	return false;
	}
	
}