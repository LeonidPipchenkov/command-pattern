package net.happiness.command.kirby;

import net.happiness.command.Command;
import net.happiness.model.KirbyCharacter;

public class KirbyRightCommand implements Command {

    private final KirbyCharacter kirbyCharacter;

    public KirbyRightCommand(KirbyCharacter kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveRight();
    }

}
