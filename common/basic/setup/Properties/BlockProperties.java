package basic.setup.Properties;

import basic.setup.Config.BlockConfig;
import basic.setup.Blocks.Block1;
import net.minecraft.block.Block;

public class BlockProperties
{
    //Static Blocks
    public static Block Block1;
    
    public static BlockConfig config = new BlockConfig();
    
    // Properties
    public void Props()
    {
        Block1 = new Block1(BlockConfig.Block1ID, 0).setUnlocalizedName("Block1");
    }
}