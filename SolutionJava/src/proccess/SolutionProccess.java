package proccess;

import java.io.IOException;

public class SolutionProccess {

	public static void main(String[] args) {
		ProcessBuilder processBuilder = new ProcessBuilder(args);
		Process process;
	 try {
		process = processBuilder.start();
	    
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	}

}
