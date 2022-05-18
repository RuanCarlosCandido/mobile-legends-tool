package org.models.exceptions;

public class UnknownHeroException extends RuntimeException {

	private static final long serialVersionUID = -5364744104552614385L;

	public UnknownHeroException(String pickedHero) {
		super(pickedHero + " does not exist");
	}

}
