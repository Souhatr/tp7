package tpexaman2020;

public class ResultatDistance implements Resultat {
	 private double distance;
	public String toString()
	{
		return "distance"+this.distance;
	}
	public void affiche()
	{
		System.out.println(toString());
	}
	public ResultatDistance(double distance)
	{
		this.distance=distance;
	}
	@Override
	public int compareTo(Resultat r) {
		if(r instanceof ResultatDistance) {
			if(((ResultatDistance)r).distance>this.distance) {
				return 1;
			}
			else if(((ResultatDistance)r).distance==this.distance)
				return 0;
		
		}
		return -1;
	}
	
	
}
