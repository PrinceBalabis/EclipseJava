package test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Enumeration;
import java.io.IOException;

public class TestClass
{
	public static BufferedReader input;
	public static OutputStream output;

	public static synchronized void writeData(String data) {
		System.out.println("Sent: " + data);
		try {
			output.write(data.getBytes());
		} catch (Exception e) {
			System.out.println("could not write to port");
		}
	}

	public static void main(String[] ag)
	{

		try
		{
			SerialClass obj = new SerialClass();
			char c=0;
			obj.initialize();
			input = SerialClass.input;
			output = SerialClass.output;
			InputStreamReader Ir = new InputStreamReader(System.in);
			BufferedReader Br = new BufferedReader(Ir);
			while (c!='b')
			{
				System.out.println("LED ON / OFF MENU.");
				System.out.println("1.LED ON");
				System.out.println("2.LED OFF");
				System.out.print("Enter your choice :");
				c = Br.readLine().charAt(0);
				System.out.println(c);

				switch(c)
				{
				case 'a':
					writeData("1");
					break;

				case 'b':
					writeData("0");
					break;

				case 'c':
					System.exit(0);
				}
			}


			String inputLine=input.readLine();
			System.out.println(inputLine);

			obj.close();

		}
		catch(Exception e){}

	}
}