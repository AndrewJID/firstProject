package day15;

public class TimsConsumable implements TimsItems{
    public void getPrice(int n) {
        switch(n){
            case 1:
            System.out.println("Price of Donut is 5$");
            break;
            case 2:
            System.out.println("Price of Bagel is 4$");
            break;
            case 3:
            System.out.println("Price of Coffee is 2$");
            break;
            case 4:
            System.out.println("Price of Wrap is 8$");
            break;
            case 5:
            System.out.println("Price of Sandwich is 10$");
            break;
        }
    }
    public int addItem(int n)
    {
        int totalCons=0;
        switch(n) {
            case 1:
                totalCons += 5;
                break;
            case 2:
                totalCons += 4;
                break;
            case 3:
                totalCons += 2;
                break;
            case 4:
                totalCons += 8;
                break;
            case 5:
                totalCons += 10;
                break;
        }
        return totalCons;
    }
    public static void getCalories(int n)
    {
        switch(n) {
            case 1:
                System.out.println("Donut has 200 Calories");
                break;
            case 2:
                System.out.println("Bagel has 30 calories");
                break;
            case 3:
                System.out.println("Coffee has 40 calories");
                break;
            case 4:
                System.out.println("Wrap has 70 calories");
                break;
            case 5:
                System.out.println("Sandwich has 90 calories");
                break;
        }
    }
    public String toString(int n)
    {
        String item="";
        switch(n){
            case 1:
                item+="1 X Donut  -  5$";
                break;
            case 2:
                item+="1 X Bagel  -  4$";
                break;

            case 3:
                item+="1 X Coffee  -  2$";
                break;
            case 4:
                item+="1 X Wrap -  8$";
                break;
            case 5:
                item+="1 X Sandwich -  10$";
                break;
        }
        return item;
    }
}

