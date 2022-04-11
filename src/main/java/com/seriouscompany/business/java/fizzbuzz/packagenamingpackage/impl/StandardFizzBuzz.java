package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.FizzBuzz;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

/**
 * Standard FizzBuzz
 */
@Service
public class StandardFizzBuzz implements FizzBuzz {

	private final FizzBuzzSolutionStrategyFactory fizzBuzzSolutionStrategyFactory;

	/**
	 * @param _fizzBuzzSolutionStrategyFactory
	 */
	@Autowired
	public StandardFizzBuzz(final FizzBuzzSolutionStrategyFactory fizzBuzzSolutionStrategyFactory) {
		super();
		this._fizzBuzzSolutionStrategyFactory = fizzBuzzSolutionStrategyFactory;
	}

	/**
	 * @param nFizzBuzzUpperLimit
	 */
	public void fizzBuzz(final int nFizzBuzzUpperLimit) {
		final FizzBuzzSolutionStrategy mySolutionStrategy =
				this.fizzBuzzSolutionStrategyFactory.createFizzBuzzSolutionStrategy();
		mySolutionStrategy.runSolution(nFizzBuzzUpperLimit);
	}

}
