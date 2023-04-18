/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 40 "model.ump"
// line 234 "model.ump"
public class Assessment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Assessment Attributes
  private String assessmentID;
  private String assessmentName;
  private String description;

  //Assessment Associations
  private Course course;
  private Grade grade;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Assessment(String aAssessmentID, String aAssessmentName, String aDescription, Course aCourse, Grade aGrade)
  {
    assessmentID = aAssessmentID;
    assessmentName = aAssessmentName;
    description = aDescription;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create assessment due to course. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    if (aGrade == null || aGrade.getAssessment() != null)
    {
      throw new RuntimeException("Unable to create Assessment due to aGrade. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    grade = aGrade;
  }

  public Assessment(String aAssessmentID, String aAssessmentName, String aDescription, Course aCourse, String aGradeIDForGrade, String aGradeForGrade, Course aCourseForGrade, Student aStudentForGrade)
  {
    assessmentID = aAssessmentID;
    assessmentName = aAssessmentName;
    description = aDescription;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create assessment due to course. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    grade = new Grade(aGradeIDForGrade, aGradeForGrade, aCourseForGrade, aStudentForGrade, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAssessmentID(String aAssessmentID)
  {
    boolean wasSet = false;
    assessmentID = aAssessmentID;
    wasSet = true;
    return wasSet;
  }

  public boolean setAssessmentName(String aAssessmentName)
  {
    boolean wasSet = false;
    assessmentName = aAssessmentName;
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

  public String getAssessmentID()
  {
    return assessmentID;
  }

  public String getAssessmentName()
  {
    return assessmentName;
  }

  public String getDescription()
  {
    return description;
  }
  /* Code from template association_GetOne */
  public Course getCourse()
  {
    return course;
  }
  /* Code from template association_GetOne */
  public Grade getGrade()
  {
    return grade;
  }
  /* Code from template association_SetOneToMandatoryMany */
  public boolean setCourse(Course aCourse)
  {
    boolean wasSet = false;
    //Must provide course to assessment
    if (aCourse == null)
    {
      return wasSet;
    }

    if (course != null && course.numberOfAssessments() <= Course.minimumNumberOfAssessments())
    {
      return wasSet;
    }

    Course existingCourse = course;
    course = aCourse;
    if (existingCourse != null && !existingCourse.equals(aCourse))
    {
      boolean didRemove = existingCourse.removeAssessment(this);
      if (!didRemove)
      {
        course = existingCourse;
        return wasSet;
      }
    }
    course.addAssessment(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Course placeholderCourse = course;
    this.course = null;
    if(placeholderCourse != null)
    {
      placeholderCourse.removeAssessment(this);
    }
    Grade existingGrade = grade;
    grade = null;
    if (existingGrade != null)
    {
      existingGrade.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "assessmentID" + ":" + getAssessmentID()+ "," +
            "assessmentName" + ":" + getAssessmentName()+ "," +
            "description" + ":" + getDescription()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "course = "+(getCourse()!=null?Integer.toHexString(System.identityHashCode(getCourse())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "grade = "+(getGrade()!=null?Integer.toHexString(System.identityHashCode(getGrade())):"null");
  }
}