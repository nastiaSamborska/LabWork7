package Tests;

import Task1.CourseNameException;
import Task1.Lecture;
import Task1.TeacherSurnameException;
import  org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class Tests {

    @Test
    public void findTheStudents() throws TeacherSurnameException, CourseNameException {

        Lecture expected;
        Lecture actual;

        Lecture lecture1 = new Lecture("Programming", "Lll", "01-05-2022", "Classes", 50);
        Lecture lecture2 = new Lecture("Programming", "Lll", "02-05-2022", "Classes", 20);
        Lecture lecture3 = new Lecture("Programming", "Nnn", "28-04-2022", "String", 29);
        Lecture lecture4 = new Lecture("Programming", "Kkk", "28-04-2022", "String", 19);
        Lecture lecture5 = new Lecture("Programming", "Nna", "26-04-2022", "OOP", 38);

        Lecture.addLectures(lecture1);
        Lecture.addLectures(lecture2);
        Lecture.addLectures(lecture3);
        Lecture.addLectures(lecture4);
        Lecture.addLectures(lecture5);

        expected = lecture4;

        actual = Lecture.findTheSmallestNumberOfStudents();
        assertEquals(expected,actual);

        Lecture.deleteLectures(lecture1);
        Lecture.deleteLectures(lecture2);
        Lecture.deleteLectures(lecture3);
        Lecture.deleteLectures(lecture4);
        Lecture.deleteLectures(lecture5);


    }

    @Test
    public void findTopicName() throws TeacherSurnameException, CourseNameException {

        String topicName = "OOP";

        ArrayList<Lecture> expected = new ArrayList<>();
        ArrayList<Lecture> actual = new ArrayList<>();


        Lecture lecture1 = new Lecture("Programming", "Lll", "01-05-2022", "Classes", 50);
        Lecture lecture2 = new Lecture("Programming", "Lll", "02-05-2022", "Classes", 20);
        Lecture lecture3 = new Lecture("Programming", "Nnn", "28-04-2022", "String", 29);
        Lecture lecture4 = new Lecture("Programming", "Kkk", "28-04-2022", "String", 19);
        Lecture lecture5 = new Lecture("Programming", "Nna", "26-04-2022", "OOP", 38);

        Lecture.addLectures(lecture1);
        Lecture.addLectures(lecture2);
        Lecture.addLectures(lecture3);
        Lecture.addLectures(lecture4);
        Lecture.addLectures(lecture5);

        expected.add(lecture5);

        actual = Lecture.findTopic(topicName);
        assertEquals(expected,actual);

        Lecture.deleteLectures(lecture1);
        Lecture.deleteLectures(lecture2);
        Lecture.deleteLectures(lecture3);
        Lecture.deleteLectures(lecture4);
        Lecture.deleteLectures(lecture5);

    }

    @Test
    public void findTeacherSurname() throws TeacherSurnameException, CourseNameException {
        String lastLetter = "a";

        ArrayList<Lecture> expected = new ArrayList<>();
        ArrayList<Lecture> actual = new ArrayList<>();


        Lecture lecture1 = new Lecture("Programming", "Lll", "01-05-2022", "Classes", 50);
        Lecture lecture2 = new Lecture("Programming", "Lll", "02-05-2022", "Classes", 20);
        Lecture lecture3 = new Lecture("Programming", "Nnn", "28-04-2022", "String", 29);
        Lecture lecture4 = new Lecture("Programming", "Kkk", "28-04-2022", "String", 19);
        Lecture lecture5 = new Lecture("Programming", "Nna", "26-04-2022", "OOP", 38);

        Lecture.addLectures(lecture1);
        Lecture.addLectures(lecture2);
        Lecture.addLectures(lecture3);
        Lecture.addLectures(lecture4);
        Lecture.addLectures(lecture5);

        expected.add(lecture5);

        actual = Lecture.findTeachers(lastLetter);
        assertEquals(expected,actual);

        Lecture.deleteLectures(lecture1);
        Lecture.deleteLectures(lecture2);
        Lecture.deleteLectures(lecture3);
        Lecture.deleteLectures(lecture4);
        Lecture.deleteLectures(lecture5);

    }

    }


