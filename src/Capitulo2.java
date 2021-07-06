import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {
	public static void main(String[] args) {
		Usuario user1 = new Usuario ("Dannilo Pires", 150);
		Usuario user2 = new Usuario ("Luana Dias", 120);
		Usuario user3 = new Usuario ("Raul Costa", 190);
		
		/*List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		*/
		
		/*ArrayList<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		*/
		
		/*
		 * Arrays.asList é uma maneira simples de criar
		 * uma List imutável. 
		 */
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		for(Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		
		System.out.println("\n<<<<=>>>>\n");
		
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
		
		System.out.println("\n<<<<=>>>>\n");
		
		Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		};
		
		usuarios.forEach(mostrador2);
		
		System.out.println("\n<<<<=>>>>\n");
		
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});
		
		System.out.println("\n<<<<=>>>>\n");
		
		/*
		 * Um lambda no Java é uma maneira mais simples
		 * de implementar uma interface que só tem um
		 * único método. 
		 * 
		 */
		
		
}
}
