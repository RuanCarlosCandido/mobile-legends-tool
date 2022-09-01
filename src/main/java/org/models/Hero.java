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
import static org.models.Behaviour.SPLASH_DAMAGE;
import static org.models.Behaviour.SUMMON;
import static org.models.Behaviour.SKILL_SUPPRESSION;
import static org.models.Behaviour.ENCAGE;
import static org.models.Behaviour.EXPLOSION;

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

	AAMON(MAGE, Arrays.asList(INVULNERABILITY)),
	AKAI(TANK, Arrays.asList(SHIELD, ENCAGE)),
	ALDOUS(SOLDIER, Arrays.asList(HIGH_MOBILITY, SHIELD,EXPLOSION)),
	ALICE(MAGE, Arrays.asList(REGENERATION, HIGH_MOBILITY, SPLASH_DAMAGE)),
	ALPHA(SOLDIER, Arrays.asList(REAL_DAMAGE)),
	ALUCARD(DAMAGE, Arrays.asList(REGENERATION, HIGH_MOBILITY)),
	ANGELA(SUPPORT, Arrays.asList(REGENERATION, SHIELD)),
	ARGUS(SOLDIER, Arrays.asList(INVULNERABILITY)),
	ATLAS(TANK, Arrays.asList(CROWD_CONTROL, ENDURANCE )),
	AULUS(SOLDIER, Arrays.asList(HIGH_MOBILITY, REGENERATION)),
	AURORA(MAGE, Arrays.asList(CROWD_CONTROL, EXPLOSION)),
	BADANG(SOLDIER, Arrays.asList(SPLASH_DAMAGE, ENCAGE)),
	BALMOND(SOLDIER, Arrays.asList(REAL_DAMAGE, ENDURANCE, SPLASH_DAMAGE)),
	BANE(SOLDIER, Arrays.asList(REGENERATION,CROWD_CONTROL)),
	BARATS(TANK, Arrays.asList(ENDURANCE, ENCAGE, ENDURANCE)),
	BAXIA(SOLDIER, Arrays.asList(HIGH_MOBILITY, REGENERATION_REDUCTION)),
	BEATRIX(DAMAGE, Arrays.asList(REAP, HIGH_MOBILITY, LONG_RANGE)),
	BELERICK(TANK, Arrays.asList(REFLECTION, REGENERATION, CROWD_CONTROL)),
	BENEDETA(DAMAGE, Arrays.asList(HIGH_MOBILITY, INVULNERABILITY)),
	BRODY(DAMAGE, Arrays.asList(LONG_RANGE)),
	BRUNO(DAMAGE, Arrays.asList(REAP)),
	CARMILLA(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	CECILION(MAGE, Arrays.asList(CROWD_CONTROL)),
	CHANGE(MAGE, Arrays.asList(LONG_RANGE)),
	CHOU(DAMAGE, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY)),
	CLAUDE(DAMAGE, Arrays.asList(HIGH_MOBILITY, REAP)),
	CLINT(DAMAGE, Arrays.asList(ARMOR_BREAKER,SPLASH_DAMAGE)),
	CYCLOPS(MAGE, Arrays.asList(CROWD_CONTROL, HIGH_MOBILITY)),
	DIGGIE(SUPPORT, Arrays.asList(CONTROL_IMMUNITY)),
	DYRROTH(DAMAGE, Arrays.asList(REGENERATION)),
	EDITH(SOLDIER,Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	ESMERALDA(MAGE, Arrays.asList(SHIELD_STEALING, REGENERATION)),
	ESTES(SUPPORT, Arrays.asList(REGENERATION)),
	EUDORA(MAGE, Arrays.asList(CROWD_CONTROL,EXPLOSION)),
	FANNY(DAMAGE, Arrays.asList(HIGH_MOBILITY, REGENERATION)),
	FARAMIS(SUPPORT, Arrays.asList(REGENERATION, SPLASH_DAMAGE)),
	FREDERIN(TANK, Arrays.asList(REGENERATION, ENDURANCE)),
	FLORYN(SUPPORT, Arrays.asList(SHIELD, REGENERATION)),
	FRANCO(TANK, Arrays.asList(SKILL_SUPPRESSION,HIGH_MOBILITY, REGENERATION)),
	FREYA(SOLDIER, Arrays.asList(ENDURANCE, SHIELD)),
	GATOTKACA(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	GLOO(TANK, Arrays.asList(ENDURANCE, SKILL_SUPPRESSION)),
	GORD(MAGE, Arrays.asList(REAL_DAMAGE)),
	GRANGER(DAMAGE, Arrays.asList(HIGH_MOBILITY)),
	GROCK(TANK, Arrays.asList(CONTROL_IMMUNITY, ENCAGE, ENDURANCE)),
	GUINEVERE(SOLDIER, Arrays.asList(HIGH_MOBILITY, CROWD_CONTROL, REGENERATION)),
	GUSION(MAGE, Arrays.asList(HIGH_MOBILITY)),
	HANABI(DAMAGE, Arrays.asList(SPLASH_DAMAGE)),
	HANZO(DAMAGE, Arrays.asList(HIGH_MOBILITY, INVULNERABILITY)),
	HARITH(MAGE, Arrays.asList(CROWD_CONTROL, HIGH_MOBILITY)),
	HARLEY(MAGE, Arrays.asList(HIGH_MOBILITY)),
	HAYABUSA(DAMAGE, Arrays.asList(HIGH_MOBILITY, INVULNERABILITY)),
	HELCURT(DAMAGE, Arrays.asList(HIGH_MOBILITY,SKILL_SUPPRESSION)),
	HILDA(SOLDIER, Arrays.asList(SHIELD, REGENERATION)),
	HYLOS(SUPPORT, Arrays.asList(ENDURANCE, CROWD_CONTROL, SPLASH_DAMAGE)),
	IRITHEL(DAMAGE, Arrays.asList(REAP)),
	JAWHEAD(SOLDIER, Arrays.asList(ENDURANCE, SHIELD, HIGH_MOBILITY)),
	JOHNSON(TANK, Arrays.asList(ENDURANCE, SHIELD, HIGH_MOBILITY, CROWD_CONTROL)),
	KADITA(MAGE, Arrays.asList(REAL_DAMAGE, CROWD_CONTROL, INVULNERABILITY, EXPLOSION)),
	KAGURA(MAGE, Arrays.asList(HIGH_MOBILITY, CONTROL_IMMUNITY, SPLASH_DAMAGE)),
	KAJA(MAGE, Arrays.asList(CROWD_CONTROL)),
	KARINA(DAMAGE, Arrays.asList(REAL_DAMAGE, INVULNERABILITY, HIGH_MOBILITY, REFLECTION)),
	KARRIE(DAMAGE, Arrays.asList(REAL_DAMAGE, REAP)),
	KHALEED(SOLDIER, Arrays.asList(ENDURANCE, REGENERATION)),
	KHUFRA(TANK, Arrays.asList(HIGH_MOBILITY, ENCAGE)),
	KIMMY(MAGE, Arrays.asList(HIGH_MOBILITY, REAP, LONG_RANGE)),
	LANCELOT(DAMAGE, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY)),
	LAPULAPU(SOLDIER, Arrays.asList(REGENERATION)),
	LAYLA(DAMAGE, Arrays.asList(LONG_RANGE)),
	LEOMORD(DAMAGE, Arrays.asList(REGENERATION, ENDURANCE)),
	LESLEY(DAMAGE, Arrays.asList(LONG_RANGE,HIGH_MOBILITY)),
	LING(DAMAGE, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY)),
	LOLITA(SUPPORT, Arrays.asList(SHIELD, CROWD_CONTROL)),
	LUNOX(MAGE, Arrays.asList(REAL_DAMAGE, REAP)),
	LOUYI(SUPPORT, Arrays.asList(CROWD_CONTROL, SPLASH_DAMAGE)),
	LYLIA(MAGE, Arrays.asList(ENDURANCE, HIGH_MOBILITY, LONG_RANGE)),
	MARTIS(DAMAGE, Arrays.asList(CONTROL_IMMUNITY, REGENERATION)),
	MASHA(DAMAGE, Arrays.asList(HIGH_MOBILITY, SHIELD)),
	MATHILDA(SUPPORT, Arrays.asList(HIGH_MOBILITY)),
	MINOTAUR(SUPPORT, Arrays.asList(ENDURANCE, REGENERATION, CROWD_CONTROL)),
	MINSITTHAR(SUPPORT, Arrays.asList(ENCAGE,SKILL_SUPPRESSION)),
	MYA(DAMAGE, Arrays.asList(REAP, CONTROL_IMMUNITY, SPLASH_DAMAGE)),
	MOSKOV(DAMAGE, Arrays.asList(REAP, CROWD_CONTROL)),
	NANA(MAGE, Arrays.asList(INVULNERABILITY, SPLASH_DAMAGE)),
	NATALIA(DAMAGE, Arrays.asList(HIGH_MOBILITY,SKILL_SUPPRESSION)),
	NATAN(DAMAGE, Arrays.asList(REAP)),
	ODETTE(MAGE, Arrays.asList(ENDURANCE, SPLASH_DAMAGE)),
	PAQUITO(SOLDIER, Arrays.asList(INVULNERABILITY, HIGH_MOBILITY)),
	PHARSA(MAGE, Arrays.asList(HIGH_MOBILITY, LONG_RANGE)),
	PHOVEUS(SOLDIER, Arrays.asList(HIGH_MOBILITY, REGENERATION, ENDURANCE)),
	POPOL(SOLDIER, Arrays.asList(SUMMON)),
	RAFAELA(SUPPORT, Arrays.asList(REGENERATION, CROWD_CONTROL)),
	ROGER(SOLDIER, Arrays.asList(HIGH_MOBILITY, REAP, REGENERATION)),
	RUBY(TANK, Arrays.asList(REGENERATION, CROWD_CONTROL)),
	SABER(DAMAGE, Arrays.asList(ARMOR_BREAKER, CROWD_CONTROL,EXPLOSION)),
	SELENA(MAGE, Arrays.asList(LONG_RANGE, CROWD_CONTROL)),
	SILVANNA(SOLDIER, Arrays.asList(REGENERATION, SHIELD, ENCAGE)),
	SUN(SOLDIER, Arrays.asList(SUMMON, REAP)),
	TERIZLA(SOLDIER, Arrays.asList(REGENERATION)),
	THAMUZ(SOLDIER, Arrays.asList(REGENERATION, REAL_DAMAGE)),
	TIGREAL(TANK, Arrays.asList(ENDURANCE, CROWD_CONTROL)),
	URANUS(TANK, Arrays.asList(REGENERATION, SHIELD)),
	VALE(MAGE, Arrays.asList(HIGH_MOBILITY, CROWD_CONTROL)),
	VALIR(MAGE, Arrays.asList(CROWD_CONTROL, LONG_RANGE)),
	VALENTINA(MAGE, Arrays.asList(LONG_RANGE,CROWD_CONTROL)),
	VEXANA(MAGE, Arrays.asList(SUMMON)),
	WANWAN(DAMAGE, Arrays.asList(REAP, CONTROL_IMMUNITY, HIGH_MOBILITY)),
	XBORG(SOLDIER, Arrays.asList(SHIELD, REAL_DAMAGE, SPLASH_DAMAGE, EXPLOSION)),
	YISUNSHIN(DAMAGE, Arrays.asList(LONG_RANGE, INVULNERABILITY, SPLASH_DAMAGE)),
	YUZHONG(TANK, Arrays.asList(ENDURANCE, REGENERATION, HIGH_MOBILITY)),
	YVE(MAGE, Arrays.asList(LONG_RANGE)),
	ZHASK(SOLDIER, Arrays.asList(SUMMON, CROWD_CONTROL)),
	ZILONG(DAMAGE, Arrays.asList(HIGH_MOBILITY, REAP, CONTROL_IMMUNITY, ARMOR_BREAKER));

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