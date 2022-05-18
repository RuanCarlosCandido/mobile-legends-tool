package org.services;

import static org.models.Hero.*;
import static org.models.Spell.*;

import org.models.Hero;
import org.models.Spell;

public class SpellCounter {
//
//	public static Spell of(Hero name) {
//		Spell spell = null;
//
//		if (name.equals(LING)) {
//			spell = AEGIS;
//
//		} else if (name.equals(WANWAN)) {
//
//			spell = SPRINT;
//		}
//
//		else if (name.equals(BENEDETA)) {
//
//			spell = AEGIS;
//		}
//
//		else if (name.equals(HANZO)) {
//
//			spell = SPRINT;
//		}
//
//		else if (name.equals(HELCURT)) {
//			spell = AEGIS;
//		}
//
//		else if (name.equals(KARINA)) {
//			spell = FLAMESHOT;
//		}
//
//		else if (name.equals(SUN)) {
//
//			spell = VENGEANCE;
//		}
//
//		else if (name.equals(JAWHEAD)) {
//
//			spell = SPRINT;
//		}
//
//		else if (name.equals(YUZHONG)) {
//			spell = SPRINT;
//		}
//
//		else if (name.equals(LYLIA)) {
//			spell = SPRINT;
//		}
//
//		else if (name.equals(GRANGER)) {
//
//			spell = AEGIS;
//		}
//
//		else if (name.equals(VALE)) {
//			spell = SPRINT;
//		}
//
//		else if (name.equals(GUINEVERE)) {
//			spell = PURIFY;
//		}
//
//		else if (name.equals(XBORG)) {
//			spell = SPRINT;
//		}
//
//		else if (name.equals(GUSION)) {
//			spell = AEGIS;
//		}
//
//		else if (name.equals(AKAI)) {
//
//			spell = PURIFY;
//		} else if (name.equals(ALDOUS)) {
//			spell = ARRIVAL;
//		} else if (name.equals(ALICE)) {
//			spell = SPRINT;
//		} else if (name.equals(ALPHA)) {
//			spell = VENGEANCE;
//		} else if (name.equals(ALUCARD)) {
//			spell = AEGIS;
//		} else if (name.equals(ANGELA)) {
//			spell = SPRINT;
//		} else if (name.equals(ARGUS)) {
//			spell = REVITALIZE;
//		} else if (name.equals(ATLAS)) {
//			spell = PURIFY;
//		} else if (name.equals(AULUS)) {
//			spell = VENGEANCE;
//		} else if (name.equals(AURORA)) {
//			spell = PURIFY;
//		} else if (name.equals(BADANG)) {
//			spell = FLICKER;
//		} else if (name.equals(BALMOND)) {
//			spell = SPRINT;
//		} else if (name.equals(BANE)) {
//			spell = REVITALIZE;
//		} else if (name.equals(BARATS)) {
//			spell = SPRINT;
//		} else if (name.equals(BAXIA)) {
//			spell = SPRINT;
//		} else if (name.equals(BEATRIX)) {
//			spell = AEGIS;
//		} else if (name.equals(BELERICK)) {
//			spell = PURIFY;
//		} else if (name.equals(BRODY)) {
//			spell = AEGIS;
//		} else if (name.equals(BRUNO)) {
//			spell = VENGEANCE;
//		} else if (name.equals(CARMILLA)) {
//			spell = PURIFY;
//		} else if (name.equals(CECILION)) {
//			spell = SPRINT;
//		} else if (name.equals(CHANGE)) {
//			spell = VENGEANCE;
//		} else if (name.equals(CLAUDE)) {
//			spell = VENGEANCE;
//		} else if (name.equals(CLINT)) {
//			spell = AEGIS;
//		} else if (name.equals(CYCLOPS)) {
//			spell = PURIFY;
//		} else if (name.equals(DIGGIE)) {
//			spell = AEGIS;
//		} else if (name.equals(DYRROTH)) {
//			spell = VENGEANCE;
//		} else if (name.equals(ESMERALDA)) {
//			spell = EXECUTE;
//		} else if (name.equals(ESTES)) {
//			spell = REVITALIZE;
//		} else if (name.equals(EUDORA)) {
//			spell = PURIFY;
//		} else if (name.equals(FANNY)) {
//			spell = AEGIS;
//		} else if (name.equals(FARAMIS)) {
//			spell = SPRINT;
//		} else if (name.equals(FRANCO)) {
//			spell = REVITALIZE;
//		} else if (name.equals(FREYA)) {
//			spell = VENGEANCE;
//		} else if (name.equals(GATOTKACA)) {
//			spell = EXECUTE;
//		} else if (name.equals(GLOO)) {
//			spell = SPRINT;
//		} else if (name.equals(GORD)) {
//			spell = VENGEANCE;
//		} else if (name.equals(GROCK)) {
//			spell = FLICKER;
//		} else if (name.equals(HANABI)) {
//			spell = PURIFY;
//		} else if (name.equals(HARITH)) {
//			spell = SPRINT;
//		} else if (name.equals(HARLEY)) {
//			spell = AEGIS;
//		} else if (name.equals(HAYABUSA)) {
//			spell = AEGIS;
//		} else if (name.equals(HILDA)) {
//			spell = SPRINT;
//		} else if (name.equals(HYLOS)) {
//			spell = SPRINT;
//		} else if (name.equals(IRITHEL)) {
//			spell = VENGEANCE;
//		} else if (name.equals(JOHNSON)) {
//			spell = PURIFY;
//		} else if (name.equals(KADITA)) {
//			spell = PURIFY;
//		} else if (name.equals(KAGURA)) {
//			spell = PURIFY;
//		} else if (name.equals(KAJA)) {
//			spell = PURIFY;
//		} else if (name.equals(KARRIE)) {
//			spell = VENGEANCE;
//		} else if (name.equals(KHALEED)) {
//			spell = AEGIS;
//		} else if (name.equals(KHUFRA)) {
//			spell = PURIFY;
//		} else if (name.equals(KIMMY)) {
//spell = VENGEANCE;
//		} else if (name.equals(LANCELOT)) {
//spell = AEGIS;
//		} else if (name.equals(LAPULAPU)) {
//spell = AEGIS;
//		} else if (name.equals(LAYLA)) {
//spell = VENGEANCE;
//		} else if (name.equals(LEOMORD)) {
//spell = AEGIS;
//		} else if (name.equals(LESLEY)) {
//spell = AEGIS;
//		} else if (name.equals(LOLITA)) {
//spell = EXECUTE;
//		} else if (name.equals(LUNOX)) {
//spell = SPRINT;
//		} else if (name.equals(LOUYI)) {
//spell = AEGIS;
//		} else if (name.equals(MARTIS)) {
//spell = AEGIS;
//		} else if (name.equals(MASHA)) {
//spell = VENGEANCE;
//		} else if (name.equals(MATHILDA)) {
//spell = AEGIS;
//		} else if (name.equals(MINOTAUR)) {
//spell = PURIFY;
//		} else if (name.equals(MINSITTHAR)) {
//spell = REVITALIZE;
//		} else if (name.equals(MYA)) {
//spell = VENGEANCE;
//		} else if (name.equals(MOSKOV)) {
//spell = PURIFY;
//		} else if (name.equals(NANA)) {
//spell = FLAMESHOT;
//		} else if (name.equals(NATALIA)) {
//spell = AEGIS;
//		} else if (name.equals(NATAN)) {
//spell = VENGEANCE;
//		} else if (name.equals(ODETTE)) {
//spell = PETRIFY;
//		} else if (name.equals(PAQUITO)) {
//spell = AEGIS;
//		} else if (name.equals(PHARSA)) {
//spell = SPRINT;
//		} else if (name.equals(PHOVEUS)) {
//spell = VENGEANCE;
//		}
//		else if (name.equals(FLORYN)) {
//			spell = FLAMESHOT;
//					}
//		else if (name.equals(POPOL)) {
//spell = PURIFY;
//		} else if (name.equals(RAFAELA)) {
//spell = SPRINT;
//		} else if (name.equals(ROGER)) {
//spell = VENGEANCE;
//		} else if (name.equals(RUBY)) {
//spell = AEGIS;
//		} else if (name.equals(SABER)) {
//spell = AEGIS;
//		} else if (name.equals(SELENA)) {
//spell = PURIFY;
//		} else if (name.equals(SILVANNA)) {
//spell = PURIFY;
//		} else if (name.equals(TERIZLA)) {
//spell = AEGIS;
//		} else if (name.equals(THAMUZ)) {
//spell = AEGIS;
//		} else if (name.equals(TIGREAL)) {
//spell = PURIFY;
//		} else if (name.equals(URANUS)) {
//spell = SPRINT;
//		} else if (name.equals(VALIR)) {
//spell = AEGIS;
//		} else if (name.equals(VEXANA)) {
//spell = REVITALIZE;
//		} else if (name.equals(YISUNSHIN)) {
//spell = SPRINT;
//		} else if (name.equals(YVE)) {
//spell = SPRINT;
//		} else if (name.equals(ZHASK)) {
//spell = SPRINT;
//		} else if (name.equals(ZILONG)) {
//spell = SPRINT;
//		}
//
//		return spell;
//	}
//
}