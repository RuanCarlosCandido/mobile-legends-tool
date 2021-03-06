package org.models;

import static org.models.Behaviour.ARMOR_BREAKER;
import static org.models.Behaviour.CONTROL_IMMUNITY;
import static org.models.Behaviour.CROWD_CONTROL;
import static org.models.Behaviour.ENDURANCE;
import static org.models.Behaviour.HIGH_MOBILITY;
import static org.models.Behaviour.INVULNERABILITY;
import static org.models.Behaviour.LONG_RANGE;
import static org.models.Behaviour.REAL_DAMAGE;
import static org.models.Behaviour.REAP;
import static org.models.Behaviour.REFLECTION;
import static org.models.Behaviour.REGENERATION;
import static org.models.Behaviour.REGENERATION_REDUCTION;
import static org.models.Behaviour.SHIELD;
import static org.models.Behaviour.SHIELD_STEALING;
import static org.models.Role.DAMAGE;
import static org.models.Role.MAGE;
import static org.models.Role.SOLDIER;
import static org.models.Role.SUPPORT;
import static org.models.Role.TANK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Hero {

	AAMON(MAGE, Arrays.asList(HIGH_MOBILITY)), 
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
	BARATS(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL, ENDURANCE)),
	BAXIA(TANK, Arrays.asList(HIGH_MOBILITY, ENDURANCE, REGENERATION_REDUCTION)),
	BEATRIX(DAMAGE, Arrays.asList(REAP, HIGH_MOBILITY)),
	BELERICK(SOLDIER, Arrays.asList(REFLECTION)),
	BENEDETA(DAMAGE, Arrays.asList(HIGH_MOBILITY)),
	BRODY(DAMAGE, Arrays.asList(ARMOR_BREAKER)),
	BRUNO(DAMAGE, Arrays.asList(REAP)),
	CARMILLA(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	CECILION(MAGE, Arrays.asList(CROWD_CONTROL)),
	CHANGE(MAGE, Arrays.asList(LONG_RANGE)),
	CHOU(DAMAGE, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY)),
	CLAUDE(DAMAGE, Arrays.asList(HIGH_MOBILITY)),
	CLINT(DAMAGE, Arrays.asList(ARMOR_BREAKER)),
	CYCLOPS(MAGE, Arrays.asList(CROWD_CONTROL, HIGH_MOBILITY)),
	DIGGIE(SUPPORT, Arrays.asList(CONTROL_IMMUNITY, LONG_RANGE)),
	DYRROTH(DAMAGE, Arrays.asList(REGENERATION)),
	ESMERALDA(MAGE, Arrays.asList(SHIELD_STEALING, CROWD_CONTROL)),
	ESTES(SUPPORT, Arrays.asList(REGENERATION)),
	EUDORA(MAGE, Arrays.asList(CROWD_CONTROL)),
	FANNY(DAMAGE, Arrays.asList(HIGH_MOBILITY)),
	FARAMIS(SUPPORT, Arrays.asList(ENDURANCE, HIGH_MOBILITY)),
	FLORYN(SUPPORT, Arrays.asList(SHIELD)),
	FRANCO(TANK, Arrays.asList(CROWD_CONTROL)),
	FREYA(SOLDIER, Arrays.asList(ENDURANCE, SHIELD)),
	GATOTKACA(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	GLOO(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	GORD(MAGE, Arrays.asList(REAL_DAMAGE)),
	GRANGER(DAMAGE, Arrays.asList(HIGH_MOBILITY)),
	GROCK(TANK, Arrays.asList(CONTROL_IMMUNITY, CROWD_CONTROL, HIGH_MOBILITY)),
	GUINEVERE(SOLDIER, Arrays.asList(HIGH_MOBILITY, CROWD_CONTROL)),
	GUSION(MAGE, Arrays.asList(HIGH_MOBILITY)),
	HANABI(DAMAGE, Arrays.asList(CROWD_CONTROL)),
	HANZO(DAMAGE, Arrays.asList(HIGH_MOBILITY, INVULNERABILITY)),
	HARITH(MAGE, Arrays.asList(CROWD_CONTROL, HIGH_MOBILITY)),
	HARLEY(MAGE, Arrays.asList(HIGH_MOBILITY)),
	HAYABUSA(DAMAGE, Arrays.asList(HIGH_MOBILITY, INVULNERABILITY)),
	HELCURT(DAMAGE, Arrays.asList(HIGH_MOBILITY, INVULNERABILITY)),
	HILDA(SOLDIER, Arrays.asList(SHIELD, REGENERATION)),
	HYLOS(TANK, Arrays.asList(ENDURANCE, HIGH_MOBILITY)),
	IRITHEL(DAMAGE, Arrays.asList(REAP)),
	JAWHEAD(SOLDIER, Arrays.asList(ENDURANCE, SHIELD, HIGH_MOBILITY)),
	JOHNSON(TANK, Arrays.asList(ENDURANCE, SHIELD, HIGH_MOBILITY, CROWD_CONTROL)),
	KADITA(MAGE, Arrays.asList(REAL_DAMAGE, CROWD_CONTROL, INVULNERABILITY)),
	KAGURA(MAGE, Arrays.asList(HIGH_MOBILITY, CONTROL_IMMUNITY)),
	KAJA(MAGE, Arrays.asList(CROWD_CONTROL)),
	KARINA(MAGE, Arrays.asList(REAL_DAMAGE, INVULNERABILITY)),
	KARRIE(DAMAGE, Arrays.asList(REAL_DAMAGE)),
	KHALEED(SOLDIER, Arrays.asList(ENDURANCE, REGENERATION)),
	KHUFRA(TANK, Arrays.asList(HIGH_MOBILITY, CROWD_CONTROL)),
	KIMMY(MAGE, Arrays.asList(HIGH_MOBILITY, REAP, LONG_RANGE)),
	LANCELOT(DAMAGE, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY)),
	LAPULAPU(SOLDIER, Arrays.asList(REGENERATION)),
	LAYLA(DAMAGE, Arrays.asList(LONG_RANGE)),
	LEOMORD(DAMAGE, Arrays.asList(REGENERATION, ENDURANCE)),
	LESLEY(DAMAGE, Arrays.asList(LONG_RANGE)),
	LING(DAMAGE, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY)),
	LOLITA(SUPPORT, Arrays.asList(SHIELD, CROWD_CONTROL)),
	LUNOX(MAGE, Arrays.asList(REAL_DAMAGE, REAP)),
	LOUYI(SUPPORT, Arrays.asList(CROWD_CONTROL, HIGH_MOBILITY)),
	LYLIA(MAGE, Arrays.asList(ENDURANCE, HIGH_MOBILITY, LONG_RANGE)),
	MARTIS(DAMAGE, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY, REGENERATION)),
	MASHA(DAMAGE, Arrays.asList(HIGH_MOBILITY, SHIELD)),
	MATHILDA(SUPPORT, Arrays.asList(HIGH_MOBILITY)),
	MINOTAUR(SUPPORT, Arrays.asList(ENDURANCE, REGENERATION, CROWD_CONTROL)),
	MINSITTHAR(SUPPORT, Arrays.asList(SHIELD, CROWD_CONTROL)),
	MYA(DAMAGE, Arrays.asList(REAP, CONTROL_IMMUNITY)),
	MOSKOV(DAMAGE, Arrays.asList(REAP, LONG_RANGE)), 
	NANA(MAGE, Arrays.asList(CROWD_CONTROL, INVULNERABILITY)),
	NATALIA(DAMAGE, Arrays.asList(INVULNERABILITY)),
	NATAN(DAMAGE, Arrays.asList(REAP)),
	ODETTE(MAGE, Arrays.asList(ENDURANCE)),
	PAQUITO(SOLDIER, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY)),
	PHARSA(MAGE, Arrays.asList(HIGH_MOBILITY, LONG_RANGE)),
	PHOVEUS(SOLDIER, Arrays.asList(HIGH_MOBILITY, REGENERATION, ENDURANCE)),
	POPOL(SOLDIER, Arrays.asList(ENDURANCE, REAP)),
	RAFAELA(SUPPORT, Arrays.asList(REGENERATION, CROWD_CONTROL)),
	ROGER(SOLDIER, Arrays.asList(HIGH_MOBILITY, REAP, REGENERATION)),
	RUBY(TANK, Arrays.asList(REGENERATION, CROWD_CONTROL)),
	SABER(DAMAGE, Arrays.asList(ARMOR_BREAKER)),
	SELENA(MAGE, Arrays.asList(LONG_RANGE, CROWD_CONTROL)),
	SILVANNA(SOLDIER, Arrays.asList(REGENERATION, SHIELD, CROWD_CONTROL)),
	SUN(SOLDIER, Arrays.asList(REGENERATION, HIGH_MOBILITY, REAP)),
	TERIZLA(SOLDIER, Arrays.asList(REGENERATION)),
	THAMUZ(SOLDIER, Arrays.asList(REGENERATION, REAL_DAMAGE)),
	TIGREAL(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	URANUS(TANK, Arrays.asList(REGENERATION, SHIELD)),
	VALE(MAGE, Arrays.asList(HIGH_MOBILITY, CROWD_CONTROL, LONG_RANGE)),
	VALIR(MAGE, Arrays.asList(CROWD_CONTROL, LONG_RANGE)),
	VEXANA(MAGE, Arrays.asList(LONG_RANGE)),
	WANWAN(DAMAGE, Arrays.asList(REAP, CONTROL_IMMUNITY)),
	XBORG(SOLDIER, Arrays.asList(SHIELD, REAL_DAMAGE)),
	YISUNSHIN(DAMAGE, Arrays.asList(LONG_RANGE, INVULNERABILITY)),
	YUZHONG(TANK, Arrays.asList(ENDURANCE, REGENERATION, HIGH_MOBILITY)),
	YVE(MAGE, Arrays.asList(LONG_RANGE)),
	ZHASK(SOLDIER, Arrays.asList(ENDURANCE, REAL_DAMAGE)),
	ZILONG(DAMAGE, Arrays.asList(HIGH_MOBILITY, REAP));

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