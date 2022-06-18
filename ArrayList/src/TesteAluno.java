import java.util.ArrayList;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Aluno> lista = new ArrayList();
	
		Aluno a1 = new Aluno(555, 70);
	    lista.add(a1);
	    
	    Aluno a2 = new Aluno(444, 40);
	    lista.add(a2);
		
	    Aluno a3 = new Aluno(666, 50);
	    lista.add(a3);
	    
	    /*for (int i=0; i<lista.size(); i++) {
	    	System.out.println(lista.get(i).situacao());
	    }*/
	    
	    for (Aluno a:lista) {
	    	System.out.println(a.situacao());
	    }
		

	}

}
