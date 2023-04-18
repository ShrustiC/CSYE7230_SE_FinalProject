/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 12 "model.ump"
// line 215 "model.ump"
public class Resource
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Resource Attributes
  private String resourceID;
  private String resourceName;
  private String description;
  private String link;
  private Enum resourceType;

  //Resource Associations
  private Course course;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Resource(String aResourceID, String aResourceName, String aDescription, String aLink, Enum aResourceType, Course aCourse)
  {
    resourceID = aResourceID;
    resourceName = aResourceName;
    description = aDescription;
    link = aLink;
    resourceType = aResourceType;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create resource due to course. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setResourceID(String aResourceID)
  {
    boolean wasSet = false;
    resourceID = aResourceID;
    wasSet = true;
    return wasSet;
  }

  public boolean setResourceName(String aResourceName)
  {
    boolean wasSet = false;
    resourceName = aResourceName;
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

  public boolean setLink(String aLink)
  {
    boolean wasSet = false;
    link = aLink;
    wasSet = true;
    return wasSet;
  }

  public boolean setResourceType(Enum aResourceType)
  {
    boolean wasSet = false;
    resourceType = aResourceType;
    wasSet = true;
    return wasSet;
  }

  public String getResourceID()
  {
    return resourceID;
  }

  public String getResourceName()
  {
    return resourceName;
  }

  public String getDescription()
  {
    return description;
  }

  public String getLink()
  {
    return link;
  }

  public Enum getResourceType()
  {
    return resourceType;
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
    //Must provide course to resource
    if (aCourse == null)
    {
      return wasSet;
    }

    if (course != null && course.numberOfResources() <= Course.minimumNumberOfResources())
    {
      return wasSet;
    }

    Course existingCourse = course;
    course = aCourse;
    if (existingCourse != null && !existingCourse.equals(aCourse))
    {
      boolean didRemove = existingCourse.removeResource(this);
      if (!didRemove)
      {
        course = existingCourse;
        return wasSet;
      }
    }
    course.addResource(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Course placeholderCourse = course;
    this.course = null;
    if(placeholderCourse != null)
    {
      placeholderCourse.removeResource(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "resourceID" + ":" + getResourceID()+ "," +
            "resourceName" + ":" + getResourceName()+ "," +
            "description" + ":" + getDescription()+ "," +
            "link" + ":" + getLink()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "resourceType" + "=" + (getResourceType() != null ? !getResourceType().equals(this)  ? getResourceType().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "course = "+(getCourse()!=null?Integer.toHexString(System.identityHashCode(getCourse())):"null");
  }
}