// ANDERSON MAINA
// CT 101/G/20948/23
//THIS PROGRAQM CAL;CULATES DISCOUNT ACCORDING TO THE SALARY INITIASLIZED USING CONDITIONAL LOOPS

public class discount {
    public static double getDiscount(double price) {
        double discount = 0;//INITIALIZING DISCOUNT TO 0


//USING CONDITIONALS TO DETERMINE THE DISCOUNT TO BE ALLOCATED
        if (price > 5000) {
            discount = 0.1 * price;
        } else if (price >= 1000 && price <= 5000) {
            discount = 0.05 * price;
        } else {
            discount = 0;
        }
        return discount;
    }

//MAIN FUNCTION IS USED TO OUTPUT DISCOUNT IN CONJUCTION WITH INITIALIZING THE SALARY
    public static void main(String[] args) {
        double price = 12000;//INITIALIZIZNG SALARYY
        double discount = getDiscount(price);
        
        //OUTPUTING THE DISCOUNT
        System.out.println("Discount is: " + discount);
    }
