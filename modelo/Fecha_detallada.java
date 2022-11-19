package modelo;

public class FechaDetallada extends Fecha{
  //Atributos
  private static String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};  
  

  //Constructor nulo
  public FechaDetallada()
  {
      super();
  }
  
  //constructor que recibe dia,mes,año
   public FechaDetallada(int dia,int mes,int anio)
   {
    super(dia,mes,anio);
   }
   
   //constructor que recibe la cadena  dd/mm/aaaa
   public FechaDetallada(String s)
   {
    super(s);
   }
  
   public String toString()
   {
      return dia + " de " + meses[getMes()-1] + " de " + anio;
   }
}
  
