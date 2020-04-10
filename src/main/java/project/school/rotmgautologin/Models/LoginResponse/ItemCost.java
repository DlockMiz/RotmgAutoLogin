package project.school.rotmgautologin.Models.LoginResponse;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class ItemCost {
    @JacksonXmlProperty(localName = "purchasable", isAttribute = true)
    private String purchasable;

    @JacksonXmlProperty(localName = "expires", isAttribute = true)
    private String expires;

    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    @JacksonXmlText
    private String content;

    public String getPurchasable ()
    {
        return purchasable;
    }

    public void setPurchasable (String purchasable)
    {
        this.purchasable = purchasable;
    }

    public String getExpires ()
    {
        return expires;
    }

    public void setExpires (String expires)
    {
        this.expires = expires;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }
}
