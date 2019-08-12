
class newmain{
	public static void main(String args[]){	
		
		Add Ad= new Add();
        int result1=Ad.add();
        System.out.print("Sum of a and b is::"+result1 +"\n");
		Sub Su=new Sub();
		int result2=Su.sub();
		System.out.print("sub of a and b is::"+result2 +"\n");
		Div Di=new Div();
		float result3=Di.div();
		System.out.print("div of a and b is::"+result3 +"\n");
		Mul Mu=new Mul();
		int result4=Mu.mul();
		System.out.print("mul of a and b is::"+result4+"\n");
	}
}