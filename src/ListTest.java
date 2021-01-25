import java.util.*;
class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public boolean equals(Object o){
        if (o instanceof Person){
            Person p = (Person) o;
            return Objects.equals(p.firstName,this.firstName) && this.age == p.age;
        }
        return false;
    }
}

public class ListTest {
        public static   void main(String[] args) {
            List<Person> list = Arrays.asList(
                    new Person("Xiao", "Ming", 18),
                    new Person("Xiao", "Hong", 25),
                    new Person("Bob", "Smith", 20)
            );
            boolean exist = list.contains(new Person("Bob", "Smith", 20));
            System.out.println(exist ? "测试成功!" : "测试失败!");
        }
}

//class preson{
//    int age = 0;
//    String name = null;
//    preson(){
//
//    }
//    preson(int age){
//        this.age = age;
//    }
//    public boolean equals(Object o){
//        if(o instanceof preson)
//        {
//            preson p = (preson) o;
//            return Objects.equals(this.name,((preson) o).name) && this.age == p.age;
//        }
//        return false;
//    }
//}

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        preson p = new preson();
//        list.add("1");
//        String str = null;
//        System.out.println(str.equals(null));
//        List<preson> listp = new ArrayList<>();
//        preson p1 = new preson(1);
//        preson p2 = new preson(2);
//        listp.add(p1);
//        listp.add(p2);
//        System.out.print(listp.contains(new preson(1)));
////        boolean result = list.contains(new String("1"));
////        String str1 = new String("1");
////        String str2 = new String("1");
////        System.out.println(str1.equals(str2));
////        System.out.print(str1 == str2);
//    }
