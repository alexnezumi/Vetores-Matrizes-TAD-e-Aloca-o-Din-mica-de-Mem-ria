public class Lista {
    public static void main(String[] args) {
        ListaEncadiada<String> lista = new ListaEncadiada<>();

        System.out.println("Tamanho da lista = " + lista.getTamanho());

        lista.adiciona("Claudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elis");

        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

        lista.remover("Claudio");

        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());


    }
}
