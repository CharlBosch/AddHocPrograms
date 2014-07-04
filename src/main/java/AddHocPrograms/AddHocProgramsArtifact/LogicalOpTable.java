package AddHocPrograms.AddHocProgramsArtifact;
 //A truth table for the logical operators. 
class LogicalOpTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true;
		q = true;
		int pint = 0;
		int qint = 0;
		
		System.out.print(p + "\t" + q + "\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		System.out.println();
		
		p = true;
		q = false;
		
		System.out.print(p + "\t" + q + "\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		System.out.println();
		
		p = false;
		q = true;
		
		System.out.print(p + "\t" + q + "\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		System.out.println();
		
		p = false;
		q = false;
		
		System.out.print(p + "\t" + q + "\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	}

}
