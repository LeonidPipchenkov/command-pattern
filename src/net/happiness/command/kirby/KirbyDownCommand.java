package net.happiness.command.kirby;

import net.happiness.command.Command;
import net.happiness.model.KirbyCharacter;

public class KirbyDownCommand implements Command {

    private final KirbyCharacter kirbyCharacter;

    public KirbyDownCommand(KirbyCharacter kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveDown();
    }

}
