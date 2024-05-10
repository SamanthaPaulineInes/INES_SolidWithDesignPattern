package LabHw6_INES_3BSCS2_SolidWithDesignPattern;
import java.util.HashMap;
import java.util.Map;
public class TestProgram
{
    public static void main(String[] args)
    {
        Map<String, ResourceBorrower> resourceFactory = new HashMap<>();
        ResourceProcessor resourceProcessor = new ResourceProcessor(resourceFactory);

        Student studentName1 = new Student("Harry Potter");
        Student studentName2 = new Student("Ron Weasley");
        Student studentName3 = new Student("Hermoine Granger");

        resourceFactory.put("Book", new ResourceType());
        Resource book = new Resource("Book", "Advanced Potion Making");

        resourceFactory.put("Thesis", new ResourceType());
        Resource thesis = new Resource("Thesis", "Fantastic Beasts and Where to find them");

        resourceFactory.put("Capstone", new ResourceType());
        Resource capstone = new Resource("Capstone", "The Dark Forces");

        resourceFactory.put("Internet Access", new ResourceType());
        Resource internetAccess = new Resource("Internet Access", "Quidditch Through the Ages");

        resourceFactory.put("Journal", new ResourceType());
        Resource journal = new Resource("Journal", "The Dark Arts");

        resourceFactory.put("Newspaper", new ResourceType());
        Resource newspaper = new Resource("Newspaper", "The Daily Prophet");


        System.out.print("\n");

        System.out.print("HOGWARTS LIBRARY\n\n");
        resourceProcessor.borrowResource(studentName1, book);
        resourceProcessor.borrowResource(studentName1, internetAccess); System.out.print("\n");

        resourceProcessor.borrowResource(studentName2, thesis);
        resourceProcessor.borrowResource(studentName2, journal); System.out.print("\n");

        resourceProcessor.borrowResource(studentName3, capstone);
        resourceProcessor.borrowResource(studentName3, newspaper); System.out.print("\n");
    }
}
