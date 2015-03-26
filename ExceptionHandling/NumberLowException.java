
public class NumberLowException extends Exception {
// creates exception object with no message
    
    // null message in superclass
    public NumberLowException() {
    }
		      
    // str used for exception message
    public NumberLowException(String str) {
        super(str);  // explicitly invokes superclass constructor
    }
		 
    public String toString() {
        return "NumberLowException";
    }
    
}

