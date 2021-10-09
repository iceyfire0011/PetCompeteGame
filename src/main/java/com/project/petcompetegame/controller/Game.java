package com.project.petcompetegame.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Game{
    public void gameInit(int numberOfPlayer, int numberOfRounds){

    }

    public int roundIncrementer(int currentRound,int roundLimit){
        if(currentRound==roundLimit){
            return -1;
        }
        return currentRound++;
    }

    public String gameFinish(String playerName){
        return "Congratulation! The winner is: "+playerName;
    }
}
