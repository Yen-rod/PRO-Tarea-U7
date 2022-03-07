package tarea_U7;

import java.io.IOException;

public class Test

{

  public static void main(String[] args) throws IOException

  {

    CCuentaAhorro cliente01 = new CCuentaAhorro(

                   "Angel Lillo", "111/6666", 10000, 3.5, 30);

 

    System.out.println(cliente01.getNombre());

    System.out.println(cliente01.getCuenta());

    System.out.println(cliente01.getSaldo());

    System.out.println(cliente01.getTipoInteres());

    System.out.println(cliente01.intereses());

 
    //la subclase  CCuentaCorrienteConIn requiere de parametros para la herencia de la superclase CCuentaCorriente
    CCuentaCorrienteConIn cliente02 = new  CCuentaCorrienteConIn(null, null, 0,0,0,0);

    cliente02.setNombre("Ainhoa");

    cliente02.setCuenta("1234567890");

    cliente02.setTipoInteres(3.0);

    cliente02.setTransExentas(0);

    cliente02.setImportePorTrans(1.0);

 

    cliente02.ingreso(20000);

    cliente02.reintegro(10000);

    cliente02.intereses();

    cliente02.comisiones();

    System.out.println(cliente02.getNombre());

    System.out.println(cliente02.getCuenta());

    System.out.println(cliente02.getSaldo());

  

  }

}
