package projetounitmilhas;

public class Usuario extends Pessoa  {
    private String email, login, telefone;
    private boolean cadastro;
    private int totCompra;

    // Método Público
    public void efetuarCadastro() {
        this.cadastro = true;
        System.out.println("Prezado " + getNome() + " Confirme o cadastro através do e-mail enviado para: " + getEmail());
    }
    public void validarCadastro() {
        if (getCadastro()) {
            System.out.println("Cadastro confirmado com sucesso!");
        } else {
            System.out.println("Cadastro inexistente");
        }
                
    }
    
    // Métodos Especiais
    public Usuario(String nome, String cpf, int idade, String sexo, String email, String login, String telefone) {
        super(nome, cpf, idade, sexo);
        this.email = email;
        this.login = login;
        this.telefone = telefone; 
        this.cadastro = false; 
        this.totCompra = 0;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean getCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    public int getTotCompra() {
        return totCompra;
    }
    public void setTotCompra(int totCompra) {
        this.totCompra = totCompra;
    }


}
