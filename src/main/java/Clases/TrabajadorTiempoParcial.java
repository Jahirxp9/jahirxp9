
package Clases;


public class TrabajadorTiempoParcial extends Persona implements InTrabajadores {
    private String codigoTtp;
    private int horas;
    private float sueldo;

    public String getCodigoTtp() {
        return codigoTtp;
    }

    public void setCodigoTtp(String codigoTtp) {
        this.codigoTtp = codigoTtp;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public TrabajadorTiempoParcial() {
        this.codigoTtp = "TP00" + Persona.getCodigo();
    }
    

    public TrabajadorTiempoParcial(String codigoTtp, int horas, float sueldo) {
        this.codigoTtp = "TP00" + Persona.getCodigo();
        this.codigoTtp = codigoTtp;
        this.horas = horas;
        this.sueldo = sueldo;
    }

    public TrabajadorTiempoParcial(String codigoTtp, int horas, float sueldo, String apellidos, String nombres, String dni) {
        super(apellidos, nombres, dni);
        this.codigoTtp = "TP00" + Persona.getCodigo();
        this.codigoTtp = codigoTtp;
        this.horas = horas;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        super.toString();
        return "TrabajadorTiempoParcial{" + "codigoTtp=" + codigoTtp + ", horas=" + horas + ", sueldo=" + sueldo + '}';
    }

    @Override
    public float calcularSueldo(int tipo, int nHoras, float monto) {
        if ( tipo == 1 ){ // si tipo es igual a 1 es parcial
            this.sueldo = nHoras * monto;
        }
        return this.sueldo; 
    }    
}
