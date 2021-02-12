package lector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Lector extends BufferedReader {

	public Lector(Reader in) {
		super(in);
	}
	public Lector() {
		super(new InputStreamReader(System.in));
	}
	public Integer readInt() {
		try {
			return Integer.parseInt(this.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Double readDouble() {
		try {
			return Double.parseDouble(this.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
