import java.util.Random;

public class Dice
{
    private int sides;

    public int roll()
    {
        Random rand = new Random();
        int sides = rand.nextInt(this.sides + 1);
        return sides;
    }
}
