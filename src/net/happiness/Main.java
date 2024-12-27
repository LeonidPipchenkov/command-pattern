package net.happiness;

import net.happiness.command.Command;
import net.happiness.command.kirby.KirbyDownCommand;
import net.happiness.command.kirby.KirbyLeftCommand;
import net.happiness.command.kirby.KirbyRightCommand;
import net.happiness.command.kirby.KirbyUpCommand;
import net.happiness.command.mario.MarioDownCommand;
import net.happiness.command.mario.MarioLeftCommand;
import net.happiness.command.mario.MarioRightCommand;
import net.happiness.command.mario.MarioUpCommand;
import net.happiness.model.GameConsole;
import net.happiness.model.KirbyCharacter;
import net.happiness.model.MarioCharacter;

public class Main {

    public static void main(String[] args) {
        playMario();
        System.out.println();
        playKirby();
    }

    private static void playMario() {
        MarioCharacter mario = new MarioCharacter();

        Command marioUpCommand = new MarioUpCommand(mario);
        Command marioDownCommand = new MarioDownCommand(mario);
        Command marioLeftCommand = new MarioLeftCommand(mario);
        Command marioRightCommand = new MarioRightCommand(mario);

        GameConsole gameConsole = new GameConsole(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
        gameConsole.arrowDown();
    }

    private static void playKirby() {
        KirbyCharacter kirby = new KirbyCharacter();

        Command kirbyUpCommand = new KirbyUpCommand(kirby);
        Command kirbyDownCommand = new KirbyDownCommand(kirby);
        Command kirbyLeftCommand = new KirbyLeftCommand(kirby);
        Command kirbyRightCommand = new KirbyRightCommand(kirby);

        GameConsole gameConsole = new GameConsole(kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);
        gameConsole.arrowDown();
        gameConsole.arrowUp();
        gameConsole.arrowLeft();
        gameConsole.arrowRight();
    }

}
