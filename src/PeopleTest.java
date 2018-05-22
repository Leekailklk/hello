import java.sql.SQLOutput;

public class PeopleTest {
    public static void main(String[] args) {
        People people=new People();
        System.out.println("name:"+people.name);
        System.out.println("Age:"+people.age);
        System.out.println("What are u doing?"+people.eat());
    }


}
