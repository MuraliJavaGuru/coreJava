package inherit.abstractEx1;

/**
For Hdfc overriding the createPPF() method is mandatory.
if Hdfc doesnt override , we will get compilation.

*/
public class Hdfc extends RBI{

	@Override
	public void createPPF() {
		System.out.println("HDFC: createPPF comeplted");
	}

}
