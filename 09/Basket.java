import java.util.*;

class Basket
{
	public static ArrayList<Ball> basketPull = new ArrayList<Ball>();

	public static void main(String[] args) {
		Ball ball1 = new Ball("blue", 20);
		Ball ball2 = new Ball("red", 10);
		Ball ball3 = new Ball("blue", 130);
		Ball ball4 = new Ball("yellow", 50);

		basketPull.add(ball1);
		basketPull.add(ball2);
		basketPull.add(ball3);
		basketPull.add(ball4);

		int blueBallsAmount = calcColorBallsAmount(basketPull, "blue");
		int ballsWeight = calcBallsWeight(basketPull);

		System.out.println(blueBallsAmount);
		System.out.println(ballsWeight);
	}

	public static int calcBallsWeight(ArrayList<Ball> basket)
	{
		int ballsWeight = 0;
		for (int i = 0; i < basket.size(); ++i)
			ballsWeight += basket.get(i).weight;

		return ballsWeight;
	}

	public static int calcColorBallsAmount(ArrayList<Ball> basket, String ballColor)
	{
		int ballsAmount = 0;
		for (int i = 0; i < basket.size(); ++i)
		{
			if (basket.get(i).color == ballColor)
				ballsAmount++;
		}
		return ballsAmount;
	}
}
