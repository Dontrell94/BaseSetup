package basic.setup.Config;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ItemConfig
{
    //Set config integers
    public static int Item1ID;
    
    public void PreInit(FMLPreInitializationEvent event)
    {
        // Configurations
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        Item1ID = config.getItem("Item1", 450).getInt();
        config.save();
    }
}