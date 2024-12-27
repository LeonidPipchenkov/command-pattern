package net.happiness.command.mario;

import net.happiness.command.Command;
import net.happiness.model.MarioCharacter;

public class MarioRightCommand implements Command {

    private final MarioCharacter marioCharacter;

    public MarioRightCommand(MarioCharacter marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveRight();
    }

}
