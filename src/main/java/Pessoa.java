public class Pessoa {
    public String nome;
    public int cpf;
    Endereco[] enderecos;


    public Pessoa(String nome, int cpf, int qtdEnd){
        this.nome=nome;
        this.cpf=cpf;
        enderecos = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        for (int i = 0; i < enderecos.length; i++) {
            if(enderecos[i]== null){
                enderecos[i]= end;
                break;
            }

        }
    }
    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        for(int i= 0; i<enderecos.length;i++){
           if( enderecos[i]!=null){
               enderecos[i].mostraInfo();
           }

        }
    }
}
