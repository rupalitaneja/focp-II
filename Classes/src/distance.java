//write a program to read two dsitances in feet and inches and find their sum
class distance{
	float dfeet,dinches;
	Double x;
	distance(float a,float b){
     dfeet=a;
     dinches=b;
	}
	distance(){
	dfeet=0;
	dinches=0;
	}
	distance add(distance x){
	x.dfeet=x.dfeet+dfeet;
	x.dinches=x.dinches+dinches;
	
	return x;
  }
	
}