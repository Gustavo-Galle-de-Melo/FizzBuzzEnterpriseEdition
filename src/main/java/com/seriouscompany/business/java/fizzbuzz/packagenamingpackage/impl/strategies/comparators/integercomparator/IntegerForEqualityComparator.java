package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.integercomparator;

import org.springframework.stereotype.Service;

/**
 * Comparator for IntegerForEquality
 */
@Service
public final class IntegerForEqualityComparator {

	private IntegerForEqualityComparator() {}

	/**
	 * @param nFirstInteger int
	 * @param nSecondInteger int
	 * @return boolean
	 */
	public static boolean areTwoIntegersEqual(final int nFirstInteger, final int nSecondInteger) {
		final ThreeWayIntegerComparisonResult comparisonResult =
				ThreeWayIntegerComparator.compare(nFirstInteger, nSecondInteger);
		return ThreeWayIntegerComparisonResult.FIRST_EQUALS_SECOND == comparisonResult; 
	}
}
