package org.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.models.Role.*;
import static org.models.Behaviour.*;

public enum Hero {

	AAMON(MAGE, Arrays.asList()), AKAI(TANK, Arrays.asList(CROWD_CONTROL, SHIELD, ESCAPE)),
	ALDOUS(SOLDIER, Arrays.asList(CHARGE, SHIELD)), ALICE(MAGE, Arrays.asList(REGENERATION, CROWD_CONTROL, CHARGE)),
	ALPHA(null, Arrays.asList()), ALUCARD(null, Arrays.asList()), ANGELA(null, Arrays.asList()),
	ARGUS(null, Arrays.asList()), ATLAS(null, Arrays.asList()), AULUS(null, Arrays.asList()),
	AURORA(null, Arrays.asList()), BADANG(null, Arrays.asList()), BALMOND(null, Arrays.asList()),
	BANE(null, Arrays.asList()), BARATS(null, Arrays.asList()), BAXIA(null, Arrays.asList()),
	BEATRIX(null, Arrays.asList()), BELERICK(null, Arrays.asList()), BENEDETA(null, Arrays.asList()),
	BRODY(null, Arrays.asList()), BRUNO(null, Arrays.asList()), CARMILLA(null, Arrays.asList()),
	CECILION(null, Arrays.asList()), CHANGE(null, Arrays.asList()), CHOU(null, Arrays.asList()),
	CLAUDE(null, Arrays.asList()), CLINT(null, Arrays.asList()), CYCLOPS(null, Arrays.asList()),
	DIGGIE(null, Arrays.asList()), DYRROTH(null, Arrays.asList()), ESMERALDA(null, Arrays.asList()),
	ESTES(null, Arrays.asList()), EUDORA(null, Arrays.asList()), FANNY(null, Arrays.asList()),
	FARAMIS(null, Arrays.asList()), FLORYN(null, Arrays.asList()), FRANCO(null, Arrays.asList()),
	FREYA(null, Arrays.asList()), GATOTKACA(null, Arrays.asList()), GLOO(null, Arrays.asList()),
	GORD(null, Arrays.asList()), GRANGER(null, Arrays.asList()), GROCK(null, Arrays.asList()),
	GUINEVERE(null, Arrays.asList()), GUSION(null, Arrays.asList()), HANABI(null, Arrays.asList()),
	HANZO(null, Arrays.asList()), HARITH(null, Arrays.asList()), HARLEY(null, Arrays.asList()),
	HAYABUSA(null, Arrays.asList()), HELCURT(null, Arrays.asList()), HILDA(null, Arrays.asList()),
	HYLOS(null, Arrays.asList()), IRITHEL(null, Arrays.asList()), JAWHEAD(null, Arrays.asList()),
	JOHNSON(null, Arrays.asList()), KADITA(null, Arrays.asList()), KAGURA(null, Arrays.asList()),
	KAJA(null, Arrays.asList()), KARINA(null, Arrays.asList()), KARRIE(null, Arrays.asList()),
	KHALEED(null, Arrays.asList()), KHUFRA(null, Arrays.asList()), KIMMY(null, Arrays.asList()),
	LANCELOT(null, Arrays.asList()), LAPULAPU(null, Arrays.asList()), LAYLA(null, Arrays.asList()),
	LEOMORD(null, Arrays.asList()), LESLEY(null, Arrays.asList()), LING(null, Arrays.asList()),
	LOLITA(null, Arrays.asList()), LUNOX(null, Arrays.asList()), LOUYI(null, Arrays.asList()),
	LYLIA(null, Arrays.asList()), MARTIS(null, Arrays.asList()), MASHA(null, Arrays.asList()),
	MATHILDA(null, Arrays.asList()), MINOTAUR(null, Arrays.asList()), MINSITTHAR(null, Arrays.asList()),
	MYA(null, Arrays.asList()), MOSKOV(null, Arrays.asList()), NANA(null, Arrays.asList()),
	NATALIA(null, Arrays.asList()), NATAN(null, Arrays.asList()), ODETTE(null, Arrays.asList()),
	PAQUITO(null, Arrays.asList()), PHARSA(null, Arrays.asList()), PHOVEUS(null, Arrays.asList()),
	POPOL(null, Arrays.asList()), RAFAELA(null, Arrays.asList()), ROGER(null, Arrays.asList()),
	RUBY(null, Arrays.asList()), SABER(null, Arrays.asList()), SELENA(null, Arrays.asList()),
	SILVANNA(null, Arrays.asList()), SUN(null, Arrays.asList()), TERIZLA(null, Arrays.asList()),
	THAMUZ(null, Arrays.asList()), TIGREAL(null, Arrays.asList()), URANUS(null, Arrays.asList()),
	VALE(null, Arrays.asList()), VALIR(null, Arrays.asList()), VEXANA(null, Arrays.asList()),
	WANWAN(null, Arrays.asList()), XBORG(null, Arrays.asList()), YISUNSHIN(null, Arrays.asList()),
	YUZHONG(null, Arrays.asList()), YVE(null, Arrays.asList()), ZHASK(null, Arrays.asList()),
	ZILONG(null, Arrays.asList());

	private Role role;
	private List<Behaviour> strengths;
	private List<Behaviour> weaknesses;

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