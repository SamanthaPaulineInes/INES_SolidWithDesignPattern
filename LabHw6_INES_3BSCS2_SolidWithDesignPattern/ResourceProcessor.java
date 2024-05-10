package LabHw6_INES_3BSCS2_SolidWithDesignPattern;
import java.util.Map;
public class ResourceProcessor
{
    private final Map<String, ResourceBorrower> resourceType;
    public ResourceProcessor(Map<String, ResourceBorrower> resourceType)
    {
        this.resourceType = resourceType;
    }
    public void borrowResource(Student student, Resource resource)
    {
        ResourceBorrower resourceBorrower = resourceType.getOrDefault(resource.getResourceType(), null);
        resourceBorrower.borrowResource(student, resource);
    }
}
