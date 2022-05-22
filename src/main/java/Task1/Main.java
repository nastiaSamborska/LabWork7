package Task1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            Lecture lecture1 = new Lecture("Programming", "Lll", "01-05-2022", "Classes", 50);
            Lecture lecture2 = new Lecture("Programming", "Lll", "02-05-2022", "Classes", 20);
            Lecture lecture3 = new Lecture("Programming", "Nnn", "28-04-2022", "String", 29);
            Lecture lecture4 = new Lecture("Programming", "Kkk", "28-04-2022", "String", 19);
            Lecture lecture5 = new Lecture("Programming", "Nna", "26-04-2022", "OOP", 38);
            Lecture lecture6 = new Lecture("Programming", "Hhh", "22-04-2022", "OOP", 24);


            Lecture.addLectures(lecture1);
            Lecture.addLectures(lecture2);
            Lecture.addLectures(lecture3);
            Lecture.addLectures(lecture4);
            Lecture.addLectures(lecture5);
            Lecture.addLectures(lecture6);


            Lecture.deleteLectures(lecture6);

        }catch (TeacherSurnameException | CourseNameException | IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        while (true){
            System.out.println( "\n" +"0 - exit");
            System.out.println("1 - find the smallest number of students");
            System.out.println("2 - find the topic");
            System.out.println("3 - find the teacher(last letter)");
            int task = console.nextInt();

            if (task == 1){
                System.out.println(Lecture.findTheSmallestNumberOfStudents());
            }

            if (task == 2){
                Scanner scanner = new Scanner(System.in);
                String topicName = scanner.nextLine();

                ArrayList<Lecture> lecturesTopic = new ArrayList<>(Objects.requireNonNull(Lecture.findTopic(topicName)));
                for (Lecture element : lecturesTopic){
                    System.out.println(element);
                }
            }

            if (task == 3) {
                Scanner scanner1 = new Scanner(System.in);
                String lastLetter = scanner1.nextLine();

                ArrayList<Lecture> lecturesTeachers = new ArrayList<>(Objects.requireNonNull(Lecture.findTeachers(lastLetter)));
                for (Lecture element : lecturesTeachers) {
                    System.out.println(element);
                }
            }
            if (task == 0){
                break;
            }
        }

    }
}
