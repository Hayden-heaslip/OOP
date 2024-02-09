public class USD extends CAD {

    // USD constructor
    USD(double amount)
    {
        super(amount);
    }
    // overides CAD .toCAD method
    public double toCAD ()
    {
        // converts from USD to CAD
        finalVal = amount/CADtoUSD;
        return finalVal;
    }

}
