/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 166 "model.ump"
// line 319 "model.ump"
public class StudentSingletonFactory
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentSingletonFactory Attributes
  private StudentSingletonFactory instance;

  //StudentSingletonFactory Associations
  private Student student;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudentSingletonFactory(StudentSingletonFactory aInstance, Student aStudent)
  {
    instance = aInstance;
    if (aStudent == null || aStudent.getStudentSingletonFactory() != null)
    {
      throw new RuntimeException("Unable to create StudentSingletonFactory due to aStudent. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    student = aStudent;
  }

  public StudentSingletonFactory(StudentSingletonFactory aInstance, String aRoleIDForStudent, String aUserNameForStudent, String aPasswordForStudent, String aUserIDForStudent, Enum aUserTypeForStudent, String aEmailForStudent, int aStatusForStudent, DateTime aRegistrationDateForStudent, String aContactForStudent, String aStudentIDForStudent, String aStudentNameForStudent, String aUniversityForStudent, String aMajorForStudent, List aEnrolledCoursesForStudent, List aCompleteCoursesForStudent, School aSchoolForStudent)
  {
    instance = aInstance;
    student = new Student(aRoleIDForStudent, aUserNameForStudent, aPasswordForStudent, aUserIDForStudent, aUserTypeForStudent, aEmailForStudent, aStatusForStudent, aRegistrationDateForStudent, aContactForStudent, aStudentIDForStudent, aStudentNameForStudent, aUniversityForStudent, aMajorForStudent, aEnrolledCoursesForStudent, aCompleteCoursesForStudent, aSchoolForStudent, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setInstance(StudentSingletonFactory aInstance)
  {
    boolean wasSet = false;
    instance = aInstance;
    wasSet = true;
    return wasSet;
  }

  public StudentSingletonFactory getInstance()
  {
    return instance;
  }
  /* Code from template association_GetOne */
  public Student getStudent()
  {
    return student;
  }

  public void delete()
  {
    Student existingStudent = student;
    student = null;
    if (existingStudent != null)
    {
      existingStudent.delete();
    }
  }

  // line 170 "model.ump"
   public Student getObject(){
    
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "instance" + "=" + (getInstance() != null ? !getInstance().equals(this)  ? getInstance().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "student = "+(getStudent()!=null?Integer.toHexString(System.identityHashCode(getStudent())):"null");
  }
}