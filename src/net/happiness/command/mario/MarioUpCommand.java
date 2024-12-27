package net.happiness.command.mario;

import net.happiness.model.MarioCharacter;
import net.happiness.command.Command;

public class MarioUpCommand implements Command {

    private final MarioCharacter marioCharacter;

    public MarioUpCommand(MarioCharacter marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveUp();
    }

}
