import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Betting {
	public static void main(String[] args) throws IOException {
		new Betting().run();
	}
	public void run() throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		double p1 = Integer.parseInt(file.readLine());
		file.close();
		double p2 = 100-p1; 
		out.println(100.0/p1);
		out.println(100.0/p2);
		out.close();
	}
}
