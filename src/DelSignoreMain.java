import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class DelSignoreMain {
    public static void main(String[] args) {
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
        var userResponse = "";
        while(userResponse.equals("done")) {
            System.out.println("What product?: ");
            userResponse = reader.nextLine();
            if (userResponse.equals("done")) {
                break;
            }
            productName.add(userResponse);
            System.out.println("This is out of stock");
            for (var productName : productNames);
                System.out.print("Done?");

            for (int i = 0; 1< productName.size(); i++)
                System.out.println(productInfo);
        }
    }
    }

}


