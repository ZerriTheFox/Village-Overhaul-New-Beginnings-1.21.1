package net.zerrithefox.overhaulvillage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.zerrithefox.overhaulvillage.items.ModItems;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.recipe.book.RecipeCategory.*;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(MISC, ModItems.WHEEL, 1)
                .pattern("SSS")
                .pattern("SBS")
                .pattern("SSS")
                .input('S', Items.STICK )
                .input('B', ItemTags.BUTTONS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(MISC, ModItems.VILLAGE_SEED, 1)
                .pattern(" E ")
                .pattern("APH")
                .pattern("WBW")
                .input('E', Items.ENCHANTING_TABLE)
                .input('B', ItemTags.BOATS)
                .input('A', Items.IRON_AXE)
                .input('P', Items.IRON_PICKAXE)
                .input('H', Items.IRON_HOE)
                .input('W', ModItems.WHEEL)
                .criterion(hasItem(Items.ENCHANTING_TABLE), conditionsFromItem(Items.ENCHANTING_TABLE))
            .offerTo(exporter);
    }
}
