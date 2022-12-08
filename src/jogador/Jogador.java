package jogador;

import java.util.Random;


import adapter.ArenaTerra;
import adapter.Arenafogo;
import adapter.RunaFogo;
import adapter.RunaTerra;
import decorator.ArmaduraBronze;
import decorator.ArmaduraCouro;
import decorator.ArmaduraOuro;
import decorator.Componentes;
import decorator.CouracaBronze;
import decorator.CouracaCouro;
import decorator.CouracaOuro;
import decorator.ElmoBronze;
import decorator.ElmoCouro;
import decorator.EscudoFerro;
import decorator.EscudoMadeira;
import strategy.AnimaisPre;
import strategy.CabecadaFatal;
import strategy.FuriaFogo;
import strategy.MachimosaurusRex;
import strategy.Megalodon;
import strategy.MordidaFatal;
import strategy.Pterodactilo;
import strategy.Raposa;
import strategy.Titanoboa;
public class Jogador{
    private String nome;
    private float rupas;
    private int esperiencia;
    private int vez;// 1- eu ataco 2- computador
    private int fase;//fase de luta
    AnimaisPre lut = new Raposa();
    AnimaisPre comp = new Megalodon();
    Arenafogo arena = new Arenafogo();
    //1-megalodon,2-rex,piterodacto,titanoboa,dragaoAncestral

     public Jogador(){
        this.nome="ralf";
        this.rupas=10f;
        this.vez=1;
        this.fase=0;
    }

    static int escolhaAtaque(){
        Random gerador = new Random();
        return gerador.nextInt(2)+1;
    }

    public void selecionarAdversario(){
          if (this.fase == 1){
              comp = new Titanoboa();
              this.equiparArmadura();
            }
            else if(this.fase ==2){
               comp = new MachimosaurusRex();
               this.equiparArmadura();
            }else if(this.fase ==3){
               comp = new Pterodactilo();
               this.equiparArmadura();
            }
    }     


    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getRupas() {
		return rupas;
	}
	public void setRupas(float rupas) {
		this.rupas = rupas;
	}
	public int getEsperiencia() {
		return esperiencia;
	}
	public void setEsperiencia(int esperiencia) {
		this.esperiencia = esperiencia;
	}
	public float getVez() {
		return vez;
	}
	public void setVez(int vez) {
		this.vez = vez;
	}
    
    public void equiparArmadura(){
        if(this.getRupas()>=60){
            ArmaduraCouro couro =new ArmaduraCouro();
            Componentes c=new CouracaCouro(couro);
            c= new ElmoCouro(c);
            c = new EscudoMadeira(c);
        
            lut.setLife(lut.getLife()+c.getLife());
            lut.setForca(lut.getForca()+c.getForca());
            lut.setDefesa(lut.getDefesa()+c.getDefesa());
            System.out.println("Armadura equpada:"+"  "+ c.getNome());
            this.rupas-=10f;

        }else if(this.getRupas()>=70){

            ArmaduraBronze bronze =new ArmaduraBronze();
            Componentes cb=new CouracaBronze(bronze);
            cb = new ElmoBronze(cb);
            cb = new EscudoFerro(cb);

            lut.setLife(lut.getLife()+cb.getLife());
            lut.setForca(lut.getForca()+cb.getForca());
            lut.setDefesa(lut.getDefesa()+cb.getDefesa());
            System.out.println("Armadura equpada:"+"  "+ cb.getNome());
            

           
        }else if(this.getRupas()>=100){
            ArmaduraOuro ouro = new ArmaduraOuro();
            Componentes co=new CouracaOuro(ouro);
            co = new ElmoBronze(co);
            co = new EscudoFerro(co);

            lut.setLife(lut.getLife()+co.getLife());
            lut.setForca(lut.getForca()+co.getForca());
            lut.setDefesa(lut.getDefesa()+co.getDefesa());
            System.out.println("Armadura equpada:"+"  "+ co.getNome());
            
        }else{
            System.out.println("Você não tem dinheiro para isso");
        }
    }
    
     public void informacaoPensonagem(){
        System.out.println("--------------------------");
        System.out.println("Nome "+ lut.getNome());
        System.out.println("força "+ lut.getForca());
        System.out.println("defesa" + lut.getDefesa());
        System.out.println("velocidade " + lut.getVelocidade());
        System.out.println("vida " + lut.getLife());
        System.out.println("Rupas" + this.getRupas());
    }

    public void informacaoLutar(){
        System.out.println("--------------------------");
        System.out.println("          Você ");
        System.out.println("Nome "+ lut.getNome());
        System.out.println("vida " + lut.getLife());
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("          Adversario ");
        System.out.println("Nome "+ comp.getNome());
        System.out.println("vida " + comp.getLife());
        
    }
    public void escoleherArena(){

        if (this.fase==0){
            arena.setAnimal(lut);
            arena.inciarLuta(lut);
            arena.inciarLuta(new RunaFogo(comp));
        }else if(this.fase==1) {
            ArenaTerra arena = new ArenaTerra();
            arena.setAnimal(comp);
            arena.inciarLuta(comp);
            arena.inciarLuta(new RunaTerra(lut));
        }else if(this.fase==3) {
            Arenafogo arena = new Arenafogo();
            arena.setAnimal(lut);
            arena.inciarLuta(lut);
            arena.inciarLuta(new RunaFogo(comp));
        }
    }
    
    public void iniciarLutar(){
        escoleherArena();
        int ataque;
        while(lut.getLife()>0 && comp.getLife()>0){
            informacaoLutar();
            if (this.getVez() == 1){
                if(lut.getLife()>0){
                    ataque = escolhaAtaque();
                    switch(ataque){
                        case 1:
                            System.out.println("----------------------------");
                            System.out.println(" Você atacou com um ataque Basico");
                            System.out.println("----------------------------");
                            lut.setAtaqueBasico(new MordidaFatal());
                            comp.setLife(comp.getLife()- lut.ataqueBasico(lut.getForca()));
                            this.setVez(2);
                            break;
                        case 2:
                            System.out.println("----------------------------");
                            System.out.println(" Você atacou com um ataque Elementar");
                            System.out.println("----------------------------");
                            lut.setAtaqueElemento(new FuriaFogo());
                            comp.setLife(comp.getLife()- lut.ataqueElementar(lut.getForca()));
                            this.setVez(2);
                            
                            if(lut.getXp()==5){
                                System.out.println("----------------------------");
                                System.out.println(" Você atacou com um ataque Especial");
                                System.out.println("----------------------------");
                                comp.setLife(comp.getLife()- lut.especial(lut.getForca()));
                                this.setVez(2);
                            }
                            break;
                        case 3:
                            System.out.println("----------------------------");
                            System.out.println(" Você atacou com um ataque Elementar 2");
                            System.out.println("----------------------------");
                            lut.chamasdoexilio(lut.getForca());
                            this.setVez(2);
                            break;
                    }
                }else if(lut.getLife()<0){
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("Você perdeu ");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("Inicie novamente ");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    informacaoLutar();
                    
                    break;
                }
                
            }if (this.getVez() == 2){
                if( comp.getLife()>0){
                    ataque = escolhaAtaque();
                    switch(ataque){
                        case 1:
                                System.out.println("----------------------------");
                                System.out.println(" O Adversario atacou com um ataque Basico");
                                System.out.println("----------------------------");
                                comp.setAtaqueBasico(new MordidaFatal());
                                lut.setLife(lut.getLife()- comp.ataqueBasico(comp.getForca()));
                                this.setVez(1);
                            break;
                        case 2:
                            System.out.println("----------------------------");
                            System.out.println(" O Adversario atacou com um ataque Basico");
                            System.out.println("----------------------------");
                            comp.setAtaqueBasico(new CabecadaFatal());
                            lut.setLife(lut.getLife()- comp.especial(comp.getForca()));
                            this.setVez(1);
                            if(comp.getXp()==5){
                                System.out.println("----------------------------");
                                System.out.println(" Você atacou com um ataque Especial");
                                System.out.println("----------------------------");
                                comp.setAtaqueBasico(new MordidaFatal());
                                lut.setLife(lut.getLife()- comp.ataqueBasico(comp.getForca()));
                                this.setVez(1);
                            }
                            break;
                        case 3:
                            System.out.println("----------------------------");
                            System.out.println(" Você atacou com um ataque Especial");
                            System.out.println("----------------------------");
                            comp.setAtaqueBasico(new MordidaFatal());
                            lut.setLife(lut.getLife()- comp.ataqueBasico(comp.getForca()));
                            this.setVez(1);
                            break;
                    }
                }else{
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("computador perdeu perdeu");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    informacaoLutar();
                    lut.setLife(1000f);
                    System.out.println("A lutade numero "+ this.fase);
                    this.setRupas(this.getRupas()+20);
                    this.fase+=1;
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("parabens você pode equipar uma nova armadura");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("Você esta na proxima fase"+ this.fase);
                    selecionarAdversario();
                    break;
                }
            }   
        }
    }
}