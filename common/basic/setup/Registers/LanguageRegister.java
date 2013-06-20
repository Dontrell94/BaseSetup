package basic.setup.Registers;

import basic.setup.Properties.BlockProperties;
import basic.setup.Properties.ItemProperties;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageRegister
{
    public void addNames()
    {
        //Block additions
        LanguageRegistry.addName(BlockProperties.Block1,"Basic Block");
        
        //Item additions
        LanguageRegistry.addName(ItemProperties.Item1,"Basic Item");
    }
}