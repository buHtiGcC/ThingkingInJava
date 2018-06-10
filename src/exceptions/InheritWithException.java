package exceptions;

class BaseException extends Exception {
	private static final long serialVersionUID = 1L;
}

class DerivedException1 extends BaseException {
	private static final long serialVersionUID = 1L;
}

class DerivedException2 extends BaseException {
	private static final long serialVersionUID = 1L;
}

abstract class BaseWithException {
	public BaseWithException() throws BaseException {}
	public void event() throws BaseException {}
	public abstract void action() throws DerivedException1, DerivedException2;
	public void handle() {}	
}

@SuppressWarnings("serial")
class InterfaceException extends Exception {}

interface InterfaceWithtWithException {
	public void event() throws InterfaceException;
	public void handle() throws InterfaceException;
}

public class InheritWithException extends BaseWithException implements InterfaceWithtWithException {
	/*!compile error!
	 * public InheritWithException() {}
	 * */
	public InheritWithException() throws BaseException{}
	
	/*!compile error!
	 *public InheritWithException(int i) throws InterfaceException{}
	 * */
	public InheritWithException(int i) throws BaseException, InterfaceException {}
	
	/*!compile error!
	 * public void event() throws BaseException {}
	 * public void event() throws InterfaceException {}
	 * public void event() throws BaseException, InterfaceException {}
	 * */
	public void event() {}
	
	/*!compile error!
	 * public void action() throws BaseException {}
	 * */
	public void action() throws DerivedException1 {}	
	
	/*!compile error!
	 * public void handle() throws InterfaceException {}
	 * */
	public void handle() {}
	
	public static void main(String[] args) {
		try {
			BaseWithException be = new InheritWithException();
			be.event();
			be.action();
			be.handle();
			
			InterfaceWithtWithException ie = new InheritWithException();
			ie.event();
			ie.handle();
			
			InheritWithException te = new InheritWithException();
			te.event();
			te.action();
			te.handle();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
