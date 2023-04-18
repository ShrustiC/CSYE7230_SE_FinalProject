/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 189 "model.ump"
// line 330 "model.ump"
public class OnlinePayment extends PaymentAPI
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //OnlinePayment Attributes
  private paymentType paymentType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public OnlinePayment(String aPaymentID, DateTime aPaymentDate, double aAmount, Student aStudent, paymentType aPaymentType)
  {
    super(aPaymentID, aPaymentDate, aAmount, aStudent);
    paymentType = aPaymentType;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPaymentType(paymentType aPaymentType)
  {
    boolean wasSet = false;
    paymentType = aPaymentType;
    wasSet = true;
    return wasSet;
  }

  public paymentType getPaymentType()
  {
    return paymentType;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "paymentType" + "=" + (getPaymentType() != null ? !getPaymentType().equals(this)  ? getPaymentType().toString().replaceAll("  ","    ") : "this" : "null");
  }
}