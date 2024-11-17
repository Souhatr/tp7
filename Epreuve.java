package tpexaman2020;

public class Epreuve {
	private String denomination;
	private Athlete [] Athletes;
	private int nbmax;
	private int nbf=0;
	private boolean etat;
	public Epreuve (String denomination, int max)
	{
		this.denomination=denomination;
		this.nbmax=max;
	}
	public String toString()
	{
		return "denomination"+denomination+"etat"+etat;
	}
	public void ajoutAthlete(Athlete a)
	{
		if(nbmax<Athletes.length)
			Athletes[nbf]=a;
			nbf++;
	}
	public void terminer ()
	{
		this.etat=true;
	}
	public boolean estTerminee()
	{
		if(this.etat=true)
			return true;
		else
			return false;
	}
	public Resultat getRecordOlymique()
	{
		Resultat r=null;
		for(int i=0;i<nbf;i++)
	  	{
			if((Athletes[i].getResultat().compareTo(r))==1) {
				r=Athletes[i].getResultat();
			}
		}
		return r;
	}
	public Athlete getVinqueur()
	{
		Athlete a=null;
		Resultat r=getRecordOlymique();
		for(int i=0;i<nbf;i++)
		{
			if(estTerminee()&&(Athletes[i].getResultat().compareTo(r)==0))
				a= Athletes[i];
		}
		return a;
	}
	public void fixeResultat(int id, Resultat r) throws IllegalStateException
	{
		if(etat)
		{
			throw new IllegalStateException();
		}	
		for(int i=0;i<nbf;i++)
		{
			if(Athletes[i].getId()==id)
				Athletes[i].setResultat(r);
		}
	}
	Resultat getResultat(int id)
	{
		for(int i=0;i<nbf;i++)
		{
			if(Athletes[i].getId()==id)
				return Athletes[i].getResultat();
		}
		return null;
	}
}
