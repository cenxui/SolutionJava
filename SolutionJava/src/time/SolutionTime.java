package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SolutionTime {

	public static void main(String[] args) {
		String date = LocalDate
				.parse("2016-08-10")
				.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
		
	}
	
	private void name() {
		r.run();
//		r.x = 0 ;
//		
		new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			public Runnable name() {
				return this;
			}
		}.name();
	}
	
	
	
	Runnable r = new Runnable() {
		int x = 0; 
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
		public void name() {
			
		}
	};
}
