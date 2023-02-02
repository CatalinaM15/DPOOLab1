package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola, mundo!");
		CalculadoraEstadisticas calc = null;
		try {
			calc = LoaderOlimpicos.cargarArchivo("data/atletas.csv");
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archiv.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Existe un error cargando el archivo.");
			e.printStackTrace();
		}
		System.out.println(calc.paisConMasMedallistas());
	}

}




