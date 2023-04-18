/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 32 "model.ump"
// line 228 "model.ump"
public class Domain
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Domain Attributes
  private String domainID;
  private String domainName;
  private String description;

  //Domain Associations
  private List<Course> courses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Domain(String aDomainID, String aDomainName, String aDescription)
  {
    domainID = aDomainID;
    domainName = aDomainName;
    description = aDescription;
    courses = new ArrayList<Course>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDomainID(String aDomainID)
  {
    boolean wasSet = false;
    domainID = aDomainID;
    wasSet = true;
    return wasSet;
  }

  public boolean setDomainName(String aDomainName)
  {
    boolean wasSet = false;
    domainName = aDomainName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public String getDomainID()
  {
    return domainID;
  }

  public String getDomainName()
  {
    return domainName;
  }

  public String getDescription()
  {
    return description;
  }
  /* Code from template association_GetMany */
  public Course getCourse(int index)
  {
    Course aCourse = courses.get(index);
    return aCourse;
  }

  public List<Course> getCourses()
  {
    List<Course> newCourses = Collections.unmodifiableList(courses);
    return newCourses;
  }

  public int numberOfCourses()
  {
    int number = courses.size();
    return number;
  }

  public boolean hasCourses()
  {
    boolean has = courses.size() > 0;
    return has;
  }

  public int indexOfCourse(Course aCourse)
  {
    int index = courses.indexOf(aCourse);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfCoursesValid()
  {
    boolean isValid = numberOfCourses() >= minimumNumberOfCourses();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCourses()
  {
    return 1;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCourse(Course aCourse)
  {
    boolean wasAdded = false;
    if (courses.contains(aCourse)) { return false; }
    courses.add(aCourse);
    if (aCourse.indexOfDomain(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCourse.addDomain(this);
      if (!wasAdded)
      {
        courses.remove(aCourse);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMStarToMany */
  public boolean removeCourse(Course aCourse)
  {
    boolean wasRemoved = false;
    if (!courses.contains(aCourse))
    {
      return wasRemoved;
    }

    if (numberOfCourses() <= minimumNumberOfCourses())
    {
      return wasRemoved;
    }

    int oldIndex = courses.indexOf(aCourse);
    courses.remove(oldIndex);
    if (aCourse.indexOfDomain(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCourse.removeDomain(this);
      if (!wasRemoved)
      {
        courses.add(oldIndex,aCourse);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMStarToMany */
  public boolean setCourses(Course... newCourses)
  {
    boolean wasSet = false;
    ArrayList<Course> verifiedCourses = new ArrayList<Course>();
    for (Course aCourse : newCourses)
    {
      if (verifiedCourses.contains(aCourse))
      {
        continue;
      }
      verifiedCourses.add(aCourse);
    }

    if (verifiedCourses.size() != newCourses.length || verifiedCourses.size() < minimumNumberOfCourses())
    {
      return wasSet;
    }

    ArrayList<Course> oldCourses = new ArrayList<Course>(courses);
    courses.clear();
    for (Course aNewCourse : verifiedCourses)
    {
      courses.add(aNewCourse);
      if (oldCourses.contains(aNewCourse))
      {
        oldCourses.remove(aNewCourse);
      }
      else
      {
        aNewCourse.addDomain(this);
      }
    }

    for (Course anOldCourse : oldCourses)
    {
      anOldCourse.removeDomain(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCourseAt(Course aCourse, int index)
  {  
    boolean wasAdded = false;
    if(addCourse(aCourse))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCourses()) { index = numberOfCourses() - 1; }
      courses.remove(aCourse);
      courses.add(index, aCourse);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCourseAt(Course aCourse, int index)
  {
    boolean wasAdded = false;
    if(courses.contains(aCourse))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCourses()) { index = numberOfCourses() - 1; }
      courses.remove(aCourse);
      courses.add(index, aCourse);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCourseAt(aCourse, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Course> copyOfCourses = new ArrayList<Course>(courses);
    courses.clear();
    for(Course aCourse : copyOfCourses)
    {
      if (aCourse.numberOfDomains() <= Course.minimumNumberOfDomains())
      {
        aCourse.delete();
      }
      else
      {
        aCourse.removeDomain(this);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "domainID" + ":" + getDomainID()+ "," +
            "domainName" + ":" + getDomainName()+ "," +
            "description" + ":" + getDescription()+ "]";
  }
}