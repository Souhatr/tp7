package tpexaman2020;

public class ResultatRang implements Resultat {
	private int rang;
	public String toString()
	{
		return "rang"+this.rang;
	}
	public void affiche()
	{
		System.out.println(toString());
	}
	public ResultatRang(int rang)
	{
		this.rang=rang;
	}
	@Override
	public int compareTo(Resultat r) {
		if(r instanceof ResultatRang) {
			if(((ResultatRang)r).rang>this.rang) {
				return 1;
			}
			else if(((ResultatRang)r).rang==this.rang)
				return 0;
			else
				return -1;
	}
	
}
