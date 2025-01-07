public class Party {
    public static void main(String[] args) {
		
        int money=3000;
        if(money>=12000)
        {
            System.out.println("Money having  :"+money+" Goto to visiting on new places .");
        }
        else if(money>5000 && money<10000)
        {
            System.out.println("Money having :"+money+" Goto to Zoo.");
        }
        else if(money >=2000 && money <5000)
        {
            System.out.println("Money having :"+money+" Eating Chicken Dinner");
        }
        else
        {
            System.out.println("Money having "+money+" then eating Burger .");
        }
    }
}
