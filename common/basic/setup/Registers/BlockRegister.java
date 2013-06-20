package basic.setup.Registers;

import basic.setup.Properties.BlockProperties;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister
{
    public void registerBlocks()
    {
        //Add blocks in this fashion
        GameRegistry.registerBlock(BlockProperties.Block1, "Block1");
    }
}