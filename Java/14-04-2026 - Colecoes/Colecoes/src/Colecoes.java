import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Colecoes {

	public static void main(String[] args) {
		// lista();
		listaLinkada();
	}

	static void listaLinkada() {
		LinkedList<String> carros = new LinkedList<String>();

		carros.add("Fusca");
		carros.addFirst("BMW");
		carros.add(0, "Tracker");

		System.out.println(carros.toString());
	}

	static void lista() {

		List<String> carros = new ArrayList<>();

		carros.add("Fusca");
		carros.add("Volvo");
		carros.add("Etios");
		carros.add("Fusca");
		carros.add("BMW");
		carros.add("Etios");

		System.out.println(carros.size());

		// corrigido
		System.out.println(carros.get(0));
		System.out.println(carros.get(1));
		System.out.println(carros.get(carros.size() - 1));

		carros.add(5, "Kombi");

		carros.remove(0);

		carros.set(1, "Polo");

		System.out.println(carros.toString());
	}
}