public class EnemyShipFactory {
    public Enemyship makeEnemyShip(String newShipType)
    {
        Enemyship newship= null;
        if(newShipType.equals("U"))
        {
            return new UFOEnemyShip();
        } else if (newShipType.equals("B")) {
            return new BigUFOEnemyShip();
        } else if (newShipType.equals("R")) {
            return new RocketEnemyShip();
        }
        return null;
    }
}
