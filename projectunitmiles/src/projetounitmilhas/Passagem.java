package projetounitmilhas;

public class Passagem implements AcoesPassagem {
    private String destino;
    private String data;
    private int disponibilidade;
    private float pagamento;
    private int totvendas;
    private boolean reservado;
    
    public Passagem(String destino, String data) {
        this.destino = destino;
        this.data = data;
        this.pagamento = 0;
        this.disponibilidade = 0;
        this.totvendas = 0;
        this.reservado = false;

    }

    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getTotvendas() {
        return totvendas;
    }

    public void setTotvendas(int totvendas) {
        this.totvendas = totvendas;
    }

    public boolean getReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public float getPagamento() {
        return pagamento;
    }

    public void setPagamento(float pagamento) {
        this.pagamento = pagamento;
    }

    // Método de sobreposição
    @Override
    public void reservar() {
        this.reservado = true;
        this.totvendas++;
            
    }

    @Override
    public void cancelar() {
        this.setReservado(true);
        System.out.println("Entrar em contato com a agência para efetuar o cancelamento");    
    }

    @Override
    public void consultar() {
        if (getReservado()) {
            System.out.println("Destino " + getDestino() + "/nDia: " + getData());
        } else {
            System.out.println("Não existe nenhuma reserva");
        }
            
    }

    @Override
    public String toString() {
        return "Passagem [destino=" + destino + ", data=" + data + ",  disponibilidade=" + disponibilidade
                + ", reservado=" + reservado + ", totvendas=" + totvendas + "]";
    }
    
}
