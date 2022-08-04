package gregification.forestry;

import gregification.base.BaseConfig;
import gregification.base.ModIDs;
import gregification.base.Module;
import gregtech.api.GregTechAPI;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Module.Root(name = "Gregification: Forestry")
public class ForestryModule implements Module {

    @Module.Log
    public static Logger logger;

    @SidedProxy(
            clientSide = "gregification.forestry.ForestryClient",
            serverSide = "gregification.forestry.ForestryCommon"
    )
    protected static ForestryCommon proxy;

    @Override
    public boolean isModuleActive() {
        return BaseConfig.enableForestryModule && Loader.isModLoaded(ModIDs.MODID_FR);
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Override
    public void registerItems(RegistryEvent.Register<Item> event) {
        proxy.registerItems(event);
    }

    @Override
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        proxy.registerRecipes(event);
    }

    @Override
    public void registerModels(ModelRegistryEvent event) {
        proxy.registerModels(event);
    }

    @Override
    public void registerMaterials(GregTechAPI.MaterialEvent event) {
        proxy.registerMaterials(event);
    }
}
