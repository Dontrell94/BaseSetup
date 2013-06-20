package basic.setup.CreativeTab;

import basic.setup.Properties.ItemProperties;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CreativeItems
{
    //Set up items here
    public static Block Item1;
    
 // Creative Tab
    public static CreativeTabs customTab = new CreativeTabBasicSetup("Basic Setup");
    
    public void CreativeProxy()
    {
     // Creative Tab
        LanguageRegistry.instance().addStringLocalization("Basic Setup","en_US", "Basic Setup");
        ItemProperties.Item1.setCreativeTab(CreativeItems.customTab);
    }
}
