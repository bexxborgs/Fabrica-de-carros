public class FabricaCarrosSedan
    
    implements FabricaCarros {
        @Override
        public Carro criarCarro() {
            return (Carro) new CarroSedan();
        }
    }
