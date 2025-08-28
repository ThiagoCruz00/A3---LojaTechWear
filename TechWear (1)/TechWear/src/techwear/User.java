package techwear;

public class User {
    
    private static int id;
    private static String cpf;
    private static String email;
    private static String nCelular;
    private static String senha;
    private static String pix;
    private static String nome;
    
    protected static void setLoggedUser(int idP,String cpfP,String emailP,String nCelularP,String senhaP,String pixP, String nomeP){
    
        id=idP;
        cpf=cpfP;
        email=emailP;
        nCelular=nCelularP;
        senha=senhaP;
        pix=pixP;
        nome=nomeP;
    }
    
    protected static int getId(){
    
        return id;
    }
    
    protected static String getCpf(){
    
        return cpf;
    }
    
    protected static String getEmail(){
    
        return email;
    }
    
    protected static String getNCelular(){
    
        return nCelular;
    }
    
    protected static String getSenha(){
    
        return senha;
    }
    
    protected static String getPix(){
    
        return pix;
    }
    
    protected static String getNome(){
    
        return nome;
    }
    
    protected static boolean verifLogin(){
    
        return getId()!=0;
    }
}
