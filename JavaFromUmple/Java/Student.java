/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;
import java.sql.Date;

// line 155 "model.ump"
// line 313 "model.ump"
public class Student extends User
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Student Attributes
  private String studentID;
  private String studentName;
  private String university;
  private String major;
  private List enrolledCourses;
  private List completeCourses;

  //Student Associations
  private School school;
  private List<Grade> grades;
  private List<Enrollment> enrollments;
  private List<Certificate> certificates;
  private StudentSingletonFactory studentSingletonFactory;
  private List<PaymentAPI> paymentAPIs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Student(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact, String aStudentID, String aStudentName, String aUniversity, String aMajor, List aEnrolledCourses, List aCompleteCourses, School aSchool, StudentSingletonFactory aStudentSingletonFactory)
  {
    super(aRoleID, aUserName, aPassword, aUserID, aUserType, aEmail, aStatus, aRegistrationDate, aContact);
    studentID = aStudentID;
    studentName = aStudentName;
    university = aUniversity;
    major = aMajor;
    enrolledCourses = aEnrolledCourses;
    completeCourses = aCompleteCourses;
    boolean didAddSchool = setSchool(aSchool);
    if (!didAddSchool)
    {
      throw new RuntimeException("Unable to create student due to school. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    grades = new ArrayList<Grade>();
    enrollments = new ArrayList<Enrollment>();
    certificates = new ArrayList<Certificate>();
    if (aStudentSingletonFactory == null || aStudentSingletonFactory.getStudent() != null)
    {
      throw new RuntimeException("Unable to create Student due to aStudentSingletonFactory. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    studentSingletonFactory = aStudentSingletonFactory;
    paymentAPIs = new ArrayList<PaymentAPI>();
  }

  public Student(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact, String aStudentID, String aStudentName, String aUniversity, String aMajor, List aEnrolledCourses, List aCompleteCourses, School aSchool, StudentSingletonFactory aInstanceForStudentSingletonFactory)
  {
    super(aRoleID, aUserName, aPassword, aUserID, aUserType, aEmail, aStatus, aRegistrationDate, aContact);
    studentID = aStudentID;
    studentName = aStudentName;
    university = aUniversity;
    major = aMajor;
    enrolledCourses = aEnrolledCourses;
    completeCourses = aCompleteCourses;
    boolean didAddSchool = setSchool(aSchool);
    if (!didAddSchool)
    {
      throw new RuntimeException("Unable to create student due to school. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    grades = new ArrayList<Grade>();
    enrollments = new ArrayList<Enrollment>();
    certificates = new ArrayList<Certificate>();
    studentSingletonFactory = new StudentSingletonFactory(aInstanceForStudentSingletonFactory, this);
    paymentAPIs = new ArrayList<PaymentAPI>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStudentID(String aStudentID)
  {
    boolean wasSet = false;
    studentID = aStudentID;
    wasSet = true;
    return wasSet;
  }

  public boolean setStudentName(String aStudentName)
  {
    boolean wasSet = false;
    studentName = aStudentName;
    wasSet = true;
    return wasSet;
  }

  public boolean setUniversity(String aUniversity)
  {
    boolean wasSet = false;
    university = aUniversity;
    wasSet = true;
    return wasSet;
  }

  public boolean setMajor(String aMajor)
  {
    boolean wasSet = false;
    major = aMajor;
    wasSet = true;
    return wasSet;
  }

  public boolean setEnrolledCourses(List aEnrolledCourses)
  {
    boolean wasSet = false;
    enrolledCourses = aEnrolledCourses;
    wasSet = true;
    return wasSet;
  }

  public boolean setCompleteCourses(List aCompleteCourses)
  {
    boolean wasSet = false;
    completeCourses = aCompleteCourses;
    wasSet = true;
    return wasSet;
  }

  public String getStudentID()
  {
    return studentID;
  }

  public String getStudentName()
  {
    return studentName;
  }

  public String getUniversity()
  {
    return university;
  }

  public String getMajor()
  {
    return major;
  }

  public List getEnrolledCourses()
  {
    return enrolledCourses;
  }

  public List getCompleteCourses()
  {
    return completeCourses;
  }
  /* Code from template association_GetOne */
  public School getSchool()
  {
    return school;
  }
  /* Code from template association_GetMany */
  public Grade getGrade(int index)
  {
    Grade aGrade = grades.get(index);
    return aGrade;
  }

  public List<Grade> getGrades()
  {
    List<Grade> newGrades = Collections.unmodifiableList(grades);
    return newGrades;
  }

  public int numberOfGrades()
  {
    int number = grades.size();
    return number;
  }

  public boolean hasGrades()
  {
    boolean has = grades.size() > 0;
    return has;
  }

  public int indexOfGrade(Grade aGrade)
  {
    int index = grades.indexOf(aGrade);
    return index;
  }
  /* Code from template association_GetMany */
  public Enrollment getEnrollment(int index)
  {
    Enrollment aEnrollment = enrollments.get(index);
    return aEnrollment;
  }

  public List<Enrollment> getEnrollments()
  {
    List<Enrollment> newEnrollments = Collections.unmodifiableList(enrollments);
    return newEnrollments;
  }

  public int numberOfEnrollments()
  {
    int number = enrollments.size();
    return number;
  }

  public boolean hasEnrollments()
  {
    boolean has = enrollments.size() > 0;
    return has;
  }

  public int indexOfEnrollment(Enrollment aEnrollment)
  {
    int index = enrollments.indexOf(aEnrollment);
    return index;
  }
  /* Code from template association_GetMany */
  public Certificate getCertificate(int index)
  {
    Certificate aCertificate = certificates.get(index);
    return aCertificate;
  }

  public List<Certificate> getCertificates()
  {
    List<Certificate> newCertificates = Collections.unmodifiableList(certificates);
    return newCertificates;
  }

  public int numberOfCertificates()
  {
    int number = certificates.size();
    return number;
  }

  public boolean hasCertificates()
  {
    boolean has = certificates.size() > 0;
    return has;
  }

  public int indexOfCertificate(Certificate aCertificate)
  {
    int index = certificates.indexOf(aCertificate);
    return index;
  }
  /* Code from template association_GetOne */
  public StudentSingletonFactory getStudentSingletonFactory()
  {
    return studentSingletonFactory;
  }
  /* Code from template association_GetMany */
  public PaymentAPI getPaymentAPI(int index)
  {
    PaymentAPI aPaymentAPI = paymentAPIs.get(index);
    return aPaymentAPI;
  }

  public List<PaymentAPI> getPaymentAPIs()
  {
    List<PaymentAPI> newPaymentAPIs = Collections.unmodifiableList(paymentAPIs);
    return newPaymentAPIs;
  }

  public int numberOfPaymentAPIs()
  {
    int number = paymentAPIs.size();
    return number;
  }

  public boolean hasPaymentAPIs()
  {
    boolean has = paymentAPIs.size() > 0;
    return has;
  }

  public int indexOfPaymentAPI(PaymentAPI aPaymentAPI)
  {
    int index = paymentAPIs.indexOf(aPaymentAPI);
    return index;
  }
  /* Code from template association_SetOneToMany */
  public boolean setSchool(School aSchool)
  {
    boolean wasSet = false;
    if (aSchool == null)
    {
      return wasSet;
    }

    School existingSchool = school;
    school = aSchool;
    if (existingSchool != null && !existingSchool.equals(aSchool))
    {
      existingSchool.removeStudent(this);
    }
    school.addStudent(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGrades()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Grade addGrade(String aGradeID, String aGrade, Course aCourse, Assessment aAssessment)
  {
    return new Grade(aGradeID, aGrade, aCourse, this, aAssessment);
  }

  public boolean addGrade(Grade aGrade)
  {
    boolean wasAdded = false;
    if (grades.contains(aGrade)) { return false; }
    Student existingStudent = aGrade.getStudent();
    boolean isNewStudent = existingStudent != null && !this.equals(existingStudent);
    if (isNewStudent)
    {
      aGrade.setStudent(this);
    }
    else
    {
      grades.add(aGrade);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGrade(Grade aGrade)
  {
    boolean wasRemoved = false;
    //Unable to remove aGrade, as it must always have a student
    if (!this.equals(aGrade.getStudent()))
    {
      grades.remove(aGrade);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGradeAt(Grade aGrade, int index)
  {  
    boolean wasAdded = false;
    if(addGrade(aGrade))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGrades()) { index = numberOfGrades() - 1; }
      grades.remove(aGrade);
      grades.add(index, aGrade);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGradeAt(Grade aGrade, int index)
  {
    boolean wasAdded = false;
    if(grades.contains(aGrade))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGrades()) { index = numberOfGrades() - 1; }
      grades.remove(aGrade);
      grades.add(index, aGrade);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGradeAt(aGrade, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEnrollments()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Enrollment addEnrollment(String aEnrollmentID, Date aEnrolledOn, Course aCourse)
  {
    return new Enrollment(aEnrollmentID, aEnrolledOn, aCourse, this);
  }

  public boolean addEnrollment(Enrollment aEnrollment)
  {
    boolean wasAdded = false;
    if (enrollments.contains(aEnrollment)) { return false; }
    Student existingStudent = aEnrollment.getStudent();
    boolean isNewStudent = existingStudent != null && !this.equals(existingStudent);
    if (isNewStudent)
    {
      aEnrollment.setStudent(this);
    }
    else
    {
      enrollments.add(aEnrollment);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEnrollment(Enrollment aEnrollment)
  {
    boolean wasRemoved = false;
    //Unable to remove aEnrollment, as it must always have a student
    if (!this.equals(aEnrollment.getStudent()))
    {
      enrollments.remove(aEnrollment);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEnrollmentAt(Enrollment aEnrollment, int index)
  {  
    boolean wasAdded = false;
    if(addEnrollment(aEnrollment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnrollments()) { index = numberOfEnrollments() - 1; }
      enrollments.remove(aEnrollment);
      enrollments.add(index, aEnrollment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEnrollmentAt(Enrollment aEnrollment, int index)
  {
    boolean wasAdded = false;
    if(enrollments.contains(aEnrollment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnrollments()) { index = numberOfEnrollments() - 1; }
      enrollments.remove(aEnrollment);
      enrollments.add(index, aEnrollment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEnrollmentAt(aEnrollment, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCertificates()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Certificate addCertificate(String aCertificateID, String aCertificateName, DateTime aIssueDate)
  {
    return new Certificate(aCertificateID, aCertificateName, aIssueDate, this);
  }

  public boolean addCertificate(Certificate aCertificate)
  {
    boolean wasAdded = false;
    if (certificates.contains(aCertificate)) { return false; }
    Student existingStudent = aCertificate.getStudent();
    boolean isNewStudent = existingStudent != null && !this.equals(existingStudent);
    if (isNewStudent)
    {
      aCertificate.setStudent(this);
    }
    else
    {
      certificates.add(aCertificate);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCertificate(Certificate aCertificate)
  {
    boolean wasRemoved = false;
    //Unable to remove aCertificate, as it must always have a student
    if (!this.equals(aCertificate.getStudent()))
    {
      certificates.remove(aCertificate);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCertificateAt(Certificate aCertificate, int index)
  {  
    boolean wasAdded = false;
    if(addCertificate(aCertificate))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCertificates()) { index = numberOfCertificates() - 1; }
      certificates.remove(aCertificate);
      certificates.add(index, aCertificate);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCertificateAt(Certificate aCertificate, int index)
  {
    boolean wasAdded = false;
    if(certificates.contains(aCertificate))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCertificates()) { index = numberOfCertificates() - 1; }
      certificates.remove(aCertificate);
      certificates.add(index, aCertificate);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCertificateAt(aCertificate, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPaymentAPIs()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PaymentAPI addPaymentAPI(String aPaymentID, DateTime aPaymentDate, double aAmount)
  {
    return new PaymentAPI(aPaymentID, aPaymentDate, aAmount, this);
  }

  public boolean addPaymentAPI(PaymentAPI aPaymentAPI)
  {
    boolean wasAdded = false;
    if (paymentAPIs.contains(aPaymentAPI)) { return false; }
    Student existingStudent = aPaymentAPI.getStudent();
    boolean isNewStudent = existingStudent != null && !this.equals(existingStudent);
    if (isNewStudent)
    {
      aPaymentAPI.setStudent(this);
    }
    else
    {
      paymentAPIs.add(aPaymentAPI);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePaymentAPI(PaymentAPI aPaymentAPI)
  {
    boolean wasRemoved = false;
    //Unable to remove aPaymentAPI, as it must always have a student
    if (!this.equals(aPaymentAPI.getStudent()))
    {
      paymentAPIs.remove(aPaymentAPI);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPaymentAPIAt(PaymentAPI aPaymentAPI, int index)
  {  
    boolean wasAdded = false;
    if(addPaymentAPI(aPaymentAPI))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPaymentAPIs()) { index = numberOfPaymentAPIs() - 1; }
      paymentAPIs.remove(aPaymentAPI);
      paymentAPIs.add(index, aPaymentAPI);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePaymentAPIAt(PaymentAPI aPaymentAPI, int index)
  {
    boolean wasAdded = false;
    if(paymentAPIs.contains(aPaymentAPI))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPaymentAPIs()) { index = numberOfPaymentAPIs() - 1; }
      paymentAPIs.remove(aPaymentAPI);
      paymentAPIs.add(index, aPaymentAPI);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPaymentAPIAt(aPaymentAPI, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    School placeholderSchool = school;
    this.school = null;
    if(placeholderSchool != null)
    {
      placeholderSchool.removeStudent(this);
    }
    for(int i=grades.size(); i > 0; i--)
    {
      Grade aGrade = grades.get(i - 1);
      aGrade.delete();
    }
    for(int i=enrollments.size(); i > 0; i--)
    {
      Enrollment aEnrollment = enrollments.get(i - 1);
      aEnrollment.delete();
    }
    for(int i=certificates.size(); i > 0; i--)
    {
      Certificate aCertificate = certificates.get(i - 1);
      aCertificate.delete();
    }
    StudentSingletonFactory existingStudentSingletonFactory = studentSingletonFactory;
    studentSingletonFactory = null;
    if (existingStudentSingletonFactory != null)
    {
      existingStudentSingletonFactory.delete();
    }
    for(int i=paymentAPIs.size(); i > 0; i--)
    {
      PaymentAPI aPaymentAPI = paymentAPIs.get(i - 1);
      aPaymentAPI.delete();
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "studentID" + ":" + getStudentID()+ "," +
            "studentName" + ":" + getStudentName()+ "," +
            "university" + ":" + getUniversity()+ "," +
            "major" + ":" + getMajor()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "enrolledCourses" + "=" + (getEnrolledCourses() != null ? !getEnrolledCourses().equals(this)  ? getEnrolledCourses().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "completeCourses" + "=" + (getCompleteCourses() != null ? !getCompleteCourses().equals(this)  ? getCompleteCourses().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "school = "+(getSchool()!=null?Integer.toHexString(System.identityHashCode(getSchool())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "studentSingletonFactory = "+(getStudentSingletonFactory()!=null?Integer.toHexString(System.identityHashCode(getStudentSingletonFactory())):"null");
  }
}