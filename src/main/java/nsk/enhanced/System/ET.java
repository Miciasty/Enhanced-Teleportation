package nsk.enhanced.System;

import nsk.enhanced.Character.Character;
import nsk.enhanced.EnhancedTeleportation;
import org.bukkit.entity.Player;

import java.util.List;

public class ET {


    private static EnhancedTeleportation instance;
    public static EnhancedTeleportation getInstance() {
        return instance;
    }
    public static void setInstance(EnhancedTeleportation in) {
        instance = in;
    }

    // --- --- --- --- --- --- --- --- --- //

    public static EnhancedLogger EnhancedLogger() {
        return getInstance().getEnhancedLogger();
    }

    // --- --- --- --- --- --- --- --- --- //

    public static Character getCharacter(Player player) {
        List<Character> characters = getInstance().getCharacters();

        for (Character character : characters) {
            if (character.getPlayer().equals(player)) {
                return character;
            }
        }
        return null;
    }

}
