package Controller;
import Model.Exception.InvalidDOBException;
import Model.Exception.InvalidFullNameException;
import Model.Exception.InvalidPhoneNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    public static void checkName(String name) throws InvalidFullNameException {
        int length = name.length();
        if (length<=10) return;
        else
            throw new InvalidFullNameException("Name invalid");
    }
    public static void checkdoB(String doB) throws InvalidDOBException {
        final String DATE_FORMAT_REGEX = "^\\d{2}/\\d{2}/\\d{4}$";
            Pattern pattern = Pattern.compile(DATE_FORMAT_REGEX);
            Matcher matcher = pattern.matcher(doB);
            if(matcher.matches()) return;
            else
                throw new InvalidDOBException("doB invalid");
        }
     public static void checkPhone(String phone) throws InvalidPhoneNumberException {
          final String PHONE_NUMBER_REGEX = "^(090|098|091|031|035|038)\\d{7}$";
             Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
             Matcher matcher = pattern.matcher(phone);
         if(matcher.matches()) return;
         else
             throw new InvalidPhoneNumberException("Phone invalid");
         }
     }
