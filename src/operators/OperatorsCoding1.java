package operators;

public class OperatorsCoding1
{
    public static void main(String[] args)
    {
        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyIntTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": $" + price);

        int increasedPrice = price + 1000;
        System.out.println("Increased price of a " + carModel + ": $" + increasedPrice);

        int decreasedPrice = price - 1000;
        System.out.println("The decreased price of a " + carModel + ": $" + decreasedPrice);

        int twoCarsPrice = price *2;
        System.out.println("Two " + carModel + ": $" + twoCarsPrice);

        int dodgesYouCanBuy = moneyIntTheBank / price;
        System.out.println("From the money we have in the back we can buy " + dodgesYouCanBuy + " " + carModel);

        int moneyRemaining = moneyIntTheBank % price;
        System.out.println("Money we would remain after buying " + dodgesYouCanBuy + " " + carModel + ": $" + moneyRemaining);


    }
}
