package app.models;

public class OuterClass {

   public int x = 10;

    public class InnerClass {
        public int y = 5;

        public void sum(){
            System.out.println(x +y);
        }
    }

    public void sum(){
        System.out.println(x + new InnerClass().y);
    }


//    public int x = 5;
//
//    public static class InnerClass {
//        public int y = 5;
//    }

//    public class InnerClass {
//       public int y = 5;
//    }

}
