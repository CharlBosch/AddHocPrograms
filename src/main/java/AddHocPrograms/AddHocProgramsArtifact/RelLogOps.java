package AddHocPrograms.AddHocProgramsArtifact;
	// This demo is to demonstrate the relational and logic operators. 
class RelLogOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		boolean b1, b2;
		
		i = 10;
		j = 11;
		if(i < j) System.out.println("i < j");
		if(i <= j) System.out.println("i <= j");
		if(i != j) System.out.println("i != j");
		if(i == j) System.out.println("i == j");
		if(i >= j) System.out.println("i >= j");
		if(i > j) System.out.println("i > j");
		
		b1 = true;
		b2 = false;
		if (b1 & b2) System.out.println("this won't execute where & is AND");
		if (!(b1 & b2)) System.out.println("!(b1 & b2) is true where & is AND and ! is NOT");
		if (b1 | b2) System.out.println("(b1 | b2) is true where | is OR");
		if (b1 ^ b2) System.out.println("(b1 ^ b2) is true where XOR (exlusive OR)");
	}

}
