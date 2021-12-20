/* 
            *** Cara compile dan run file .java di Terminal ***
    
    <+> Untuk meng-compile source code gunakan perintah "javac"
        Contoh: $ javac namaFile.java
    <+> Hasil kompilasi program, akan menghasilkan nama file yang sesuai dengan
        nama class yang terdapat "main method".
        contoh: namaClass.class
    <+> Untuk meng-run hasil compile yaitu "namaClass.class" dengan menggunakan 
        perintah "java".
        Contoh: $ java namaClass (tidak ikut .class ditulis)
*/
class hello { //Nama kelas ini merupakan acuan dari nama hasil compile.
              //Jika source code ini di-compile akan menghasilkan file dengan nama
              //hello.class.
    public static void main(String[] args) { //Main Method
        System.out.println("Hello, Word!");
        System.out.println("Hai Kevin :)");
    }
}