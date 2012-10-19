package w05_OOMiddleware;

import w05_OOMiddleware.HelloApp.*;
import org.omg.CORBA.*;
import java.io.*;

public class HelloClient {

	public static void main(String[] args) {
		System.out.println("I am the client");
		try{
			ORB orb = ORB.init(args, null);
			BufferedReader br = new BufferedReader(new FileReader(".\\src\\w05_OOMiddleware\\HelloIOR"));
			String ior = br.readLine();
			br.close();
			
			org.omg.CORBA.Object obj = orb.string_to_object(ior);
			Hello helloRef = HelloHelper.narrow(obj);
			String hello = helloRef.sayHello();
			System.out.println(hello);
			
		} catch(Exception e) {
			System.out.println("Error: "+e);
			e.printStackTrace(System.out);
		}

	}

}
