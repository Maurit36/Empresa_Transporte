package co.edu.uniquindio.empresaTransporte.factory;

public class ModelFactory {
    private static ModelFactory modelFactory;
    //private static Conexion instancia = new Conexion();

    //Para evitar instancia mediante operador "new"
    private ModelFactory() {
        //inicializarDatos();
    }

    public static ModelFactory getInstancia() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
}