package projetounitmilhas;

public class Viagem {
    private Usuario passageiro;
    private Passagem bilhete;

    public Viagem(Usuario passageiro, Passagem bilhete) {
        this.passageiro = passageiro;
        this.bilhete = bilhete;
        this.passageiro.setTotCompra(this.passageiro.getTotCompra() + 1);
        this.bilhete.setTotvendas(this.bilhete.getTotvendas() + 1);
    }

    // Métodos de sobrecarga
    public void pagar(String aVista) {
        switch (aVista) {
            case "Dinheiro":
                System.out.println("Pagamento efetuado em dinheiro!");
                break;
            case "Pix":
                System.out.println("Pagamento efetuado por PIX!");
            case "Débito":
                System.out.println("Pagamento efetuado na função débito");        
            default:
                System.out.println("O metódo de pagamento não é à Vista");
                break;
        }
    }

    public void pagar(int nParcela) {
        if (nParcela > 0 && nParcela <= 10) {
            System.out.println("Transação efetuada com sucesso");
            System.out.println("Valor dividido em: " + nParcela);
        } else {
            System.out.println("Só pode ser dividido em até 10x");
        }
    }

    public Usuario getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Usuario passageiro) {
        this.passageiro = passageiro;
    }

    public Passagem getBilhete() {
        return bilhete;
    }

    public void setBilhete(Passagem bilhete) {
        this.bilhete = bilhete;
    }
    
    
        
}
