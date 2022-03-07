package tarea_U7;

public abstract class CCuenta {

	// Atributos
		protected String nombreTitular;
		protected String numCuenta;
		protected double saldo;
		protected double tipoDeInteres;
		
		// Constructor
		public CCuenta(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres) 
		{
			this.nombreTitular = nombreTitular;
			this.numCuenta = numCuenta;
			this.saldo = saldo;
			this.tipoDeInteres = tipoDeInteres;
		}
		
		// Constructor por defecto
		public CCuenta() 
		{
		}
		
		// Getters*
		
		//Retorna el nombre.
		protected String getNombre() 
		{
			return nombreTitular;
		}
		
		// Retorna el n�mero de cuenta.
		protected String getCuenta() 
		{
			return numCuenta;
		}
		
		//Retorna el saldo de la cuenta.
		protected double getSaldo() 
		{
			return saldo;
		}
		
		//Retorna el tiop de inter�s. 
		protected double getTipoInteres() 
		{
			return tipoDeInteres;
		}
		
		// Setters*
		
		//Asigna el nombre.
		protected void setNombre(String nombreTitular) 
		{
			this.nombreTitular = nombreTitular;
		}
		
		//Asigna el n�mero de cuenta.
		protected void setCuenta(String numCuenta) 
		{
			this.numCuenta = numCuenta;
		}
		
		//Asigna el saldo de la cuenta.
		protected void setSaldo(double saldo) 
		{
			this.saldo = saldo;
		}
		
		//Asigna el tipo de inter�s.
		protected void setTipoInteres(double tipoDeInteres) 
		{
			this.tipoDeInteres = tipoDeInteres;
		}
		
		// Metodos abstractos*
		
		//Es un m�todo sin par�metros que ser� redefinido en las subclases.
		protected abstract void comisiones();
		
		// Calcula los intereses producidos
		protected abstract double intereses();
		
		// Metodos*
		
		//A�ade la cantidad especificada al saldo actual de la cuenta.
		protected void ingreso(double cantidad) 
		{
			saldo += cantidad;
		}
		
		//Resta la cantidad especificada del saldo actual de la cuenta.
		protected void reintegro(double cantidad) 
		{
			saldo -= cantidad;
		}
		
	}
