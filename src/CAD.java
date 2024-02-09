import java.util.*;
import java.math.*;
import java.text.*;

public class CAD {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    // conversion rate of canadian dollar to the euro
    public final double CADtoEURO = 0.6894;
    // conversion rate of canadian dollar to the australian dollar
    public final double CADtoAUD = 1.1386;
    // conversion rate of canadian dollar to the united states dollar
    public final double CADtoUSD = 0.743;
    // placeholder value for the users final converted amount of money
    double finalVal = 0;
    // holds the amount of money the user has in canadian dollar
    double amount;
    // CAD constructor

    CAD(double amount)
    {
        this.amount = amount;
    }
    // function to convert the users money to another currency
    public static void listPrinter (List<String> listOfCurrencies)
    {
        //for loop that prints one currency and the key to press to access it
        for (int i = 0; i < listOfCurrencies.size(); i++)
        {
            System.out.println(listOfCurrencies.get(i) + " (" + (i+1) + ")");
        }
        System.out.println("Exit (0)");
    }
    public static void  converter (CAD money, double userChoice)
    {
        // turns the users money to CAD
        if (userChoice == 1)
        {
            System.out.println("Your converted money is: " + decfor.format(money.toCAD()));
        }
        // turns the users money to the Euro
        else if (userChoice == 2)
        {
            System.out.println("Your converted money is: " + decfor.format(money.toEuro()));
        }
        // turns the users money to AUD
        else if  (userChoice == 3)
        {
            System.out.println("Your converted money is: " + decfor.format(money.toAUD()));
        }
        // turns the users money into USD
        else if (userChoice == 4)
        {
            System.out.println("Your converted money is: " + decfor.format(money.toUSD()));
        }
    }
    //sends the users money to them
    public double toCAD()
    {
        return amount;
    }
    // converts the users money to the euro
    public double toEuro ()
    {
        // invokes the users objects classes toCAD() function
        finalVal = toCAD();
        // converts from canadian to euro
        finalVal = finalVal*CADtoEURO;
        return finalVal;
    }
    // converts the users money to australian dollar
    public double toAUD ()
    {
        // invokes the users objects classes toCAD() function
        finalVal = toCAD();
        // converts from canadian to AUD
        finalVal = finalVal*CADtoAUD;
        return finalVal;
    }
    // converts the users money to USD
    public double toUSD()
    {
        // invokes the users objects classes toCAD() function
        finalVal = toCAD();
        // converts from canadian to USD
        finalVal = finalVal * CADtoUSD;
        return finalVal;
    }
    // main to make the program run
    public static void main (String[] args)
    {
        // placeholder variable to keep do loop open
        boolean exit = false;
        // do loop to allow the user to execute the program
        do {
        // title for the program
        System.out.println("~~~~---- Currency Converter ----~~~~");
        // scanner that lets the user enter a value
        Scanner scn = new Scanner(System.in);
        // creates the list of the currencies that are used
        List<String> currencies = new ArrayList<>();
        currencies.add("CAD");
        currencies.add("EURO");
        currencies.add("AUD");
        currencies.add("USD");

        System.out.println("which currency do you want to convert?");
        // presents the user the currencies that they can pick
        listPrinter(currencies);
        // makes sure that the value that the user enters does not cause any errors
        try {
            // gets the users choice of currency
            int toConvertChoice = scn.nextInt();
            // makes sure that the users number is available
            if (toConvertChoice != 1 && toConvertChoice != 2 && toConvertChoice != 3 && toConvertChoice != 4
                    && toConvertChoice != 0) {
                //sends the user to the top of the do loop
                System.out.println("please enter a number in the list");
                continue;
            }
            // checks if the exit value is selected
            if (toConvertChoice == 0)
            {
                //breaks the loop ending the program
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("what do you want to convert to?");
            // lists the users choices
            listPrinter(currencies);
            // lets teh user select the currency they want to convert to.
            int convertedChoice = scn.nextInt();
            // checks if the users number is available
            if (convertedChoice != 1 && convertedChoice != 2 && convertedChoice != 3 && convertedChoice != 4
                    && convertedChoice != 0) {
                //sends the user to the top of the do loop
                System.out.println("please enter a number in the list");
                continue;
            }
            if (convertedChoice == 0)
            {
                // breaks the loop ending the program
                System.out.println("Goodbye!");
                break;
            }


            System.out.println("how much money do you want to convert?");
            // gets the amount of money that the user wants to be converted
            double initialValue = scn.nextInt();
            //converts the users value from CAD to another currency
            if (toConvertChoice == 1) {
                CAD convert = new CAD(initialValue);
                //sends the currency to the converter function with their choice of currency to convert to
                converter(convert, convertedChoice);
            //converts the users value form EURO to another currency
            } else if (toConvertChoice == 2) {
                EURO convert = new EURO(initialValue);
                //sends the currency to the converter function with their choice of currency to convert to
                converter(convert, convertedChoice);
            //converts the users value from AUD to another currency
            } else if (toConvertChoice == 3) {
                AUD convert = new AUD(initialValue);
                //sends the currency to the converter function with their choice of currency to convert to
                converter(convert, convertedChoice);
            //converts the users value from USD to another currency
            } else {
                USD convert = new USD(initialValue);
                //sends the currency to the converter function with their choice of currency to convert to
                converter(convert, convertedChoice);
            }
        }
        // when the user enters a number that is not an int for the choice .nextInt section it restarts the program
        catch(Exception e)
        {
            // i did not put a continue statment here because it is at the bottom of the loop
            System.out.println("please type a number that is listed");
        }
        } while (!exit);
    }
}