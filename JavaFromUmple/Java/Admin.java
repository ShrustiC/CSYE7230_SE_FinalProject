/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 149 "model.ump"
// line 308 "model.ump"
public class Admin extends Role
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Admin Attributes
  private String adminID;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Admin(String aRoleID, String aUserName, String aPassword, String aAdminID)
  {
    super(aRoleID, aUserName, aPassword);
    adminID = aAdminID;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAdminID(String aAdminID)
  {
    boolean wasSet = false;
    adminID = aAdminID;
    wasSet = true;
    return wasSet;
  }

  public String getAdminID()
  {
    return adminID;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "adminID" + ":" + getAdminID()+ "]";
  }
}