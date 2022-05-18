package org.services;

import static org.models.Hero.*;

import org.models.Hero;

public class EquipmentCounter {
//
//	public static EquipmentCounter of(Hero name) {
//		EquipmentCounter ec = null;
//
//		if (name.equals(LING)) {
//
//		} else if (name.equals(WANWAN)) {
//
//		}
//
//		else if (name.equals(BENEDETA)) {
//
//		}
//
//		else if (name.equals(HANZO)) {
//
//		}
//
//		else if (name.equals(HELCURT)) {
//
//		}
//
//		else if (name.equals(KARINA)) {
//
//		}
//
//		else if (name.equals(SUN)) {
//
//		}
//
//		else if (name.equals(JAWHEAD)) {
//
//		}
//
//		else if (name.equals(YUZHONG)) {
//
//		}
//
//		else if (name.equals(LYLIA)) {
//
//		}
//
//		else if (name.equals(GRANGER)) {
//
//		}
//
//		else if (name.equals(VALE)) {
//
//		}
//
//		else if (name.equals(GUINEVERE)) {
//
//		}
//
//		else if (name.equals(XBORG)) {
//
//		}
//
//		else if (name.equals(GUSION)) {
//
//		}
//
//		else if (name.equals(AKAI)) {
//
//		} else if (name.equals(ALDOUS)) {
//
//		} else if (name.equals(ALICE)) {
//
//		} else if (name.equals(ALPHA)) {
//
//		} else if (name.equals(ALUCARD)) {
//
//		} else if (name.equals(ANGELA)) {
//
//		} else if (name.equals(ARGUS)) {
//
//		} else if (name.equals(ATLAS)) {
//
//		} else if (name.equals(AULUS)) {
//
//		} else if (name.equals(AURORA)) {
//
//		} else if (name.equals(BADANG)) {
//
//		} else if (name.equals(BALMOND)) {
//
//		}
//
//		else if (name.equals(BANE)) {
//
//		} else if (name.equals(BARATS)) {
//
//		} else if (name.equals(BAXIA)) {
//
//		} else if (name.equals(BEATRIX)) {
//
//		} else if (name.equals(BELERICK)) {
//
//		} else if (name.equals(BRODY)) {
//
//		} else if (name.equals(BRUNO)) {
//
//		} else if (name.equals(CARMILLA)) {
//
//		} else if (name.equals(CECILION)) {
//
//		} else if (name.equals(CHANGE)) {
//
//		} else if (name.equals(CLAUDE)) {
//
//		} else if (name.equals(CLINT)) {
//
//		} else if (name.equals(CYCLOPS)) {
//
//		} else if (name.equals(DIGGIE)) {
//
//		} else if (name.equals(DYRROTH)) {
//
//		} else if (name.equals(ESMERALDA)) {
//
//		} else if (name.equals(ESTES)) {
//
//		} else if (name.equals(EUDORA)) {
//
//		} else if (name.equals(FANNY)) {
//
//		} else if (name.equals(FARAMIS)) {
//
//		} else if (name.equals(FRANCO)) {
//
//		} else if (name.equals(FREYA)) {
//
//		} else if (name.equals(GATOTKACA)) {
//
//		} else if (name.equals(GLOO)) {
//
//		} else if (name.equals(GORD)) {
//
//		} else if (name.equals(GROCK)) {
//
//		} else if (name.equals(HANABI)) {
//
//		} else if (name.equals(HARITH)) {
//
//		} else if (name.equals(HARLEY)) {
//
//		} else if (name.equals(HAYABUSA)) {
//
//		} else if (name.equals(HILDA)) {
//
//		} else if (name.equals(HYLOS)) {
//
//		} else if (name.equals(IRITHEL)) {
//
//		} else if (name.equals(JOHNSON)) {
//
//		} else if (name.equals(KADITA)) {
//
//		} else if (name.equals(KAGURA)) {
//
//		} else if (name.equals(KAJA)) {
//
//		} else if (name.equals(KARRIE)) {
//
//		} else if (name.equals(KHALEED)) {
//
//		} else if (name.equals(KHUFRA)) {
//
//		} else if (name.equals(KIMMY)) {
//
//		} else if (name.equals(LANCELOT)) {
//
//		} else if (name.equals(LAPULAPU)) {
//
//		} else if (name.equals(LAYLA)) {
//
//		} else if (name.equals(LEOMORD)) {
//
//		} else if (name.equals(LESLEY)) {
//
//		} else if (name.equals(LOLITA)) {
//
//		} else if (name.equals(LUNOX)) {
//
//		} else if (name.equals(LOUYI)) {
//
//		} else if (name.equals(MARTIS)) {
//
//		} else if (name.equals(MASHA)) {
//
//		} else if (name.equals(MATHILDA)) {
//
//		} else if (name.equals(MINOTAUR)) {
//
//		} else if (name.equals(MINSITTHAR)) {
//
//		} else if (name.equals(MYA)) {
//
//		} else if (name.equals(MOSKOV)) {
//
//		} else if (name.equals(NANA)) {
//
//		} else if (name.equals(NATALIA)) {
//
//		} else if (name.equals(NATAN)) {
//
//		} else if (name.equals(ODETTE)) {
//
//		} else if (name.equals(PAQUITO)) {
//
//		} else if (name.equals(PHARSA)) {
//
//		} else if (name.equals(PHOVEUS)) {
//
//		} else if (name.equals(POPOL)) {
//
//		} else if (name.equals(RAFAELA)) {
//
//		} else if (name.equals(ROGER)) {
//
//		} else if (name.equals(RUBY)) {
//
//		} else if (name.equals(SABER)) {
//
//		} else if (name.equals(SELENA)) {
//
//		} else if (name.equals(SILVANNA)) {
//
//		} else if (name.equals(TERIZLA)) {
//
//		} else if (name.equals(THAMUZ)) {
//
//		} else if (name.equals(TIGREAL)) {
//
//		} else if (name.equals(URANUS)) {
//
//		} else if (name.equals(VALIR)) {
//
//		} else if (name.equals(VEXANA)) {
//
//		} else if (name.equals(YISUNSHIN)) {
//
//		} else if (name.equals(YVE)) {
//
//		} else if (name.equals(ZHASK)) {
//
//		} else if (name.equals(ZILONG)) {
//
//		}
//
//		return ec;
//	}
//
}
