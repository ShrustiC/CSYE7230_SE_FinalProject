/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 58 "model.ump"
// line 246 "model.ump"
public class JobPosting
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //JobPosting Attributes
  private String jobID;
  private String jobName;
  private int level;

  //JobPosting Associations
  private Company company;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JobPosting(String aJobID, String aJobName, int aLevel, Company aCompany)
  {
    jobID = aJobID;
    jobName = aJobName;
    level = aLevel;
    boolean didAddCompany = setCompany(aCompany);
    if (!didAddCompany)
    {
      throw new RuntimeException("Unable to create jobPosting due to company. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setJobID(String aJobID)
  {
    boolean wasSet = false;
    jobID = aJobID;
    wasSet = true;
    return wasSet;
  }

  public boolean setJobName(String aJobName)
  {
    boolean wasSet = false;
    jobName = aJobName;
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

  public String getJobID()
  {
    return jobID;
  }

  public String getJobName()
  {
    return jobName;
  }

  public int getLevel()
  {
    return level;
  }
  /* Code from template association_GetOne */
  public Company getCompany()
  {
    return company;
  }
  /* Code from template association_SetOneToMany */
  public boolean setCompany(Company aCompany)
  {
    boolean wasSet = false;
    if (aCompany == null)
    {
      return wasSet;
    }

    Company existingCompany = company;
    company = aCompany;
    if (existingCompany != null && !existingCompany.equals(aCompany))
    {
      existingCompany.removeJobPosting(this);
    }
    company.addJobPosting(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Company placeholderCompany = company;
    this.company = null;
    if(placeholderCompany != null)
    {
      placeholderCompany.removeJobPosting(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "jobID" + ":" + getJobID()+ "," +
            "jobName" + ":" + getJobName()+ "," +
            "level" + ":" + getLevel()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "company = "+(getCompany()!=null?Integer.toHexString(System.identityHashCode(getCompany())):"null");
  }
}