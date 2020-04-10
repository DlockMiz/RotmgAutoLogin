package project.school.rotmgautologin.Models.LoginResponse;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Stats {
    @JacksonXmlProperty(localName = "Fame")
    private String Fame;

    @JsonProperty("TotalFame")
    private String TotalFame;

    @JsonProperty("BestCharFame")
    private String BestCharFame;

    public String getFame ()
    {
        return Fame;
    }

    public void setFame (String Fame)
    {
        this.Fame = Fame;
    }

    public String getTotalFame ()
    {
        return TotalFame;
    }

    public void setTotalFame (String TotalFame)
    {
        this.TotalFame = TotalFame;
    }

    public String getBestCharFame ()
    {
        return BestCharFame;
    }

    public void setBestCharFame (String BestCharFame)
    {
        this.BestCharFame = BestCharFame;
    }

}
