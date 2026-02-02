class X
{
	int x;
	int  display(){ // use void also
		return(x);
	}
}
class M{
	public static void main(String args[]){
		X a=new X();
		int r;
		r=a.display();
	}
}
