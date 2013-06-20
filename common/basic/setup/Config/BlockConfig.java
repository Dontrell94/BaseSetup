package basic.setup.Config;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class BlockConfig
{
    //Set config integers
    public static int Block1ID;
    
    public void PreInit(FMLPreInitializationEvent event)
    {
        // Configurations
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        Block1ID = config.getBlock("Block1", 1500).getInt();
        config.save();
    }
}