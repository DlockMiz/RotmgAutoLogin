package project.school.rotmgautologin.Models.LoginResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Chars {

    @JacksonXmlProperty(localName = "Account")
    private Account Account;

    @JacksonXmlProperty(localName = "maxNumChars", isAttribute = true)
    private String maxNumChars;

    @JacksonXmlProperty(localName = "nextCharId", isAttribute = true)
    private String nextCharId;

    @JacksonXmlProperty(localName = "ItemCosts")
    private ItemCosts ItemCosts;

    @JacksonXmlProperty(localName = "News")
    private String News;

    @JacksonXmlProperty(localName = "Long")
    private String Long;

    @JacksonXmlProperty(localName = "Servers")
    private Servers Servers;

    @JacksonXmlProperty(localName = "ClassAvailabilityList")
    private ClassAvailabilityList ClassAvailabilityList;

    @JacksonXmlProperty(localName = "Lat")
    private String Lat;

    public Account getAccount ()
    {
        return Account;
    }

    public void setAccount (Account Account)
    {
        this.Account = Account;
    }

    public String getMaxNumChars ()
    {
        return maxNumChars;
    }

    public void setMaxNumChars (String maxNumChars)
    {
        this.maxNumChars = maxNumChars;
    }

    public ItemCosts getItemCosts ()
    {
        return ItemCosts;
    }

    public void setItemCosts (ItemCosts ItemCosts)
    {
        this.ItemCosts = ItemCosts;
    }

    public String getNews ()
    {
        return News;
    }

    public void setNews (String News)
    {
        this.News = News;
    }

    public String getLong ()
    {
        return Long;
    }

    public void setLong (String Long)
    {
        this.Long = Long;
    }

    public Servers getServers ()
    {
        return Servers;
    }

    public void setServers (Servers Servers)
    {
        this.Servers = Servers;
    }

    public ClassAvailabilityList getClassAvailabilityList ()
    {
        return ClassAvailabilityList;
    }

    public void setClassAvailabilityList (ClassAvailabilityList ClassAvailabilityList)
    {
        this.ClassAvailabilityList = ClassAvailabilityList;
    }

    public String getNextCharId ()
    {
        return nextCharId;
    }

    public void setNextCharId (String nextCharId)
    {
        this.nextCharId = nextCharId;
    }

    public String getLat ()
    {
        return Lat;
    }

    public void setLat (String Lat)
    {
        this.Lat = Lat;
    }

}
