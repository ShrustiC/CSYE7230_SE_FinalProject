/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;
import java.sql.Date;

// line 2 "model.ump"
// line 207 "model.ump"
public class Course
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Course Attributes
  private String courseID;
  private String courseName;
  private int level;
  private String description;
  private double price;

  //Course Associations
  private CourseSingletonFactory courseSingletonFactory;
  private List<Resource> resources;
  private School school;
  private List<Domain> domains;
  private List<Assessment> assessments;
  private List<Grade> grades;
  private List<Enrollment> enrollments;
  private List<TA> tAs;
  private Instructor instructor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Course(String aCourseID, String aCourseName, int aLevel, String aDescription, double aPrice, CourseSingletonFactory aCourseSingletonFactory, School aSchool, Instructor aInstructor)
  {
    courseID = aCourseID;
    courseName = aCourseName;
    level = aLevel;
    description = aDescription;
    price = aPrice;
    if (aCourseSingletonFactory == null || aCourseSingletonFactory.getCourse() != null)
    {
      throw new RuntimeException("Unable to create Course due to aCourseSingletonFactory. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    courseSingletonFactory = aCourseSingletonFactory;
    resources = new ArrayList<Resource>();
    boolean didAddSchool = setSchool(aSchool);
    if (!didAddSchool)
    {
      throw new RuntimeException("Unable to create course due to school. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    domains = new ArrayList<Domain>();
    assessments = new ArrayList<Assessment>();
    grades = new ArrayList<Grade>();
    enrollments = new ArrayList<Enrollment>();
    tAs = new ArrayList<TA>();
    boolean didAddInstructor = setInstructor(aInstructor);
    if (!didAddInstructor)
    {
      throw new RuntimeException("Unable to create course due to instructor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  public Course(String aCourseID, String aCourseName, int aLevel, String aDescription, double aPrice, CourseSingletonFactory aInstanceForCourseSingletonFactory, School aSchool, Instructor aInstructor)
  {
    courseID = aCourseID;
    courseName = aCourseName;
    level = aLevel;
    description = aDescription;
    price = aPrice;
    courseSingletonFactory = new CourseSingletonFactory(aInstanceForCourseSingletonFactory, this);
    resources = new ArrayList<Resource>();
    boolean didAddSchool = setSchool(aSchool);
    if (!didAddSchool)
    {
      throw new RuntimeException("Unable to create course due to school. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    domains = new ArrayList<Domain>();
    assessments = new ArrayList<Assessment>();
    grades = new ArrayList<Grade>();
    enrollments = new ArrayList<Enrollment>();
    tAs = new ArrayList<TA>();
    boolean didAddInstructor = setInstructor(aInstructor);
    if (!didAddInstructor)
    {
      throw new RuntimeException("Unable to create course due to instructor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCourseID(String aCourseID)
  {
    boolean wasSet = false;
    courseID = aCourseID;
    wasSet = true;
    return wasSet;
  }

  public boolean setCourseName(String aCourseName)
  {
    boolean wasSet = false;
    courseName = aCourseName;
    wasSet = true;
    return wasSet;
  }

  public boolean setLevel(int aLevel)
  {
    boolean wasSet = false;
    level = aLevel;
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

  public boolean setPrice(double aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public String getCourseID()
  {
    return courseID;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public int getLevel()
  {
    return level;
  }

  public String getDescription()
  {
    return description;
  }

  public double getPrice()
  {
    return price;
  }
  /* Code from template association_GetOne */
  public CourseSingletonFactory getCourseSingletonFactory()
  {
    return courseSingletonFactory;
  }
  /* Code from template association_GetMany */
  public Resource getResource(int index)
  {
    Resource aResource = resources.get(index);
    return aResource;
  }

  public List<Resource> getResources()
  {
    List<Resource> newResources = Collections.unmodifiableList(resources);
    return newResources;
  }

  public int numberOfResources()
  {
    int number = resources.size();
    return number;
  }

  public boolean hasResources()
  {
    boolean has = resources.size() > 0;
    return has;
  }

  public int indexOfResource(Resource aResource)
  {
    int index = resources.indexOf(aResource);
    return index;
  }
  /* Code from template association_GetOne */
  public School getSchool()
  {
    return school;
  }
  /* Code from template association_GetMany */
  public Domain getDomain(int index)
  {
    Domain aDomain = domains.get(index);
    return aDomain;
  }

  public List<Domain> getDomains()
  {
    List<Domain> newDomains = Collections.unmodifiableList(domains);
    return newDomains;
  }

  public int numberOfDomains()
  {
    int number = domains.size();
    return number;
  }

  public boolean hasDomains()
  {
    boolean has = domains.size() > 0;
    return has;
  }

  public int indexOfDomain(Domain aDomain)
  {
    int index = domains.indexOf(aDomain);
    return index;
  }
  /* Code from template association_GetMany */
  public Assessment getAssessment(int index)
  {
    Assessment aAssessment = assessments.get(index);
    return aAssessment;
  }

  public List<Assessment> getAssessments()
  {
    List<Assessment> newAssessments = Collections.unmodifiableList(assessments);
    return newAssessments;
  }

  public int numberOfAssessments()
  {
    int number = assessments.size();
    return number;
  }

  public boolean hasAssessments()
  {
    boolean has = assessments.size() > 0;
    return has;
  }

  public int indexOfAssessment(Assessment aAssessment)
  {
    int index = assessments.indexOf(aAssessment);
    return index;
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
  public TA getTA(int index)
  {
    TA aTA = tAs.get(index);
    return aTA;
  }

  public List<TA> getTAs()
  {
    List<TA> newTAs = Collections.unmodifiableList(tAs);
    return newTAs;
  }

  public int numberOfTAs()
  {
    int number = tAs.size();
    return number;
  }

  public boolean hasTAs()
  {
    boolean has = tAs.size() > 0;
    return has;
  }

  public int indexOfTA(TA aTA)
  {
    int index = tAs.indexOf(aTA);
    return index;
  }
  /* Code from template association_GetOne */
  public Instructor getInstructor()
  {
    return instructor;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfResourcesValid()
  {
    boolean isValid = numberOfResources() >= minimumNumberOfResources();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfResources()
  {
    return 1;
  }
  /* Code from template association_AddMandatoryManyToOne */
  public Resource addResource(String aResourceID, String aResourceName, String aDescription, String aLink, Enum aResourceType)
  {
    Resource aNewResource = new Resource(aResourceID, aResourceName, aDescription, aLink, aResourceType, this);
    return aNewResource;
  }

  public boolean addResource(Resource aResource)
  {
    boolean wasAdded = false;
    if (resources.contains(aResource)) { return false; }
    Course existingCourse = aResource.getCourse();
    boolean isNewCourse = existingCourse != null && !this.equals(existingCourse);

    if (isNewCourse && existingCourse.numberOfResources() <= minimumNumberOfResources())
    {
      return wasAdded;
    }
    if (isNewCourse)
    {
      aResource.setCourse(this);
    }
    else
    {
      resources.add(aResource);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeResource(Resource aResource)
  {
    boolean wasRemoved = false;
    //Unable to remove aResource, as it must always have a course
    if (this.equals(aResource.getCourse()))
    {
      return wasRemoved;
    }

    //course already at minimum (1)
    if (numberOfResources() <= minimumNumberOfResources())
    {
      return wasRemoved;
    }

    resources.remove(aResource);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addResourceAt(Resource aResource, int index)
  {  
    boolean wasAdded = false;
    if(addResource(aResource))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfResources()) { index = numberOfResources() - 1; }
      resources.remove(aResource);
      resources.add(index, aResource);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveResourceAt(Resource aResource, int index)
  {
    boolean wasAdded = false;
    if(resources.contains(aResource))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfResources()) { index = numberOfResources() - 1; }
      resources.remove(aResource);
      resources.add(index, aResource);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addResourceAt(aResource, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMandatoryMany */
  public boolean setSchool(School aSchool)
  {
    boolean wasSet = false;
    //Must provide school to course
    if (aSchool == null)
    {
      return wasSet;
    }

    if (school != null && school.numberOfCourses() <= School.minimumNumberOfCourses())
    {
      return wasSet;
    }

    School existingSchool = school;
    school = aSchool;
    if (existingSchool != null && !existingSchool.equals(aSchool))
    {
      boolean didRemove = existingSchool.removeCourse(this);
      if (!didRemove)
      {
        school = existingSchool;
        return wasSet;
      }
    }
    school.addCourse(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfDomainsValid()
  {
    boolean isValid = numberOfDomains() >= minimumNumberOfDomains();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDomains()
  {
    return 1;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDomain(Domain aDomain)
  {
    boolean wasAdded = false;
    if (domains.contains(aDomain)) { return false; }
    domains.add(aDomain);
    if (aDomain.indexOfCourse(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDomain.addCourse(this);
      if (!wasAdded)
      {
        domains.remove(aDomain);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMStarToMany */
  public boolean removeDomain(Domain aDomain)
  {
    boolean wasRemoved = false;
    if (!domains.contains(aDomain))
    {
      return wasRemoved;
    }

    if (numberOfDomains() <= minimumNumberOfDomains())
    {
      return wasRemoved;
    }

    int oldIndex = domains.indexOf(aDomain);
    domains.remove(oldIndex);
    if (aDomain.indexOfCourse(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDomain.removeCourse(this);
      if (!wasRemoved)
      {
        domains.add(oldIndex,aDomain);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMStarToMany */
  public boolean setDomains(Domain... newDomains)
  {
    boolean wasSet = false;
    ArrayList<Domain> verifiedDomains = new ArrayList<Domain>();
    for (Domain aDomain : newDomains)
    {
      if (verifiedDomains.contains(aDomain))
      {
        continue;
      }
      verifiedDomains.add(aDomain);
    }

    if (verifiedDomains.size() != newDomains.length || verifiedDomains.size() < minimumNumberOfDomains())
    {
      return wasSet;
    }

    ArrayList<Domain> oldDomains = new ArrayList<Domain>(domains);
    domains.clear();
    for (Domain aNewDomain : verifiedDomains)
    {
      domains.add(aNewDomain);
      if (oldDomains.contains(aNewDomain))
      {
        oldDomains.remove(aNewDomain);
      }
      else
      {
        aNewDomain.addCourse(this);
      }
    }

    for (Domain anOldDomain : oldDomains)
    {
      anOldDomain.removeCourse(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDomainAt(Domain aDomain, int index)
  {  
    boolean wasAdded = false;
    if(addDomain(aDomain))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDomains()) { index = numberOfDomains() - 1; }
      domains.remove(aDomain);
      domains.add(index, aDomain);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDomainAt(Domain aDomain, int index)
  {
    boolean wasAdded = false;
    if(domains.contains(aDomain))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDomains()) { index = numberOfDomains() - 1; }
      domains.remove(aDomain);
      domains.add(index, aDomain);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDomainAt(aDomain, index);
    }
    return wasAdded;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfAssessmentsValid()
  {
    boolean isValid = numberOfAssessments() >= minimumNumberOfAssessments();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssessments()
  {
    return 1;
  }
  /* Code from template association_AddMandatoryManyToOne */
  public Assessment addAssessment(String aAssessmentID, String aAssessmentName, String aDescription, Grade aGrade)
  {
    Assessment aNewAssessment = new Assessment(aAssessmentID, aAssessmentName, aDescription, this, aGrade);
    return aNewAssessment;
  }

  public boolean addAssessment(Assessment aAssessment)
  {
    boolean wasAdded = false;
    if (assessments.contains(aAssessment)) { return false; }
    Course existingCourse = aAssessment.getCourse();
    boolean isNewCourse = existingCourse != null && !this.equals(existingCourse);

    if (isNewCourse && existingCourse.numberOfAssessments() <= minimumNumberOfAssessments())
    {
      return wasAdded;
    }
    if (isNewCourse)
    {
      aAssessment.setCourse(this);
    }
    else
    {
      assessments.add(aAssessment);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAssessment(Assessment aAssessment)
  {
    boolean wasRemoved = false;
    //Unable to remove aAssessment, as it must always have a course
    if (this.equals(aAssessment.getCourse()))
    {
      return wasRemoved;
    }

    //course already at minimum (1)
    if (numberOfAssessments() <= minimumNumberOfAssessments())
    {
      return wasRemoved;
    }

    assessments.remove(aAssessment);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssessmentAt(Assessment aAssessment, int index)
  {  
    boolean wasAdded = false;
    if(addAssessment(aAssessment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssessments()) { index = numberOfAssessments() - 1; }
      assessments.remove(aAssessment);
      assessments.add(index, aAssessment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssessmentAt(Assessment aAssessment, int index)
  {
    boolean wasAdded = false;
    if(assessments.contains(aAssessment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssessments()) { index = numberOfAssessments() - 1; }
      assessments.remove(aAssessment);
      assessments.add(index, aAssessment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssessmentAt(aAssessment, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGrades()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Grade addGrade(String aGradeID, String aGrade, Student aStudent, Assessment aAssessment)
  {
    return new Grade(aGradeID, aGrade, this, aStudent, aAssessment);
  }

  public boolean addGrade(Grade aGrade)
  {
    boolean wasAdded = false;
    if (grades.contains(aGrade)) { return false; }
    Course existingCourse = aGrade.getCourse();
    boolean isNewCourse = existingCourse != null && !this.equals(existingCourse);
    if (isNewCourse)
    {
      aGrade.setCourse(this);
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
    //Unable to remove aGrade, as it must always have a course
    if (!this.equals(aGrade.getCourse()))
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
  public Enrollment addEnrollment(String aEnrollmentID, Date aEnrolledOn, Student aStudent)
  {
    return new Enrollment(aEnrollmentID, aEnrolledOn, this, aStudent);
  }

  public boolean addEnrollment(Enrollment aEnrollment)
  {
    boolean wasAdded = false;
    if (enrollments.contains(aEnrollment)) { return false; }
    Course existingCourse = aEnrollment.getCourse();
    boolean isNewCourse = existingCourse != null && !this.equals(existingCourse);
    if (isNewCourse)
    {
      aEnrollment.setCourse(this);
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
    //Unable to remove aEnrollment, as it must always have a course
    if (!this.equals(aEnrollment.getCourse()))
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
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfTAsValid()
  {
    boolean isValid = numberOfTAs() >= minimumNumberOfTAs();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTAs()
  {
    return 1;
  }
  /* Code from template association_AddMandatoryManyToOne */
  public TA addTA(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact, String aTaID, String aTaName)
  {
    TA aNewTA = new TA(aRoleID, aUserName, aPassword, aUserID, aUserType, aEmail, aStatus, aRegistrationDate, aContact, aTaID, aTaName, this);
    return aNewTA;
  }

  public boolean addTA(TA aTA)
  {
    boolean wasAdded = false;
    if (tAs.contains(aTA)) { return false; }
    Course existingCourse = aTA.getCourse();
    boolean isNewCourse = existingCourse != null && !this.equals(existingCourse);

    if (isNewCourse && existingCourse.numberOfTAs() <= minimumNumberOfTAs())
    {
      return wasAdded;
    }
    if (isNewCourse)
    {
      aTA.setCourse(this);
    }
    else
    {
      tAs.add(aTA);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTA(TA aTA)
  {
    boolean wasRemoved = false;
    //Unable to remove aTA, as it must always have a course
    if (this.equals(aTA.getCourse()))
    {
      return wasRemoved;
    }

    //course already at minimum (1)
    if (numberOfTAs() <= minimumNumberOfTAs())
    {
      return wasRemoved;
    }

    tAs.remove(aTA);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTAAt(TA aTA, int index)
  {  
    boolean wasAdded = false;
    if(addTA(aTA))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTAs()) { index = numberOfTAs() - 1; }
      tAs.remove(aTA);
      tAs.add(index, aTA);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTAAt(TA aTA, int index)
  {
    boolean wasAdded = false;
    if(tAs.contains(aTA))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTAs()) { index = numberOfTAs() - 1; }
      tAs.remove(aTA);
      tAs.add(index, aTA);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTAAt(aTA, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setInstructor(Instructor aInstructor)
  {
    boolean wasSet = false;
    if (aInstructor == null)
    {
      return wasSet;
    }

    Instructor existingInstructor = instructor;
    instructor = aInstructor;
    if (existingInstructor != null && !existingInstructor.equals(aInstructor))
    {
      existingInstructor.removeCourse(this);
    }
    instructor.addCourse(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    CourseSingletonFactory existingCourseSingletonFactory = courseSingletonFactory;
    courseSingletonFactory = null;
    if (existingCourseSingletonFactory != null)
    {
      existingCourseSingletonFactory.delete();
    }
    for(int i=resources.size(); i > 0; i--)
    {
      Resource aResource = resources.get(i - 1);
      aResource.delete();
    }
    School placeholderSchool = school;
    this.school = null;
    if(placeholderSchool != null)
    {
      placeholderSchool.removeCourse(this);
    }
    ArrayList<Domain> copyOfDomains = new ArrayList<Domain>(domains);
    domains.clear();
    for(Domain aDomain : copyOfDomains)
    {
      if (aDomain.numberOfCourses() <= Domain.minimumNumberOfCourses())
      {
        aDomain.delete();
      }
      else
      {
        aDomain.removeCourse(this);
      }
    }
    for(int i=assessments.size(); i > 0; i--)
    {
      Assessment aAssessment = assessments.get(i - 1);
      aAssessment.delete();
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
    for(int i=tAs.size(); i > 0; i--)
    {
      TA aTA = tAs.get(i - 1);
      aTA.delete();
    }
    Instructor placeholderInstructor = instructor;
    this.instructor = null;
    if(placeholderInstructor != null)
    {
      placeholderInstructor.removeCourse(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "courseID" + ":" + getCourseID()+ "," +
            "courseName" + ":" + getCourseName()+ "," +
            "level" + ":" + getLevel()+ "," +
            "description" + ":" + getDescription()+ "," +
            "price" + ":" + getPrice()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "courseSingletonFactory = "+(getCourseSingletonFactory()!=null?Integer.toHexString(System.identityHashCode(getCourseSingletonFactory())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "school = "+(getSchool()!=null?Integer.toHexString(System.identityHashCode(getSchool())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "instructor = "+(getInstructor()!=null?Integer.toHexString(System.identityHashCode(getInstructor())):"null");
  }
}