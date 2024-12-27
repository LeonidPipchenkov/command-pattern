package net.happiness.command.kirby;

import net.happiness.command.Command;
import net.happiness.model.KirbyCharacter;

public class KirbyUpCommand implements Command {

    private final KirbyCharacter kirbyCharacter;

    public KirbyUpCommand(KirbyCharacter kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveUp();
    }

}
