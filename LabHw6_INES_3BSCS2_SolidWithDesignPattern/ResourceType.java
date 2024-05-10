package LabHw6_INES_3BSCS2_SolidWithDesignPattern;
public class ResourceType implements ResourceBorrower
{
    @Override
    public void borrowResource(Student student, Resource resource)
    {
        System.out.println("Student: " + student.getName() + "\n  Borrowed: " + resource.getResourceTitle() + " - " + resource.getResourceType());
    }
}
