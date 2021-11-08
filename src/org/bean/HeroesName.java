package org.bean;

import java.util.HashMap;
import java.util.Map;

public enum HeroesName {

	AKAI, ALDOUS, ALICE, ALPHA, ALUCARD, ANGELA, ARGUS, ATLAS, AULUS, AURORA, BADANG, BALMOND, BANE, BARATS, BAXIA,
	BEATRIX, BELERICK, BENEDETA, BRODY, BRUNO, CARMILLA, CECILION, CHANGE, CHOU, CLAUDE, CLINT, CYCLOPS, DIGGIE,
	DYRROTH, ESMERALDA, ESTES, EUDORA, FANNY, FARAMIS, FLORYN, FRANCO, FREYA, GATOTKACA, GLOO, GORD, GRANGER, GROCK,
	GUINEVERE, GUSION, HANABI, HANZO, HARITH, HARLEY, HAYABUSA, HELCURT, HILDA, HYLOS, IRITHEL, JAWHEAD, JOHNSON,
	KADITA, KAGURA, KAJA, KARINA, KARRIE, KHALEED, KHUFRA, KIMMY, LANCELOT, LAPULAPU, LAYLA, LEOMORD, LESLEY, LING,
	LOLITA, LUNOX, LOUYI, LYLIA, MARTIS, MASHA, MATHILDA, MINOTAUR, MINSITTHAR, MYA, MOSKOV, NANA, NATALIA, NATAN,
	ODETTE, PAQUITO, PHARSA, PHOVEUS, POPOL, RAFAELA, ROGER, RUBY, SABER, SELENA, SILVANNA, SUN, TERIZLA, THAMUZ,
	TIGREAL, URANUS, VALE, VALIR, VEXANA, WANWAN, XBORG, YISUNSHIN, YUZHONG, YVE, ZHASK, ZILONG;

	private static Map<String, HeroesName> heroesNameMap = new HashMap<String, HeroesName>();

	static {
		HeroesName[] values = HeroesName.values();
		int ammountValues = values.length;

		if (heroesNameMap.isEmpty()) {
			for (int i = 0; i < ammountValues; i++) {
				heroesNameMap.put(String.valueOf(values[i]), values[i]);
			}
		}

	}

	public static Map<String, HeroesName> getHeroesNameMap() {
		return heroesNameMap;
	}

	public boolean isTank() {
		if (this == AKAI || this == ATLAS || this == BARATS || this == BAXIA || this == CARMILLA || this == ESMERALDA
				|| this == FRANCO || this == GATOTKACA || this == GLOO || this == GROCK || this == HYLOS || this == RUBY
				|| this == JOHNSON || this == KHUFRA || this == TIGREAL || this == YUZHONG || this == URANUS)
			return true;

		return false;
	}

	public boolean isSupport() {
		// 11 heroes
		if (this == ANGELA || this == DIGGIE || this == ESTES || this == FARAMIS || this == FLORYN || this == LOUYI
				|| this == LOLITA || this == MATHILDA || this == MINOTAUR || this == MINSITTHAR || this == RAFAELA)
			return true;

		return false;
	}

	public boolean isSoldier() {
		// 11 heroes
		if (this == ALPHA || this == AULUS || this == ARGUS || this == BADANG || this == BALMOND
				|| this == BANE || this == BELERICK || this == FREYA || this == GUINEVERE || this == HILDA
				|| this == JAWHEAD || this == KHALEED || this == LAPULAPU || this == MARTIS || this == PHOVEUS
				|| this == ROGER || this == POPOL || this == TERIZLA | this == THAMUZ || this == SILVANNA || this == SUN
				|| this == XBORG || this == ZHASK)
			return true;

		return false;
	}

	public boolean isMage() {
		// 11 heroes
		if (this == ALICE || this == AURORA || this == CECILION || this == CHANGE || this == CYCLOPS || this == EUDORA
				|| this == GORD || this == GUSION || this == HARITH || this == HARLEY || this == KADITA
				|| this == KAGURA || this == KAJA || this == KARINA || this == KIMMY || this == ODETTE || this == PHARSA
				|| this == LUNOX || this == LYLIA || this == NANA || this == SELENA || this == VALE || this == VALIR
				|| this == VEXANA || this == YVE)
			return true;

		return false;
	}

	
	
	
	
	
}