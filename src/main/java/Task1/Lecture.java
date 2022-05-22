package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lecture extends Course {
    private String date;
    private String topic;
    private int amountOfStudents;
    static ArrayList<Lecture> lectures = new ArrayList<Lecture>();

    public Lecture(String courseName, String teachersSurname, String date, String topic, int amountOfStudents) throws TeacherSurnameException, CourseNameException {
        super(courseName, teachersSurname);
        setDate(date);
        setTopic(topic);
        setAmountOfStudents(amountOfStudents);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        Pattern pattern = Pattern.compile("\\d\\d-\\d\\d-\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            this.date = date;
        } else {
            throw new IllegalArgumentException("Incorrect date format");
        }
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        Pattern pattern = Pattern.compile("[A-Za-z]*");
        Matcher matcher = pattern.matcher(topic);
        if (matcher.matches()) {
            this.topic = topic;
        } else {
            throw new IllegalArgumentException("Incorrect topic format");
        }
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        if (amountOfStudents <= 0) {
            throw new IllegalArgumentException("Amount of students can't be less than zero");
        } else {
            this.amountOfStudents = amountOfStudents;
        }
    }

    public static void addLectures(Lecture lecture){
        lectures.add(lecture);
    }

    public static void deleteLectures(Lecture lecture){
        lectures.remove(lecture);
    }

    public static Lecture findTheSmallestNumberOfStudents(){
        if (lectures.isEmpty()){
            return null;
        }

        return lectures.stream().min(Comparator.comparing(Lecture::getAmountOfStudents)).get();
    }

     public static ArrayList<Lecture> findTopic(String topicName){
        if (lectures.isEmpty()) {
            return null;
        }
            ArrayList<Lecture> topics = new ArrayList<Lecture>();
            for (Lecture element : lectures) {
                if (element.getTopic().equals(topicName)){
                    topics.add(element);

                }
            }

        return topics;
    }

    public static ArrayList<Lecture> findTeachers(String lastLetterOfTheSurname){
        if (lectures.isEmpty()){
            return null;
        }
        ArrayList<Lecture> teachers = new ArrayList<>();
        for (Lecture element : lectures){
            if (element.getTeachersSurname().endsWith(lastLetterOfTheSurname)){
                teachers.add(element);
            }
        }
        return teachers;
    }


    @Override
    public String toString() {
        return "Lecture {" +
                "courseName='" + this.getCourseName() + '\'' +
                ", teachersSurname='" + this.getTeachersSurname() + '\'' +
                ", date='" + date + '\'' +
                ", topic='" + topic + '\'' +
                ", amountOfStudents=" + amountOfStudents +
                '}';
    }
}