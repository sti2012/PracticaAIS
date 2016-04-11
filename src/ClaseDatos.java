package calculadora;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class ClaseDatos {
    
    public static void obtenerResultado() {
        ScriptEngineManager Manager = new ScriptEngineManager();
        ScriptEngine Engine = Manager.getEngineByName("JavaScript");
        String Texto = ClaseInterfaz.pantalla.getText();
        try{
            ClaseInterfaz.pantalla.setText(Engine.eval(Texto).toString());
        } catch (Exception e) {
            ClaseInterfaz.pantalla.setText("Syntax error");
        }
    }
}