package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author Erica
 */
public class Dados {

    private int maxUsu = 50;
    private int maxPro = 100;
    private int maxCli = 100;
    private Usuario msUsuarios[] = new Usuario[maxUsu];
    private Produto msProdutos[] = new Produto[maxPro];
    private Cliente msClientes[] = new Cliente[maxCli];
    private int conUsu = 0;
    private int conPro = 0;
    private int conCli = 0;
    private int numFatura = 0;

    public Dados() {
        preencherUsuarios();
        preencherClientes();
        preencherProdutos();
        preencherConfiguracao();
    }
    
    public int getNumeroFatura() {
        return numFatura;
    }
    public void setNumeroFatura(int numFatura){
        this.numFatura = numFatura;
    }

    public int numeroUsuario() {
        return conUsu;
    }

    public int numeroProduto() {
        return conPro;
    }

    public int numeroCliente() {
        return conCli;
    }

    public Usuario[] getUsuarios() {
        return msUsuarios;
    }

    public Produto[] getProdutos() {
        return msProdutos;
    }

    public Cliente[] getClientes() {
        return msClientes;
    }

    public boolean validarUsuario(String usuario, String senha) {
        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario) && msUsuarios[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public int getPerfil(String usuario) {
        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)) {
                return msUsuarios[i].getPerfil();
            }
        }
        return -1;
    }

    public void trocarSenha(String usuario, String senha) {
        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)) {
                msUsuarios[i].setSenha(senha);
                return;
            }
        }
    }

    public int posicaoUsuario(String usuario) {
        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)) {
                return i;
            }
        }
        return -1;
    }

    public int posicaoProduto(String produto) {
        for (int i = 0; i < conPro; i++) {
            if (msProdutos[i].getIdProduto().equals(produto)) {
                return i;
            }
        }
        return -1;
    }

    public int posicaoCliente(String cliente) {
        for (int i = 0; i < conCli; i++) {
            if (msClientes[i].getIdCliente().equals(cliente)) {
                return i;
            }
        }
        return -1;
    }

    public String adicionarUsuario(Usuario mUsuario) {
        if (conUsu == maxUsu) {
            return "Não é possível cadastrar mais usuários (valor máximo atingido).";
        }
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        return "Usuário cadastrado com sucesso!";
    }

    public String adicionarProduto(Produto mpProduto) {
        if (conPro == maxPro) {
            return "Não é possível cadastrar mais produtos (valor máximo atingido).";
        }
        msProdutos[conPro] = mpProduto;
        conPro++;
        return "Produto cadastrado com sucesso!";
    }

    public String adicionarCliente(Cliente mpCliente) {
        if (conCli == maxCli) {
            return "Não é possível cadastrar mais Clientes (valor máximo atingido).";
        }
        msClientes[conCli] = mpCliente;
        conCli++;
        return "Cliente cadastrado com sucesso!";
    }

    public String editarUsuario(Usuario mUsuario, int pos) {
        msUsuarios[pos].setNome(mUsuario.getNome());
        msUsuarios[pos].setSnome(mUsuario.getSnome());
        msUsuarios[pos].setSenha(mUsuario.getSenha());
        msUsuarios[pos].setPerfil(mUsuario.getPerfil());
        return "Usuário editado com sucesso!";
    }

    public String editarProduto(Produto mPoduto, int pos) {
        msProdutos[pos].setDescricao(mPoduto.getDescricao());
        msProdutos[pos].setImposto(mPoduto.getImposto());
        msProdutos[pos].setPreco(mPoduto.getPreco());
        msProdutos[pos].setAnotacao(mPoduto.getAnotacao());
        return "Produto editado com sucesso!";
    }

    public String editarCliente(Cliente mCliente, int pos) {
        msClientes[pos].setNome(mCliente.getNome());
        msClientes[pos].setSnome(mCliente.getSnome());
        msClientes[pos].setEndereco(mCliente.getEndereco());
        msClientes[pos].setTelefone(mCliente.getTelefone());
        msClientes[pos].setIdCidade(mCliente.getIdCidade());
        msClientes[pos].setIdTipo(mCliente.getIdTipo());
        msClientes[pos].setNascimento(mCliente.getNascimento());
        msClientes[pos].setData(mCliente.getData());
        return "Cliente editado com sucesso!";
    }

    public String deletarUsuario(int pos) {
        for (int i = pos; i < conUsu - 1; i++) {
            msUsuarios[i] = msUsuarios[i + 1];
        }
        conUsu--;
        return "Usuário deletado com sucesso!";
    }

    public String deletarProduto(int pos) {
        for (int i = pos; i < conPro - 1; i++) {
            msProdutos[i] = msProdutos[i + 1];
        }
        conPro--;
        return "Produto deletado com sucesso!";
    }

    public String deletarCliente(int pos) {
        for (int i = pos; i < conCli - 1; i++) {
            msClientes[i] = msClientes[i + 1];
        }
        conCli--;
        return "Cliente deletado com sucesso!";
    }

    public void salvarTodo() {
        salvarUsuarios();
        salvarClientes();
        salvarProdutos();
        salvarConfiguracao();
    }

    private void salvarUsuarios() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/usuarios.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < conUsu; i++) {
                pw.println(msUsuarios[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void salvarClientes() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/clientes.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < conCli; i++) {
                pw.println(msClientes[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void salvarProdutos() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/produtos.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < conPro; i++) {
                pw.println(msProdutos[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void salvarConfiguracao() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/configuracao.ini");
            pw = new PrintWriter(fw);

            pw.println("[Geral]");
            pw.println("FaturaAtual="+numFatura);      

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void preencherUsuarios() {
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            arquivo = new File("Data/usuarios.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            int pos, perfil;
            String aux, linha, idUsuario, nome, snome, senha;

            while ((linha = br.readLine()) != null) {
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idUsuario = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                nome = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                snome = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                senha = aux;
                linha = linha.substring(pos + 1);

                perfil = Integer.parseInt(linha);

                Usuario mUsuario = new Usuario(idUsuario, nome, snome, senha, perfil);
                msUsuarios[conUsu] = mUsuario;
                conUsu++;
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void preencherProdutos() {
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            arquivo = new File("Data/produtos.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            int pos, preco, imposto;
            String linha, aux, idProduto, descricao, anotacao;

            while ((linha = br.readLine()) != null) {
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idProduto = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                descricao = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                preco = Integer.parseInt(aux);
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                imposto = Integer.parseInt(aux);
                linha = linha.substring(pos + 1);

                anotacao = linha;

                Produto mProduto = new Produto(idProduto, descricao, preco, imposto, anotacao);
                msProdutos[conPro] = mProduto;
                conPro++;
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void preencherClientes() {
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            arquivo = new File("Data/clientes.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            int pos, idTipo, idCidade;
            String aux, linha, idCliente, nome, snome, endereco, telefone;
            Date nascimento, data;

            while ((linha = br.readLine()) != null) {
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idCliente = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idTipo = Integer.parseInt(aux);
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                nome = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                snome = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                endereco = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                telefone = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idCidade = Integer.parseInt(aux);
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                nascimento = Utilidades.stringToDate(aux);
                linha = linha.substring(pos + 1);

                data = Utilidades.stringToDate(linha);

                Cliente mCliente = new Cliente(idCliente, idTipo, nome, snome, endereco, telefone, idCidade, nascimento, data);
                msClientes[conCli] = mCliente;
                conCli++;
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void preencherConfiguracao() {
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            arquivo = new File("Data/Configuracao.ini");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            String linha;

            while ((linha = br.readLine()) != null) {
                if (linha.startsWith("FaturaAtual=")) {
                    numFatura = new Integer(linha.substring(14));//VERIFICAR 14
                }
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
