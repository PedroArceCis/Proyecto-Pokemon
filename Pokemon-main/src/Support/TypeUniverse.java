package Support;

import java.util.ArrayList;

public class TypeUniverse {

    private Type [] list = new Type[7];
    public TypeUniverse(){

        Type water = new Type("Agua");
        Type fire = new Type("Fuego");
        Type electron = new Type("Eléctrico");
        Type iron = new Type("Hierro");
        Type normal = new Type("Normal");
        Type grass = new Type("Planta");

        water.setCounterList(electron,grass);
        water.setAntiCounterList(fire);

        fire.setCounterList(water);
        fire.setAntiCounterList(iron,grass);

        electron.setCounterList();
        electron.setAntiCounterList(water);

        iron.setCounterList(fire);
        iron.setAntiCounterList();

        grass.setCounterList(fire);
        grass.setAntiCounterList(water);

        list[0] = water;
        list[1] = fire;
        list[2] = electron;
        list[3] = iron;
        list[4] = normal;
        list[5] = grass;
    }

    public Type getType(int i){
        return list[i];
    }
}
