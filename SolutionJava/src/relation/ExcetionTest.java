package relation;

import java.io.IOException;

public class ExcetionTest {
	interface Bus {
		void drive() throws IOException;
	}
	class UBus implements Bus {
		@Override
		public void drive() {
			
		}
	}
}
