package AddHocPrograms.AddHocProgramsArtifact;
// Promotion surprise! Type promotion rules - how it works
public class PromDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i;
		
		b = 10;
		i = b * b; // No casting needed. This is already elevated to type of int 
		
		b = 10;
		b = (byte) (b * b); // Cast needed to assign an int to a byte
		
		System.out.println("i and b: " + i + " " + b);
	}

}
