class Cliente {
    private int id;
    private String nome;
    private String email;
    private String cpf;

    public Cliente(String nome, String email, String cpf, int id) {
        this.id=id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
    public String toString(){
        return "\nNome do Cliente: "+getNome()+
                "\nE-mail: " + getEmail()+
                "\nCPF: "+getCpf()+
                "\nID: "+ getId();
    }
}
