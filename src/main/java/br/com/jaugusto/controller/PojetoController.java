package br.com.jaugusto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jaugusto.model.Projeto;
import br.com.jaugusto.service.PessoaService;
import br.com.jaugusto.service.ProjetoService;

@Controller
public class PojetoController {
	
	@Autowired
	ProjetoService projetoService;  
	
	@Autowired
	PessoaService pessoaService;
			
    private static final  String STATUS_PROJETO_INICIADO = "Iniciado";
	
	private static final  String STATUS_PROJETO_ANDAMENTO = "Em andamento";
	
	private static final  String STATUS_PROJETO_ENCERRADO = "Encerrado";
	
	private static final  String redirect_listagem = "redirect:/projetos";
	
		
	@GetMapping("/projetos")
	public ModelAndView listar() {
	  ModelAndView modelAndView = new ModelAndView("ListaProjetos");
	  modelAndView.addObject("projetos", projetoService.getAllProjetos());
	  return modelAndView;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView getCadastro() {
		ModelAndView modelAndView = new ModelAndView("cadastroProjeto");
		modelAndView.addObject(new Projeto());
		modelAndView.addObject("pessoas", pessoaService.getAllPessoas());
		return modelAndView;
		
	}
	
	@PostMapping("/cadastroProjeto")
	public String salvar(Projeto projeto) {
		projetoService.save(projeto);
		return redirect_listagem;
	}
	
	@GetMapping("/editar/{id}")
	public String visualizarProjeto(@PathVariable("id") long id, Model model) {
	    Projeto projeto = projetoService.getProjetoById(id);
	    model.addAttribute("projeto", projeto);
	    model.addAttribute("pessoas", pessoaService.getAllPessoas());
	    return "atualizaProjeto";
	}
	
	@PostMapping("/atualizar/{id}")
	public String atualizarProjeto(@PathVariable("id") long id , @Validated Projeto projeto) {
	   projetoService.update(projeto);
	   return redirect_listagem;
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
	  Projeto projeto = projetoService.getProjetoById(id);
	  
	  if(projeto.getDsStatus().equals(STATUS_PROJETO_INICIADO) || projeto.getDsStatus().equals(STATUS_PROJETO_ANDAMENTO) 
        || projeto.getDsStatus().equals(STATUS_PROJETO_ENCERRADO))
		 return "messages";
		
	  projetoService.delete(id);
	  return redirect_listagem;
	}


}
