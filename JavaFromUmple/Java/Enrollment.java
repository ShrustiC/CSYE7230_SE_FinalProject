/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.sql.Date;

// line 90 "model.ump"
// line 270 "model.ump"
public class Enrollment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Enrollment Attributes
  private String enrollmentID;
  private Date enrolledOn;

  //Enrollment Associations
  private Course course;
  private Student student;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Enrollment(String aEnrollmentID, Date aEnrolledOn, Course aCourse, Student aStudent)
  {
    enrollmentID = aEnrollmentID;
    enrolledOn = aEnrolledOn;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create enrollment due to course. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddStudent = setStudent(aStudent);
    if (!didAddStudent)
    {
      throw new RuntimeException("Unable to create enrollment due to student. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setEnrollmentID(String aEnrollmentID)
  {
    boolean wasSet = false;
    enrollmentID = aEnrollmentID;
    wasSet = true;
    return wasSet;
  }

  public boolean setEnrolledOn(Date aEnrolledOn)
  {
    boolean wasSet = false;
    enrolledOn = aEnrolledOn;
    wasSet = true;
    return wasSet;
  }

  public String getEnrollmentID()
  {
    return enrollmentID;
  }

  public Date getEnrolledOn()
  {
    return enrolledOn;
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
      existingCourse.removeEnrollment(this);
    }
    course.addEnrollment(this);
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
      existingStudent.removeEnrollment(this);
    }
    student.addEnrollment(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Course placeholderCourse = course;
    this.course = null;
    if(placeholderCourse != null)
    {
      placeholderCourse.removeEnrollment(this);
    }
    Student placeholderStudent = student;
    this.student = null;
    if(placeholderStudent != null)
    {
      placeholderStudent.removeEnrollment(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "enrollmentID" + ":" + getEnrollmentID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "enrolledOn" + "=" + (getEnrolledOn() != null ? !getEnrolledOn().equals(this)  ? getEnrolledOn().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "course = "+(getCourse()!=null?Integer.toHexString(System.identityHashCode(getCourse())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "student = "+(getStudent()!=null?Integer.toHexString(System.identityHashCode(getStudent())):"null");
  }
}