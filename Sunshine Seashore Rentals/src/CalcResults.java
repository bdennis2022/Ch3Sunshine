public class CalcResults {
    public static final int DEFAULT_RENTAL_MINUTES = 60;
    private static final int PRICE_PER_HOUR = 40;
    private static final int PRICE_PER_ADDITIONAL_MINUTES = 1;
    public int cHrs, cAdditionalMinutes, cPrice;



    public void calculate(int iTimes){
        cHrs = iTimes / DEFAULT_RENTAL_MINUTES;
        cAdditionalMinutes = iTimes % DEFAULT_RENTAL_MINUTES;
        cPrice = (PRICE_PER_HOUR * cHrs) + (cAdditionalMinutes * PRICE_PER_ADDITIONAL_MINUTES);

    }

}