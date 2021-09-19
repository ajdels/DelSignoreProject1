import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DelSignoreMain {
    var filename = "List.txt";
    var products = Paths.get(filename);
    var productName = new ArrayList<String>();
    var productPrice = new ArrayList<Float>();
    var productAvailable = new ArrayList<Integer>();
    var productInfo = Files.readAllLines(products);
    for (var line : productInfo){
        var splitLine = line.split(",");
        productName.add(splitLine[0]);
        var available = Integer.parseInt(splitLine[1]);
        productAvailable.add(available);
    }
    for (int i = 0; 1< studentNames.size(); i++)
        System.out.println("")
}