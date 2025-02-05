public class Principal{
    
    
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();
        System.out.println(objPessoa.toString());    

        Pessoa objPessoa2 = new Pessoa("David", 20);
        System.out.println(objPessoa2.toString());    

        Pessoa objPessoa3 = new Pessoa("Junior", 32, 1234567891);
        System.out.println(objPessoa3.toString());
    }
    
    
}