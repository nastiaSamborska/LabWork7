package Task1;

public class TeacherSurnameException extends Exception{

    @Override
    public String getMessage(){
        return "Incorrect last name format !";
    }
}
