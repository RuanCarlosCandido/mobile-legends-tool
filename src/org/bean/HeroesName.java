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

}