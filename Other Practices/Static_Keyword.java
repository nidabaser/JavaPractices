//Java'da, static anahtar kelimesi bir metot veya değişkenin sınıf düzeyinde olduğunu belirtir.
//Yani, bir sınıfın nesnesi oluşturulmadan doğrudan sınıf adı üzerinden erişilebilir. 

//Örnek 1: Basit Static Metot
public class MyMathClass {    
    public static int add(int x, int y) {        
        return x + y;    
    }
}

// Main method in another class
    public static void main(String[] args) {    
        int sum = MyMathClass.add(10, 5);    
        System.out.println(sum); // prints 15
    }
//Bu örnekte, MyMathClass sınıfında bir static metot olan add metotunu tanımladık.
//Bu metodu kullanmak için bir MyMathClass nesnesi oluşturmak zorunda değiliz, bunun yerine doğrudan sınıf adı üzerinden erişebiliriz.

//Örnek 2: Static Metotlar ve Değişkenler
public class Counter {    
    static int count = 0;       
    public static void increment() {        
        count++;    }       
    
    public static void printCount() {        
        System.out.println("Count: " + count);    
    }
}

// Main method in another class
    public static void main(String[] args) {    
        Counter.increment();    
        Counter.increment();    
        Counter.printCount(); // prints "Count: 2"
    }
//Bu örnekte, Counter sınıfında hem static bir değişken count hem de increment ve printCount adında iki static metot tanımladık.
//increment metodu, count değerini artırırken, printCount metodu mevcut count değerini yazdırır. 

//Her iki metodu da nesne oluşturmadan kullanabiliyoruz ve count değeri tüm Counter sınıfı için paylaşılıyor,
//bu da static değişkenlerin ve metodların sınıf düzeyinde olduğunu gösteriyor.

//Örnek 3: Static ve Non-Static Metotlar Arasındaki Fark
public class Example {    
    static void staticMethod() {        
        System.out.println("I am a static method.");    
    }    
    
    void nonStaticMethod() {        
        System.out.println("I am a non-static method.");    
    }
}

// Main method in another class
    public static void main(String[] args) {    
        Example.staticMethod(); // works fine       
        Example ex = new Example();    
        ex.nonStaticMethod(); // works fine    

        //Example.nonStaticMethod(); // would produce an error
}
//Bu örnekte, hem static hem de non-static metotları gösteren bir Example sınıfı oluşturduk.
//main metodunda, static metot doğrudan sınıf adı ile çağrılabilirken, non-static metot bir Example nesnesi üzerinden çağrılmalıdır.

//Özellikle, static metodlar durum, durum bilgisi veya durumu değiştiren bir işlem içermemeli
//çünkü static metodlar tüm nesneler arasında paylaşılır. Genellikle, yardımcı fonksiyonlar (util methodlar)
//veya nesne oluşturmadan erişilmesi gereken durum bilgileri için kullanılır.
//Aynı şekilde, static değişkenler genellikle sabitler (final keyword ile birlikte) veya tüm nesneler arasında paylaşılan durum bilgilerini içerir. 

