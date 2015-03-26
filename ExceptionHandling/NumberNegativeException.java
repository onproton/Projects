
public class NumberNegativeException extends NumberLowException {
// creates exception object with no message

    // null message in superclass
    public NumberNegativeException() {
    }
			 
    // str used for exception message
    public NumberNegativeException(String str) {
        super(str);  // explicitly invokes superclass constructor
    }

    public String toString() {
        return "NumberNegativeException";
    }
	
}
