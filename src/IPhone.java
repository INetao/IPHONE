public class iPhone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public iPhone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public void ligar() {
        telefone.ligar();
    }

    public void atender() {
        telefone.atender();
    }

    public void iniciarChamadaVoz() {
        telefone.iniciarChamadaVoz();
    }

    public void exibirPagina() {
        navegador.exibirPagina();
    }

    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}
