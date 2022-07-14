package projetounitmilhas;

public class UnitMilhas {
    public static void main(String[] args) {
        /* Passagem p[] = new Passagem[2];
        p[0] = new Passagem ("Fortaleza", "14/07/2022");
        p[1] = new Passagem("Recife", "16/07/2022");

        p[0].reservar();
        p[0].consultar();
        System.out.println(p[0].toString());
        p[0].cancelar(); */

        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Thyago", "089.493.244-66", 31, "M", "thiago@gmail", "Luiz", "8198558-3324");
        u[0].efetuarCadastro();
        u[0].validarCadastro();
        
        

        



    }
    
}