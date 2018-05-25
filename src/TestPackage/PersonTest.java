package TestPackage;
class Person{
    public String Name;
    public static int eyeNum;

    @Override
    public String toString() {
        return "Name:"+Name+"  eyeNum:"+eyeNum;
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println("Person's eyeNum:"+Person.eyeNum);
        p.Name="li";
        p.eyeNum=2;
        System.out.println("Person's eyeNum:"+Person.eyeNum);
        System.out.println("Person:"+p);
        Person p1=new Person();
        p1.eyeNum=4;
        System.out.println("Person's eyeNum:"+Person.eyeNum);
        System.out.println("Person p:"+p);
        System.out.println("Person p1:"+p1);
    }
}
