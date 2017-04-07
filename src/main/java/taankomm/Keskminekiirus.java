package taankomm;

public class Keskminekiirus implements Funktsioon{
	double v;
	public String f(double s, double h, double m){
		double t = h + (m/60);

		v = Math.round(s/t);

			return "Keskminekiirus "+ v +" kmh";

	}

}
