package oops_part_2.polyMorphism.Movie;

public class Movie {
 
	private String name;
	
	public Movie(String name)
	{
		this.name=name;
	}
	
	public String Plot()
	{
		return "No plot Available";
	}

	public String getName() {
		return name;
	}
}
