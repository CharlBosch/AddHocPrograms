package AddHocPrograms.AddHocProgramsArtifact;

class ScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		
		if(x == 10)	
		{
		 int y = 20;
		 
		 System.out.println(" x is " + x + " y is " + y);
		 x = y * 2;
		}
		
		//y = 100;
		// y is out of the block and thus not valid in compilation
		
		System.out.println(" x is " + x);
	}

}
