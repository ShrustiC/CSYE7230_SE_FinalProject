/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 99 "model.ump"
// line 277 "model.ump"
public class Certificate
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Certificate Attributes
  private String certificateID;
  private String certificateName;
  private DateTime issueDate;

  //Certificate Associations
  private Student student;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Certificate(String aCertificateID, String aCertificateName, DateTime aIssueDate, Student aStudent)
  {
    certificateID = aCertificateID;
    certificateName = aCertificateName;
    issueDate = aIssueDate;
    boolean didAddStudent = setStudent(aStudent);
    if (!didAddStudent)
    {
      throw new RuntimeException("Unable to create certificate due to student. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCertificateID(String aCertificateID)
  {
    boolean wasSet = false;
    certificateID = aCertificateID;
    wasSet = true;
    return wasSet;
  }

  public boolean setCertificateName(String aCertificateName)
  {
    boolean wasSet = false;
    certificateName = aCertificateName;
    wasSet = true;
    return wasSet;
  }

  public boolean setIssueDate(DateTime aIssueDate)
  {
    boolean wasSet = false;
    issueDate = aIssueDate;
    wasSet = true;
    return wasSet;
  }

  public String getCertificateID()
  {
    return certificateID;
  }

  public String getCertificateName()
  {
    return certificateName;
  }

  public DateTime getIssueDate()
  {
    return issueDate;
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
      existingStudent.removeCertificate(this);
    }
    student.addCertificate(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Student placeholderStudent = student;
    this.student = null;
    if(placeholderStudent != null)
    {
      placeholderStudent.removeCertificate(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "certificateID" + ":" + getCertificateID()+ "," +
            "certificateName" + ":" + getCertificateName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "issueDate" + "=" + (getIssueDate() != null ? !getIssueDate().equals(this)  ? getIssueDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "student = "+(getStudent()!=null?Integer.toHexString(System.identityHashCode(getStudent())):"null");
  }
}