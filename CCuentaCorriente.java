package tarea_U7;

import java.util.*;

public class CCuentaCorriente extends CCuenta {

	// Atributos
	public int transacciones = 0;
	protected double importePorTrans;
	protected int transExentas;
	
	// Constructor
	public CCuentaCorriente(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres, double importePorTrans, int transExentas) 
	{
		super(nombreTitular, numCuenta, saldo, tipoDeInteres);
		this.importePorTrans = importePorTrans;
		this.transExentas = transExentas;
	}
	
	// Getter que devuelve el importe por transacción.
	protected double getImportePorTrans() 
	{
		return importePorTrans;
	}
	
	// Setter que establece el importe de transacción.
	protected void setImportePorTrans(double importePorTrans) 
	{
		this.importePorTrans = importePorTrans;
	}
	
	// Getter que devuelve el número de transacciones exentas.
	protected int getTransExentas() 
	{
		return transExentas;
	}
	
	// Setter que establece el número de transacciones exentas.
	protected void setTransExentas(int transExentas) 
	{
		this.transExentas = transExentas;
	}
	
	// Metodos*
	
	// Decrementa en 1 el número de transacciones.
	protected void decrementarTransacciones() 
	{
		transacciones--;
	}
	
	// Añade la cantidad ingresada al saldo e incrementa el número de transacciones. 
	protected void ingreso(double cantidad) 
	{
		super.ingreso(cantidad);
		transacciones++;
	}
	
	// Resta la cantidad del saldo actual e incrementa el número de transacciones. 
	protected void reintegro(double cantidad) 
	{
		super.reintegro(cantidad);
		transacciones++;
	}
	// Metodos abstractos sobrescritos
	@Override
	protected void comisiones() 
	{
		int diaDelMes;
		GregorianCalendar gcalendario = new GregorianCalendar();
		diaDelMes = gcalendario.get(Calendar.DAY_OF_MONTH);
		if(diaDelMes == 1) {
			saldo -= (importePorTrans * (transacciones - transExentas));
			transacciones = 0;
		}
		
	}

	@Override
	protected double intereses() 
	{
		int diaDelMes;
		double gananciaInteresAcumulado = 0.0;
		GregorianCalendar gcalendario = new GregorianCalendar();
		diaDelMes = gcalendario.get(Calendar.DAY_OF_MONTH);
		if(diaDelMes == 1) {
			if(saldo < 3000) {
				gananciaInteresAcumulado = saldo * 0.005;
			}else {
				gananciaInteresAcumulado = (3000 * 0.005) + ((saldo - 3000) * (tipoDeInteres / 100));
			}
			saldo += gananciaInteresAcumulado;
			return saldo;
		}else return 0.0;
		
	}
}