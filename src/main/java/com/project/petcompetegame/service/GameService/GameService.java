package com.project.petcompetegame.service.GameService;

import org.springframework.stereotype.Service;

@Service
public class GameService implements IGameService{
    public int roundIncrementer(int currentRound,int roundLimit){
        if(currentRound==roundLimit){
            return -1;
        }
        return currentRound++;
    }

    @Override
    public int gameRun(int numberOfPlayer, int roundNumber, int roundLimit, double balance){
        return 0;
    }
}
