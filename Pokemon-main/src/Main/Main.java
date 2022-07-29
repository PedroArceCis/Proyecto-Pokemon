package Main;

import Panels.BattlePanel;
import Pokemon.PokemonUniverse;
import Support.Player;
import Support.SkillUniverse;
import Support.TypeUniverse;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main extends Application {

    private PokemonUniverse pu;
    private SkillUniverse su;
    private Player p1;
    private  Player p2;
    private TypeUniverse tu;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        tu = new TypeUniverse();
        su = new SkillUniverse(tu);
        pu = new PokemonUniverse(this, tu);

        List<Integer> ListaEnemy = Arrays.asList(1, 2, 4, 7);
        List<Integer> ListaAlly = Arrays.asList(0, 3, 5, 6);

        Random aleatorio = new Random();

        int ren = ListaEnemy.get(aleatorio.nextInt(ListaEnemy.size()));
        int ral = ListaAlly.get(aleatorio.nextInt(ListaAlly.size()));

        p1 = new Player(pu.getPokemon(ral),new ImageView(new Image("file:data/pokeAlly1.png")));
        p2 = new Player(pu.getPokemon(ren),new ImageView(new Image("file:data/Ash_enemy1.png")));
        BattlePanel p = new BattlePanel(p1,p2);
        primaryStage.setTitle("Batalla Pokemon");
        primaryStage.setScene(new Scene(p, 1280, 720));

        primaryStage.show();
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                Platform.exit();
                System.exit(0);
            }
        });
    }

    public PokemonUniverse getPu(){
        return pu;
    }

    public SkillUniverse getSu(){
        return su;
    }
}
