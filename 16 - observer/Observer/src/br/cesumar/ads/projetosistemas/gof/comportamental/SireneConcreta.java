package br.cesumar.ads.projetosistemas.gof.comportamental;

import java.util.ArrayList;
import java.util.Iterator;

public class SireneConcreta implements Sirene {

	private Boolean alertaSonoro = false;
	private ArrayList observadores = new ArrayList();

	
	public Boolean getAlertaSonoro() {
		return alertaSonoro;
	}
	

	public void alteraAlerta(){
		if (alertaSonoro) {
			alertaSonoro = false;
		} else {
			alertaSonoro = true;
		}
		notificaObservador();
	}
	public void setAlertaSonoro(Boolean alertaSonoro) {
		this.alertaSonoro = alertaSonoro;
	}


	@Override
	public void adicionaObservador(Operario operario) {
		observadores.add(operario);
	}

	@Override
	public void removeObservador(Operario operario) {
		observadores.remove(operario);

	}

	@Override
	public void notificaObservador() {
		Iterator i = observadores.iterator();
		while(i.hasNext()){
			Operario o = (Operario) i.next();
			o.atualizar(this);
		}

	}
	
	

}
