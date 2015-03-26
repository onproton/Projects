
public class NumberHighException extends Exception {
    // creates exception object with no message
    // null message in superclass
    public NumberHighException() {
    }
	             
    // str used for exception message
    public NumberHighException(String str) {
        super(str);  // explicitly invokes superclass constructor
    }

    public String toString() {
        return "NumberHighException";
    }
    
}


