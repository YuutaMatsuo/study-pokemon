package poketmonster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// Mapを作成
		Map<String,List<Pokemon>> gymPokemonMap = new LinkedHashMap<>(); 
		
		// モンスターのインスタンスを作成
		Pokemon geodude = new Pokemon("イシツブテ");
		Pokemon onix = new Pokemon("イワーク");
		Pokemon staryu = new Pokemon("ヒトデマン");
		Pokemon starmie = new Pokemon("スターミー");
		Pokemon pikachu = new Pokemon("ピカチュウ");
		Pokemon raichu = new Pokemon("ライチュウ");
		
		// 各ジムリーダーごとの手持ちポケモンが入ったListを作成
		ArrayList<Pokemon> takeshiPokemon = 
				new ArrayList<>(Arrays.asList(geodude,onix));
		ArrayList<Pokemon> kasumiPokemon = 
				new ArrayList<>(Arrays.asList(staryu,starmie));
		ArrayList<Pokemon> matisuPokemon = 
				new ArrayList<>(Arrays.asList(pikachu,raichu));
		
		// Mapにリストを格納
		gymPokemonMap.put("タケシ", takeshiPokemon);
		gymPokemonMap.put("カスミ", kasumiPokemon);
		gymPokemonMap.put("マチス", matisuPokemon);
		
		// 出力
		for( String key : gymPokemonMap.keySet()) {
			System.out.println("【" + key + "の手持ちポケモン】");
			for(Pokemon pokemon : gymPokemonMap.get(key)) {
				System.out.println(pokemon);
			}
		}
	}
}
