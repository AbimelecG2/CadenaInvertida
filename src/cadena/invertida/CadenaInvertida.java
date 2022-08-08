/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadena.invertida;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class CadenaInvertida {

   
    public static void main(String[] args) {
        // TODO code application logic here
        	Scanner input= new Scanner(System.in);
		String textoIngresado;

		System.out.println("-----TEXTO INVERTIDO-----");
		System.out.println("Ingrese el texto que desea invertir: ");
		textoIngresado = input.nextLine();

		char arregloTexto[] = textoIngresado.toCharArray();
		int contador;
		int contadorSimbolos = 0;
		int[] arregloPosiciones = new int[textoIngresado.length()];
		int[] arregloSimbolosCa = new int[textoIngresado.length()];

		for (int i = 0; i <= textoIngresado.length() - 1; i++) {
			if ((arregloTexto[i] <= 64) || ((arregloTexto[i] >= 91) && (arregloTexto[i] <= 96)) || (arregloTexto[i] >= 123)) {
				arregloPosiciones[contadorSimbolos] = (textoIngresado.length() -1) - i;
				arregloSimbolosCa[contadorSimbolos] = arregloTexto[i];
				contadorSimbolos++;
			}
		}

		for (contador = textoIngresado.length() - 1; contador >= 0; --contador) {
			for (int j = 0; j <= arregloPosiciones.length - 1; j++) {
				if (contador == arregloPosiciones[j]) {
					System.out.print("" + (char) arregloSimbolosCa[j]);
				}
			}

			if ((arregloTexto[contador] >= 65 && arregloTexto[contador] <= 90)
					|| (arregloTexto[contador] >= 97 && arregloTexto[contador] <= 122)) {
				System.out.print("" + arregloTexto[contador]);
			}
		}
    }
    
}
