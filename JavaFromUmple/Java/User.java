/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 129 "model.ump"
// line 297 "model.ump"
public class User extends Role
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //User Attributes
  private String userID;
  private Enum userType;
  private String email;
  private int status;
  private DateTime registrationDate;
  private String contact;

  //User Associations
  private List<Event> events;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public User(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact)
  {
    super(aRoleID, aUserName, aPassword);
    userID = aUserID;
    userType = aUserType;
    email = aEmail;
    status = aStatus;
    registrationDate = aRegistrationDate;
    contact = aContact;
    events = new ArrayList<Event>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUserID(String aUserID)
  {
    boolean wasSet = false;
    userID = aUserID;
    wasSet = true;
    return wasSet;
  }

  public boolean setUserType(Enum aUserType)
  {
    boolean wasSet = false;
    userType = aUserType;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmail(String aEmail)
  {
    boolean wasSet = false;
    email = aEmail;
    wasSet = true;
    return wasSet;
  }

  public boolean setStatus(int aStatus)
  {
    boolean wasSet = false;
    status = aStatus;
    wasSet = true;
    return wasSet;
  }

  public boolean setRegistrationDate(DateTime aRegistrationDate)
  {
    boolean wasSet = false;
    registrationDate = aRegistrationDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setContact(String aContact)
  {
    boolean wasSet = false;
    contact = aContact;
    wasSet = true;
    return wasSet;
  }

  public String getUserID()
  {
    return userID;
  }

  public Enum getUserType()
  {
    return userType;
  }

  public String getEmail()
  {
    return email;
  }

  public int getStatus()
  {
    return status;
  }

  public DateTime getRegistrationDate()
  {
    return registrationDate;
  }

  public String getContact()
  {
    return contact;
  }
  /* Code from template association_GetMany */
  public Event getEvent(int index)
  {
    Event aEvent = events.get(index);
    return aEvent;
  }

  public List<Event> getEvents()
  {
    List<Event> newEvents = Collections.unmodifiableList(events);
    return newEvents;
  }

  public int numberOfEvents()
  {
    int number = events.size();
    return number;
  }

  public boolean hasEvents()
  {
    boolean has = events.size() > 0;
    return has;
  }

  public int indexOfEvent(Event aEvent)
  {
    int index = events.indexOf(aEvent);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEvents()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addEvent(Event aEvent)
  {
    boolean wasAdded = false;
    if (events.contains(aEvent)) { return false; }
    events.add(aEvent);
    if (aEvent.indexOfUser(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aEvent.addUser(this);
      if (!wasAdded)
      {
        events.remove(aEvent);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeEvent(Event aEvent)
  {
    boolean wasRemoved = false;
    if (!events.contains(aEvent))
    {
      return wasRemoved;
    }

    int oldIndex = events.indexOf(aEvent);
    events.remove(oldIndex);
    if (aEvent.indexOfUser(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aEvent.removeUser(this);
      if (!wasRemoved)
      {
        events.add(oldIndex,aEvent);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEventAt(Event aEvent, int index)
  {  
    boolean wasAdded = false;
    if(addEvent(aEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEvents()) { index = numberOfEvents() - 1; }
      events.remove(aEvent);
      events.add(index, aEvent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEventAt(Event aEvent, int index)
  {
    boolean wasAdded = false;
    if(events.contains(aEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEvents()) { index = numberOfEvents() - 1; }
      events.remove(aEvent);
      events.add(index, aEvent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEventAt(aEvent, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Event> copyOfEvents = new ArrayList<Event>(events);
    events.clear();
    for(Event aEvent : copyOfEvents)
    {
      aEvent.removeUser(this);
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "userID" + ":" + getUserID()+ "," +
            "email" + ":" + getEmail()+ "," +
            "status" + ":" + getStatus()+ "," +
            "contact" + ":" + getContact()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "userType" + "=" + (getUserType() != null ? !getUserType().equals(this)  ? getUserType().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "registrationDate" + "=" + (getRegistrationDate() != null ? !getRegistrationDate().equals(this)  ? getRegistrationDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}