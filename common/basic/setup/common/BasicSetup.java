package basic.setup.common;

import basic.setup.Config.BlockConfig;
import basic.setup.Config.ItemConfig;
import basic.setup.CreativeTab.CreativeBlocks;
import basic.setup.CreativeTab.CreativeItems;
import basic.setup.Properties.BlockProperties;
import basic.setup.Registers.BlockRegister;
import basic.setup.Registers.ItemRegister;
import basic.setup.Registers.LanguageRegister;
import basic.setup.Registers.RecipeRegister;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = BasicSetup.ID, name = "Basic Setup", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class BasicSetup
{
    //Set string ID
    public static final String ID = "Basic Setup";

    //Instance settings
    @Instance(ID)
    public static BasicSetup instance;
    
    //Creative Tabs
    public static CreativeBlocks BlockTab = new CreativeBlocks();
    public static CreativeItems ItemTab = new CreativeItems();
    
    //Config
    public static BlockConfig BlcokConfig = new BlockConfig();
    public static ItemConfig ItemConfig = new ItemConfig();
    
    //Blocks
    public static BlockRegister BlockReg = new BlockRegister();
    
    //Items
    public static ItemRegister ItemReg = new ItemRegister();
    
    //Names
    public static LanguageRegister NameReg = new LanguageRegister();
    
    //Recipes
    public static RecipeRegister RecipeReg = new RecipeRegister();
    
    //Properties
    public static BlockProperties Props = new BlockProperties();
    
    @PreInit
    public void PreInit(FMLPreInitializationEvent event)
    {
        BlcokConfig.PreInit(event);
        ItemConfig.PreInit(event);
    }

    @Init
    public void Init(FMLInitializationEvent event)
    {
        Props.Props();
        BlockReg.registerBlocks();
        NameReg.addNames();
        RecipeReg.addRecipes();
        BlockTab.CreativeProxy();
        ItemTab.CreativeProxy();
    }

    @PostInit
    public void afterLoaded(FMLPostInitializationEvent event)
    {
        
    }
}