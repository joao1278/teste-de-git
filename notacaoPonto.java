package fundamentos;

public class notacaoPonto { 
	
	public static void main(String[] args) {
		// double é um tipo primitivo
		double a = 2.3;
		System.out.println(a);
		String s = "bom dia X"; // String sempre inicia com letras maiusculas.
		s = s.replace("X","senhora");
		// essa funcao substitue algo por outra coisa
		s = s.toUpperCase();// ele faz as letras ficarem maiusculas / s.toU + ctrl espaco
		s = s.concat("!!!");
		// essa foncao pode concatenar 
		// assim como o '+' vc tbem pode juntar com essa funcao
				System.out.println(s);
				
				
				// vc tbem pode colocar todos em uma unica linha
				//que pode ser quebrada, antes ou apos o ponto.
				
				
				String f = "bom dia x"
						.replace("x", "joao")
						.concat("!!!")
						.toUpperCase();
				
				System.out.println(f);
				// tipos primitivos nao tem o operador "."
}

}
