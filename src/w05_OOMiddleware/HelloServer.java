package w05_OOMiddleware;

//import w05_OOMiddleware.HelloApp.*;
import org.omg.CORBA.*;
import java.io.*;

public class HelloServer {

	public static void main(String[] args) {
		System.out.println("I am the server");
		try{
			ORB orb = ORB.init(args, null);
			HelloServant helloRef = new HelloServant();
			orb.connect(helloRef);
			
			String ior = orb.object_to_string(helloRef);
			FileOutputStream fos = new FileOutputStream(".\\src\\w05_OOMiddleware\\HelloIOR");
			PrintStream ps = new PrintStream(fos);
			ps.print(ior);
			ps.close();
			
			orb.run();
		} catch(Exception e){
			System.err.println("Error: " + e);
			e.printStackTrace(System.out);
		}

	}

}