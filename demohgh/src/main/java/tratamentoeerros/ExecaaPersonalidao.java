package tratamentoeerros;

public class ExecaaPersonalidao extends RuntimeException {

    private String nomeDoAtributo;

    public ExecaaPersonalidao(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMenssage(){
        return String.format(" o atributo esta megativo ",nomeDoAtributo);
    }


    public static void main(String[] args) {
    }



    
}
