package Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Course2 {
    private String courseName2;
    private String teachersSurname2;

    public Course2 (String courseName2, String teachersSurname2){
        setCourseName2(courseName2);
        setTeachersSurname2(teachersSurname2);
    }
    public Course2(){}

    public String getCourseName2() {
        return courseName2;
    }

    public void setCourseName2(String courseName2) {
        Pattern pattern = Pattern.compile("[A-Za-z]*");
        Matcher matcher = pattern.matcher(courseName2);
        if (matcher.matches()) {
            this.courseName2 = courseName2;
        } else {
            throw new IllegalArgumentException("Incorrect course name format !");
        }
    }

    public String getTeachersSurname2() {
        return teachersSurname2;
    }

    public void setTeachersSurname2(String teachersSurname2) {
        Pattern pattern = Pattern.compile("[A-Za-z]*");
        Matcher matcher = pattern.matcher(teachersSurname2);
        if (matcher.matches()){
            this.teachersSurname2 = teachersSurname2;
        } else {
            throw new IllegalArgumentException("Incorrect teachers surname format !");
        }

    }

    public abstract void findTheSmallestNumberOfStudents2();
    public abstract void findTopic2(String topicName2);
    public abstract void findTeachers2(String lastLetterOfTheSurname2);
}
