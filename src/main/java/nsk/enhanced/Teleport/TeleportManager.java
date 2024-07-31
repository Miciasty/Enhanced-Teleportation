package nsk.enhanced.Teleport;

import nsk.enhanced.Character.Character;
import nsk.enhanced.EnhancedTeleportation;
import nsk.enhanced.System.ET;
import org.bukkit.entity.Player;

import java.util.List;

public class TeleportManager {

    private static final EnhancedTeleportation plugin = ET.getInstance();
    private static final List<Character> characters = plugin.getCharacters();

    // --- --- --- --- --- --- --- --- --- //

    public static List<TeleportRequest> getTeleportRequests(Player player) {

        for (Character character : characters) {
            if (character.getPlayer().equals(player)) {

                return character.getRequests();

            }
        }

        return null;

    }

    public static void

}
