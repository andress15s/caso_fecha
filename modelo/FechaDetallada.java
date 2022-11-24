package modelo;

public class FechaDetallada extends Fecha
{
    private int dia;
    private int mes;
    private int año;

    public FechaDetallada(int dia, int mes, int año)
    {
        super(dia, mes, año);
    }

    public FechaDetallada() 
        {
                super();
        }

    public String fechaDetallada() 
        {
            String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
            
            int Mes = getMes() -1;

                return "Fecha: " + getDia() + " de " + meses[Mes] + " de " + getAnio();
        }

    public FechaDetallada(String s)
        {
           super(s);
        }

}