package br.livro.android.cap11.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Service simples que exibe logs no método onCreate, onDestroy
 * 
 * O onCreate cria uma Thread para demonstrar um processamento em background
 * 
 * Demonstra como criar uma thread mas não se preocupa com o multi-threading, sendo que os atributos são compartilhados pelas threads
 * 
 * @author ricardo
 *
 */
public class ExemploServico extends Service implements Runnable {
	private static final int MAX = 50;
	private static final String CATEGORIA = "livro";
	protected int count;
	private boolean ativo;
	@Override
	public IBinder onBind(Intent i) {
		Log.i(CATEGORIA, "ExemploServico.onBind()");
		// Retorna null aqui porque não queremos interagir com o service
		return null;
	}
	@Override
	public void onCreate() {
		Log.i(CATEGORIA, "ExemploServico.onCreate()");
	}
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.i(CATEGORIA, "ExemploServico.onStartCommand(): " + startId);
		count = 0;
		// Método chamado depois do onCreate(), logo depois que o serviço é iniciado
		// O parâmetro 'startId' representa o identificador deste serviço
		ativo = true;
		// Delega para uma thread (passamos o nome no construtor para visualizar no debug do eclipse se necessário)
		new Thread(this,"ExemploServico-"+startId).start();
		// Chama a implementação da classe mãe
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onDestroy() {
		//Ao encerrar o serviço, altera o flag para a thread parar
		ativo = false;
		Log.i(CATEGORIA, "ExemploServico.onDestroy()");
	}
	/**
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		while (ativo && count < MAX) {
			fazAlgumaCoisa();

			Log.i(CATEGORIA, "ExemploServico executando... " + count);

			count++;
		}

		Log.i(CATEGORIA, "ExemploServico fim.");

		// Auto-Encerra o service quando o processamento terminar
        stopSelf();
	}
	private void fazAlgumaCoisa() {
		try {
			//simula algum processamento
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
