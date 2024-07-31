package nsk.enhanced.Character;

import nsk.enhanced.System.ET;
import nsk.enhanced.Teleport.TeleportRequest;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Character {

    private final Player player;                                            // Player class
    private final UUID uuid;                                                // Player's UUID

    private final List<TeleportRequest> requests = new ArrayList<>();       // Player's teleportation requests

    public Character(Player player) {
        this.player = player;
        this.uuid = player.getUniqueId();
    }

    // --- --- --- --- --- --- --- --- --- //

    public Player getPlayer() {
        return player;
    }

    public UUID getUUID() {
        return uuid;
    }

    public List<TeleportRequest> getRequests() {
        return requests;
    }

    public TeleportRequest getRequest(int index) {
        if (index < requests.size()) {
            return requests.get(index);
        } else {
            return null;
        }
    }

    // --- --- --- --- --- --- --- --- --- //

    public void addRequest(TeleportRequest request) {
        try {
            requests.add(request);
        } catch (Exception e) {
            ET.EnhancedLogger().severe(e.getMessage());
        }
    }

    public void removeRequest(TeleportRequest request) {
        try {
            requests.remove(request);
        } catch (Exception e) {
            ET.EnhancedLogger().severe(e.getMessage());
        }
    }
}
