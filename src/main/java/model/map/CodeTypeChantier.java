package model.map;

import exception.EosException;

public enum CodeTypeChantier {
	DRAPEAU("drapeau"),
	MINE("mine"),
	BOURG("bourg"),
	ARME_SIEGE("arme_de_siege"),
	TOUR("tour"),
	FORT("fort"),
	MUR("mur")
	;

	String type;

	CodeTypeChantier(final String type) {
		this.type = type;
	}

	public static CodeTypeChantier getCodeByType(final String type) {
		for (final CodeTypeChantier code : values()) {
			if (code.getType().equals(type)) {
				return code;
			}
		}
		// Non trouvé
		throw new EosException("Type de chantier inconnu: " + type);
	}

	/*
	 * Getters
	 */

	public String getType() {
		return type;
	}

}
