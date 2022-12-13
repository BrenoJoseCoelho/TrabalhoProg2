/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClienteDAO;
import DAO.EstoqueDAO;
import DAO.FuncionarioDAO;
import DAO.VendaDAO;
import Repositorio.ClienteRepositorio;
import Repositorio.EstoqueRepositorio;
import Repositorio.FuncionarioRepositorio;
import Repositorio.VendaRepositorio;
import View.JFGeralVendas;
import View.JFVenda;
import java.util.List;
import models.Cliente;
import models.Funcionario;
import models.LivroNovo;
import models.LivroUsado;
import models.Venda;

/**
 *
 * @author breno
 */
public class VendaController {

    private Venda venda;
    private JFVenda fvenda;

    public VendaController(JFVenda fvenda, Venda venda) {
        this.venda = venda;
        this.fvenda = fvenda;

        startButton();
        popularFuncionario();
        popularCliente();
        popularLivroNovo();
        popularLivroUsado();
    }

    public void startButton() {

        fvenda.adicionarAcaoBotaoVender(e
                -> {
            salvarVenda();
        });

    }

    public void salvarVenda() {

        //obter o data
        String data = fvenda.getData();
        //obter o cliente
        Cliente cliente = fvenda.getCliente();
        //obter o funcionario
        Funcionario funcionario = fvenda.getFuncionario();
        //obter o livros
        LivroUsado livroUsado = fvenda.getLivroUsado();

        LivroNovo livroNovo = fvenda.getLivroNovo();

        String observacao = fvenda.getObservacao();

        EstoqueRepositorio estoquerepositorio = new EstoqueDAO();
        estoquerepositorio.removeLivroUsado(livroUsado);
        estoquerepositorio.removeLivroNovo(livroNovo);
        //salvar no BD
        VendaRepositorio vendaRepositorio = new VendaDAO();
        vendaRepositorio.novaVenda(new Venda(data, observacao, cliente, funcionario, livroUsado, livroNovo));
        //Mostrar mensagem de sucesso
        fvenda.apresentarMensagem("Venda realizada com sucesso!");
        
        fvenda.fecharTela();
    }

    public void exibirTela() {
        fvenda.exbirTela();
    }

    public void popularFuncionario() {
        FuncionarioRepositorio funcionariorepositorio = new FuncionarioDAO();
        List<Funcionario> funcionarios = funcionariorepositorio.getTodosFuncionarios();

        fvenda.popularFuncionario(funcionarios);
    }

    public void popularCliente() {
        ClienteRepositorio clienterepositorio = new ClienteDAO();
        List<Cliente> clientes = clienterepositorio.buscarTodosClientes();

        fvenda.popularCliente(clientes);
    }

    public void popularLivroNovo() {
        EstoqueRepositorio estoquerepositorio = new EstoqueDAO();
        List<LivroNovo> estoquen = estoquerepositorio.getTodosLivrosNovo();

        fvenda.popularLivroNovo(estoquen);
    }

    public void popularLivroUsado() {
       EstoqueRepositorio estoquerepositorio = new EstoqueDAO();
        List<LivroUsado> estoqueu = estoquerepositorio.getTodosLivrosUsado();

        fvenda.popularLivroUsado(estoqueu);
    }

    public void limparTela() {
        fvenda.limparTela();
    }
}
