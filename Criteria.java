
/**
 * This contains the criteria specified by the user to select hosues
 *
 * @author (Kurt Mueller)
 * @version (10/27/19)
 */
public class Criteria
{
    //----------------------------------------------------------------------------------------
    //intialize variables
    private int minimumPrice;
    private int maximumPrice;
    private int minimumArea;
    private int maximumArea;
    private int minimumNumberOfBedrooms;
    private int maximumNumberOfBedrooms;
    //----------------------------------------------------------------------------------------
    /**
     * constructor
     * 
     * @param       int minimumPrice  
     * @param       int maximumPrice
     * @param       int minimumArea
     * @param       int maximumArea
     * @param       int minimumNumberOfBathrooms
     * @param       int maximumNumberOfBathrooms
     */
    public Criteria(int minimumPrice, int maximumPrice, int minimumArea, int maximumArea, int minimumNumberOfBedrooms, int maximumNumberOfBedrooms){
        this.minimumPrice = minimumPrice;
        this.maximumPrice = maximumPrice;
        this.minimumArea = minimumArea;
        this.maximumArea = maximumArea;
        this.minimumNumberOfBedrooms = minimumNumberOfBedrooms;
        this.maximumNumberOfBedrooms = maximumNumberOfBedrooms;
    }
    //----------------------------------------------------------------------------------------
    /**
     * get minimumPrice
     * 
     * @param       none
     * @return      int minimumprice
     */
    public int getMinimumPrice(){return minimumPrice;}
    //----------------------------------------------------------------------------------------
    /**
     * get maximumPrice
     * 
     * @param       none
     * @return      int maximumPrice
     */
    public int getMaximumPrice(){return maximumPrice;}
    //----------------------------------------------------------------------------------------
    /**
     * get minimumArea
     * 
     * @param       none
     * @return      int minimumArea
     */
    public int getMinimumArea(){return minimumArea;}
    //----------------------------------------------------------------------------------------
    /**
     * get maximumArea
     * 
     * @param       none
     * @return      int maximumArea
     */
    public int getMaximumArea(){return maximumArea;}
    //----------------------------------------------------------------------------------------
    /**
     * get minimumNumberOfBedrooms
     * 
     * @param       none
     * @return      int minimumNumberOfBedrooms
     */
    public int getMinimumNumberOfBedrooms(){return minimumNumberOfBedrooms;}
    //----------------------------------------------------------------------------------------
    /**
     * get maximumNumberOfBedrooms
     * 
     * @param       none
     * @return      maximumNumberOfBedrooms
     */
    public int getMaximumNumberOfBedrooms(){return maximumNumberOfBedrooms;}
}
