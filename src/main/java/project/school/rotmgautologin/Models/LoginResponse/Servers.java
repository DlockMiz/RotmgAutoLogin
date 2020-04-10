package project.school.rotmgautologin.Models.LoginResponse;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Servers {
    @JacksonXmlProperty(localName = "Server")
    private Server[] Server;

    public Server[] getServer ()
    {
        return Server;
    }

    public void setServer (Server[] Server)
    {
        this.Server = Server;
    }
}
