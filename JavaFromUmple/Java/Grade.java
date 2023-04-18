/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 81 "model.ump"
// line 263 "model.ump"
public class Grade
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Grade Attributes
  private String gradeID;
  private String grade;

  //Grade Associations
  private Course course;
  private Student student;
  private Assessment assessment;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Grade(String aGradeID, String aGrade, Course aCourse, Student aStudent, Assessment aAssessment)
  {
    gradeID = aGradeID;
    grade = aGrade;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create grade due to course. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddStudent = setStudent(aStudent);
    if (!didAddStudent)
    {
      throw new RuntimeException("Unable to create grade due to student. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    if (aAssessment == null || aAssessment.getGrade() != null)
    {
      throw new RuntimeException("Unable to create Grade due to aAssessment. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    assessment = aAssessment;
  }

  public Grade(String aGradeID, String aGrade, Course aCourse, Student aStudent, String aAssessmentIDForAssessment, String aAssessmentNameForAssessment, String aDescriptionForAssessment, Course aCourseForAssessment)
  {
    gradeID = aGradeID;
    grade = aGrade;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create grade due to course. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddStudent = setStudent(aStudent);
    if (!didAddStudent)
    {
      throw new RuntimeException("Unable to create grade due to student. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    assessment = new Assessment(aAssessmentIDForAssessment, aAssessmentNameForAssessment, aDescriptionForAssessment, aCourseForAssessment, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGradeID(String aGradeID)
  {
    boolean wasSet = false;
    gradeID = aGradeID;
    wasSet = true;
    return wasSet;
  }

  public boolean setGrade(String aGrade)
  {
    boolean wasSet = false;
    grade = aGrade;
    wasSet = true;
    return wasSet;
  }

  public String getGradeID()
  {
    return gradeID;
  }

  public String getGrade()
  {
    return grade;
  }
  /* Code from template association_GetOne */
  public Course getCourse()
  {
    return course;
  }
  /* Code from template association_GetOne */
  public Student getStudent()
  {
    return student;
  }
  /* Code from template association_GetOne */
  public Assessment getAssessment()
  {
    return assessment;
  }
  /* Code from template association_SetOneToMany */
  public boolean setCourse(Course aCourse)
  {
    boolean wasSet = false;
    if (aCourse == null)
    {
      return wasSet;
    }

    Course existingCourse = course;
    course = aCourse;
    if (existingCourse != null && !existingCourse.equals(aCourse))
    {
      existingCourse.removeGrade(this);
    }
    course.addGrade(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setStudent(Student aStudent)
  {
    boolean wasSet = false;
    if (aStudent == null)
    {
      return wasSet;
    }

    Student existingStudent = student;
    student = aStudent;
    if (existingStudent != null && !existingStudent.equals(aStudent))
    {
      existingStudent.removeGrade(this);
    }
    student.addGrade(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Course placeholderCourse = course;
    this.course = null;
    if(placeholderCourse != null)
    {
      placeholderCourse.removeGrade(this);
    }
    Student placeholderStudent = student;
    this.student = null;
    if(placeholderStudent != null)
    {
      placeholderStudent.removeGrade(this);
    }
    Assessment existingAssessment = assessment;
    assessment = null;
    if (existingAssessment != null)
    {
      existingAssessment.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "gradeID" + ":" + getGradeID()+ "," +
            "grade" + ":" + getGrade()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "course = "+(getCourse()!=null?Integer.toHexString(System.identityHashCode(getCourse())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "student = "+(getStudent()!=null?Integer.toHexString(System.identityHashCode(getStudent())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "assessment = "+(getAssessment()!=null?Integer.toHexString(System.identityHashCode(getAssessment())):"null");
  }
}