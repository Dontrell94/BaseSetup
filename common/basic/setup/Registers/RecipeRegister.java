package basic.setup.Registers;

import basic.setup.Properties.BlockProperties;
import basic.setup.Properties.ItemProperties;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeRegister
{
    public void addRecipes()
    {
        //Add recipes for blocks
        GameRegistry.addRecipe(new ItemStack(BlockProperties.Block1, 1), new Object[] {"DDD", "DDD", "DDD", 'D', Block.dirt});
        
        //Add recipes for Items
        GameRegistry.addRecipe(new ItemStack(ItemProperties.Item1, 1), new Object[] {"SSS", "SSS", "SSS", 'S', Block.sand});
    }
}