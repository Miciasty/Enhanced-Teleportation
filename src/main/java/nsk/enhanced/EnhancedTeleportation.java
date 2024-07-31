package nsk.enhanced;

import nsk.enhanced.Character.Character;
import nsk.enhanced.System.ET;
import nsk.enhanced.System.EnhancedLogger;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class EnhancedTeleportation extends JavaPlugin {

    private EnhancedLogger enhancedLogger;

    private final List<Character> characters = new ArrayList<Character>();

    @Override
    public void onEnable() {

        ET.setInstance(this);
        enhancedLogger = new EnhancedLogger(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public EnhancedLogger getEnhancedLogger() {
        return enhancedLogger;
    }

    public List<Character> getCharacters() {
        return characters;
    }

}
