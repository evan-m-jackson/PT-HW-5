
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		String output = "";
		for(int i = 0; i < log.length(); i++) {
			output += log.charAt(i) + " ";
		}
		System.out.println(output);
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String output = "ERROR: ";
		for(int i = 0; i < error.length(); i++) {
			output += error.charAt(i) + " ";
		}
		System.out.println(output);
	}

}
