import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> stList = new ArrayList<>();
        stList.add(new TechStudent(1001,"Larry","07881"));
        stList.add(new TechStudent(1002,"James","07882"));
        stList.add(new BusClass(1004,"Eric","07884"));
        stList.add(new BusClass(1005,"Fabrice","07885"));
        stList.add(new TourStudent(1006,"Kevine","07886"));
        stList.add(new TechStudent(1003,"Claude","07883"));


        for (Student st:stList){
            System.out.println(st);
        }
    }
}