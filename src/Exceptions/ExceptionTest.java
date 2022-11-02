package Exceptions;

import java.util.Locale;

public class ExceptionTest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExceptionTest() {

    }

    public String convertToUpperCase(String name) {
       try {
           return name.toUpperCase();
       }catch (Exception e){
           e.printStackTrace();
           throw e;
       }
    }
}
