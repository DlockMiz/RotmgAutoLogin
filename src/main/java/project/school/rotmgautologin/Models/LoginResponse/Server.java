package project.school.rotmgautologin.Models.LoginResponse;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Server {
    @JacksonXmlProperty(localName = "Usage")
    private String Usage;

    @JacksonXmlProperty(localName = "DNS")
    private String DNS;

    @JacksonXmlProperty(localName = "Long")
    private String Long;

    @JacksonXmlProperty(localName = "Lat")
    private String Lat;

    @JacksonXmlProperty(localName = "Name")
    private String Name;

    public String getUsage ()
    {
        return Usage;
    }

    public void setUsage (String Usage)
    {
        this.Usage = Usage;
    }

    public String getDNS ()
    {
        return DNS;
    }

    public void setDNS (String DNS)
    {
        this.DNS = DNS;
    }

    public String getLong ()
    {
        return Long;
    }

    public void setLong (String Long)
    {
        this.Long = Long;
    }

    public String getLat ()
    {
        return Lat;
    }

    public void setLat (String Lat)
    {
        this.Lat = Lat;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }
}
