package com.everis.logbackdesafio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Desafío Logback
 * 
 * @author aguerrre
 *
 */
public class App {

	/** LOGGER */

	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.warn("Inicio del método main");
		iterate();
		LOGGER.warn("Fin del método main");
	}

	private static void iterate() {
		LOGGER.info("Inicio del método iterate");
		// Iteraciones hasta n
		for (int i = 0; i <= 5000; i++) {
			LOGGER.debug("Iteración número {}", i);
		}
		LOGGER.info("Fin del método iterate");
	}
}
