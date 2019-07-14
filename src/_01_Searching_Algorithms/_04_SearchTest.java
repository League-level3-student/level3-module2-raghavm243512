package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	int[] a = {1,2,3,4,7,8,9,10,11};
	String[] words = {"f", "d", "s", "a"};
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(3, _00_LinearSearch.linearSearch(words, "a"));
		assertEquals(1, _00_LinearSearch.linearSearch(words, "d"));
		assertEquals(2, _00_LinearSearch.linearSearch(words, "s"));

	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(4, _01_BinarySearch.binarySearch(a, 0, a.length, 7));
		assertEquals(0, _01_BinarySearch.binarySearch(a, 0, a.length, 1));
		assertEquals(6, _01_BinarySearch.binarySearch(a, 0, a.length, 9));
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(a, 7));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(a, 1));
		assertEquals(8, _02_InterpolationSearch.interpolationSearch(a, 11));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(a, 7));
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(a, 1));
		assertEquals(8, _03_ExponentialSearch.exponentialSearch(a, 11));
	}
}
