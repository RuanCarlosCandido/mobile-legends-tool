package org.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.bean.HeroesName;
import static org.bean.HeroesName.*;

public class Counter {

	public static ArrayList<HeroesName> of(HeroesName name) {
		
		//I have decided to capture the counter in a set to avoid repeated names in declarations
		Set<HeroesName> allCountersFromThisHero = new LinkedHashSet<HeroesName>();

		if (name.equals(LING)) {// ok
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(BARATS);

			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINOTAUR);

			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(PHOVEUS);

			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(VEXANA);
			allCountersFromThisHero.add(PHARSA);

		} else if (name.equals(WANWAN)) {// ok
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(YUZHONG);

			allCountersFromThisHero.add(MATHILDA);

			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BELERICK);
			;
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ZHASK);

			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(GUSION);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(VEXANA);
		}

		else if (name.equals(BENEDETA)) {// ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(URANUS);

			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINSITTHAR);

			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(VEXANA);
			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(PHARSA);

			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(JAWHEAD);
		}

		else if (name.equals(HANZO)) {// ok
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(YUZHONG);

			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(MATHILDA);

			allCountersFromThisHero.add(AULUS);
			allCountersFromThisHero.add(ROGER);
			allCountersFromThisHero.add(SUN);

			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(PHARSA);
			allCountersFromThisHero.add(VEXANA);
			allCountersFromThisHero.add(GUSION);
			allCountersFromThisHero.add(HARLEY);
		}

		else if (name.equals(HELCURT)) {// ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(TIGREAL);

			allCountersFromThisHero.add(MINSITTHAR);
			allCountersFromThisHero.add(DIGGIE);

			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(XBORG);

			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KAJA);
		}

		else if (name.equals(KARINA)) {// ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(HYLOS);

			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MINSITTHAR);
			allCountersFromThisHero.add(MINOTAUR);

			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(XBORG);

			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(HAYABUSA);
			allCountersFromThisHero.add(PAQUITO);

		}

		else if (name.equals(SUN)) {// ok
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(YUZHONG);

			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(RAFAELA);

			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(VALIR);

			allCountersFromThisHero.add(FANNY);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(VALIR);
			allCountersFromThisHero.add(VALIR);

		} else if (name.equals(JAWHEAD)) {// OK
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);

			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(MINSITTHAR);

			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(GRANGER);

			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(VALIR);
			allCountersFromThisHero.add(VEXANA);
		}

		else if (name.equals(YUZHONG)) {// ok
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(LOUYI);

			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(HARLEY);

			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(PHOVEUS);

			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(WANWAN);

		}

		else if (name.equals(LYLIA)) {// ok
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(ATLAS);

			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(DIGGIE);

			allCountersFromThisHero.add(AULUS);
			allCountersFromThisHero.add(ROGER);
			allCountersFromThisHero.add(HILDA);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(SILVANNA);

			allCountersFromThisHero.add(LESLEY);
			allCountersFromThisHero.add(BRODY);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(FANNY);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(SABER);
			allCountersFromThisHero.add(ZILONG);
		}

		else if (name.equals(GRANGER)) {// ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);

			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINSITTHAR);

			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(GUSION);
			allCountersFromThisHero.add(HARLEY);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(SELENA);

			allCountersFromThisHero.add(ALPHA);
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(SILVANNA);
		}

		else if (name.equals(VALE)) {// ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(YUZHONG);

			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(ESTES);
			allCountersFromThisHero.add(LOUYI);

			allCountersFromThisHero.add(BADANG);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(SILVANNA);

			allCountersFromThisHero.add(ALDOUS);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(HANZO);
			allCountersFromThisHero.add(HAYABUSA);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(NATAN);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(SABER);
		}

		else if (name.equals(GUINEVERE)) {// ok
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(URANUS);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(URANUS);

			allCountersFromThisHero.add(DIGGIE);

			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(LUNOX);

			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(YISUNSHIN);
		}

		else if (name.equals(XBORG)) {// ok
			allCountersFromThisHero.add(URANUS);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(HYLOS);

			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(FARAMIS);

			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(LYLIA);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(LUNOX);

			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(HANZO);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(LAYLA);
			allCountersFromThisHero.add(PAQUITO);
		}

		else if (name.equals(GUSION)) {// ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(HYLOS);

			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(MINSITTHAR);

			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(BRODY);
			allCountersFromThisHero.add(HAYABUSA);
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(NATALIA);
			allCountersFromThisHero.add(SABER);

			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(ZHASK);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(KHALEED);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(PHOVEUS);
		}

		else if (name.equals(AKAI)) {// ok
			allCountersFromThisHero.add(ALPHA);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ZHASK);
			allCountersFromThisHero.add(TERIZLA);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(MINSITTHAR);
			allCountersFromThisHero.add(LOUYI);
			
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(VALIR);

			allCountersFromThisHero.add(HANABI);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(SABER);
			allCountersFromThisHero.add(KARRIE);

		} else if (name.equals(ALDOUS)) {//ok
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(YUZHONG);

			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(ESTES);
			allCountersFromThisHero.add(FARAMIS);

			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(LYLIA);
			allCountersFromThisHero.add(VEXANA);

			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(ZHASK);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(XBORG);

		} else if (name.equals(ALICE)) {//ok
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(BAXIA);
			
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINSITTHAR);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(HAYABUSA);
			allCountersFromThisHero.add(FANNY);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(MASHA);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(ROGER);			
			
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(AULUS);
			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(FREYA);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(ALPHA)) {//ok
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(RUBY);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(DIGGIE);
			
			allCountersFromThisHero.add(ALUCARD);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(NANA);
			
		} else if (name.equals(ALUCARD)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GATOTKACA);
			
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINOTAUR);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(SELENA);
			allCountersFromThisHero.add(VALIR);
			
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(TERIZLA);
			
		} else if (name.equals(ANGELA)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ESMERALDA);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(HANZO);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(YISUNSHIN);
			allCountersFromThisHero.add(KARRIE);
				
			allCountersFromThisHero.add(GORD);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(LUNOX);

			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(AULUS);			
			allCountersFromThisHero.add(BADANG);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ZHASK);
			allCountersFromThisHero.add(SUN);

		} else if (name.equals(ARGUS)) {//ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(CARMILLA);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(TIGREAL);
			
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(ESTES);
			
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(LESLEY);
			allCountersFromThisHero.add(MOSKOV);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(SELENA);
			allCountersFromThisHero.add(VALIR);
			allCountersFromThisHero.add(VEXANA);
			
		} else if (name.equals(ATLAS)) {//ok
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MINSITTHAR);
	
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(XBORG);
			
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(YISUNSHIN);
			
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(NANA);
			
			
		} else if (name.equals(AULUS)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(GATOTKACA);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINSITTHAR);
			
			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(SELENA);
			allCountersFromThisHero.add(VALIR);
			allCountersFromThisHero.add(VEXANA);
			
			allCountersFromThisHero.add(LESLEY);
			allCountersFromThisHero.add(LAYLA);
			allCountersFromThisHero.add(ALDOUS);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(YISUNSHIN);
			allCountersFromThisHero.add(BENEDETA);
			
		} else if (name.equals(AURORA)) {//ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(URANUS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(YUZHONG);
	
			allCountersFromThisHero.add(DIGGIE);
		
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(BADANG);
			allCountersFromThisHero.add(GUINEVERE);
			
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(ALDOUS);
			allCountersFromThisHero.add(HANZO);
			allCountersFromThisHero.add(YISUNSHIN);
			
		} else if (name.equals(BADANG)) {//ok
			allCountersFromThisHero.add(AKAI);	
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(YUZHONG);
				
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(LOLITA);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(BRUNO);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(BEATRIX);
			allCountersFromThisHero.add(CLINT);
			allCountersFromThisHero.add(DYRROTH);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(SABER);
			allCountersFromThisHero.add(YISUNSHIN);
			
			allCountersFromThisHero.add(GUSION);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(HARLEY);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KIMMY);
			
		} else if (name.equals(BALMOND)) {//ok
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(RUBY);
			allCountersFromThisHero.add(HYLOS);
			
			allCountersFromThisHero.add(MINSITTHAR);
			
			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(PHARSA);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(VEXANA);
			
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(DYRROTH);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(PAQUITO);
		}

		else if (name.equals(BANE)) {//ok
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(MINSITTHAR);
			
			allCountersFromThisHero.add(HARLEY);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(LUNOX);
			
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(LAYLA);
			allCountersFromThisHero.add(NATAN);
			
		} else if (name.equals(BARATS)) {//ok
			allCountersFromThisHero.add(ALPHA);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(THAMUZ);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ZHASK);
			
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(GORD);
			
			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(CLINT);
			allCountersFromThisHero.add(WANWAN);
			
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(RAFAELA);
			
		} else if (name.equals(BAXIA)) {//ok
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(MINSITTHAR);
			
			allCountersFromThisHero.add(FREYA);
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(THAMUZ);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ZHASK);
			
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(ZILONG);
			allCountersFromThisHero.add(ALDOUS);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(YISUNSHIN);
			
			allCountersFromThisHero.add(LYLIA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(VALIR);
			allCountersFromThisHero.add(VALE);
			
		} else if (name.equals(BEATRIX)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(FRANCO);
			
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(LOLITA);

			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(ALICE);
			
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(XBORG);
			
		} else if (name.equals(BELERICK)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(URANUS);
						
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(ESTES);
			allCountersFromThisHero.add(RAFAELA);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(LYLIA);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(BRODY);
			allCountersFromThisHero.add(BEATRIX);
			
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(LYLIA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(VEXANA);
			
		} else if (name.equals(BRODY)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(GATOTKACA);

			allCountersFromThisHero.add(ESTES);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(LOLITA);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(ALICE);
			
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(SILVANNA);
			
		} else if (name.equals(BRUNO)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);

			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(LOLITA);
			
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KARINA);
			
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(SILVANNA);
		
		} else if (name.equals(CARMILLA)) {//ok
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(MINSITTHAR);
			
			allCountersFromThisHero.add(ALPHA);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(THAMUZ);
			allCountersFromThisHero.add(ZHASK);

			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(KARINA);

			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(LAYLA);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(CHOU);
			
		} else if (name.equals(CECILION)) {//ok
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(CARMILLA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(URANUS);
						
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(FARAMIS);

			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(ALPHA);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(SILVANNA);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(HANZO);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(NATALIA);
			allCountersFromThisHero.add(NATAN);
			allCountersFromThisHero.add(YISUNSHIN);
			allCountersFromThisHero.add(ZILONG);
			
		} else if (name.equals(CHANGE)) {//ok
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(ESTES);
			allCountersFromThisHero.add(LOLITA);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(SILVANNA);
			
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(BELERICK);
			
		} else if (name.equals(CLAUDE)) {//ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MINSITTHAR);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(CYCLOPS);
			
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(TERIZLA);
			
		} else if (name.equals(CLINT)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(ESTES);
			allCountersFromThisHero.add(FLORYN);
			allCountersFromThisHero.add(RAFAELA);
			
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(GUSION);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(SELENA);
			
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(BELERICK);
			
		} else if (name.equals(CYCLOPS)) {//ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(URANUS);
			allCountersFromThisHero.add(RUBY);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MATHILDA);
			
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(YISUNSHIN);
			
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(KHALEED);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(POPOL);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(XBORG);

		} else if (name.equals(DIGGIE)) {//ok
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(LAYLA);
			allCountersFromThisHero.add(HARLEY);
			allCountersFromThisHero.add(SABER);
			allCountersFromThisHero.add(LESLEY);
			allCountersFromThisHero.add(ZILONG);

			allCountersFromThisHero.add(ALPHA);
			allCountersFromThisHero.add(BADANG);
			allCountersFromThisHero.add(HILDA);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(ROGER);
			allCountersFromThisHero.add(SUN);
			
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(GUSION);
			allCountersFromThisHero.add(HARLEY);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(KIMMY);
			allCountersFromThisHero.add(VEXANA);
			
		} else if (name.equals(DYRROTH)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(BAXIA);

			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINOTAUR);
			
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(LYLIA);
			allCountersFromThisHero.add(NANA);
			
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BELERICK);
				
		} else if (name.equals(ESMERALDA)) {//ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(TIGREAL);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(RAFAELA);
			
			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(CLINT);
			
			allCountersFromThisHero.add(ALPHA);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(THAMUZ);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ZHASK);
			
		} else if (name.equals(ESTES)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(CARMILLA);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(YVE);
			
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(BADANG);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(GUINEVERE);
			
			allCountersFromThisHero.add(HANABI);
			allCountersFromThisHero.add(BRUNO);
			allCountersFromThisHero.add(GRANGER);
			
			
		} else if (name.equals(EUDORA)) {//ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(URANUS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(YUZHONG);
	
			allCountersFromThisHero.add(DIGGIE);
		
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(BADANG);
			allCountersFromThisHero.add(GUINEVERE);
			
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(ALDOUS);
			allCountersFromThisHero.add(HANZO);
			allCountersFromThisHero.add(YISUNSHIN);
			
		} else if (name.equals(FANNY)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(GUSION);
			allCountersFromThisHero.add(HARLEY);
			allCountersFromThisHero.add(VEXANA);
			
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(ANGELA);			
			allCountersFromThisHero.add(MINSITTHAR);

			allCountersFromThisHero.add(BADANG);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(PHOVEUS);
			allCountersFromThisHero.add(POPOL);
			allCountersFromThisHero.add(SILVANNA);
			
			
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(FARAMIS)) {//ok
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(RUBY);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(ZHASK);
			
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(VEXANA);
			
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(MOSKOV);
			allCountersFromThisHero.add(NATAN);
			
		} else if (name.equals(FRANCO)) {//ok
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(RAFAELA);
			allCountersFromThisHero.add(DIGGIE);
	
			allCountersFromThisHero.add(AULUS);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(SUN);
			allCountersFromThisHero.add(XBORG);

			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(BANE);

			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(ALDOUS);
			allCountersFromThisHero.add(HANABI);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(YISUNSHIN);
			
		} else if (name.equals(FREYA)) {//ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(ESMERALDA);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);

			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(MINOTAUR);

			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(GORD);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(LUNOX);

			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(CLINT);
			allCountersFromThisHero.add(GRANGER);
			
		} else if (name.equals(GATOTKACA)) {//ok
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(MINSITTHAR);
		
			allCountersFromThisHero.add(GORD);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(LUNOX);

			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ALPHA);
			allCountersFromThisHero.add(GUINEVERE);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(THAMUZ);
			allCountersFromThisHero.add(ZHASK);

			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(CLINT);
			
		} else if (name.equals(GLOO)) {//ok
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MINSITTHAR);
	
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(XBORG);
			
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(YISUNSHIN);
			
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(NANA);
	
		} else if (name.equals(GORD)) {//ok
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(RUBY);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(HANABI);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(WANWAN);
			allCountersFromThisHero.add(YISUNSHIN);

			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(MARTIS);
			allCountersFromThisHero.add(XBORG);

			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(ESTES);
			allCountersFromThisHero.add(FARAMIS);

		} else if (name.equals(GROCK)) {//ok
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINOTAUR);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(BEATRIX);
			allCountersFromThisHero.add(BRUNO);
			allCountersFromThisHero.add(CLAUDE);
			allCountersFromThisHero.add(HAYABUSA);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(SABER);
			allCountersFromThisHero.add(YISUNSHIN);

			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(LAPULAPU);

			allCountersFromThisHero.add(GUSION);
			allCountersFromThisHero.add(HARLEY);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(KIMMY);
			allCountersFromThisHero.add(PHARSA);
			
		} else if (name.equals(HANABI)) {//ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(GATOTKACA);

			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(FARAMIS);

			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(XBORG);

			allCountersFromThisHero.add(GORD);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(NANA);

		} else if (name.equals(HARITH)) {
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(ESMERALDA);
			allCountersFromThisHero.add(RUBY);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(ALUCARD);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(JAWHEAD);

			
			
		} else if (name.equals(HARLEY)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(HAYABUSA)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(KAJA);

		} else if (name.equals(HILDA)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(GATOTKACA);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINSITTHAR);
			
			allCountersFromThisHero.add(AURORA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(SELENA);
			allCountersFromThisHero.add(VALIR);
			allCountersFromThisHero.add(VEXANA);
			
			allCountersFromThisHero.add(LESLEY);
			allCountersFromThisHero.add(LAYLA);
			allCountersFromThisHero.add(ALDOUS);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(PAQUITO);
			allCountersFromThisHero.add(YISUNSHIN);
			allCountersFromThisHero.add(BENEDETA);
						
		} else if (name.equals(HYLOS)) {

			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(MATHILDA);
			
			allCountersFromThisHero.add(BANE);

		} else if (name.equals(IRITHEL)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(GATOTKACA);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(ALICE);

		} else if (name.equals(JOHNSON)) {
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MATHILDA);
			
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(ALICE);

		} else if (name.equals(KADITA)) {
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(KAGURA)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(URANUS);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(KAJA)) {//ok
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(JOHNSON);
			
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(RAFAELA);
			
			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BALMOND);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(KHALEED);
			allCountersFromThisHero.add(POPOL);
			allCountersFromThisHero.add(TERIZLA);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(XBORG);
			allCountersFromThisHero.add(ZHASK);
			
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(LYLIA);
			allCountersFromThisHero.add(NANA);

			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(LING);
			
		} else if (name.equals(KARRIE)) {
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(RUBY);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(ODETTE);

		} else if (name.equals(KHALEED)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(TIGREAL);
			
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(CYCLOPS);

		} else if (name.equals(KHUFRA)) {
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(LOUYI);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(GORD);

		} else if (name.equals(KIMMY)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(LANCELOT)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(MINOTAUR);

		} else if (name.equals(LAPULAPU)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(JOHNSON);
			
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(CYCLOPS);

		} else if (name.equals(LAYLA)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(GATOTKACA);

			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(LEOMORD)) {
			allCountersFromThisHero.add(FRANCO);			
			allCountersFromThisHero.add(BARATS);			
			allCountersFromThisHero.add(BAXIA);			
			allCountersFromThisHero.add(FRANCO);			
			allCountersFromThisHero.add(HYLOS);			
			allCountersFromThisHero.add(YUZHONG);			
			
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(CYCLOPS);

		} else if (name.equals(LESLEY)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BARATS);			
			allCountersFromThisHero.add(GLOO);			
			allCountersFromThisHero.add(FRANCO);			
			allCountersFromThisHero.add(HYLOS);			
			allCountersFromThisHero.add(JOHNSON);			
			allCountersFromThisHero.add(YUZHONG);			
			
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(ALICE);

		} else if (name.equals(LOLITA)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(ESMERALDA);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(SABER);


			
		} else if (name.equals(LUNOX)) {
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(FRANCO);
			
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(KAJA);
			
		} else if (name.equals(LOUYI)) {
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(RUBY);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(TIGREAL);

			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(MARTIS)) {
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GATOTKACA);
			
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(ALUCARD);

			allCountersFromThisHero.add(ALICE);// testado
		} else if (name.equals(MASHA)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(GLOO);
			
			allCountersFromThisHero.add(CYCLOPS);
			
			allCountersFromThisHero.add(ODETTE);
			
		} else if (name.equals(MATHILDA)) {
			allCountersFromThisHero.add(CARMILLA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(FRANCO);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(LAYLA);

			allCountersFromThisHero.add(ZILONG);
			
		} else if (name.equals(MINOTAUR)) {
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(WANWAN);
			

		} else if (name.equals(MINSITTHAR)) {
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(RUBY);
			
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(VALE);

		} else if (name.equals(MYA)) {
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(GLOO);
			
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(RAFAELA);
			allCountersFromThisHero.add(ODETTE);
			
			//PAREI AQUI, declarando tanks
		} else if (name.equals(MOSKOV)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(KHUFRA);
			allCountersFromThisHero.add(URANUS);

			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(NANA)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(JAWHEAD);

			allCountersFromThisHero.add(ZILONG);
			
		} else if (name.equals(NATALIA)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(TIGREAL);
			
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(NATAN)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(AURORA);

		} else if (name.equals(ODETTE)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(FARAMIS);
			
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(SILVANNA);
			
			allCountersFromThisHero.add(CHOU);
			
			

		} else if (name.equals(PAQUITO)) {
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(PHARSA)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(PHOVEUS)) {
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(CARMILLA);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(CYCLOPS);

		} else if (name.equals(POPOL)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(CARMILLA);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(NANA);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(ALICE);

		} else if (name.equals(RAFAELA)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(ROGER)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(ODETTE);

		} else if (name.equals(RUBY)) {//ok
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(DIGGIE);

			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(CLINT);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(HAYABUSA);
			allCountersFromThisHero.add(LAYLA);
			allCountersFromThisHero.add(PAQUITO);

			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BANE);
			allCountersFromThisHero.add(MARTIS);

			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(HARITH);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(KIMMY);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(NANA);

		} else if (name.equals(SABER)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(NANA);

		} else if (name.equals(SELENA)) {
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(LOLITA);
			allCountersFromThisHero.add(MYA);

		} else if (name.equals(SILVANNA)) {// ok
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(ESMERALDA);
			allCountersFromThisHero.add(YUZHONG);
			allCountersFromThisHero.add(BAXIA);

			allCountersFromThisHero.add(MINOTAUR);
			allCountersFromThisHero.add(DIGGIE);

			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(KARRIE);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(WANWAN);

			allCountersFromThisHero.add(ALICE);
			allCountersFromThisHero.add(ESMERALDA);
			allCountersFromThisHero.add(GORD);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(KAGURA);
			allCountersFromThisHero.add(KARINA);
			allCountersFromThisHero.add(LUNOX);
			allCountersFromThisHero.add(NANA);

		} else if (name.equals(TERIZLA)) {
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(URANUS);
			
			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(ALICE);

		} else if (name.equals(THAMUZ)) {
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(RUBY);

			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(ODETTE);
			
		} else if (name.equals(TIGREAL)) {
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(FARAMIS);
			allCountersFromThisHero.add(MINSITTHAR);

			allCountersFromThisHero.add(MYA);
			allCountersFromThisHero.add(ALICE);

		} else if (name.equals(URANUS)) {
			allCountersFromThisHero.add(FLORYN);
			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(ESTES);

			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(SILVANNA);

		} else if (name.equals(VALIR)) {
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(GROCK);
			
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(GATOTKACA);

		} else if (name.equals(VEXANA)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(JOHNSON);

			allCountersFromThisHero.add(ANGELA);
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(MINOTAUR);
			
		} else if (name.equals(YISUNSHIN)) {
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(KHUFRA);
			
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(JAWHEAD);

		} else if (name.equals(YVE)) {
			allCountersFromThisHero.add(AKAI);
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(FRANCO);
			allCountersFromThisHero.add(JOHNSON);
			allCountersFromThisHero.add(TIGREAL);
			allCountersFromThisHero.add(YUZHONG);
			
			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(DIGGIE);
			allCountersFromThisHero.add(MYA);
			
		} else if (name.equals(ZHASK)) {// ok
			allCountersFromThisHero.add(ATLAS);
			allCountersFromThisHero.add(BAXIA);
			allCountersFromThisHero.add(GLOO);
			allCountersFromThisHero.add(HYLOS);
			allCountersFromThisHero.add(YUZHONG);

			allCountersFromThisHero.add(KAJA);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(ODETTE);
			allCountersFromThisHero.add(VALE);
			allCountersFromThisHero.add(CHANGE);
			allCountersFromThisHero.add(KADITA);

			allCountersFromThisHero.add(ALUCARD);
			allCountersFromThisHero.add(BENEDETA);
			allCountersFromThisHero.add(CHOU);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(GRANGER);
			allCountersFromThisHero.add(HAYABUSA);
			allCountersFromThisHero.add(LANCELOT);
			allCountersFromThisHero.add(LING);
			allCountersFromThisHero.add(SABER);

			allCountersFromThisHero.add(LOUYI);
			allCountersFromThisHero.add(MINOTAUR);

		} else if (name.equals(ZILONG)) {// ok
			allCountersFromThisHero.add(BARATS);
			allCountersFromThisHero.add(GATOTKACA);
			allCountersFromThisHero.add(GROCK);
			allCountersFromThisHero.add(YUZHONG);

			allCountersFromThisHero.add(CYCLOPS);
			allCountersFromThisHero.add(EUDORA);
			allCountersFromThisHero.add(KADITA);
			allCountersFromThisHero.add(VEXANA);

			allCountersFromThisHero.add(MATHILDA);
			allCountersFromThisHero.add(MINOTAUR);

			allCountersFromThisHero.add(SILVANNA);
			allCountersFromThisHero.add(JAWHEAD);
			allCountersFromThisHero.add(ARGUS);
			allCountersFromThisHero.add(BELERICK);
			allCountersFromThisHero.add(THAMUZ);
		}

		return new ArrayList<HeroesName>(allCountersFromThisHero);
	}

}
