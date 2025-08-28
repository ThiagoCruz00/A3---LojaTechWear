 package techwear;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
/**
 *
 * @author macga
 */


public class DatabaseMethods {
    
    protected static ArrayList productsQuery(int offSet, String nome){
    
        try{
            
            String command="select * from produtos \n" +
                            "left join cores on produtos.cores_id_cor=cores.id_cor\n" +
                            "WHERE produtos.nome like ? \n" +
                            "limit ?,10;";
            
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            
            if(pst==null){
                throw new SQLException("Erro ao executar o metodo de listagem de produtos: \n");
            }
            
            pst.setString(1,"%"+nome+"%");
            pst.setInt(2,offSet);
            
            ResultSet results=pst.executeQuery();
            ArrayList<Object[]> produtos=new ArrayList();
            
            while(results.next()){

                int puxarID=results.getInt("id_produtos");
                String puxarNome=results.getString("produtos.nome");
                float puxarPreco=results.getFloat("preco");
                String puxarCor=results.getString("cores.nome");
                int puxarEstoque=results.getInt("estoque");
                
                produtos.add(new Object[]{puxarID,puxarNome, puxarPreco, puxarCor, puxarEstoque});
            }
            
            return produtos;
            
        } catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
    }
    
    protected static ArrayList<Object[]> productsIDQuery(int IDProduto){
    
        try{
        
            String command="select id_produtos,produtos.nome,preco,cores_id_cor,cores.nome,estoque from produtos left join cores on produtos.cores_id_cor=cores.id_cor where id_produtos=?;";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            if(pst==null)
                throw new SQLException("A conexoa com o banco de dados nao foi estabelecida.");
            pst.setInt(1,IDProduto);
            
            ResultSet results=pst.executeQuery();
            ArrayList<Object[]> product=new ArrayList();
            
            while(results.next()){
            
                int puxarID=results.getInt("id_produtos");
                String puxarNome=results.getString("produtos.nome");
                float puxarPreco=results.getFloat("preco");
                int puxarIDCor=results.getInt("cores_id_cor");
                String puxarCor=results.getString("cores.nome");
                int puxarEstoque=results.getInt("estoque");
                
                product.add(new Object[]{puxarID,puxarNome, puxarPreco, puxarIDCor,puxarCor, puxarEstoque});
            }
            
            if(product.isEmpty()){
            
                throw new SQLException("Nenhum produto foi encontrado.");
            }
            
            return product;
        
        } catch(SQLException e){
        
            System.err.println("Erro ao executar o metodo productsIDQuery: \n"+e);
            return null;
        }
    }
    
    protected static int alterProducts(String nome, float preco, int IDCor, int estoque, int IDProduto){
    
        try{
        
            String command="update produtos set nome=?,preco=?,cores_id_cor=?,estoque=? where id_produtos=?;";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            if(pst==null)
                throw new SQLException("A conexao com o banco de dados nao foi estabelecida.");
            pst.setString(1,nome);
            pst.setFloat(2,preco);
            pst.setInt(3,IDCor);
            pst.setInt(4,estoque);
            pst.setInt(5,IDProduto);
            
            int affectedRows=pst.executeUpdate();
            if(affectedRows==0)
                throw new SQLException("Nenhuma linha foi alterada.");
            
            return affectedRows;
            
        } catch(SQLException e){
        
            System.err.println("Erro no metodo alterProducts: \n"+e);
            return 0;
        }
    }
    
    protected static int registerUser(String cpf, String email, String celular, String senha){
    
        try{
        
            String command = "INSERT INTO clientes (cpf, email, celular, senha) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(command);
      
            pst.setString(1, cpf);
            pst.setString(2, email);
            pst.setString(3, celular);
            pst.setString(4, senha);
            
            int affectedRows=pst.executeUpdate();
            
            return affectedRows;

        } catch(SQLException e){
        
            System.err.println("Erro ao cadastrar o cliente: \n"+e);
            return 0;
        }
    }
    
    protected static int alterUser(String cpf, String email, String celular, String senha, String pix, String nome){
    
        try{
        
            String command="update clientes set cpf=?, email=?,celular=?,senha=?,pix=?,nome=? where id_clientes=?;";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            pst.setString(1, cpf);
            pst.setString(2, email);
            pst.setString(3, celular);
            pst.setString(4, senha);
            pst.setString(5, pix);
            pst.setString(6, nome);
            
            int affectedRows=pst.executeUpdate();
            if(affectedRows==0)
                throw new SQLException("Nenhuma linha foi afetada.");
            
            return affectedRows;
            
        } catch(SQLException e){
        
            System.err.println("Erro ao executar o metodo alterUser: \n"+e);
            return 0;
        }
    }
    
    protected static boolean Login(String email, String senha){
    
        try{
        
            String command="select * from clientes where email=? and senha=?;";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            
            if(pst==null){
            
                throw new SQLException("Erro ao executar o metodo de login: \n");
            }
            
            pst.setString(1,email);
            pst.setString(2,senha);
            
            ResultSet registro=pst.executeQuery();
            boolean verifLogin=false;
            
            if(registro.next()){
                verifLogin=true;
            
                int puxarID=registro.getInt("id_clientes");
                String puxarCPF=registro.getString("cpf");
                String puxarEmail=registro.getString("email");
                String puxarNCelular=registro.getString("celular");
                String puxarSenha=registro.getString("senha");
                String puxarPix=registro.getString("pix");
                String puxarNome=registro.getString("nome");
                
                User.setLoggedUser(puxarID, puxarCPF, puxarEmail, puxarNCelular, puxarSenha, puxarPix,puxarNome);
            }
            
            return verifLogin;
            
        }catch(SQLException e){
        
            System.err.println(e);
            return false;
        }
    }
    
    protected static ArrayList<Object[]> userQueryCart(int IDCliente){
    
        try{
        
            String command="select * from carrinho where clientes_id_clientes=?";
            
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            pst.setInt(1,IDCliente);
            
            ResultSet results=pst.executeQuery();
            ArrayList<Object[]> registros=new ArrayList();
            
            if(results.next()){
                
                registros.add(new Object[]{results.getInt("id_carrinho"),results.getInt("clientes_id_clientes")});
            }
            
            return registros;
            
        } catch(SQLException e){
        
            System.err.println("Erro ao executar o metodo userQueryCart: \n"+e);
            return null;
        }
    }
    
    protected static ArrayList<Object[]> productQueryCartItem (int IDProduto){
    
        try{
        
            String command="select * from item_carrinho where produtos_id_produtos=?";
            
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            pst.setInt(1,IDProduto);
            
            ResultSet results=pst.executeQuery();
            ArrayList<Object[]> registros=new ArrayList();
            
            if(results.next()){
                
                registros.add(new Object[]{results.getInt("id_item_carrinho"),results.getInt("produtos_id_produtos"),results.getInt("carrinho_id_carrinho"),results.getInt("quantidade")});
            }
            
            return registros;
            
        } catch(SQLException e){
        
            System.err.println("Erro ao executar o metodo productQueryCartItem: \n"+e);
            return null;
        }
    }
    
    protected static int CartInsert(int IDCliente){
    
        try{

            String command="insert into carrinho (clientes_id_clientes) values (?);";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command,Statement.RETURN_GENERATED_KEYS);
            
            if(pst==null)
                throw new SQLException("Conexao com o banco falhou no metodo CartInsert.");
            
            pst.setInt(1,IDCliente);

            if(!userQueryCart(IDCliente).isEmpty()) //verifica se o arraylist possui valor
                throw new SQLException("Esse cliente já possui um carrinho cadastrado.");
            
            int affectedRows=pst.executeUpdate();
            if(affectedRows==0){
                
                throw new SQLException("O carrinho não foi gerado.");
            }
            
            ResultSet rs=pst.getGeneratedKeys();
            if(!rs.next())
                throw new SQLException("Não foi possível pegar o ID gerado no carrinho.");
                
            int generatedID=rs.getInt(1);
            
            return generatedID;
                
        } catch(SQLException e){
        
            System.err.println("Erro ao executar o metodo de insert no carrinho. \n"+e);
            return 0;
        }
    }
    
    protected static int cartItemInsert(int IDCliente, int IDProduto, int quantidade){
    
        try{

            int IDCarrinho;
            
            String command="insert into item_carrinho (produtos_id_produtos,carrinho_id_carrinho,quantidade) values (?,?,?);";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            if(pst==null)
                throw new SQLException();
            
            //Método que retorna os registros de um produto no carrinho pelo ID.
            ArrayList<Object[]> registerProductItemCart= productQueryCartItem(IDProduto);
            
            //Verifica se o produto ja existe no carrinho.
            if(!registerProductItemCart.isEmpty())
                throw new SQLException("O produto já existe no carrinho.");
            
            ArrayList<Object[]> registerUserCart= userQueryCart(IDCliente);
            
            if(registerUserCart.isEmpty())
                IDCarrinho= CartInsert(IDCliente);
            else
                IDCarrinho=(int) registerUserCart.get(0)[0];
            
            //Executando o insert do item
            pst.setInt(1,IDProduto);
            pst.setInt(2,IDCarrinho);
            pst.setInt(3,quantidade);
            
            int affectedRowsItemInsert=pst.executeUpdate();
            if(affectedRowsItemInsert==0)
                throw new SQLException("Erro ao tentar inserir um novo item no carrinho");
                    
            return affectedRowsItemInsert;
        
        } catch(SQLException e){

            System.err.println("Erro ao executar o metodo cartItemInsert. \n"+e);
            return 0;
        }
    }
    
    protected static ResultSet UserItemsCartQuery(int IDCliente){
    
        try{
        
            String command= "select id_item_carrinho, item_carrinho.quantidade,\n" +
                        "produtos.id_produtos,produtos.nome,produtos.preco,produtos.cores_id_cor,cores.nome,produtos.estoque,\n" +
                        "carrinho.clientes_id_clientes, carrinho.id_carrinho \n" +
                
                        "from item_carrinho \n" +
                        "inner join produtos on produtos_id_produtos=id_produtos\n" +
                        "left join cores on produtos.cores_id_cor=cores.id_cor\n" +
                        "inner join carrinho on carrinho_id_carrinho=id_carrinho\n" +
                        "WHERE carrinho.clientes_id_clientes=?;";
            
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            
            if(pst==null){
                System.err.println("Erro ao gerar conexão com banco de dados");
                throw new Error();
            }
            
            pst.setInt(1,IDCliente);
            
            ResultSet results=pst.executeQuery();
            
            return results;
        
        } catch(SQLException e){
         
            return null;
        } 
    }
    
    protected static int deleteItemCart(int IDItemCart){
    
         try{
         
            String command="delete from item_carrinho where id_item_carrinho=?;";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            if(pst==null)
                throw new SQLException("A conexão não foi estabelecida.");
            pst.setInt(1,IDItemCart);
            
            int affectedRows=pst.executeUpdate();
            
            return affectedRows;
             
        } catch(SQLException e){
         
            System.err.println("Erro ao executar o metodo deleteItemCart. \n"+e);
            return 0;
        }
    }
    
    protected static int alterItemCart(int IDItemCart,int IDProduto,int IDCarrinho,int quantidade){
    
        try{
        
            String command= "update item_carrinho \n" +
                                "set produtos_id_produtos=?, carrinho_id_carrinho=?, quantidade=?\n" +
                                "where id_item_carrinho=?;";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            if(pst==null)
                throw new SQLException("A conexão não foi estabelecida.");
            
            pst.setInt(1,IDProduto);
            pst.setInt(2,IDCarrinho);
            pst.setInt(3,quantidade);
            pst.setInt(4,IDItemCart);
            
            int affectedRows=pst.executeUpdate();
            if(affectedRows==0)
                throw new Exception("Nenhuma linha foi alterada, verifique se as informações estão corretas.");
            
            return affectedRows;
        
        } catch(Exception e){
        
            System.err.println("Erro ao executar o metodo alterItemCart: \n"+e);
            return 0;
        }
    }

    protected static int insertPedido(String cep,int IDCliente,float total,String dataEntrega,boolean situacao,String dataEmissao,String pagamento){
    
        try{
        
            String command="insert into pedidos (cep,clientes_id_clientes,total,entrega,situacao,data_emissao,forma_pagamento) values(?,?,?,?,?,?,?);";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command,Statement.RETURN_GENERATED_KEYS);
            
            if(pst==null)
                throw new SQLException("A conexao com o banco nao foi estabelecida.");
            
            pst.setString(1, cep);
            pst.setInt(2, IDCliente);
            pst.setFloat(3, total);
            pst.setString(4, dataEntrega);
            pst.setBoolean(5,situacao);
            pst.setString(6, dataEmissao);
            pst.setString(7,pagamento);
            
            int affectedRows=pst.executeUpdate();
            if(affectedRows==0)
                throw new SQLException("Nenhum registro foi inserido.");
            
            ResultSet rs=pst.getGeneratedKeys();
            if(!rs.next())
                throw new SQLException("Não foi possivel capturar o ID gerado na inserção.");
                
            return rs.getInt(1);
        
        } catch(SQLException e){
        
            System.err.println("Erro ao chamar o metodo insertPedido: \n"+e);
            return 0;
        }
    }
    
    protected static int insertItemPedido(
    //informacoes do pedido        
    String cep,
    int IDCliente,
    float total,
    String dataEntrega,
    boolean situacao,
    String dataEmissao,
    String pagamento,
    
    //informações do item pedido
    ArrayList<ItemPedido> itemsPedido){
        
        Connection con=null;
        int affectedRows=0;
        try {

            con=Conexao.getConnection();
            if(con==null)
                throw new SQLException("A conexao com o banco nao foi estabelecida.");
            con.setAutoCommit(false);
            
            int IDPedido=insertPedido(cep,IDCliente,total,dataEntrega,situacao,dataEmissao,pagamento);
            if(IDPedido==0){
            
                con.rollback();
                throw new SQLException("O ID do pedido não foi encontrado.");
            }
            
            if(itemsPedido.isEmpty())
                throw new SQLException("Nenhum item foi encontrado para ser adicionado ao pedido.");
                
            for(ItemPedido item:itemsPedido){
                String comando = "INSERT INTO item_pedido (produtos_id_produtos, pedidos_id_pedido, quantidade, total_item) " +
                                 "VALUES (?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(comando);

                pst.setInt(1, item.getIdProduto());
                pst.setInt(2, IDPedido);
                pst.setInt(3, item.getQuantidade());
                pst.setFloat(4, item.getTotalItem());

                affectedRows = pst.executeUpdate();
                if (affectedRows == 0) {
                    con.rollback();
                    throw new SQLException("Falha ao inserir item do pedido.");
                }
                
                ArrayList<Object[]> product=productsIDQuery(item.getIdProduto());
                if(product.isEmpty())
                    throw new SQLException("Erro ao buscar as informações do produto.");
     
                int novoEstoque=(int)product.get(0)[5];
                novoEstoque=novoEstoque-item.getQuantidade();
                int iProduct=alterProducts(product.get(0)[1].toString(),(float)product.get(0)[2],(int)product.get(0)[3],novoEstoque,(int)product.get(0)[0]);
                if(iProduct==0)
                    throw new SQLException("Falha ao alterar o estoque do produto após o item ser adicionado ao pedido.");
                
                int iCart = deleteItemCart(item.getIdItemCarrinho());
                if(iCart==0)
                    throw new SQLException("Falha ao excluir o item deste pedido do carrinho.");
            }
            
            con.commit();
            return affectedRows;

        } catch (SQLException e) {
            
            if(con!=null){
                
                try{
                    con.rollback();
                } catch(SQLException ee){
                    
                    System.err.println("Erro ao realizar o rollback: \n"+ee);
                }
            }
            System.err.println("Erro em insertItemPedido: \n" + e);
            return 0;
        }
    }
    
    protected static ResultSet pedidosQuery(int IDCliente){
    
        try{
        
            String command="select * from pedidos where clientes_id_clientes=?;";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            pst.setInt(1,IDCliente);
            
            ResultSet rs=pst.executeQuery();
            
            return rs;
            
        } catch(SQLException e){
        
            System.err.println("Erro ao executar o metodo pedidosQuery: \n"+e);
            return null;
        }
    }
    
    protected static ResultSet itemPedidoQuery(int IDPedido){
    
        try{
        
            String command="select id_item_pedido,pedidos_id_pedido,quantidade,total_item,id_produtos,produtos.nome,preco,estoque,id_cor,cores.nome "
                    + "from item_pedido inner join produtos on produtos_id_produtos=id_produtos right join cores on cores_id_cor=id_cor "
                    + "where pedidos_id_pedido=?;";
            PreparedStatement pst=Conexao.getConnection().prepareStatement(command);
            pst.setInt(1,IDPedido);
            
            ResultSet rs=pst.executeQuery();
            
            return rs;
            
        } catch(SQLException e){
        
            System.err.println("Erro ao executar o metodo itemPedidoQuery: \n"+e);
            
            return null;
        }
    }
    
    protected static ResultSet cardTypeQuery(){
    
        try{
        
            String command="select * from tipo_cartao";
            Statement st=Conexao.getConnection().createStatement();
            
            ResultSet rs=st.executeQuery(command);
            
            return rs;
            
        } catch(SQLException e){
        
            System.err.println("Erro ao executar o metodo cardTypeQuery: \n"+e);
            return null;
        }
    }
}
