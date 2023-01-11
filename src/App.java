import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] arrayUm = new String[]{"Maçã", "Bananinha", "Uva passa", "Mamão com açúcar", "Açaí", "Maracujá", "Cupuaçu"}; 
        String[] arrayDois = new String[]{"Geléia", "Tutti Frutti", "Bananinha", "Morango", "Pavê ou pacumê", "Mamão com açúcar"};
        ArrayList<String> frutasRepetidas = new ArrayList<>();
        for(int i = 0; i < arrayUm.length; i++){
            for(int j = 0; j < arrayDois.length; j++){
                if(arrayUm[i] == arrayDois[j]){
                    frutasRepetidas.add(arrayUm[i]);
                }
            }
        }
        System.out.println("Itens repetidos nos dois arrays:");
        System.out.println(frutasRepetidas);
    }
}
