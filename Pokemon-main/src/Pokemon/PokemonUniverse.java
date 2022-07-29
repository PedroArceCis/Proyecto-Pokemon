package Pokemon;

import Main.Main;
import Support.TypeUniverse;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class PokemonUniverse {
    private ImageView im0 = new ImageView(new Image("file:data/Pikachu.png"));
    private ImageView im1 = new ImageView(new Image("file:data/Slowpoke.png"));
    private ImageView im2 =new ImageView(new Image("file:data/charizard_enemy.png"));
    private ImageView im3 =new ImageView(new Image("file:data/charizard_ally.png"));
    private ImageView im4 =new ImageView(new Image("file:data/blastoise_enemy.png"));
    private ImageView im5 =new ImageView(new Image("file:data/blastoise_ally.png"));
    private ImageView im6 =new ImageView(new Image("file:data/venusaur_ally.png"));
    private ImageView im7 =new ImageView(new Image("file:data/venusaur_enemy.png"));
    Pokemon[] list = new Pokemon[10];
    public PokemonUniverse(Main main, TypeUniverse tu){

        list[0] = new Pokemon("Pikachu", im0, 120, tu.getType(2));
        list[1] = new Pokemon("Slowpoke", im1, 180, tu.getType(0));
        list[2] = new Pokemon("Charizard",im2,270,tu.getType(1));
        list[3] = new Pokemon("Charizard",im3,270,tu.getType(1));
        list[4] = new Pokemon("Blastoise",im4,270,tu.getType(0));
        list[5] = new Pokemon("Blastoise",im5,270,tu.getType(0));
        list[6] = new Pokemon("Venusaur",im6,270,tu.getType(5));
        list[7] = new Pokemon("Venusaur",im7,270,tu.getType(5));

        list[0].learnSkill(main.getSu().getSkill(0));
        list[0].learnSkill(main.getSu().getSkill(1));
        list[0].learnSkill(main.getSu().getSkill(4));
        list[0].learnSkill(main.getSu().getSkill(7));

        list[1].learnSkill(main.getSu().getSkill(5));
        list[1].learnSkill(main.getSu().getSkill(6));
        list[1].learnSkill(main.getSu().getSkill(4));
        list[1].learnSkill(main.getSu().getSkill(7));

        list[2].learnSkill(main.getSu().getSkill(0));
        list[2].learnSkill(main.getSu().getSkill(2));
        list[2].learnSkill(main.getSu().getSkill(6));
        list[2].learnSkill(main.getSu().getSkill(8));

        list[3].learnSkill(main.getSu().getSkill(0));
        list[3].learnSkill(main.getSu().getSkill(2));
        list[3].learnSkill(main.getSu().getSkill(6));
        list[3].learnSkill(main.getSu().getSkill(8));

        list[4].learnSkill(main.getSu().getSkill(12));
        list[4].learnSkill(main.getSu().getSkill(5));
        list[4].learnSkill(main.getSu().getSkill(11));
        list[4].learnSkill(main.getSu().getSkill(13));

        list[5].learnSkill(main.getSu().getSkill(7));
        list[5].learnSkill(main.getSu().getSkill(5));
        list[5].learnSkill(main.getSu().getSkill(11));
        list[5].learnSkill(main.getSu().getSkill(13));

        list[6].learnSkill(main.getSu().getSkill(12));
        list[6].learnSkill(main.getSu().getSkill(9));
        list[6].learnSkill(main.getSu().getSkill(4));
        list[6].learnSkill(main.getSu().getSkill(10));

        list[7].learnSkill(main.getSu().getSkill(12));
        list[7].learnSkill(main.getSu().getSkill(9));
        list[7].learnSkill(main.getSu().getSkill(4));
        list[7].learnSkill(main.getSu().getSkill(10));
    }


    public Pokemon getPokemon(int i){
        return list[i];
    }
}
