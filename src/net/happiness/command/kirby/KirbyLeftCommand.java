package net.happiness.command.kirby;

import net.happiness.command.Command;
import net.happiness.model.KirbyCharacter;

public class KirbyLeftCommand implements Command {

    private final KirbyCharacter kirbyCharacter;

    public KirbyLeftCommand(KirbyCharacter kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveLeft();
    }

}
