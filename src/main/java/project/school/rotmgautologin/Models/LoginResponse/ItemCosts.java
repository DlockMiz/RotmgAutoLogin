package project.school.rotmgautologin.Models.LoginResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ItemCosts {
    @JacksonXmlProperty(localName = "ItemCost")
    private ItemCost[] ItemCost;

    public ItemCost[] getItemCost ()
    {
        return ItemCost;
    }

    public void setItemCost (ItemCost[] ItemCost)
    {
        this.ItemCost = ItemCost;
    }
}
