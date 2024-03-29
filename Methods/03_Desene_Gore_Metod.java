public class Main {
    public static void main(String[] args) {
        // Metodun çağrılması
        sequence(16);
    }
  
    public static void sequence(int num){
        // Sayı 0'dan küçük eşit ise sayıyı yazdıracak
        if(num <= 0){
            System.out.print(num + " ");
            return;
        }
        // değilse boşluk bırakıp metod (sayı - 5) değeriyle kendini çağıracak 
        System.out.print(num + " ");
      
        sequence(num - 5); // Metodu yeniden çağırdığımız için
        // alt satıra geçmeyecek metoda dönecek ve
        // metodun şartı sağlanınca alt satırı yazdırıp sonlanacak
      
        System.out.print(num + " ");
    }
}
