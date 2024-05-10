package LabHw6_INES_3BSCS2_SolidWithDesignPattern;
public class Resource
{
    private String resourceType;
    private String resourceTitle;

    public Resource(String resourceType, String resourceTitle)
    {
        this.resourceTitle = resourceTitle;
        this.resourceType = resourceType;
    }

    public String getResourceTitle()
    {
        return resourceTitle;
    }
    public String getResourceType()
    {
        return resourceType;
    }
}
