/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 50 "model.ump"
// line 241 "model.ump"
public class CourseSingletonFactory
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseSingletonFactory Attributes
  private CourseSingletonFactory instance;

  //CourseSingletonFactory Associations
  private Course course;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseSingletonFactory(CourseSingletonFactory aInstance, Course aCourse)
  {
    instance = aInstance;
    if (aCourse == null || aCourse.getCourseSingletonFactory() != null)
    {
      throw new RuntimeException("Unable to create CourseSingletonFactory due to aCourse. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    course = aCourse;
  }

  public CourseSingletonFactory(CourseSingletonFactory aInstance, String aCourseIDForCourse, String aCourseNameForCourse, int aLevelForCourse, String aDescriptionForCourse, double aPriceForCourse, School aSchoolForCourse, Instructor aInstructorForCourse)
  {
    instance = aInstance;
    course = new Course(aCourseIDForCourse, aCourseNameForCourse, aLevelForCourse, aDescriptionForCourse, aPriceForCourse, this, aSchoolForCourse, aInstructorForCourse);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setInstance(CourseSingletonFactory aInstance)
  {
    boolean wasSet = false;
    instance = aInstance;
    wasSet = true;
    return wasSet;
  }

  public CourseSingletonFactory getInstance()
  {
    return instance;
  }
  /* Code from template association_GetOne */
  public Course getCourse()
  {
    return course;
  }

  public void delete()
  {
    Course existingCourse = course;
    course = null;
    if (existingCourse != null)
    {
      existingCourse.delete();
    }
  }

  // line 55 "model.ump"
   public Course getObject(){
    
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "instance" + "=" + (getInstance() != null ? !getInstance().equals(this)  ? getInstance().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "course = "+(getCourse()!=null?Integer.toHexString(System.identityHashCode(getCourse())):"null");
  }
}