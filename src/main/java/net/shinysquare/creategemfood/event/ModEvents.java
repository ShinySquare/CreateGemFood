package net.shinysquare.creategemfood.event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.shinysquare.creategemfood.item.ModItems;

public class ModEvents {
    @SubscribeEvent
    public void onCakeCrafted(PlayerEvent.ItemCraftedEvent event) {
        if (event.getCrafting().getItem() == ModItems.HALF_BREAD.get()) {
            // Explicit cast to CraftingContainer
            CraftingContainer grid = (CraftingContainer) event.getInventory();

            for (int i = 0; i < grid.getContainerSize(); i++) {
                ItemStack stack = grid.getItem(i);
                if (stack.getItem() == ModItems.WOODEN_KNIFE.get()) {
                    // Get the damaged version (handled by WoodenKnifeItem)
                    ItemStack remainingItem = stack.getCraftingRemainingItem();

                    // Update the slot (will be empty if knife broke)
                    grid.setItem(i, remainingItem);

                    // Optional: Force-sync the slot change to client
                    if (event.getEntity() != null) {
                        event.getEntity().containerMenu.broadcastChanges();
                    }
                }
            }
        }
    }
}
