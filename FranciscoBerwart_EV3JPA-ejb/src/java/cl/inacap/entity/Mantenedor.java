/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author francisco.
 */
@Entity
public class Mantenedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codEmpleado;
    
    // Se generan dos columnas más {Emplado: codEmpleado, nombre, apellidoPat, apellidoMat, sueldo}
    @Column
    private String nombre;
    @Column
    private String apePat;
    @Column
    private String apeMat;
    @Column
    private int sueldo;

    //Constructor por defecto.
    public Mantenedor() {
    }

    
    //Constructor con parametros.
    public Mantenedor(String nombre, String apePat, String apeMat, int sueldo) {
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    

    public Long getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(Long codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEmpleado != null ? codEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the codEmpleado fields are not set
        if (!(object instanceof Mantenedor)) {
            return false;
        }
        Mantenedor other = (Mantenedor) object;
        if ((this.codEmpleado == null && other.codEmpleado != null) || (this.codEmpleado != null && !this.codEmpleado.equals(other.codEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.inacap.entity.Mantenedor[ id=" + codEmpleado + " ]";
    }
    
}
