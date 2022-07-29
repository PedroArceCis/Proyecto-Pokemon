package Support;

public class SkillUniverse {

    private Skill []skillList = new Skill[20];
    public SkillUniverse(TypeUniverse tu){
        //normal
        skillList[0] = new Skill("Rapidez", 30,tu.getType(4) );
        //electricidad
        skillList[1] = new Skill("Voltio cruel", 50, tu.getType(2));
        //acero
        skillList[2] = new Skill("Cola de hierro", 40, tu.getType(3));
        //normal
        skillList[4]  =new Skill("Bostezo",0, tu.getType(4));
        //agua
        skillList[5] = new Skill("Surf", 30, tu.getType(0));
        //fuego
        skillList[6] = new Skill("Llamarada", 60, tu.getType(1));
        //normal
        skillList[7] = new Skill("Placaje",30,tu.getType(4));
        //fuego
        skillList[8] = new Skill("Sofoco",70,tu.getType(1));
        //planta
        skillList[9] = new Skill("Tormenta Floral",50,tu.getType(5));
        //planta
        skillList[10] = new Skill("Rayo solar",70,tu.getType(5));
        //agua
        skillList[11] = new Skill("hidrobomba",70,tu.getType(0));
        //normal
        skillList[12] = new Skill("Cabezazo",70,tu.getType(4));
        //agua
        skillList[13] = new Skill("Hidrocañon",40,tu.getType(0));

    }

    public Skill getSkill(int i){
        return skillList[i];
    }
}
