package basic.setup.Registers;

import basic.setup.Properties.ItemProperties;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegister
{
    public void registerBlocks()
    {
        //Add items in this fashion
        GameRegistry.registerItem(ItemProperties.Item1, "Item1");
    }
}