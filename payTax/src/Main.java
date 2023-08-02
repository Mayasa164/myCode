public class Main {
    public static void main(String[] args) {
Buyer buy = new Buyer();
buy.item = "ball";
buy.price = 5;
buy.name ="sport item";
buy.tax = 0.05;
        System.out.println("the tax for "+ buy.item+" is " +buy.getCalTax());
        System.out.println("final price is : "+ buy.finalPrice());
  }
}



class Shopping{
   String item;
    double price;
    double tax;
    
    

    
}

class Buyer extends Shopping {

    String name;
double finalPrice(){

        return price + tax;
    }


    public double getCalTax() {
        return price * 0.5;
    }
}

