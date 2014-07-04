package AddHocPrograms.AddHocProgramsArtifact;
// This is to demonstrate the short-circuit operators.
class SCops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, d, q;
		
		n = 10;
		d = 2;
		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of 1 " + n);

		d = 0; //now set the value to 0.
		
		// Since d is zero, the second is zero this is not evaluated.
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of 2 " + n);
		
		// Runtime error because the & operator can't evaluate to / by zero.   
		if(d != 0 & (n % d) == 0)
			System.out.println(d + " is a factor of 3 " + n);
	}

}
