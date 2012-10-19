package w05_OOMiddleware;

//import w05_OOMiddleware.HelloApp.*;

public class HelloServant extends w05_OOMiddleware.HelloApp._HelloImplBase {

	private static final long serialVersionUID = 1L;

	@Override
	public String sayHello() {
		System.out.println("Is it cuz I is black? yep");
		return "\nHello World\n";
	}

}
