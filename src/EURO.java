public class EURO extends CAD {
    // Euro constructor
    EURO(double amount)
    {
        super(amount);
    }
    // overides the toCAD method
    public double toCAD ()
    {
        // converts the Euro to CAD
        finalVal = amount/CADtoEURO;
        return finalVal;
    }
}