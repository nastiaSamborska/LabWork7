package Task1;

public class CourseNameException extends Exception {

    @Override
    public String getMessage(){
        return "Incorrect course name format !";
    }

}
