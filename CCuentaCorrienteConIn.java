package tarea_U7;

import java.util.*;

	//*Cuenta corriente con intereses
public class CCuentaCorrienteConIn extends CCuentaCorriente {

	//metodo constructor
	public CCuentaCorrienteConIn(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres,
			double importePorTrans, int transExentas) {
		super(nombreTitular, numCuenta, saldo, tipoDeInteres, importePorTrans, transExentas);
	}

	//Metodo abstracto sobrescrito
	@Override
	protected double intereses() 
	{
		int diaDelMes;
		double gananciaInteresAcumulado = 0.0;
		GregorianCalendar gcalendario = new GregorianCalendar();
		diaDelMes = gcalendario.get(Calendar.DAY_OF_MONTH);
		if(diaDelMes == 1) {
			if(saldo > 3000) {
				gananciaInteresAcumulado = saldo * (tipoDeInteres / 100);
				return gananciaInteresAcumulado;
			}else return 0.0;
		}else return 0.0;
	}
}