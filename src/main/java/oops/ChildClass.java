package oops;

public class ChildClass implements FatherInterFace,MotherInterface {

	@Override
	public void height() {

  float HT=(FatherInterFace.ht+MotherInterface.ht)/2; //(6.2=5.8/2=12/2=6.0
  System.out.println(HT);
	}
	
	public static void main(String[] args) {
		FatherInterFace f1=new ChildClass();
		f1.height();
	}
	
	

}
