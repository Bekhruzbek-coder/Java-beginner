package methods;

public class FunctionsPractice {
    public static void main(String[] args){
        System.out.println(getEnergyEfficiency('b'));
        System.out.println();
        getCarDescription("Tesla Roadster", 2018, "good");

    }
    static String getEnergyEfficiency(char category){
        switch(category){
            case 'A':
            case 'a':
                return "Very low energy consumption.";
            case 'B':
            case 'b':
                return "Low energy consumption.";
            case 'C':
            case 'c':
                return "Normal energy consumption.";
            case 'D':
            case 'd':
                return "Above normal energy consumption.";
            case 'E':
            case 'e':
                return "High energy consumption.";
            case 'F':
            case 'f':
                return "Very high energy consumption.";
            case 'G':
            case 'g':
                return "Extremely high energy consumption.";
            default:
                return "Not defined category.";
        }
    }
    static void getCarDescription(String model, int productionYear, String condition){
        System.out.println("This car is a: " + model + ".");
        System.out.println("Production year is: " + productionYear + ".");
        System.out.println("It is in " + condition + " condition.");
    }
}
