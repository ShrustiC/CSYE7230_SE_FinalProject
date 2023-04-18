/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 23 "model.ump"
// line 221 "model.ump"
public class School
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //School Attributes
  private String schoolID;
  private String schoolName;

  //School Associations
  private List<Course> courses;
  private List<Student> students;
  private List<Instructor> instructors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public School(String aSchoolID, String aSchoolName)
  {
    schoolID = aSchoolID;
    schoolName = aSchoolName;
    courses = new ArrayList<Course>();
    students = new ArrayList<Student>();
    instructors = new ArrayList<Instructor>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSchoolID(String aSchoolID)
  {
    boolean wasSet = false;
    schoolID = aSchoolID;
    wasSet = true;
    return wasSet;
  }

  public boolean setSchoolName(String aSchoolName)
  {
    boolean wasSet = false;
    schoolName = aSchoolName;
    wasSet = true;
    return wasSet;
  }

  public String getSchoolID()
  {
    return schoolID;
  }

  public String getSchoolName()
  {
    return schoolName;
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
  /* Code from template association_GetMany */
  public Student getStudent(int index)
  {
    Student aStudent = students.get(index);
    return aStudent;
  }

  public List<Student> getStudents()
  {
    List<Student> newStudents = Collections.unmodifiableList(students);
    return newStudents;
  }

  public int numberOfStudents()
  {
    int number = students.size();
    return number;
  }

  public boolean hasStudents()
  {
    boolean has = students.size() > 0;
    return has;
  }

  public int indexOfStudent(Student aStudent)
  {
    int index = students.indexOf(aStudent);
    return index;
  }
  /* Code from template association_GetMany */
  public Instructor getInstructor(int index)
  {
    Instructor aInstructor = instructors.get(index);
    return aInstructor;
  }

  public List<Instructor> getInstructors()
  {
    List<Instructor> newInstructors = Collections.unmodifiableList(instructors);
    return newInstructors;
  }

  public int numberOfInstructors()
  {
    int number = instructors.size();
    return number;
  }

  public boolean hasInstructors()
  {
    boolean has = instructors.size() > 0;
    return has;
  }

  public int indexOfInstructor(Instructor aInstructor)
  {
    int index = instructors.indexOf(aInstructor);
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
  /* Code from template association_AddMandatoryManyToOne */
  public Course addCourse(String aCourseID, String aCourseName, int aLevel, String aDescription, double aPrice, CourseSingletonFactory aCourseSingletonFactory, Instructor aInstructor)
  {
    Course aNewCourse = new Course(aCourseID, aCourseName, aLevel, aDescription, aPrice, aCourseSingletonFactory, this, aInstructor);
    return aNewCourse;
  }

  public boolean addCourse(Course aCourse)
  {
    boolean wasAdded = false;
    if (courses.contains(aCourse)) { return false; }
    School existingSchool = aCourse.getSchool();
    boolean isNewSchool = existingSchool != null && !this.equals(existingSchool);

    if (isNewSchool && existingSchool.numberOfCourses() <= minimumNumberOfCourses())
    {
      return wasAdded;
    }
    if (isNewSchool)
    {
      aCourse.setSchool(this);
    }
    else
    {
      courses.add(aCourse);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCourse(Course aCourse)
  {
    boolean wasRemoved = false;
    //Unable to remove aCourse, as it must always have a school
    if (this.equals(aCourse.getSchool()))
    {
      return wasRemoved;
    }

    //school already at minimum (1)
    if (numberOfCourses() <= minimumNumberOfCourses())
    {
      return wasRemoved;
    }

    courses.remove(aCourse);
    wasRemoved = true;
    return wasRemoved;
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudents()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Student addStudent(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact, String aStudentID, String aStudentName, String aUniversity, String aMajor, List aEnrolledCourses, List aCompleteCourses, StudentSingletonFactory aStudentSingletonFactory)
  {
    return new Student(aRoleID, aUserName, aPassword, aUserID, aUserType, aEmail, aStatus, aRegistrationDate, aContact, aStudentID, aStudentName, aUniversity, aMajor, aEnrolledCourses, aCompleteCourses, this, aStudentSingletonFactory);
  }

  public boolean addStudent(Student aStudent)
  {
    boolean wasAdded = false;
    if (students.contains(aStudent)) { return false; }
    School existingSchool = aStudent.getSchool();
    boolean isNewSchool = existingSchool != null && !this.equals(existingSchool);
    if (isNewSchool)
    {
      aStudent.setSchool(this);
    }
    else
    {
      students.add(aStudent);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStudent(Student aStudent)
  {
    boolean wasRemoved = false;
    //Unable to remove aStudent, as it must always have a school
    if (!this.equals(aStudent.getSchool()))
    {
      students.remove(aStudent);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudentAt(Student aStudent, int index)
  {  
    boolean wasAdded = false;
    if(addStudent(aStudent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudents()) { index = numberOfStudents() - 1; }
      students.remove(aStudent);
      students.add(index, aStudent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudentAt(Student aStudent, int index)
  {
    boolean wasAdded = false;
    if(students.contains(aStudent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudents()) { index = numberOfStudents() - 1; }
      students.remove(aStudent);
      students.add(index, aStudent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudentAt(aStudent, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfInstructors()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Instructor addInstructor(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact, String aInstructorID, String aInstructorName)
  {
    return new Instructor(aRoleID, aUserName, aPassword, aUserID, aUserType, aEmail, aStatus, aRegistrationDate, aContact, aInstructorID, aInstructorName, this);
  }

  public boolean addInstructor(Instructor aInstructor)
  {
    boolean wasAdded = false;
    if (instructors.contains(aInstructor)) { return false; }
    School existingSchool = aInstructor.getSchool();
    boolean isNewSchool = existingSchool != null && !this.equals(existingSchool);
    if (isNewSchool)
    {
      aInstructor.setSchool(this);
    }
    else
    {
      instructors.add(aInstructor);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeInstructor(Instructor aInstructor)
  {
    boolean wasRemoved = false;
    //Unable to remove aInstructor, as it must always have a school
    if (!this.equals(aInstructor.getSchool()))
    {
      instructors.remove(aInstructor);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addInstructorAt(Instructor aInstructor, int index)
  {  
    boolean wasAdded = false;
    if(addInstructor(aInstructor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInstructors()) { index = numberOfInstructors() - 1; }
      instructors.remove(aInstructor);
      instructors.add(index, aInstructor);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveInstructorAt(Instructor aInstructor, int index)
  {
    boolean wasAdded = false;
    if(instructors.contains(aInstructor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInstructors()) { index = numberOfInstructors() - 1; }
      instructors.remove(aInstructor);
      instructors.add(index, aInstructor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addInstructorAt(aInstructor, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=courses.size(); i > 0; i--)
    {
      Course aCourse = courses.get(i - 1);
      aCourse.delete();
    }
    for(int i=students.size(); i > 0; i--)
    {
      Student aStudent = students.get(i - 1);
      aStudent.delete();
    }
    for(int i=instructors.size(); i > 0; i--)
    {
      Instructor aInstructor = instructors.get(i - 1);
      aInstructor.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "schoolID" + ":" + getSchoolID()+ "," +
            "schoolName" + ":" + getSchoolName()+ "]";
  }
}