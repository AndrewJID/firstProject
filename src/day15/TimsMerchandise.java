package day15;

public class TimsMerchandise implements TimsItems {

    public void getPrice(int n) {
        if (n == 1) {
            System.out.println("Price of Mugs is 5$");
        } else if (n == 2) {
            System.out.println("Price of Coffee Powder is 2$");
        } else if (n == 3) {
            System.out.println("Price of Gift Card is 10$");
        } else if (n == 4) {
            System.out.println("Price of Hockey Card is 1$");
        }
    }
     public int addItem(int n) {
         int totalMerch = 0;
         switch (n) {
             case 1:
                 totalMerch += 5;
                 break;
             case 2:
                 totalMerch += 2;
                 break;
             case 3:
                 totalMerch += 10;
                 break;
             case 4:
                 totalMerch += 1;
                 break;
         }
         return totalMerch;
     }
     public static void getFeature(int n){
         switch (n) {
             case 1:
                 System.out.println("Mug height is 5 inches");
                 break;
             case 2:
                 System.out.println("Coffee Powder comes in 1Kg size");
                 break;
             case 3:
                 System.out.println("Gift Cards are valid till end of the current month");
                 break;
             case 4:
                 System.out.println("Hockey Cards come with the weeks top performer");
                 break;
         }
     }
     public String toString(int n)
     {
         String item="";
         switch(n){
             case 1:
                 item+="1 X Mugs  -  5$";
                 break;
             case 2:
                 item+="1 X Coffee Powder  -  2$";
                 break;

                 case 3:
                     item+="1 X Gift Card  -  10$";
                     break;
             case 4:
                 item+="1 X Hockey Card  -  1$";
                 break;
         }
         return item;
     }

}
