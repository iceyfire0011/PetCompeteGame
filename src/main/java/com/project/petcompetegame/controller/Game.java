package com.project.petcompetegame.controller;

import com.project.petcompetegame.service.GameService.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class Game{
    IGameService iGameService;

    Game(IGameService _GameService){
        this.iGameService = _GameService;
    }

    public void gameInit(){
        Scanner sc = new Scanner(System.in);
        int roundNumber = 0, roundLimit = 0;
        System.out.println("Please enter number of player (1-4): ");
        int numberOfPlayer = sc.nextInt();
        while(roundLimit > 4 || roundLimit < 31){
            System.out.println("Please enter number of round (5-30): ");
            roundLimit = sc.nextInt();
        }
        System.out.println("Please enter balance for each player: ");
        double balance = sc.nextDouble();
        iGameService.gameRun(numberOfPlayer, roundNumber, roundLimit, balance);
    }

    public String gameFinish(String playerName){
        return "Congratulation! The winner is: " + playerName;
    }
}
