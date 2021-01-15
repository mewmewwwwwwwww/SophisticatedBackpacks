package net.p3pp3rf1y.sophisticatedbackpacks.api;

import net.minecraft.item.ItemStack;

public interface IUpgradeWrapper {
	boolean isEnabled();

	void setEnabled(boolean enabled);

	ItemStack getUpgradeStack();

	default boolean hideSettingsTab() {
		return false;
	}
}
