package net.minecraft.src.forge;

/**
 * This allows texture bigger than 16x16 for blocks
 * Written by William2405
 */
public interface IHiResTextureProvider extends ITextureProvider {
	
	public abstract int getTextureSize();
	
}
