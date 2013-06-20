package basic.setup.Properties;

import basic.setup.Config.ItemConfig;
import basic.setup.Items.Item1;
import net.minecraft.item.Item;

public class ItemProperties
{
    //Static Blocks
    public static Item Item1;
    
    public static ItemConfig config = new ItemConfig();
    
    // Properties
    public void Props()
    {
        Item1 = new Item1(ItemConfig.Item1ID, 0).setUnlocalizedName("Item1");
    }
}