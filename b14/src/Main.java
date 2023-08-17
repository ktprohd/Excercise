import Model.Exception.InvalidDOBException;
import Model.Exception.InvalidFullNameException;
import Model.Exception.InvalidPhoneNumberException;
import View.Display;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InvalidDOBException, InvalidFullNameException, InvalidPhoneNumberException {
        Display user = new Display();
        try {
            user.Display();
        } catch (Exception e) {
            if(e instanceof InvalidDOBException) {
                throw new InvalidDOBException("doB invalid");
            }
            if(e instanceof InvalidFullNameException){
                throw new InvalidFullNameException("Name invalid");
            }
            if(e instanceof InvalidPhoneNumberException){
                throw new InvalidPhoneNumberException("Phone invalid");
                    }
        }
    }
}