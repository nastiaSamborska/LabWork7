package Task2;

import Task1.Lecture;

import java.util.Scanner;

public class MainAbstract {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        try {
            Lecture2 lecture1 = new Lecture2("Programming", "Lll", "01-05-2022", "Classes", 50);
            Lecture2 lecture2 = new Lecture2("Programming", "Lll", "02-05-2022", "Classes", 20);
            Lecture2 lecture3 = new Lecture2("Programming", "Nnn", "28-04-2022", "String", 29);
            Lecture2 lecture4 = new Lecture2("Programming", "Kkk", "28-04-2022", "String", 19);
            Lecture2 lecture5 = new Lecture2("Programming", "Nna", "26-04-2022", "OOP", 38);
            Lecture2 lecture6 = new Lecture2("Programming", "Hhh", "22-04-2022", "OOP", 24);


            Lecture2.addLectures2(lecture1);
            Lecture2.addLectures2(lecture2);
            Lecture2.addLectures2(lecture3);
            Lecture2.addLectures2(lecture4);
            Lecture2.addLectures2(lecture5);
            Lecture2.addLectures2(lecture6);


            Lecture2.deleteLectures2(lecture6);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        while (true){
            System.out.println( "\n" +"0 - exit");
            System.out.println("1 - find the smallest number of students");
            System.out.println("2 - find the topic");
            System.out.println("3 - find the teacher(last letter)");
            int task = console.nextInt();

            Course2 course = new Lecture2();

            if (task == 1){
            course.findTheSmallestNumberOfStudents2();
            }

            if (task == 2){
                Scanner scanner = new Scanner(System.in);
                String topicName2 = scanner.nextLine();
                course.findTopic2(topicName2);
            }

            if (task == 3){
                Scanner scanner1 = new Scanner(System.in);
                String lastLetter2 = scanner1.nextLine();
                course.findTeachers2(lastLetter2);

            }

            if (task == 0){
                break;
            }
        }

    }
}