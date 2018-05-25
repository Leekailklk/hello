public class MiniCar extends Car {
    public static void main(String[] args) {
        MiniCar car=new MiniCar();
        System.out.println("Parents car's color:"+car.color);
        car.setColor("blue");
        System.out.println("Child car's color:"+car.color);

    }
}
class Car{
    String color="red";
    public void setColor(String c){
        this.color=c;
    }
}
