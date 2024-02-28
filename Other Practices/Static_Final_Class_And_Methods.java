//Static anahtar kelimesi Java'da bir değişkenin veya metodun sınıf düzeyinde olduğunu belirtir.
//Yani, statik bir değişkenin değeri tüm sınıf örnekleri (objeleri) tarafından paylaşılır.
//Statik değişkenler, sınıf yüklendiği anda hafızaya ayrılır ve programın sona erdiği ana kadar orada kalırlar.

//Final Sınıf Değişkenleri:

//Final anahtar kelimesi, bir değişkenin değerinin değiştirilemez olduğunu belirtir.
//Yani, bir kez atanan final bir değişkenin değeri daha sonra değiştirilemez.
//Final statik değişkenler genellikle sabit değerleri tutmak için kullanılır.


//Örnek 1: Static Değişken
class Test {    
    static int a = 10;
}

public class Main {    
    public static void main(String[] args) {        
        System.out.println(Test.a); // Output: 10    
    }
}
//Bu örnekte Test sınıfının içinde statik bir a değişkeni tanımlanmıştır.
//Statik değişkenler sınıfa ait olduğu için Test sınıfından bir nesne oluşturmadan direkt olarak sınıf ismi üzerinden erişilebilir.


//Örnek 2: Final Değişken
class Test {    
    final int a = 10;
}

public class Main {    
    public static void main(String[] args) {        
    Test t = new Test();        
    t.a = 20; // Compile Error: cannot assign a value to final variable a    
    }
}
//Bu örnekte Test sınıfının içinde final bir a değişkeni tanımlanmıştır.
//Final değişkenlerin değeri değiştirilemez. Bu nedenle t.a = 20; satırında bir derleme hatası alırız.

//Örnek 3: Static Final Değişken
class Test {    
    static final double PI = 3.14;
}

public class Main {    
      public static void main(String[] args) {        
          System.out.println(Test.PI); // Output: 3.14    
      }
}
//Bu örnekte Test sınıfında statik ve final bir PI değişkeni tanımlanmıştır.
//Bu değişken sabit bir değeri temsil eder (Pi sayısı) ve bu değer program boyunca değişmez.


//Örnek 4: Static Değişken Paylaşımı
class Test {    
static int a = 0;    
    Test() {        
        a++;    
    }    
    void printCount() {        
        System.out.println("a: " + a);    
    }
}

    public class Main {    
        public static void main(String[] args) {        
            Test t1 = new Test();        
            t1.printCount(); // Output: a: 1        
            Test t2 = new Test();        
            t2.printCount(); // Output: a: 2    
      }
}
//Bu örnekte Test sınıfının içinde statik bir a değişkeni ve Test sınıfının bir örneği oluşturulduğunda a değişkenini
//artıran bir yapıcı metod (constructor) bulunmaktadır. Test sınıfından iki adet nesne oluşturulduğunda her iki nesne de
//aynı a değişkenini paylaşır çünkü a statik bir değişkendir.


//Örnek 5: Static Method
class Test {    
    static int a = 10;    
    static void printA() {        
        System.out.println("a: " + a);    
    }
}

public class Main {    
    public static void main(String[] args) {        
        Test.printA(); // Output: a: 10    
    }
}
//Bu örnekte Test sınıfında statik bir printA metodu bulunmaktadır.
//Statik metodlar da sınıfa ait olduğu için Test sınıfından bir nesne oluşturmadan direkt olarak sınıf ismi üzerinden erişilebilir.


//Örnek 6: Static Block
class Test {    
    static int a;    
    static {        
        a = 10;    
     }
}

public class Main {    
    public static void main(String[] args) {        
        System.out.println(Test.a); // Output: 10    
    }
}
//Bu örnekte Test sınıfında bir statik blok bulunmaktadır.
//Statik bloklar, sınıf yüklendiği anda bir kez çalıştırılır ve
//genellikle statik değişkenlerin başlangıç değerlerini ayarlamak için kullanılır.


//Örnek 7: Final Method
class Test {    
    final void printMessage() {        
        System.out.println("Hello World");    
    }
}

class Derived extends Test {    
// Compile Error: printMessage() in Derived cannot override printMessage() in Test    

    void printMessage() {        
        System.out.println("Hello World Overridden");    
    }
}

public class Main {    
    public static void main(String[] args) {        
        Derived d = new Derived();        
        d.printMessage();    
    }
}
//Bu örnekte Test sınıfında final bir printMessage metodu bulunmaktadır.
//Final metodlar, alt sınıflar tarafından geçersiz kılınamaz (override).
//Bu nedenle Derived sınıfında printMessage metodunu geçersiz kılmaya çalıştığımızda bir derleme hatası alırız.

//Örnek 8: Final Class
final class Test {    
    void printMessage() {        
        System.out.println("Hello World");    
    }
}

// Compile Error: Cannot inherit from final Test
class Derived extends Test {    
    void printMessage() {        
        System.out.println("Hello World Overridden");    
    }
}
//Bu örnekte final bir Test sınıfı bulunmaktadır. Final sınıflar, başka bir sınıf tarafından kalıtılamaz (inherit).
//Bu nedenle Derived sınıfının Test sınıfını kalıtmasına çalıştığımızda bir derleme hatası alırız.

//Örnek 9: Static Inner Class
class Outer {    
    static class Inner {        
        void printMessage() {            
            System.out.println("Hello from Inner class");        
        }    
    }
}

public class Main {    
    public static void main(String[] args) {        
        Outer.Inner inner = new Outer.Inner();        
        inner.printMessage(); // Output: Hello from Inner class    
    }
}
//Bu örnekte Outer sınıfının içinde statik bir Inner sınıfı bulunmaktadır.
//Statik iç sınıflar, iç sınıfın bir örneğini oluşturabilmek için dış sınıfın bir örneğine ihtiyaç duymaz.
