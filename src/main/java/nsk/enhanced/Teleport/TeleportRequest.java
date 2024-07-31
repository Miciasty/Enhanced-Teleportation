package nsk.enhanced.Teleport;

import org.bukkit.entity.Player;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TeleportRequest {

    private final Player sender;          // Player that sent Teleportation Request
    private final Player receiver;        // Player that received Teleportation Request
    private final Long timestamp;         // Creation time.

    public TeleportRequest(Player sender, Player receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.timestamp = System.currentTimeMillis();
    }

    // --- --- --- --- --- --- --- --- --- //

    public Player getSender() {
        return sender;
    }

    public Player getReceiver() {
        return receiver;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getFormattedTimestamp() {

        Date date = new Date(timestamp);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        return formatter.format(date);
    }

    // --- --- --- --- --- --- --- --- --- //

    @Override
    public String toString() {

        StringBuilder request = new StringBuilder();

        request.append("\n");
        request.append("<green>Request creation: <aqua>").append(getFormattedTimestamp()).append("</aqua></green>\n");
        request.append("<green>Sender: <gray>").append(sender.getName()).append("</gray></green>\n");
        request.append("<green>Sender: <gray>").append(sender.getName()).append("</gray></green>\n");

        return request.toString();
    }
}
