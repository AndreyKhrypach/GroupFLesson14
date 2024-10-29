package app;

import app.models.*;

public class Lesson14Program {
    public static void main(String[] args) {

        Shape rectangle = new Shape() {
            @Override
            public double getArea() {
                double res = 0;
                int side1 = 5;
                int side2 = 8;
                res = side2 * side1;
                return res;
            }
        };

//        Person tom = new Person("Tom");
//        tom.setAccount("qwerty");

//        Bicycle bike = new Bicycle("Java", 150);
//        bike.start();
//        Bicycle.HandleBar actionBike = bike.new HandleBar();
//        actionBike.left();
//        actionBike.right();
//        actionBike.stop();

//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.y + myOuter.x);
//        myOuter.sum();
//        myInner.sum();

//        CalculateFactorial.Factorial fact = CalculateFactorial.getFactorial(6);
//        System.out.printf("Factorial number %d = %d \n", fact.getKey(), fact.getResult());


//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
//        System.out.println(innerClass.y);


//        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();

//        OuterClass outerClass = new OuterClass();
//        System.out.println(outerClass.x);
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//        System.out.println(innerClass.y);
    }
}
