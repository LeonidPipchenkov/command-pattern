package net.happiness.command.impl;

import net.happiness.model.MarioCharacter;
import net.happiness.command.Command;

public class MarioDownCommand implements Command {

    private final MarioCharacter marioCharacter;

    public MarioDownCommand(MarioCharacter marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveDown();
    }

}
