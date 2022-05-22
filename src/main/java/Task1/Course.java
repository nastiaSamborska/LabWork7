package Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {
    private String courseName;
    private String teachersSurname;

    public Course (String courseName, String teachersSurname) throws TeacherSurnameException, CourseNameException {
        setCourseName(courseName);
        setTeachersSurname(teachersSurname);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) throws CourseNameException {
        Pattern pattern = Pattern.compile("[A-Za-z]*");
        Matcher matcher = pattern.matcher(courseName);
        if (matcher.matches()) {
            this.courseName = courseName;
        } else {
            throw new CourseNameException();
        }
    }

    public String getTeachersSurname() {
        return teachersSurname;
    }

    public void setTeachersSurname(String teachersSurname) throws TeacherSurnameException  {
        Pattern pattern = Pattern.compile("[A-Za-z]*");
        Matcher matcher = pattern.matcher(teachersSurname);
        if (matcher.matches()){
            this.teachersSurname = teachersSurname;
        } else {
            throw new TeacherSurnameException();
        }

    }

    }

