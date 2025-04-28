package net.shinysquare.creategemfood.item.custom;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class DiamondWhiskItem extends Item {
    public DiamondWhiskItem() {
        super(new Properties()
                .durability(160)  // 64 uses
                .setNoRepair()   // Can't be repaired
        );
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true; // Always return the knife (or its damaged version)
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack damaged = stack.copy();
        damaged.hurt(1, RandomSource.create(), null); // Reduce durability by 1
        return damaged.isEmpty() ? ItemStack.EMPTY : damaged; // Remove if broken
    }
}
