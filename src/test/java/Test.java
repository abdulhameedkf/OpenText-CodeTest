import java.util.*;
import java.util.stream.Collectors;

public class Test {
    //Input Company Names in the List. User can add company name to test the code as required
    static List<String> listCompany = Arrays.asList("OpenText Inc", "Google", "Accenture", "Cognizant", "Alpha");

    //Filter Text. User can update any text to filter list of companies
    static String filterText = "I n c";

    public static void main(String[] args) {
        //Print Original Input List Of Companies
        System.out.println("Original List of Companies : " + listCompany);

        //Print Filtered List Of Companies
        System.out.println("Filtered List of Companies : " + filterCompanies());

        //Print List Of Companies in Alphabetical Order
        sortCompaniesAlpha();
        System.out.println("List of Companies in Alphabetical Order : " + listCompany);

        //Print List Of Companies in Reverse Alphabetical Order
        sortCompaniesReverseAlpha();
        System.out.println("List of Companies in Reverse Alphabetical Order : " + listCompany);
    }

    public static List filterCompanies() {
        removeSpace();
        List<String> filteredListOfCompanies = listCompany.stream()
                .filter(value -> value.toUpperCase() //convert to uppercase for checking
                        .contains(filterText.toUpperCase())) //convert filter text to uppercase and filter values containing that text
                .collect(Collectors.toList());//collect as list
        return filteredListOfCompanies;
    }

    public static void sortCompaniesAlpha() {
        Collections.sort(listCompany);
    }

    public static void sortCompaniesReverseAlpha() {
        Collections.sort(listCompany);
        Collections.reverse(listCompany);
    }

    public static void removeSpace() {
        //Remove Space from List of Companies
        for (int i = 0; i < listCompany.size(); i++) {
            listCompany.set(i,listCompany.get(i).replaceAll("\\s", ""));
        }

        //Remove Space from Filter Text
        filterText=filterText.replaceAll("\\s", "");
    }
}

