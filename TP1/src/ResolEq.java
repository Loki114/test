
class ResolEq {
	private double r1,r2,i1,i2; //Donn�es membres priv�es de la classe : les parties 
								//r�elles et imaginaires des 2 racines de l��quation
	private double delta;
	public ResolEq(double a, double b, double c) {
		System.out.println("Constructeur");
		r1=r2=i1=i2=0; //initialisations des donn�es membres
		resoudre(a,b,c); //lancement de la m�thode r�soudre
	}
	public void resoudre(double a, double b, double c) {
		System.out.println("M�thode de r�solution");
		//A faire : le calcul des racines. Tester si a=0, etc.
		if (a == 0) {
			if (b != 0) {
				r1 = r2 = -c / b;
			}
			else {
				System.out.println("erreur!!");
			}
		}
		else {
			delta = b*b - 4*a*c;
			
			if (delta > 0) {
				r1 = (-b + Math.sqrt(delta)) / 2*a;
				r2 = (-b - Math.sqrt(delta)) / 2*a;
			}
			else if (delta == 0) {
				r1 = r2 = -b / (2*a);
			}
			else {
				r1 = r2 = -b /(2*a);
				i1 = Math.sqrt(-delta);
				i2 = -Math.sqrt(-delta);
			}
		}
	}
	public String toString() {
		return " \nRacine 1 : "+r1+" +i "+i1+"\n"+"Racine 2 : "+r2+" +i "+i2+"\n";
		// renvoie la cha�ne � faire afficher 
		// ou qq chose utilisant le discriminant (2 raciness 
		// r�elles ou complexe ou 1 racine double )
	}
}
