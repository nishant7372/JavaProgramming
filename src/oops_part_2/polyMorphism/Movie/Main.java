package oops_part_2.polyMorphism.Movie;

public class Main {

	public static void main(String[] args)
	{
		for(int i=1;i<21;i++)
		{
			Movie movie = generateRandomMovie();
			System.out.println("Movie #" + i + ": " + movie.getName()+ "\nPlot: " + movie.Plot()+"\n");
		}
	}
	
	private static Movie generateRandomMovie()
	{
		int randomNumber = (int)(Math.random()*5)+1;
		
		switch(randomNumber)
		{
		case 1:return new Baahubali();
		case 2:return new KGF();
		case 3:return new Sultan();
		case 4:return new Pushpa();
		case 5:return new Dhoom();
		}
		return null;
	}
}
