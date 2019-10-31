/**
 * It represents the details of a house for sale
 *
 * @author (Kurt Mueller)
 * @version (10/27/19)
 */
public class House
{
    //----------------------------------------------------------------------------------------
    //initialize variables
    private String address;
    private int price;
    private int area;
    private int numBedrooms;
    //----------------------------------------------------------------------------------------
    /**
     * constructor
     * 
     * @param       String address
     * @param       int price
     * @param       int area
     * @param       int numBedrooms
     * 
     * @return      none
     */
    public House(String address, int price, int area, int numBedrooms){
        this.address = address;
        this.price = price;
        this.area = area;
        this.numBedrooms = numBedrooms;
    }
    //----------------------------------------------------------------------------------------
    /**
     * get address
     * @param       none
     * @return      String address
     */
    public String getAddress(){return address;}
    //----------------------------------------------------------------------------------------
    /**
     * get price
     * @param       none
     * @return      int price
     */
    public int getPrice(){return price;}
    //----------------------------------------------------------------------------------------
    /**
     * get area
     * @param       none
     * @return      int area
     */
    public int getArea(){return area;}
    //----------------------------------------------------------------------------------------
    /**
     * get number of bedrooms
     * @param       none
     * @return      int numBedrooms
     */
    public int getNumBedrooms(){return numBedrooms;}
    //----------------------------------------------------------------------------------------
    /**
     * returns true if values in house are up to critera
     * @param       criteria c
     * @return      boolean
     */
    public boolean satisfies(Criteria c){
        //initialize variables
        int check = 0;
        //check pricing
        if((getPrice() <= c.getMaximumPrice()) && (getPrice() >= c.getMinimumPrice()))
        {check++;}
        //check area
        if((getArea() <= c.getMaximumArea()) && (getArea() >= c.getMinimumArea()))
        {check++;}
        //check number of bedrooms
        if((getNumBedrooms() <= c.getMaximumNumberOfBedrooms()) && (getNumBedrooms() >= c.getMinimumNumberOfBedrooms()))
        {check++;}
        //return if it is in criteria
        if(check == 3){return true;}
        else{return false;}      
    }
    //----------------------------------------------------------------------------------------
    /**
     * returns values of house in a nice string
     * @param       none
     * @return      String
     */
    public String toString(){
        String temp = (address+", $"+price+", "+area+"sq/ft, "+numBedrooms+" bedrooms"); 
        return temp;
    }
}
