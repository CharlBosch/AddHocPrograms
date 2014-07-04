package AddHocPrograms.AddHocProgramsArtifact;

class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		i = (int) (x / y); // cast double to int
		System.out.println("Interger outcome of x / y: " + i);
		
		i = 100;
		b = (byte) i; // No loss because byte can handle the value 100.
		System.out.println("Value of b: " + b);
		
		i = 257;
		b = (byte) i;  // infomation loss 257 is to big for byte
		System.out.println("Value of b: " + b);		
		
		b = 88; //ASCII code for X
		ch = (char) b;
		System.out.println("ch: " + ch);
	}

}
