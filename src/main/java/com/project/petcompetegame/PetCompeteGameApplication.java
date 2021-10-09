package com.project.petcompetegame;

import com.project.petcompetegame.controller.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PetCompeteGameApplication implements CommandLineRunner{
    public final Game game;

    private static Logger LOG = LoggerFactory
            .getLogger(PetCompeteGameApplication.class);

    public PetCompeteGameApplication(Game game){
        this.game = game;
    }

    public static void main(String[] args){
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(PetCompeteGameApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception{
        game.gameInit();
        System.out.println(game.gameFinish("player 1"));
    }
}
