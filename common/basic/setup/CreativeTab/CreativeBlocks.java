package basic.setup.CreativeTab;

import basic.setup.Properties.BlockProperties;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CreativeBlocks
{
    //Set up blocks here
    public static Block Block1;
    
    // Creative Tab
    public static CreativeTabs customTab = new CreativeTabBasicSetup("Basic Setup");
    
    public void CreativeProxy()
    {
        //Blocks
        LanguageRegistry.instance().addStringLocalization("Basic Setup","en_US", "Basic Setup");
        BlockProperties.Block1.setCreativeTab(CreativeBlocks.customTab);
    }
}