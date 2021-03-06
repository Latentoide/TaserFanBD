package es.ieslvareda.server.controllers;

import es.ieslvareda.model.Authentification;
import es.ieslvareda.model.Tablas;
import es.ieslvareda.model.Vehiculo;
import es.ieslvareda.server.model.JsonTransformer;
import es.ieslvareda.server.model.empleado.IEmpleadoService;
import es.ieslvareda.server.model.empleado.ImpEmpeladoService;
import es.ieslvareda.server.model.vehiculo.IVehiculoService;
import es.ieslvareda.server.model.vehiculo.ImpVehiculoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import java.util.List;

public class VehiculoController {
    static Logger logger = LoggerFactory.getLogger(EmpleadoController.class);
    private static IVehiculoService service = new ImpVehiculoService();
    private static JsonTransformer<Vehiculo> jsonTransformer = new JsonTransformer<>();

    public static List<Vehiculo> getAllVehicles(Request req, Response res){
        logger.info("Receiving request for all vehiculos");
        return service.getAll();
    }

}
