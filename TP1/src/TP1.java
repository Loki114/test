import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.*;
import java.awt.Graphics;

public class TP1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Q1.1. 
		/*
		// System.out.println("Hello World");
		BufferedReader clavier = new BufferedReader(new InputStreamReader(Syste.in));
		String chaine = clavier.readLine(); //pour lire au clavier
		int a = Integer.parseInt(chaine);   //chaine est transtyp� (String -> entier)
		//Pour des variables de type float -> Float.parseFloat(...)
		*/
		
		// Q2.1
		/*
		System.out.println("Veuillez saisir les coefs a, b, c au clavier !");
		// Pour une saisie des param�tres au clavier
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		String chaine1 = clavier.readLine();
		// String chaine2 = clavier.readLine();
		// String chaine3 = clavier.readLine();
		// Conversion de chaine vers double
		double a = Double.parseDouble(chaine1) ;
		double b = Double.parseDouble(chaine2) ;
		double c = Double.parseDouble(chaine3) ;
		// D�claration d'une instance de la classe Eqdegre2, appel au constructeur
		ResolEq eq = new ResolEq(a,b,c);
		//Affichage du r�sultat
		System.out.println("Le resultat est : " + eq.toString());
		// Arr�t de l�application
		System.exit(0);
		*/
		
		// Q2.2
		// Pour une saisie au niveau d�une bo�te de dialogue
		String chaine1 = JOptionPane.showInputDialog("Coef. a");
		String chaine2 = JOptionPane.showInputDialog("Coef. b");
		String chaine3 = JOptionPane.showInputDialog("Coef. c");
		double a = Double.parseDouble(chaine1) ;
		double b = Double.parseDouble(chaine2) ;
		double c = Double.parseDouble(chaine3) ;
		// D�claration d'une instance de la classe Eqdegre2 
		// appel au constructeur
		ResolEq eq = new ResolEq(a,b,c);
		// Affichage du r�sultat
		System.out.println("Le resultat est : "+eq.toString());
		
		// Quitter l�application
		System.exit(0);
		
	}

}
