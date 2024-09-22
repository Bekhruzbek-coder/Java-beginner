package operators;

public class OperatorsCoding5
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

        System.out.println();

        int priceNegative = -14999;
        int priceNegativeWithPlusSign = + priceNegative;

        System.out.println("Negative price with plus sign: $" + priceNegativeWithPlusSign);

        int priceNegativeWithMinusSign = - priceNegative;
        System.out.println("Negative price with minus sign: $" + priceNegativeWithMinusSign);

        int priceOneDollarIncrease = ++price;
        System.out.println("Price after 1 dollar price increase: $" + priceOneDollarIncrease);

        int priceOneDollarDecrease = --price;
        System.out.println("Price after 1 dollar price decrease: $" + priceOneDollarDecrease);

        System.out.println("This car is damaged: " + !isDamaged);
        System.out.println();


        System.out.println("Car's price equals the money in the bank: " + (price == moneyIntTheBank));
        System.out.println("Car's price doesn't equals the money in the bank: " + (price != moneyIntTheBank));
        System.out.println("Car's price greater than the money in the bank: " + (price > moneyIntTheBank));
        System.out.println("Car's price greater than the money in the bank: " + (price > moneyIntTheBank));
        System.out.println("Car's price lesser than the money in the bank: " + (price < moneyIntTheBank));
        System.out.println("Car's price greater than or equals the money in the bank: " + (price >= moneyIntTheBank));
        System.out.println("Car's price lesser than or equals the money in the bank: " + (price <= moneyIntTheBank));
        System.out.println("The carModel variable's datatype is a String: " + (carModel instanceof String));

        String damagedText = isDamaged? "The car is damaged" : "The car isn't damaged";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingText = !isDamaged || price <= 20000 ? "It is worth seeing the car" : "It isn't worth seeing the Car";
        System.out.println(worthSeeingText);
        String worthRepairingText = isDamaged && price <= 10000 ? "It is worth repairing the car" : "It isn't worth repairing the Car";
        System.out.println(worthRepairingText);

        price += 1000;
        System.out.println("Price increased: $" + price);
        price -= 2000;
        System.out.println("Price decreased: $" + price);
        price *= 2;
        System.out.println("Price multiplied: $" + price);
        price /= 2;
        System.out.println("Price divided: $" + price);
        price %= 10000;
        System.out.println("Price remained: $" + price);

    }
}
