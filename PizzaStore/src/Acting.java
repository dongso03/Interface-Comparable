import java.util.Random;

public class Acting {
    public static void main(String[] args) {
        PizzaStore pzs = new PizzaStore();
        
       
        int nusOfCus = 50; 
        Customer[] customers = new Customer[nusOfCus];

        for (int i = 0; i < nusOfCus; i++) {
            String nationality = getRandomNationality();
            customers[i] = new Customer(nationality);
           
        }

        
        for (Customer customer : customers) {
            pzs.orderProcess(customer);
        }
    }

   
    private static String getRandomNationality() {
        String[] nationalities = {"Korean", "American"}; 
        int randomIndex = new Random().nextInt(nationalities.length);
        return nationalities[randomIndex];
    }
}