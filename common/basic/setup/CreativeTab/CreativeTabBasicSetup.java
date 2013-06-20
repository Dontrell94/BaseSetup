package basic.setup.CreativeTab;

import basic.setup.Properties.ItemProperties;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabBasicSetup extends CreativeTabs
{
    public CreativeTabBasicSetup(String par2Str)
    {
        super(par2Str);
    }
    
    public ItemStack getIconItemStack()
    {
        //Change this to modify the custom tab image
        return new ItemStack(ItemProperties.Item1);
    }

    // sets the title/name for the creative tab
    @Override
    public String getTranslatedTabLabel()
    {
        return "Basic Setup";
    }
}