/*Parametreli Metotlar:

Java'da metotlar, bir işlevi yerine getirmek için kullanılır.
Parametreli metotlar, içine belirli değerler alan ve bu değerlerle işlem yapan metotlardır.
Bu parametreler metoda girdi olarak verilir ve metot, bu girdilere göre işlemler yapar.

Parametreler, metot tanımlamasındaki parantez içerisinde belirtilir ve virgülle ayrılır.
Her parametre için bir veri tipi ve bir isim belirtilmelidir.

Parametreli Metotların Kullanılması:
*/

public class Main {    
    public static void main(String[] args) {        
        printName("John");  // Parametreli metodu çağırıyoruz ve "John" değerini parametre olarak veriyoruz.    
     }    

      // Parametreli bir metot tanımlaması    
      public static void printName(String name) {        
          System.out.println("Name is: " + name);    
      }
}

//Bu örnekte, printName adında bir metot tanımladık ve bu metoda bir String parametresi ekledik.
//Bu metodu çağırırken, bir String değeri parametre olarak veriyoruz ve bu değer, metot içinde kullanılıyor.


public class Main {    
    public static void main(String[] args) {        
        int sum = addNumbers(5, 10);  // İki sayının toplamını hesaplayan metodu çağırıyoruz.        
        System.out.println("Sum is: " + sum);    
    }    

    // İki sayının toplamını hesaplayan metot    
    public static int addNumbers(int num1, int num2) {        
        return num1 + num2;    
    }
}

//Bu örnekte, addNumbers adında bir metot tanımladık ve bu metoda iki tane int parametresi ekledik.
//Bu metodu çağırırken, iki tane int değeri parametre olarak veriyoruz ve bu değerler metot içinde toplanıyor. Metot, bu iki sayının toplamını döndürüyor.


//Çarpma işlemi yapan bir metot:
public class Main {    
    public static void main(String[] args) {        
        int result = multiply(5, 4);  // İki sayının çarpımını hesaplayan metodu çağırıyoruz.        
        System.out.println("Multiplication result: " + result);    
      }    
      
      // İki sayının çarpımını hesaplayan metot    
      public static int multiply(int num1, int num2) {        
          return num1 * num2;    
      }
}
//Bu örnekte multiply adlı metot, verilen iki parametreyi çarpar ve sonucu döndürür.


//Bir metnin belli bir kısmını alıp geri döndüren bir metot:
public class Main {    
    public static void main(String[] args) {        
        String result = getSubstring("Hello World!", 0, 5);  // Metnin bir kısmını alıp geri döndüren metodu çağırıyoruz.        
        System.out.println("Substring is: " + result);    
    }    

    // Bir metnin belirli bir kısmını alıp geri döndüren metot    
    public static String getSubstring(String str, int beginIndex, int endIndex) {        
        return str.substring(beginIndex, endIndex);    
    }
}
//Bu örnekte getSubstring adlı metot, verilen metni ve başlangıç ile bitiş indekslerini alır ve bu aralıktaki metni döndürür.


//İsim ve Soyismi Birleştiren Metot
public class Main {    
    public static void main(String[] args) {        
        String fullName = getFullName("John", "Doe");        
        System.out.println("Full Name is: " + fullName);    
    }    

    public static String getFullName(String firstName, String lastName) {        
        return firstName + " " + lastName;    
    }
}
//Bu kodda, getFullName adlı bir metot oluşturduk. Bu metot, isim ve soyisimi birleştirir ve tam ismi döndürür.
