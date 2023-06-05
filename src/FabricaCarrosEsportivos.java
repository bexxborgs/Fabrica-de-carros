public class FabricaCarrosEsportivos implements FabricaCarros {
    @Override
    public Carro criarCarro() {
        return (Carro) new CarroEsportivo();
    }
}