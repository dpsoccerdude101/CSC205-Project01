import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * Contains an ArrayList of House objects. Reads the data from a file called houses.txt and
 * adds them to the array list. Allows for searching of houses that satisft criteria.
 *
 * @author (Kurt Mueller)
 * @version (10/27/19)
 */
public class HouseList
{   
    //declare house array
    House[] house = new House[26];
    //declare empty house object
    House newHouse;
    //index array
    int index = 0;
    /**
     * reads file fileName and creates house objects out of it
     * 
     * @param       String fileName
     * @return      none
     */
    public HouseList(String fileName){
        //initialize temp variables
        String address;
        int price;
        int area;
        int numBedrooms;
        //try and catch for reading file
        try{
            //declare file variable
            File file = new File(fileName);
            //create a scanner for the file
            Scanner stdin = new Scanner(file);  
            //process each line until the end of file
            while(stdin.hasNext()){
                address = stdin.next();
                price = stdin.nextInt();
                area = stdin.nextInt();
                numBedrooms = stdin.nextInt();
                //make new house object
                newHouse = new House(address, price, area, numBedrooms);
                //put into array
                house[index] = newHouse;
                index++;
            }
            stdin.close();
        }
        //catch for if file does not exist
        catch(FileNotFoundException e1){
            System.out.println(e1);
        }
    }
    //----------------------------------------------------------------------------------------
    /**
     * print out house addresses that fullfill criteria
     * 
     * @param       Criteria c
     * @return      none
     */
    public String printHouses(Criteria c){
        String list="";
        for(int i=0; i<=index; i++){
            if(house[i].satisfies(c)){
                String temp = house[i].getAddress();
                list += temp;
            }
        }
        return list;
    }
    //----------------------------------------------------------------------------------------
    /**
     * print out houses and all their details if they fullfill the criteria
     * 
     * @param       Criteria c
     * @return      String list
     */
    public String getHouses(Criteria c){
        String list="";
        for(int i=0; i<=index; i++){
            list +=house[i].toString();
        }
        return list;
    }
    // String list = "";
    // for(int i=0; i<=numHouses; i++){
    // if(house[i].satisfies(c)){list += house[i].toString();}
    // }
    // return list;

}
