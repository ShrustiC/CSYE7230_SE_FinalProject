/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 108 "model.ump"
// line 284 "model.ump"
public class TA extends User
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TA Attributes
  private String taID;
  private String taName;

  //TA Associations
  private Course course;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TA(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact, String aTaID, String aTaName, Course aCourse)
  {
    super(aRoleID, aUserName, aPassword, aUserID, aUserType, aEmail, aStatus, aRegistrationDate, aContact);
    taID = aTaID;
    taName = aTaName;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create tA due to course. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTaID(String aTaID)
  {
    boolean wasSet = false;
    taID = aTaID;
    wasSet = true;
    return wasSet;
  }

  public boolean setTaName(String aTaName)
  {
    boolean wasSet = false;
    taName = aTaName;
    wasSet = true;
    return wasSet;
  }

  public String getTaID()
  {
    return taID;
  }

  public String getTaName()
  {
    return taName;
  }
  /* Code from template association_GetOne */
  public Course getCourse()
  {
    return course;
  }
  /* Code from template association_SetOneToMandatoryMany */
  public boolean setCourse(Course aCourse)
  {
    boolean wasSet = false;
    //Must provide course to tA
    if (aCourse == null)
    {
      return wasSet;
    }

    if (course != null && course.numberOfTAs() <= Course.minimumNumberOfTAs())
    {
      return wasSet;
    }

    Course existingCourse = course;
    course = aCourse;
    if (existingCourse != null && !existingCourse.equals(aCourse))
    {
      boolean didRemove = existingCourse.removeTA(this);
      if (!didRemove)
      {
        course = existingCourse;
        return wasSet;
      }
    }
    course.addTA(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Course placeholderCourse = course;
    this.course = null;
    if(placeholderCourse != null)
    {
      placeholderCourse.removeTA(this);
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "taID" + ":" + getTaID()+ "," +
            "taName" + ":" + getTaName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "course = "+(getCourse()!=null?Integer.toHexString(System.identityHashCode(getCourse())):"null");
  }
}