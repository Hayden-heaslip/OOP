public class AUD extends CAD{
    //AUD converter
    AUD(double amount)
    {
        super(amount);
    }
    // overides the CAD .toCAD method
    public double toCAD ()
    {
        // cpnverts from AUD to CAD
        finalVal = amount/CADtoAUD;
        return finalVal;
    }
}
