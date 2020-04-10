package project.school.rotmgautologin.Models.LoginResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Account {

    @JacksonXmlProperty(localName = "Credits")
    private String Credits;

    @JacksonXmlProperty(localName = "AccountId")
    private String AccountId;

    @JacksonXmlProperty(localName = "NextCharSlotPrice")
    private String NextCharSlotPrice;

    @JacksonXmlProperty(localName = "Stats")
    private Stats Stats;

    @JacksonXmlProperty(localName = "BeginnerPackageTimeLeft")
    private String BeginnerPackageTimeLeft;

    @JacksonXmlProperty(localName = "Name")
    private String Name;

    @JacksonXmlProperty(localName = "IsAgeVerified")
    private String IsAgeVerified;

    @JacksonXmlProperty(localName = "isFirstDeath")
    private String isFirstDeath;

    public String getCredits ()
    {
        return Credits;
    }

    public void setCredits (String Credits)
    {
        this.Credits = Credits;
    }

    public String getAccountId ()
    {
        return AccountId;
    }

    public void setAccountId (String AccountId)
    {
        this.AccountId = AccountId;
    }

    public String getNextCharSlotPrice ()
    {
        return NextCharSlotPrice;
    }

    public void setNextCharSlotPrice (String NextCharSlotPrice)
    {
        this.NextCharSlotPrice = NextCharSlotPrice;
    }

    public Stats getStats ()
    {
        return Stats;
    }

    public void setStats (Stats Stats)
    {
        this.Stats = Stats;
    }

    public String getBeginnerPackageTimeLeft ()
    {
        return BeginnerPackageTimeLeft;
    }

    public void setBeginnerPackageTimeLeft (String BeginnerPackageTimeLeft)
    {
        this.BeginnerPackageTimeLeft = BeginnerPackageTimeLeft;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getIsAgeVerified ()
    {
        return IsAgeVerified;
    }

    public void setIsAgeVerified (String IsAgeVerified)
    {
        this.IsAgeVerified = IsAgeVerified;
    }

    public String getIsFirstDeath ()
    {
        return isFirstDeath;
    }

    public void setIsFirstDeath (String isFirstDeath)
    {
        this.isFirstDeath = isFirstDeath;
    }
}
