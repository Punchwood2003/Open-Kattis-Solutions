import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Pyramids {
	public static void main(String[] agrs) throws IOException {
		new Pyramids().run();
	}
	public void run() throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		long numBlocks = Long.parseLong(file.readLine());
		long i = 1;
		long height = 0;
		while(numBlocks > (i * i * i)) {
			numBlocks -= (i * i * i);
			height++;
			i++;
		}
		out.println(height);
		file.close();
		out.close();
	}
}
