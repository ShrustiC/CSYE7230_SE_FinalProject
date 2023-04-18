/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 174 "model.ump"
// line 325 "model.ump"
public class Role
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Role Attributes
  private String roleID;
  private String userName;
  private String password;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Role(String aRoleID, String aUserName, String aPassword)
  {
    roleID = aRoleID;
    userName = aUserName;
    password = aPassword;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRoleID(String aRoleID)
  {
    boolean wasSet = false;
    roleID = aRoleID;
    wasSet = true;
    return wasSet;
  }

  public boolean setUserName(String aUserName)
  {
    boolean wasSet = false;
    userName = aUserName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public String getRoleID()
  {
    return roleID;
  }

  public String getUserName()
  {
    return userName;
  }

  public String getPassword()
  {
    return password;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "roleID" + ":" + getRoleID()+ "," +
            "userName" + ":" + getUserName()+ "," +
            "password" + ":" + getPassword()+ "]";
  }
}