package org.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.models.Role.*;
import static org.models.Behaviour.*;

public enum Hero {

	AAMON(MAGE, Arrays.asList()), 
	AKAI(TANK, Arrays.asList(CROWD_CONTROL, SHIELD)),
	ALDOUS(SOLDIER, Arrays.asList(HIGH_MOBILITY, SHIELD)),
	ALICE(MAGE, Arrays.asList(REGENERATION, CROWD_CONTROL, HIGH_MOBILITY)),
	ALPHA(SOLDIER, Arrays.asList(REGENERATION,REAL_DAMAGE)),
	ALUCARD(DAMAGE, Arrays.asList(REGENERATION, HIGH_MOBILITY,ARMOR_BREAKER)),
	ANGELA(SUPPORT, Arrays.asList(REGENERATION, SHIELD, HIGH_MOBILITY)),
	ARGUS(SOLDIER, Arrays.asList(INVULNERABILITY)),
	ATLAS(TANK, Arrays.asList(CROWD_CONTROL, HIGH_MOBILITY, ENDURANCE )),
	AULUS(SOLDIER, Arrays.asList(HIGH_MOBILITY, ENDURANCE)),
	AURORA(MAGE, Arrays.asList(CROWD_CONTROL)),
	BADANG(SOLDIER, Arrays.asList(ENDURANCE)),
	BALMOND(SOLDIER, Arrays.asList(REAL_DAMAGE, ENDURANCE)),
	BANE(SOLDIER, Arrays.asList(REGENERATION,CROWD_CONTROL)),
	BARATS(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	BAXIA(TANK, Arrays.asList(HIGH_MOBILITY, ENDURANCE, REGENERATION_REDUCTION)),
	BEATRIX(null, Arrays.asList()),
	BELERICK(SOLDIER, Arrays.asList(REFLECTION)),
	BENEDETA(null, Arrays.asList()),
	BRODY(null, Arrays.asList()),
	BRUNO(DAMAGE, Arrays.asList(REAP)),
	CARMILLA(null, Arrays.asList()),
	CECILION(null, Arrays.asList()),
	CHANGE(null, Arrays.asList()),
	CHOU(null, Arrays.asList()),
	CLAUDE(null, Arrays.asList()),
	CLINT(null, Arrays.asList()),
	CYCLOPS(null, Arrays.asList()),
	DIGGIE(SUPPORT, Arrays.asList(CONTROL_IMMUNITY, LONG_RANGE)),
	DYRROTH(null, Arrays.asList()),
	ESMERALDA(MAGE, Arrays.asList(SHIELD_STEALING, CROWD_CONTROL)),
	ESTES(null, Arrays.asList()),
	EUDORA(null, Arrays.asList()),
	FANNY(null, Arrays.asList()),
	FARAMIS(null, Arrays.asList()),
	FLORYN(null, Arrays.asList()),
	FRANCO(null, Arrays.asList()),
	FREYA(null, Arrays.asList()),
	GATOTKACA(null, Arrays.asList()),
	GLOO(null, Arrays.asList()),
	GORD(null, Arrays.asList()),
	GRANGER(null, Arrays.asList()),
	GROCK(null, Arrays.asList()),
	GUINEVERE(null, Arrays.asList()),
	GUSION(null, Arrays.asList()),
	HANABI(null, Arrays.asList()),
	HANZO(null, Arrays.asList()),
	HARITH(null, Arrays.asList()),
	HARLEY(null, Arrays.asList()),
	HAYABUSA(null, Arrays.asList()),
	HELCURT(null, Arrays.asList()),
	HILDA(SOLDIER, Arrays.asList(SHIELD, REGENERATION)),
	HYLOS(null, Arrays.asList()),
	IRITHEL(null, Arrays.asList()),
	JAWHEAD(null, Arrays.asList()),
	JOHNSON(null, Arrays.asList()),
	KADITA(MAGE, Arrays.asList(REAL_DAMAGE, CROWD_CONTROL, INVULNERABILITY)),
	KAGURA(null, Arrays.asList()),
	KAJA(null, Arrays.asList()),
	KARINA(MAGE, Arrays.asList(REAL_DAMAGE, INVULNERABILITY)),
	KARRIE(DAMAGE, Arrays.asList(REAL_DAMAGE)),
	KHALEED(null, Arrays.asList()),
	KHUFRA(null, Arrays.asList()),
	KIMMY(null, Arrays.asList()),
	LANCELOT(null, Arrays.asList()),
	LAPULAPU(null, Arrays.asList()),
	LAYLA(null, Arrays.asList()),
	LEOMORD(null, Arrays.asList()),
	LESLEY(null, Arrays.asList()),
	LING(null, Arrays.asList()),
	LOLITA(SUPPORT, Arrays.asList(SHIELD, CROWD_CONTROL)),
	LUNOX(null, Arrays.asList()),
	LOUYI(null, Arrays.asList()),
	LYLIA(null, Arrays.asList()),
	MARTIS(null, Arrays.asList()),
	MASHA(null, Arrays.asList()),
	MATHILDA(null, Arrays.asList()),
	MINOTAUR(null, Arrays.asList()),
	MINSITTHAR(null, Arrays.asList()),
	MYA(DAMAGE, Arrays.asList(REAP, CONTROL_IMMUNITY)),
	MOSKOV(null, Arrays.asList()), 
	NANA(MAGE, Arrays.asList(CROWD_CONTROL, INVULNERABILITY)),
	NATALIA(DAMAGE, Arrays.asList(INVULNERABILITY)),
	NATAN(null, Arrays.asList()),
	ODETTE(null, Arrays.asList()),
	PAQUITO(null, Arrays.asList()),
	PHARSA(null, Arrays.asList()),
	PHOVEUS(null, Arrays.asList()),
	POPOL(null, Arrays.asList()),
	RAFAELA(null, Arrays.asList()),
	ROGER(null, Arrays.asList()),
	RUBY(null, Arrays.asList()),
	SABER(null, Arrays.asList()),
	SELENA(null, Arrays.asList()),
	SILVANNA(null, Arrays.asList()),
	SUN(null, Arrays.asList()),
	TERIZLA(null, Arrays.asList()),
	THAMUZ(null, Arrays.asList()),
	TIGREAL(null, Arrays.asList()),
	URANUS(TANK, Arrays.asList(REGENERATION, SHIELD, CONTROL_IMMUNITY)),
	VALE(null, Arrays.asList()),
	VALIR(null, Arrays.asList()),
	VEXANA(null, Arrays.asList()),
	WANWAN(DAMAGE, Arrays.asList(REAP, CONTROL_IMMUNITY)),
	XBORG(null, Arrays.asList()),
	YISUNSHIN(null, Arrays.asList()),
	YUZHONG(null, Arrays.asList()),
	YVE(null, Arrays.asList()),
	ZHASK(null, Arrays.asList()),
	ZILONG(null, Arrays.asList());

	private Role role;
	private List<Behaviour> strengths;
	private List<Behaviour> weaknesses = new ArrayList<Behaviour>();

	Hero(Role role, List<Behaviour> strengths) {
		this.role = role;
		this.strengths = strengths;
	}

	private static Map<String, Hero> heroesNameMap = new HashMap<String, Hero>();

	static {
		Hero[] values = Hero.values();
		int ammountValues = values.length;

		if (heroesNameMap.isEmpty()) {
			for (int i = 0; i < ammountValues; i++) {
				heroesNameMap.put(String.valueOf(values[i]), values[i]);
			}
		}

	}

	public static Map<String, Hero> getHeroesNameMap() {
		return heroesNameMap;
	}

	public Role getRole() {
		return role;
	}

	public List<Behaviour> getWeaknesses() {
		return weaknesses;
	}

	public List<Behaviour> getStrengths() {
		return strengths;
	}

}