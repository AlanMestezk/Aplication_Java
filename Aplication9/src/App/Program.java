package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Colab;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println();
		System.out.println(" 		    ✎Registro de colaborador✐");
		System.out.println("		    ");
		System.out.println();
		
		List<Colab> list = new ArrayList<>();
		
		System.out.print(" 	     ▶ Digite a quantos colabs irá rergistrar: ");
		int numberColab = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < numberColab; i++) {
			System.out.println(" 	     Colaborador ⌘"+ (i + 1));
			System.out.print(" 	     ⊚ Digite o nome: ");
			
			String name = sc.next();
			System.out.print(" 	     ⊚ Digite o userId: ");
			sc.nextLine();
			int userId = sc.nextInt();
			System.out.print(" 	     ⊚ Digite o cargo: ");
			String role = sc.next();
			System.out.print(" 	     ⊚ Digite o salario: ");
			sc.nextLine();
			double salary = sc.nextDouble();
			System.out.println();
			
			list.add(new Colab(name, userId, role, salary));
		}
		
		System.out.println();
		System.out.println(" 	      Usuário(s) cadastrado(s) com sucesso ✔");
		System.out.println();
		
		System.out.print(" 	     Digite o numero do usuário que deseja visualizar: ");
		int idSearch = sc.nextInt();

		Colab emp = list.stream()
				.filter(x -> x.getUserId() == idSearch)
				.findFirst()
				.orElse(null);
		
		if(emp == null) {
			System.out.println("Usuário não foi cadastrado recentemente ✘");
		}else {
			System.out.println();
			System.out.println(" 	     "+emp);
		}
		
		System.out.println();
		System.out.println();
		System.out.println(" 	     fim do programa");
		System.out.println();
		System.out.println(" 	     AlanMestezk © 2023");
		
	}
	

}







