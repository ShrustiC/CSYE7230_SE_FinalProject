/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 65 "model.ump"
// line 251 "model.ump"
public class Company extends User
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Company Attributes
  private String companyID;
  private String companyName;

  //Company Associations
  private List<JobPosting> jobPostings;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Company(String aRoleID, String aUserName, String aPassword, String aUserID, Enum aUserType, String aEmail, int aStatus, DateTime aRegistrationDate, String aContact, String aCompanyID, String aCompanyName)
  {
    super(aRoleID, aUserName, aPassword, aUserID, aUserType, aEmail, aStatus, aRegistrationDate, aContact);
    companyID = aCompanyID;
    companyName = aCompanyName;
    jobPostings = new ArrayList<JobPosting>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCompanyID(String aCompanyID)
  {
    boolean wasSet = false;
    companyID = aCompanyID;
    wasSet = true;
    return wasSet;
  }

  public boolean setCompanyName(String aCompanyName)
  {
    boolean wasSet = false;
    companyName = aCompanyName;
    wasSet = true;
    return wasSet;
  }

  public String getCompanyID()
  {
    return companyID;
  }

  public String getCompanyName()
  {
    return companyName;
  }
  /* Code from template association_GetMany */
  public JobPosting getJobPosting(int index)
  {
    JobPosting aJobPosting = jobPostings.get(index);
    return aJobPosting;
  }

  public List<JobPosting> getJobPostings()
  {
    List<JobPosting> newJobPostings = Collections.unmodifiableList(jobPostings);
    return newJobPostings;
  }

  public int numberOfJobPostings()
  {
    int number = jobPostings.size();
    return number;
  }

  public boolean hasJobPostings()
  {
    boolean has = jobPostings.size() > 0;
    return has;
  }

  public int indexOfJobPosting(JobPosting aJobPosting)
  {
    int index = jobPostings.indexOf(aJobPosting);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfJobPostings()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public JobPosting addJobPosting(String aJobID, String aJobName, int aLevel)
  {
    return new JobPosting(aJobID, aJobName, aLevel, this);
  }

  public boolean addJobPosting(JobPosting aJobPosting)
  {
    boolean wasAdded = false;
    if (jobPostings.contains(aJobPosting)) { return false; }
    Company existingCompany = aJobPosting.getCompany();
    boolean isNewCompany = existingCompany != null && !this.equals(existingCompany);
    if (isNewCompany)
    {
      aJobPosting.setCompany(this);
    }
    else
    {
      jobPostings.add(aJobPosting);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeJobPosting(JobPosting aJobPosting)
  {
    boolean wasRemoved = false;
    //Unable to remove aJobPosting, as it must always have a company
    if (!this.equals(aJobPosting.getCompany()))
    {
      jobPostings.remove(aJobPosting);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addJobPostingAt(JobPosting aJobPosting, int index)
  {  
    boolean wasAdded = false;
    if(addJobPosting(aJobPosting))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJobPostings()) { index = numberOfJobPostings() - 1; }
      jobPostings.remove(aJobPosting);
      jobPostings.add(index, aJobPosting);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveJobPostingAt(JobPosting aJobPosting, int index)
  {
    boolean wasAdded = false;
    if(jobPostings.contains(aJobPosting))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJobPostings()) { index = numberOfJobPostings() - 1; }
      jobPostings.remove(aJobPosting);
      jobPostings.add(index, aJobPosting);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addJobPostingAt(aJobPosting, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=jobPostings.size(); i > 0; i--)
    {
      JobPosting aJobPosting = jobPostings.get(i - 1);
      aJobPosting.delete();
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "companyID" + ":" + getCompanyID()+ "," +
            "companyName" + ":" + getCompanyName()+ "]";
  }
}