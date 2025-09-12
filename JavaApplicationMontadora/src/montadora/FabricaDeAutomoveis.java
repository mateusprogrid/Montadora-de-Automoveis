package montadora;
public class FabricaDeAutomoveis {
    public static void main(String[] args) {
        Carros Carro1 = new Carros();
        Carro1.ano = 2025;
        Carro1.marca = "Toyota";
        Carro1.modelo = "Corolla";
        Carro1.ligar();
    }
    
}
