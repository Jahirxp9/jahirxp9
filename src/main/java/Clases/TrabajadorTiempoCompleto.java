
package Clases;

import java.util.Date;


public class TrabajadorTiempoCompleto extends Persona implements InTrabajadores {
    private String codigoTC;
    private float sueldo;
    private String cargo;
    private Date fechaIngreso;

    public String getCodigoTC() {
        return codigoTC;
    }

    public void setCodigoTC(String codigoTC) {
        this.codigoTC = codigoTC;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public TrabajadorTiempoCompleto() {
        this.codigoTC = "TC00" + Persona.getCodigo();
    }

    public TrabajadorTiempoCompleto(String codigoTC, float sueldo, String cargo, Date fechaIngreso) {
        this.codigoTC = "TC00" + Persona.getCodigo();
        this.codigoTC = codigoTC;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }

    public TrabajadorTiempoCompleto(String codigoTC, float sueldo, String cargo, Date fechaIngreso, String apellidos, String nombres, String dni) {
        super(apellidos, nombres, dni);
        this.codigoTC = "TC00" + Persona.getCodigo();
        this.codigoTC = codigoTC;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "TrabajadorTiempoCompleto{" + "codigoTC=" + codigoTC + ", sueldo=" + sueldo + ", cargo=" + cargo + ", fechaIngreso=" + fechaIngreso + '}';
    }

    @Override
    public float calcularSueldo(int tipo, int nHoras, float monto) {
        if ( tipo == 0 ){ // 0 es para tiempos completo
            this.sueldo -= 100;
        }
         return this.sueldo;   
    }
    
}
