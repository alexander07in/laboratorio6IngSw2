package co.agenciaviajes.cliente;

import co.agenciaviajes.negocio.CiudadComponent;
import co.agenciaviajes.negocio.PaqueteComponent;
import co.agenciaviajes.negocio.RegionComponent;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander Inagan
 */
public class ClienteMainTest {
    
    public ClienteMainTest() {
        
    }
    
    @Test 
    public void testCliente() throws Exception
    {
        System.out.println("Region Europa");
        PaqueteComponent instancePrincipal = new RegionComponent("Europa");
        PaqueteComponent instancePais1 = new RegionComponent("Italia");
        PaqueteComponent instancePais2 = new RegionComponent("Francia");
        PaqueteComponent instancePais3 = new RegionComponent("España");

        PaqueteComponent instanceCiudad1 = new CiudadComponent("Roma", 1000000);
        PaqueteComponent instanceCiudad2 = new CiudadComponent("Paris", 2000000);
        PaqueteComponent instanceCiudad3 = new CiudadComponent("Madrid", 3000000);
        PaqueteComponent instanceCiudad4 = new CiudadComponent("Valencia", 2000000);
        
        instancePrincipal.addComponent(instancePais1);
        instancePrincipal.addComponent(instancePais2);
        instancePrincipal.addComponent(instancePais3);

        instancePais1.addComponent(instanceCiudad1);
        instancePais2.addComponent(instanceCiudad2);
        instancePais3.addComponent(instanceCiudad3);
        instancePais3.addComponent(instanceCiudad4);

        assertEquals("Europa", instancePrincipal.getNombre());
        assertEquals(8000000, instancePrincipal.getComponentPrecio());
        assertEquals("Italia", instancePais1.getNombre());
        assertEquals(1000000, instancePais1.getComponentPrecio());
        assertEquals("Francia", instancePais2.getNombre());
        assertEquals(2000000, instancePais2.getComponentPrecio());
        assertEquals("España", instancePais3.getNombre());
        assertEquals(5000000, instancePais3.getComponentPrecio());
        
        
        System.out.println("Region Asia");
        PaqueteComponent instancePrincipal2 = new RegionComponent("Asia");
        PaqueteComponent instancePais5 = new RegionComponent("Egipto");
        PaqueteComponent instancePais6 = new RegionComponent("Turquia");
        PaqueteComponent instancePais7 = new RegionComponent("Iran");

        PaqueteComponent instanceCiudad5 = new CiudadComponent("El Cairo", 2000000);
        PaqueteComponent instanceCiudad6 = new CiudadComponent("Alejandria", 3000000);
        PaqueteComponent instanceCiudad7 = new CiudadComponent("Ankara", 4000000);
        PaqueteComponent instanceCiudad8 = new CiudadComponent("Teherán", 5000000);

        instancePrincipal2.addComponent(instancePais5);
        instancePrincipal2.addComponent(instancePais6);
        instancePrincipal2.addComponent(instancePais7);

        instancePais5.addComponent(instanceCiudad5);
        instancePais5.addComponent(instanceCiudad6);
        instancePais6.addComponent(instanceCiudad7);
        instancePais7.addComponent(instanceCiudad8);
        
        assertEquals("Asia", instancePrincipal2.getNombre());
        assertEquals(14000000, instancePrincipal2.getComponentPrecio());
        assertEquals("Egipto", instancePais5.getNombre());
        assertEquals(5000000, instancePais5.getComponentPrecio());
        assertEquals("Turquia", instancePais6.getNombre());
        assertEquals(4000000, instancePais6.getComponentPrecio());
        assertEquals("Iran", instancePais7.getNombre());      
        assertEquals(5000000, instancePais7.getComponentPrecio());
         
    }
        
    
}