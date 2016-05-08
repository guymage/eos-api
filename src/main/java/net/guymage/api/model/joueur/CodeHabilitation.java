package net.guymage.api.model.joueur;

/**
 * Statut d'un joueur
 *
 * @author guymage
 */
public enum CodeHabilitation {
	//TODO à migrer
	ROYAUME("A migrer"),
	ADMIN("Administrateur du site"),
	CHEF("Chef de meute"),
	MEMBRE("Membre de la meute")
	;

	private String desc;

	CodeHabilitation(final String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public static CodeHabilitation getCodeDroitByName(final String name) {
		for (final CodeHabilitation code : values()) {
			if (code.name().equals(name)) {
				return code;
			}
		}
		return null;
	}
}
