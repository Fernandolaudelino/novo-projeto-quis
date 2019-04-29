package show.pkgdo.milh�o;
import javax.swing.*;     // tem que importa o pacote javax.swing.* para usa o JOptionPane
public class Quiz {
    String nome;
	private int Ponto=0;
	private int fase;
	String res;
	
	private int getPonto() {return this.Ponto;}
	private void setPonto(int p) {this.Ponto=p;setFase();}
	
	private int getFase() {return this.fase;}
	private void setFase() {
		if(Ponto>=0 && Ponto<=10)  //metodo para uma pontua��o automatica
			fase=1;
		else if(Ponto<=20)
			    fase=2;
		else if(Ponto<=30)
			fase=3;
		else if(Ponto<=40)
			fase=4;
		else if(Ponto<=50)
			fase=5;
	}
	public void apresentar() {  //Apresenta��o para salva o nome do jogador e regras do jogo 
		nome = JOptionPane.showInputDialog(" Digite Seu Nome: ");
		if(nome==null)
			System.exit(0);
		else {
		JOptionPane.showMessageDialog( null," Seja bem vindo (a)!"+ nome);
		}
		JOptionPane.showMessageDialog( null,""+ nome+ " Benvindo ao jogo de perguntas e respostas\n"
				+ " Acerte para aumenta os pontos e mudar de fase \n"
				+ " Se erra voc� perde todos os seus Pontos");
	}
	
	public void inicioDoJogo() { // Inicio do jogo usando o JOptionPane mostrando as perguntas e respostas 
		
		String fase1,fase2,fase3,fase4,fase5;
		
		fase1 = JOptionPane.showInputDialog("\n Usuario:"+ nome +" Pontos: "+ this.getPonto()+ " Esta na Fase "+this.getFase()+"\n"
		+ "Oque siguinifica if ?\n "
		+ " A) Ent�o \n"
		+ " B) Talvez \n"
		+ " C) Ok \n"
		+ " D) Se \n");
		if (("D".equals(fase1))){
			JOptionPane.showMessageDialog(null," Resposta Correta!");
			this.setPonto(this.getPonto()+5);
		}
		else {
			JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
			JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto());
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Parabens " + nome+ " Voc� esta com " + this.getPonto() +" Pontos Esta na Fase "+this.getFase()+ "\n"
				
				+ " Oque signific Else? \n"
				+ "A) Se \n"
				+ "B) Se n�o \n"
				+ "C) Ok \n"
				+ "D) Sei l� ");
				if (("B".equals(fase1))){
					JOptionPane.showMessageDialog(null," Resposta Correta!");
					this.setPonto(this.getPonto()+5);
				}
			    else {
					JOptionPane.showMessageDialog(null," Voc� errou "); 
					this.setPonto(this.getPonto()-this.getPonto());
					JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
					System.exit(0);
				}
				fase1 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ " Para que serve Import Java.sql.*; ? \n"
						+ "A) conex�o com o mundo \n"
						+ "B) conex�o com a class \n"
						+ "C) conex�o com o banco de dados \n"
						+ "D) conex�o com o package");
						if (("C".equals(fase1))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Voc� errou"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}
						
						fase2 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ "  Para que serve JOptionPane? \n"
						+ "A) Para cria uma caixa de dialogo \n"
						+ "B) Fazer pesquisa \n"
						+ "C) Mudar letra da fonte \n"
						+ "D) Digita alguma manssagem \n");
						if (("A".equals(fase2))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}
						
						fase2 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ " O que � M�todo main ? \n"
						+ "A) � uma caixa de dialogo \n"
						+ "B) � um metodo para fazer pesquisa \n"
						+ "C) � um metodo que criptografa texto \n"
						+ "D) � um metodo principal \n");
						if (("D".equals(fase2))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}
													
				        fase3 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ " O que � Java ? \n"
						+ "A) � uma caixa de dialogo \n"
						+ "B) � um metodo para fazer pesquisa \n"
						+ "C) � uma linguagem de programa��o orientado a objeto \n"
						+ "D) � um meto para criptografa objeto \n");
						if (("C".equals(fase3))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}
						
						fase3 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ " Quantas pessoas faziam parte do time de constru��o do Java ? \n"
						+ "A) 12 Pessoas \n"
						+ "B) 13 Pessoas \n"
						+ "C) 15 Pessoas \n"
						+ "D) 25 Pessoas \n");
						if (("B".equals(fase3))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}
						
						fase4 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ " Quem foi o lider do projeto Java ? \n"
						+ "A) James Gosling \n"
						+ "B) Albert Einstein \n"
						+ "C) Plat�o \n"
						+ "D) Isaac newton \n");
						if (("A".equals(fase4))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}
						
						fase4 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ " Onde utiliza a linguagem Java ? \n"
						+ "A) Para desenvolvimento de aplica��es desktop \n"
						+ "B) Para fazer pesquisas \n"
						+ "C) para criptografa texto \n"
						+ "D) Para cria tela principal \n");
						if (("A".equals(fase4))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}
						
						fase5 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ " Qual o componete da plataforma Java assegura a independencia das aplica��es entre diferntes plataformas ? \n"
						+ "A) Java Aplication \n"
						+ "B) Java Virtual Machine \n"
						+ "C) Java ER \n"
						+ "D) enterpraise Edition \n");
						if (("B".equals(fase5))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}
												
				        fase5 = JOptionPane.showInputDialog("\n Parabens " +nome+ " Voc� esta com " + this.getPonto() +" Esta na Fase "+this.getFase()+ "\n"
						+ " Quantos catch pode possuir um Try? \n"
						+ "A) Apenas um \n"
						+ "B) cinco apenas \n"
						+ "C) dez apenas \n"
						+ "D) varios catch \n");
						if (("D".equals(fase5))){
							JOptionPane.showMessageDialog(null," Resposta Correta!");
							this.setPonto(this.getPonto()+5);
						}
					    else {
							JOptionPane.showMessageDialog(null," Resposta Incorreta"); 
							this.setPonto(this.getPonto()-this.getPonto());
							JOptionPane.showMessageDialog(null," Sua a Pontua��o foi: "+this.getPonto()+" so chego na Fase"+this.getFase());
							System.exit(0);
						}

	}
	
  
}