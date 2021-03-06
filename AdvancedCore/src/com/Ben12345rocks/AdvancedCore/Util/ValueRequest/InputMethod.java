package com.Ben12345rocks.AdvancedCore.Util.ValueRequest;

import com.Ben12345rocks.AdvancedCore.Configs.Config;

/**
 * The Enum InputMethod.
 */
public enum InputMethod {

	/** The anvil. */
	ANVIL,

	/** The chat. */
	CHAT,

	/** The book. */
	BOOK,
	
	/** The inventory. */
	INVENTORY;

	/**
	 * Gets the method.
	 *
	 * @param method
	 *            the method
	 * @return the method
	 */
	public static InputMethod getMethod(String method) {
		for (InputMethod input : values()) {
			if (method.equalsIgnoreCase(input.toString())) {
				return input;
			}
		}
		try {
			return valueOf(Config.getInstance().getRequestAPIDefaultMethod());
		} catch (Exception ex) {
			return CHAT;
		}

	}
}
