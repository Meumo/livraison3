package sn.objis.livraison3.service;

import java.util.Scanner;

/**
 * Date 2018-07-24 # Cette classe 'ControleInt' controle la saisie des entiers
 * 
 * @author DIOUF Mamadou
 *
 */
public class ControleInt {
	/**
	 * La methode 'controleEntier' satic ne reçoit rien comme Parametre et renvoie
	 * un int
	 * 
	 * @return int (retourne un entier)
	 */
	public static int controleEntier() {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			try {
				numero = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Mettez un entier svp!");
			}
		} while (true);
		return numero;
	}
}
