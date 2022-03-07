package tarea_U7;

import java.util.*;


public class CCuentaAhorro extends CCuenta{
	
	// Atributos incorporados
	protected double cuotaMantenimiento;
	
	// Constructor
	public CCuentaAhorro(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres, double cuotaMantenimiento) 
	{
		super(nombreTitular, numCuenta, saldo, tipoDeInteres);
		this.cuotaMantenimiento = cuotaMantenimiento;
		
	}
	
	// Getter que establece la cuota de mantenimiento de la cuenta. 
	protected double getCuotaManten() 
	{
		return cuotaMantenimiento;
	}
	
	// Setter que devuelve la cuota de mantenimiento de la cuenta.
	protected void setCuotaManten(double cuotaMantenimiento) 
	{
		this.cuotaMantenimiento = cuotaMantenimiento;
	}
	
	// Metodos abstractos sobrescritos
	@Override
	protected void comisiones() 
	{
		int diaDelMes;
		GregorianCalendar gcalendario = new GregorianCalendar();
		diaDelMes = gcalendario.get(Calendar.DAY_OF_MONTH);
		if(diaDelMes == 1) {
			saldo =- cuotaMantenimiento;
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
			gananciaInteresAcumulado = saldo * (tipoDeInteres / 100);
			System.out.println(gananciaInteresAcumulado);
			saldo += gananciaInteresAcumulado;
			return saldo;
		}else return 0.0;
		
	}
}