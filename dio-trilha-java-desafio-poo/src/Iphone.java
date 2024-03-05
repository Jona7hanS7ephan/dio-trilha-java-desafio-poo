public class Iphone implements Navegador, ReprodutorMusical, AparelhoTelefonico {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }

    public void tocar() {
        System.out.println("Tocando");
    }

    public void pausar() {
        System.out.println("Pausar");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar musica.");
    }

    public void ligar() {
        System.out.println("Ligando.");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de voz.");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    
}
