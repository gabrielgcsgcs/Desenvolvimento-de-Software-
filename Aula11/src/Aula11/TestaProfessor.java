package Aula11;


public class TestaProfessor {
	public static void main(String [] args) {
		Professor prof = new Professor("Cássio dos Santos", 
				"908.564.276-00", 'M', "Computação", 2000);
		ProfessorDoutor dr = new ProfessorDoutor("Mariana Andrade", 
				"095.334.234-09", 'F', "Biologia", 2010, 2008, "USP");
		
		System.out.println("Professor: " + prof.toString());
		System.out.println("Professor doutor: " + dr.toString());
	}
}
