package methods;

public class FunctionAppCoding {
    public static void main(String[] args){
        sayHello();
        blackboardPunishment(5);
        System.out.println("The price with 10% off: " + getTenPercentOffDiscountPrice(2000));
        System.out.println("The price with 50% off: " + getDiscountPrice(2000, 50));
        System.out.println("The price with 40% off: " + getDiscountPrice(2000.75, 60));

    }
    static void sayHello(){
        System.out.println("Hello!!!");
    }
    static void blackboardPunishment(int repeatNumber){
        for (int i = 1; i<= repeatNumber; i++){
            System.out.println("BEING RIGHT SUCKS!");
        }
    }
    static double getTenPercentOffDiscountPrice(int price){
        return price * 0.9;
    }
    static double getDiscountPrice(int price, int percent){
        return price * percent/100.0;
    }
    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }
}
