package Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lecture2 extends Course2{
    private String date2;
    private String topic2;
    private int amountOfStudents2;
    static ArrayList<Lecture2> lectures2 = new ArrayList<Lecture2>();


    public Lecture2(String courseName2, String teachersSurname2, String date2, String topic2, int amountOfStudents2)  {
        super(courseName2, teachersSurname2);
        setDate2(date2);
        setTopic2(topic2);
        setAmountOfStudents2(amountOfStudents2);
    }

    public Lecture2(){}


    public String getDate2() {
        return date2;
    }



    public void setDate2(String date2) {
        Pattern pattern = Pattern.compile("\\d\\d-\\d\\d-\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(date2);
        if (matcher.matches()) {
            this.date2 = date2;
        } else {
            throw new IllegalArgumentException("Incorrect date format");
        }
    }


    public String getTopic2() {
        return topic2;
    }



    public void setTopic2(String topic2) {
        Pattern pattern = Pattern.compile("[A-Za-z]*");
        Matcher matcher = pattern.matcher(topic2);
        if (matcher.matches()) {
            this.topic2 = topic2;
        } else {
            throw new IllegalArgumentException("Incorrect topic format");
        }
    }


    public int getAmountOfStudents2() {
        return amountOfStudents2;
    }



    public void setAmountOfStudents2(int amountOfStudents2) {
        if (amountOfStudents2 <= 0) {
            throw new IllegalArgumentException("Amount of students can't be less than zero");
        } else {
            this.amountOfStudents2 = amountOfStudents2;
        }
    }


    public static void addLectures2(Lecture2 lecture){
        lectures2.add(lecture);
    }


    public static void deleteLectures2(Lecture2 lecture){
        lectures2.remove(lecture);
    }




    @Override
    public void findTheSmallestNumberOfStudents2() {
        if (lectures2.isEmpty()){
            System.out.println("Array list is empty");
        }

       Lecture2 minNumberOfStudents = lectures2.stream().min(Comparator.comparing(Lecture2::getAmountOfStudents2)).get();
        System.out.println(minNumberOfStudents);

    }



    @Override
    public void findTopic2(String topicName2) {
        if (lectures2.isEmpty()) {
            System.out.println("Array list is empty");
        }
      //  ArrayList<Lecture2> topics2 = new ArrayList<Lecture2>();
        for (Lecture2 element : lectures2) {
            if (element.getTopic2().equals(topicName2)){
              //  topics2.add(element);
                System.out.println(element);
            }
        }

    }



    @Override
    public void findTeachers2(String lastLetterOfTheSurname2) {
        if (lectures2.isEmpty()){
            System.out.println("Array list is empty");
        }
       // ArrayList<Lecture2> teachers2 = new ArrayList<>();
        for (Lecture2 element : lectures2){
            if (element.getTeachersSurname2().endsWith(lastLetterOfTheSurname2)) {
               // teachers2.add(element);
                System.out.println(element);
            }
        }
       // System.out.println(teachers2);

    }




    @Override
    public String toString() {
        return "Lecture {" +
                "courseName='" + this.getCourseName2() + '\'' +
                ", teachersSurname='" + this.getTeachersSurname2() + '\'' +
                ", date='" + date2 + '\'' +
                ", topic='" + topic2 + '\'' +
                ", amountOfStudents=" + amountOfStudents2 +
                '}';
    }

}
