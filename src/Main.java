public class Main {
    public static void main(String[] args) {

        WaterBottle bottleOne = new WaterBottle();

        bottleOne.check();
        bottleOne.drink();
        bottleOne.check();
        WaterBottle bottleTwo= new WaterBottle();
        bottleTwo.drink();
        bottleTwo.drink();
        bottleTwo.check();
    }
}