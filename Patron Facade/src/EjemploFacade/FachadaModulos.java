/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploFacade;

/**
 *
 * @author Tonny
 */
public class FachadaModulos {

    public Peticiones peticiones;
    public Quejas quejas;
    public Reclamos reclamos;
    public OportunidadVentas oportunidadVentas;
    public VentaProductos ventaProductos;
    public Servicios servicio;
    public ConsultarHistoriaCrédito consultarHistoriaCredito;
    public SegmentacionClientes segmentacion;
    public CreacionPlanes creacionPlanes;
    public CreacionCampañas creacionCampañas;
    
    

    public FachadaModulos() {
        this.peticiones = new Peticiones("Historial Credito");
        this.quejas = new Quejas("");
        this.reclamos = new Reclamos("");
        this.oportunidadVentas = new OportunidadVentas("Oportunidad Ventas");
        this.ventaProductos = new VentaProductos("");
        this.servicio = new Servicios("");
        this.consultarHistoriaCredito = new ConsultarHistoriaCrédito("");
        this.segmentacion = new SegmentacionClientes("");
        this.creacionPlanes = new CreacionPlanes("");
        this.creacionCampañas = new CreacionCampañas("");
        
    }

    public void InicioMetodos() {
        System.out.println("* Ventas " + this.oportunidadVentas.getNombre());
        System.out.println("* historial " + this.peticiones.getNombre());
    }
}
