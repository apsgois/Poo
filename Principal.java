public class Principal {
    public static void main(String[] args) {

       Pessoa[] pessoas = new Pessoa[5];

        Pessoa p1 = new Pessoa("Ana",1234564,2);

        Endereco end1 = new Endereco();
        end1.setBairro("Recanto");
        end1.setNum(106);
        end1.setRua("Santa Fazenda");
        p1.addEndereco(end1);

        Endereco end2 = new Endereco();
        end2.setBairro("Recanto");
        end2.setNum(106);
        end2.setRua("Santa Fazenda");
        p1.addEndereco(end2);

        // o terceiro endereco nao vai funcionar pq na quantidade de enderecos, foi adicionado somente 2 para essa pessoa.
        Endereco end3 = new Endereco();
        end3.setBairro("Recanto");
        end3.setNum(109);
        end3.setRua("Santa Fazenda");
        p1.addEndereco(end3);


        // nova pessoa com novo endereco
        Pessoa p2 = new Pessoa("João",12345679,3);

        Endereco end4 = new Endereco();
        end4.setBairro("Recanto");
        end4.setNum(109);
        end4.setRua("Santa Fazenda");
        p2.addEndereco(end4);



        // criando relacionamento
        pessoas[0]=p1;
        pessoas[1]=p2;

        // Acessando as informações atravaes do for
        for (int i = 0; i <pessoas.length; i++) { // length pega o tamanho do array correto
            if(pessoas[i]!= null) {
                pessoas[i].mostraInfo();

            }
        }

    }
}
