package ej.kits;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.blocs.IBloc;
import ej.exceptions.IllegalBlocException;

public class KitDemarrage {

	private static Logger logger = LogManager.getLogger(KitDemarrage.class);

	private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
	private Set<String> motsCles = new LinkedHashSet<String>();

	public Set<IBloc> getBlocs() {
		return blocs;
	}

	public Set<String> getMotsCles() {
		return motsCles;
	}

	public KitDemarrage(final Set<IBloc> blocs) throws IllegalBlocException {
		this.blocs.addAll(blocs);

		motsCles.add("Cabane");
		motsCles.add("Muraille");
		motsCles.add("Maison");
	}

	public void afficherKit() {
		System.out.println("Nombre de bloc dans le kit : " + this.blocs.size());
		System.out.print("Liste des mots clés du kit :");
		this.motsCles.forEach(System.out::print);
	}

	public void sauvegarder() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kit de démarrage\n");
		motsCles.forEach((motCle) -> builder.append(motCle + " "));
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("kit.txt"));
			writer.write(builder.toString());
			writer.close();
		} catch (IOException e) {
			logger.error("Impossible d'écrire dans le fichier kit.txt");
		}
	}

	public void charger() {
		try (BufferedReader reader = new BufferedReader(new FileReader("kit.txt"))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			logger.error("Le fichier kit.txt n'existe pas.");
		} catch (IOException e) {
			logger.error("Impossible de lire le fichier kit.txt");
		}
	}
}