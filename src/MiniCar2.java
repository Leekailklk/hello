public class MiniCar2 extends Car {
    private  int maxspeed;

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public static void main(String[] args) {
        MiniCar2 car=new MiniCar2();
        MiniCar2 newCar=car;
        System.out.println("Parents car's color:"+car.color);
        car.setColor("blue");
        System.out.println("Child car's color:"+car.color);
        newCar.setColor("Pinc");
        System.out.println("Child car's color:"+car.color);
        System.out.println("car's maxspeed is:");
        car.setMaxspeed(180);
        System.out.println(car.maxspeed);
        newCar.setMaxspeed(90);
        System.out.println(car.maxspeed);
    }
}
