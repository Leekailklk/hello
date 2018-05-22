public class PeopleMain {
    private String Name;
    private String Sex;
    private int Age;
    public String eat(String food){
        return "I am eating"+food;
    }
    public void tea(){
        System.out.println("I am dringing tea.");
    }

    public static void main(String[] args) {
        String str=new PeopleMain().eat("Apple");
        System.out.println(str);
        new PeopleMain().tea();
    }
}
