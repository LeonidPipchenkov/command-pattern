package net.happiness.command.mario;

import net.happiness.command.Command;
import net.happiness.model.MarioCharacter;

public class MarioLeftCommand implements Command {

    private final MarioCharacter marioCharacter;

    public MarioLeftCommand(MarioCharacter marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveLeft();
    }

}
