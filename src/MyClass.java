import java.util.Arrays;

public class MyClass {
    /**MyClass деген класс тузунуз

     Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)

     Параметри эки башка болгон эки конструктор тузунуз

     MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз

     Эки объектке эки башка конструктор иштесин.

     Объекттердин маанилерин консольго чыгарыныз.*/

    String firstName;
    String lastName;
    int age;
    String [] lesson;
    String food;

    public MyClass(int age, String[] lesson, String food) {
        this.age = age;
        this.lesson = lesson;
        this.food = food;
    }

    public MyClass(String firstName, String lastName, int age, String[] lesson, String food) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lesson = lesson;
        this.food = food;

    }
}
