package error.copilation;

public class SolutionLocalVariable {
	static double result;
	int b = 2, h = 3;
	public static void main(String[] args) {
		double q,b,h;
		if (result == 0) {
			b = 3;
			h = 4;
			q = 0.5;
		}	
//		result = q*b*h + 3;// error will show in here ask you to assign q b h values before using it.
		
	}

}
