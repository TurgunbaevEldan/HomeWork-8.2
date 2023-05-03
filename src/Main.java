import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] lesson = {"programming"};
        String[] lesson1 = {"Russian language"};
        MyClass myClass = new MyClass("Aizat", "Duisheeva", 20, lesson,"Плов");
        MyClass myClass1 = new MyClass(18,lesson1,"manti");
        System.out.println(myClass.firstName+"\n"+myClass.lastName+"\n"+myClass.age+"\n"+Arrays.toString(lesson)+"\n"+myClass.food+"\n");
        System.out.println(myClass1.age+"\n"+Arrays.toString(lesson1)+"\n"+myClass1.food);
    }
}