package state2;

public class CokeMachine {

	State semLata;
	State semMoeda;
	State comMoeda;
	State entregaLata;
	
	State estado = semLata;
	
	int count = 0;
	
	public CokeMachine(int count){
		this.count = count;
		
		semLata = new SemLataState(this);
		semMoeda = new SemMoedaState(this);
		comMoeda = new ComMoedaState(this);
		entregaLata = new EntregaLataState(this);
		
		if (count > 0){
			estado = semMoeda; 
		}
	}
	
	public void recebeMoeda(){
		estado.recebeMoeda();
	}
	
	public void ejetaMoeda(){
		estado.ejetaMoeda();
	}
	
	public void pressionaBotao(){
		estado.pressionaBotao();
	}
	
	public void entregaLata(){
		estado.entregaLata();
	}
	
	public void setState(State state){
		this.estado = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getSemLata() {
		return semLata;
	}

	public State getSemMoeda() {
		return semMoeda;
	}

	public State getComMoeda() {
		return comMoeda;
	}

	public State getEntregaLata() {
		return entregaLata;
	}

	public State getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "CokeMachine [estado=" + estado + ", count=" + count + "]";
	}
	
	
	
}

