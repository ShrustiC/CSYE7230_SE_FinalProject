/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 74 "model.ump"
// line 258 "model.ump"
public class Recruiter extends User
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Recruiter Attributes
  private String recruiterID;
  private String recruiterName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Recruiter(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact, String aRecruiterID, String aRecruiterName)
  {
    super(aRoleID, aUserName, aPassword, aUserID, aUserType, aEmail, aStatus, aRegistrationDate, aContact);
    recruiterID = aRecruiterID;
    recruiterName = aRecruiterName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRecruiterID(String aRecruiterID)
  {
    boolean wasSet = false;
    recruiterID = aRecruiterID;
    wasSet = true;
    return wasSet;
  }

  public boolean setRecruiterName(String aRecruiterName)
  {
    boolean wasSet = false;
    recruiterName = aRecruiterName;
    wasSet = true;
    return wasSet;
  }

  public String getRecruiterID()
  {
    return recruiterID;
  }

  public String getRecruiterName()
  {
    return recruiterName;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "recruiterID" + ":" + getRecruiterID()+ "," +
            "recruiterName" + ":" + getRecruiterName()+ "]";
  }
}