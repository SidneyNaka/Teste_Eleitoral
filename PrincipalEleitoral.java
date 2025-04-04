package ex1;

public class PrincipalEleitoral {
    public static void main(String[] args) {
        Eleitoral e1 = new Eleitoral();
        e1.setNome("Carlos Alberto");
        e1.setIdade(45);
        e1.imprimir();
        
        Eleitoral e2 = new Eleitoral("Carol", 12);
        e2.imprimir();
    }
}
