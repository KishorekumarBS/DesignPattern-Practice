import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args)
    {
        EnemyShipFactory shipFactory=new EnemyShipFactory();
        Enemyship theenemy=null;
        Scanner userInput=new Scanner(System.in);
        System.out.println("What type of Ship? (U/ R / B)");
        if(userInput.hasNextLine())
        {
            String typeofShipe=userInput.nextLine();
            theenemy=shipFactory.makeEnemyShip(typeofShipe);
        }
        doStuffEnemy(theenemy);

    }
    public static void doStuffEnemy(Enemyship enemyship) {

        enemyship.displayEnemyShip();
        enemyship.followHeroShip();
        enemyship.enemeyShipShoots();
    }
}
