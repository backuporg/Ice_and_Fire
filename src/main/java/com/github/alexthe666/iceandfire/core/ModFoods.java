package com.github.alexthe666.iceandfire.core;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import com.github.alexthe666.iceandfire.entity.EntitySnowVillager;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import fossilsarcheology.api.FoodMappings;

public class ModFoods {

	public static void init() {
		FoodMappings.INSTANCE.addPlant(Items.REEDS, 15);
		FoodMappings.INSTANCE.addPlant(Items.WHEAT, 13);
		FoodMappings.INSTANCE.addPlant(Items.MELON, 10);
		FoodMappings.INSTANCE.addPlant(Items.APPLE, 20);
		FoodMappings.INSTANCE.addPlant(Items.BAKED_POTATO, 35);
		FoodMappings.INSTANCE.addPlant(Items.CARROT, 15);
		FoodMappings.INSTANCE.addPlant(Items.COOKIE, 10);
		FoodMappings.INSTANCE.addPlant(Items.PUMPKIN_PIE, 25);
		FoodMappings.INSTANCE.addPlant(Items.SUGAR, 7);
		FoodMappings.INSTANCE.addPlant(Items.BREAD, 25);
		FoodMappings.INSTANCE.addPlant(Items.WHEAT_SEEDS, 5);
		FoodMappings.INSTANCE.addPlant(Items.MELON_SEEDS, 5);
		FoodMappings.INSTANCE.addPlant(Items.PUMPKIN_SEEDS, 5);
		FoodMappings.INSTANCE.addPlant(Items.BEETROOT_SEEDS, 5);
		FoodMappings.INSTANCE.addPlant(Blocks.CARROTS, 20);
		FoodMappings.INSTANCE.addPlant(Blocks.LEAVES, 20);
		FoodMappings.INSTANCE.addPlant(Blocks.LEAVES2, 20);
		FoodMappings.INSTANCE.addPlant(Blocks.MELON_BLOCK, 65);
		FoodMappings.INSTANCE.addPlant(Blocks.HAY_BLOCK, 150);
		FoodMappings.INSTANCE.addPlant(Blocks.BROWN_MUSHROOM, 15);
		FoodMappings.INSTANCE.addPlant(Blocks.RED_MUSHROOM, 15);
		FoodMappings.INSTANCE.addPlant(Blocks.RED_FLOWER, 5);
		FoodMappings.INSTANCE.addPlant(Blocks.YELLOW_FLOWER, 5);
		FoodMappings.INSTANCE.addPlant(Blocks.POTATOES, 25);
		FoodMappings.INSTANCE.addPlant(Blocks.PUMPKIN, 30);
		FoodMappings.INSTANCE.addPlant(Blocks.SAPLING, 15);
		FoodMappings.INSTANCE.addPlant(Blocks.TALLGRASS, 5);
		FoodMappings.INSTANCE.addFish(Items.FISH, 30);
		FoodMappings.INSTANCE.addFish(Items.COOKED_FISH, 45);
		FoodMappings.INSTANCE.addMeat(Items.COOKED_BEEF, 60);
		FoodMappings.INSTANCE.addMeat(Items.BEEF, 40);
		FoodMappings.INSTANCE.addMeat(Items.COOKED_CHICKEN, 15);
		FoodMappings.INSTANCE.addMeat(Items.CHICKEN, 10);
		FoodMappings.INSTANCE.addMeat(Items.PORKCHOP, 35);
		FoodMappings.INSTANCE.addMeat(Items.COOKED_PORKCHOP, 55);
		FoodMappings.INSTANCE.addMeat(Items.MUTTON, 35);
		FoodMappings.INSTANCE.addMeat(Items.COOKED_MUTTON, 55);
		FoodMappings.INSTANCE.addMeat(Items.RABBIT, 10);
		FoodMappings.INSTANCE.addMeat(Items.COOKED_RABBIT, 15);
		FoodMappings.INSTANCE.addMeat(EntityPlayer.class, 27);
		FoodMappings.INSTANCE.addMeat(EntityPlayerMP.class, 27);
		FoodMappings.INSTANCE.addMeat(EntitySnowVillager.class, 27);
		FoodMappings.INSTANCE.addMeat(EntityVillager.class, 27);
		FoodMappings.INSTANCE.addMeat(EntityZombie.class, 23);
		FoodMappings.INSTANCE.addMeat(EntityChicken.class, 5);
		FoodMappings.INSTANCE.addMeat(EntityCow.class, 40);
		FoodMappings.INSTANCE.addMeat(EntityHorse.class, 55);
		FoodMappings.INSTANCE.addMeat(EntityPig.class, 20);
		FoodMappings.INSTANCE.addMeat(EntitySheep.class, 35);
		FoodMappings.INSTANCE.addMeat(EntityRabbit.class, 20);
		FoodMappings.INSTANCE.addMeat(EntitySquid.class, 30);
		FoodMappings.INSTANCE.addMeat(EntityWolf.class, 30);
		FoodMappings.INSTANCE.addMeat(EntityPolarBear.class, 70);
		FoodMappings.INSTANCE.addMeat(EntityIceDragon.class, 100);
		FoodMappings.INSTANCE.addMeat(EntityFireDragon.class, 100);

	}
}
