package com.model;

import static com.Bean.HeroesName.*;

import com.Bean.HeroesName;

public class Validator {

	public static boolean isTank(HeroesName hero) {
		if (hero == AKAI || hero == ATLAS || hero == BARATS || hero == BAXIA || hero == CARMILLA || hero == ESMERALDA
				|| hero == FRANCO || hero == GATOTKACA || hero == GLOO || hero == GROCK || hero == HYLOS || hero == RUBY
				|| hero == JOHNSON || hero == KHUFRA || hero == TIGREAL || hero == YUZHONG || hero == URANUS)
			return true;

		return false;
	}

	public static boolean isSupport(HeroesName hero) {
		// 11 heroes
		if (hero == ANGELA || hero == DIGGIE || hero == ESTES || hero == FARAMIS || hero == FLORYN || hero == LOUYI
				|| hero == LOLITA || hero == MATHILDA || hero == MINOTAUR || hero == MINSITTHAR || hero == RAFAELA)
			return true;

		return false;
	}

	public static boolean isSoldier(HeroesName hero) {
		// 11 heroes
		if (hero == ALPHA || hero == AULUS || hero == ARGUS || hero == BADANG || hero == BALMOND
				|| hero == BANE || hero == BELERICK || hero == FREYA || hero == GUINEVERE || hero == HILDA
				|| hero == JAWHEAD || hero == KHALEED || hero == LAPULAPU || hero == MARTIS || hero == PHOVEUS
				|| hero == ROGER || hero == POPOL || hero == TERIZLA | hero == THAMUZ || hero == SILVANNA || hero == SUN
				|| hero == XBORG || hero == ZHASK)
			return true;

		return false;
	}

	public static boolean isMage(HeroesName hero) {
		// 11 heroes
		if (hero == ALICE || hero == AURORA || hero == CECILION || hero == CHANGE || hero == CYCLOPS || hero == EUDORA
				|| hero == GORD || hero == GUSION || hero == HARITH || hero == HARLEY || hero == KADITA
				|| hero == KAGURA || hero == KAJA || hero == KARINA || hero == KIMMY || hero == ODETTE || hero == PHARSA
				|| hero == LUNOX || hero == LYLIA || hero == NANA || hero == SELENA || hero == VALE || hero == VALIR
				|| hero == VEXANA || hero == YVE)
			return true;

		return false;
	}

	// THE DaMAGE HEROES IS THE EXCEDENT
}
