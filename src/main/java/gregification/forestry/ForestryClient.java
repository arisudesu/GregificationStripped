package gregification.forestry;

import gregification.forestry.bees.CombItemColor;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ForestryClient extends ForestryCommon {
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);

        if (ForestryUtils.apicultureEnabled()) {
            if (ForestryConfig.gtBees) {
                Minecraft.getMinecraft().getItemColors().registerItemColorHandler(CombItemColor.INSTANCE, ForestryCommon.gtCombs, ForestryClient.gtDrops);
            }
        }
    }
}
