package morecores;

import arc.*;
import mindustry.mod.*;
import morecores.content.*;
//carga todos los paquetes de contenido, como bloques, unidades, etc.
public class MoreCores extends Mod {
    
    public MoreCores() {
        Log.info("More Cores mod cargado");
    }
    
    @Override
    public void loadContent() {
        Log.info("Cargando contenido del mod");
        CustomBlocks.load();
        // units.load();      
        // items.load();
    }
    
    @Override
    public void init() {
        Log.info("Inicializando MultiCore Mod");
    }
}