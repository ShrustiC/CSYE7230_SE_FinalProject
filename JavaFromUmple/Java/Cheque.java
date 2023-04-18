/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 195 "model.ump"
// line 335 "model.ump"
public class Cheque extends PaymentAPI
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Cheque Attributes
  private DateTime validUntil;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cheque(String aPaymentID, DateTime aPaymentDate, double aAmount, Student aStudent, DateTime aValidUntil)
  {
    super(aPaymentID, aPaymentDate, aAmount, aStudent);
    validUntil = aValidUntil;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValidUntil(DateTime aValidUntil)
  {
    boolean wasSet = false;
    validUntil = aValidUntil;
    wasSet = true;
    return wasSet;
  }

  public DateTime getValidUntil()
  {
    return validUntil;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "validUntil" + "=" + (getValidUntil() != null ? !getValidUntil().equals(this)  ? getValidUntil().toString().replaceAll("  ","    ") : "this" : "null");
  }
}