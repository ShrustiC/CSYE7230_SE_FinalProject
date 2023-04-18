/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 181 "model.ump"
// line 340 "model.ump"
public class PaymentAPI
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PaymentAPI Attributes
  private String paymentID;
  private DateTime paymentDate;
  private double amount;

  //PaymentAPI Associations
  private Student student;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PaymentAPI(String aPaymentID, DateTime aPaymentDate, double aAmount, Student aStudent)
  {
    paymentID = aPaymentID;
    paymentDate = aPaymentDate;
    amount = aAmount;
    boolean didAddStudent = setStudent(aStudent);
    if (!didAddStudent)
    {
      throw new RuntimeException("Unable to create paymentAPI due to student. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPaymentID(String aPaymentID)
  {
    boolean wasSet = false;
    paymentID = aPaymentID;
    wasSet = true;
    return wasSet;
  }

  public boolean setPaymentDate(DateTime aPaymentDate)
  {
    boolean wasSet = false;
    paymentDate = aPaymentDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setAmount(double aAmount)
  {
    boolean wasSet = false;
    amount = aAmount;
    wasSet = true;
    return wasSet;
  }

  public String getPaymentID()
  {
    return paymentID;
  }

  public DateTime getPaymentDate()
  {
    return paymentDate;
  }

  public double getAmount()
  {
    return amount;
  }
  /* Code from template association_GetOne */
  public Student getStudent()
  {
    return student;
  }
  /* Code from template association_SetOneToMany */
  public boolean setStudent(Student aStudent)
  {
    boolean wasSet = false;
    if (aStudent == null)
    {
      return wasSet;
    }

    Student existingStudent = student;
    student = aStudent;
    if (existingStudent != null && !existingStudent.equals(aStudent))
    {
      existingStudent.removePaymentAPI(this);
    }
    student.addPaymentAPI(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Student placeholderStudent = student;
    this.student = null;
    if(placeholderStudent != null)
    {
      placeholderStudent.removePaymentAPI(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "paymentID" + ":" + getPaymentID()+ "," +
            "amount" + ":" + getAmount()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "paymentDate" + "=" + (getPaymentDate() != null ? !getPaymentDate().equals(this)  ? getPaymentDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "student = "+(getStudent()!=null?Integer.toHexString(System.identityHashCode(getStudent())):"null");
  }
}