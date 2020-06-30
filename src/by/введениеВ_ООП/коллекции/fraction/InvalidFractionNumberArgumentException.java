package by.введениеВ_ООП.коллекции.fraction;

public class InvalidFractionNumberArgumentException extends IllegalArgumentException {
    private static final long serialVersionUID = 6014664301046746514L;

	/*public InvalidFractionNumberArgument() {
		super();
	}*/

    public InvalidFractionNumberArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFractionNumberArgumentException(String message) {
        super(message);
    }

	/*public InvalidFractionNumberArgument(Throwable cause) {
		super(cause);
	}*/
}