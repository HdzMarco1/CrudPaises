package com.example.productospais.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "producto")
public class ProductosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String code;

    @NotNull
    private String nombre;

    @Temporal(TemporalType.DATE)
    private Date fechaEmbarque;

    @Temporal(TemporalType.DATE)
    private Date fechaLlegada;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "pais_origen_id")
    private PaisModel paisOrigenId;

    @ManyToOne
    @JoinColumn(name = "pais_destino_id")
    private  PaisModel paisDestinoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaEmbarque() {
        return fechaEmbarque;
    }

    public void setFechaEmbarque(Date fechaEmbarque) {
        this.fechaEmbarque = fechaEmbarque;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public PaisModel getPaisOrigenId() {
        return paisOrigenId;
    }

    public void setPaisOrigenId(PaisModel paisOrigenId) {
        this.paisOrigenId = paisOrigenId;
    }

    public PaisModel getPaisDestinoId() {
        return paisDestinoId;
    }

    public void setPaisDestinoId(PaisModel paisDestinoId) {
        this.paisDestinoId = paisDestinoId;
    }
}
