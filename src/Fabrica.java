public class Fabrica {
    public static void main(String[] args) {
        // Criando uma fábrica de carros sedan
        FabricaCarros fabricaCarrosSedan = new FabricaCarrosSedan();
        Carro carroSedan = fabricaCarrosSedan.criarCarro();
        carroSedan.fabricar();

        // Criando uma fábrica de carros esportivos
        FabricaCarros fabricaCarrosEsportivos = new FabricaCarrosEsportivos();
        Carro carroEsportivo = fabricaCarrosEsportivos.criarCarro();
        carroEsportivo.fabricar();
    }
}