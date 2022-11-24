package modelo;

public class Fecha 
{
        protected int dia;
        protected int mes;
        protected int anio;

        public Fecha(int dia, int mes, int anio) 
        {
                this.dia = dia;
                this.mes = mes;
                this.anio = anio;
        }

        public Fecha() 
        {
                this.dia = 0;
                this.mes = 0;
                this.anio = 0;
        }

        public Fecha(String fecha) 
        {
            String[] fechas = fecha.split("/");
            this.dia = Integer.parseInt(fechas[0]);
            this.mes = Integer.parseInt(fechas[1]);
            this.anio = Integer.parseInt(fechas[2]);
                
        }

        public int getDia() 
        {
                return dia;
        }

        public int getMes() 
        {
                return mes;
        }

        public int getAnio() 
        {
                return anio;
        }

        public void setDia(int dia) 
        {
                this.dia = dia;
        }

        public void setMes(int mes) 
        {
                this.mes = mes;
        }

        public void setAnio(int anio) 
        {
                this.anio = anio;
        }

        public void addDias(int d)
        {
                int sum = fechaToDias() + d;
                diasToFecha(sum);
        }

        private int fechaToDias()
        {
                return anio*360 + mes*30 + dia;
        }

        private void diasToFecha(int d)
        {
                int años = (d / 360);
                int meses = (d - (años*360))/ 30;
                int dias = (d - ((años*360)+(meses*30)));

                dia = dias;
                mes = meses;
                anio = años;
                
                if (meses + mes > 12)
                {
                        anio = anio + 1;
                        mes = mes - 12;
                }
        }

        public String toString() 
        {
                return "Fecha: " + dia + "/" + mes + "/" + anio;
        }

        public boolean equals(Object objeto) 
        {
                Fecha temporal = (Fecha) objeto;
                return (dia == temporal.dia) && (mes == temporal.mes) && (anio == temporal.anio);
        }
}