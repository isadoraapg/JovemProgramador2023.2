package map_set;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do
		//candidato e a quantidade de votos (formato .csv) que ele obteve em uma urna de votação. Você deve fazer
		//um programa para ler os registros de votação a partir de um arquivo, e daí gerar um relatório consolidado
		//com os totais de cada candidato.
		
		
		
		Map<String, Integer> votos = new TreeMap<>();
		
		String path = "C:\\Users\\isadora.galego\\back end\\eleicao.txt";
		
		try (BufferedReader br= new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				String[] campos = line.split(" , ");
				String nome = campos[0];
				int count = Integer.parseInt(campos[1]);
				
				if(votos.containsKey(nome)) {
					votos.put(nome, count + votos.get(nome));
				}else {
					votos.put(nome, count);
				}
				
				
				line = br.readLine();
				
					
			}
			
			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}
			
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
