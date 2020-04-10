package project.school.rotmgautologin.Models.LoginResponse;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ClassAvailabilityList {
    @JacksonXmlProperty(localName = "ClassAvailability")
    private ClassAvailability[] ClassAvailability;

    public ClassAvailability[] getClassAvailability ()
    {
        return ClassAvailability;
    }

    public void setClassAvailability (ClassAvailability[] ClassAvailability)
    {
        this.ClassAvailability = ClassAvailability;
    }
}
