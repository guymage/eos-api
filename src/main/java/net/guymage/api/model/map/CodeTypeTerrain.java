package net.guymage.api.model.map;

/**
 * Type de terrain
 *
 * @author Guymage
 */
public enum CodeTypeTerrain {
	NORMAL(0, ""), 
	CAPITALE(1, "Ville"), 
	DONJON(2, "Donjon"), 
	PT_EXCEPT(3, "Point exceptionnel");

	private int id;

	private String desc;

	CodeTypeTerrain(final int id, final String desc) {
		this.id = id;
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public int getId() {
		return id;
	}

	public static CodeTypeTerrain getTerrainById(final int id) {
		for (final CodeTypeTerrain terrain : values()) {
			if (terrain.getId() == id) {
				return terrain;
			}
		}
		// Non trouvé
		// throw new EosException("Type de terrain inconnu: " + id);
		return NORMAL;
	}
}
