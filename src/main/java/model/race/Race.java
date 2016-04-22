package model.race;

import java.io.Serializable;

/**
 * Entité représentant une race
 *
 * @author guymage
 *
 */
public class Race implements Serializable {

	private static final long serialVersionUID = 5506742658398813083L;

	private Long id;

	private String nom;

	private String description;

	private Integer capitaleX;

	private Integer capitaleY;

	private Integer colorR;

	private Integer colorG;

	private Integer colorB;

	/*
	 * Getters & setters
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String descr) {
		this.description = descr;
	}

	public Integer getCapitaleX() {
		return capitaleX;
	}

	public void setCapitaleX(Integer capitaleX) {
		this.capitaleX = capitaleX;
	}

	public Integer getCapitaleY() {
		return capitaleY;
	}

	public void setCapitaleY(Integer capitaleY) {
		this.capitaleY = capitaleY;
	}

	public Integer getColorR() {
		return colorR;
	}

	public void setColorR(Integer colorR) {
		this.colorR = colorR;
	}

	public Integer getColorG() {
		return colorG;
	}

	public void setColorG(Integer colorG) {
		this.colorG = colorG;
	}

	public Integer getColorB() {
		return colorB;
	}

	public void setColorB(Integer colorB) {
		this.colorB = colorB;
	}

	public static class RaceBuilder {
		private Race race = new Race();

		public RaceBuilder withId(Long id) {
			race.id = id;
			return this;
		}

		public RaceBuilder withNom(String nom) {
			race.nom = nom;
			return this;
		}

		public RaceBuilder withDescription(String description) {
			race.description = description;
			return this;
		}

		public RaceBuilder withCapitaleX(Integer capitaleX) {
			race.capitaleX = capitaleX;
			return this;
		}

		public RaceBuilder withCapitaleY(Integer capitaleY) {
			race.capitaleY = capitaleY;
			return this;
		}

		public RaceBuilder withColorR(Integer colorR) {
			race.colorR = colorR;
			return this;
		}

		public RaceBuilder withColorG(Integer colorG) {
			race.colorG = colorG;
			return this;
		}

		public RaceBuilder withColorB(Integer colorB) {
			race.colorB = colorB;
			return this;
		}

		public Race build() {
			return race;
		}
	}

	public static RaceBuilder race() {
		return new RaceBuilder();
	}

}
