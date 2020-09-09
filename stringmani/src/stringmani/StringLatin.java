package stringmani;

import java.util.*;
import java.lang.*;

public class StringLatin {

	// ---- Your solution goes here ---- //
// rejoin plz
	//
	final String vowels = "aeiou";

	String translate(String phrase) {
		// heello mehak

		String latinString = "";
		String stringWords[] = phrase.split(" ");
		for (int j = 0; j < stringWords.length; j++) {
			String word = stringWords[j];
			// check each word if first letter is caps ? if yes

			// if word end contains special character
			int i = getFirstVowelIndex(word);
			if (Character.isUpperCase(word.charAt(0))) {
				// make modular and get index and then perform action
				String substring1 = word.substring(i);// ->ello
				String substring2 = word.substring(0, i).toLowerCase();
				// substring1.substring(0, 1).toUpperCase() + substring1.substring(1);
				latinString = latinString + substring1.substring(0, 1).toUpperCase() + substring1.substring(1)
						+ substring2 + "ay ";
			} else {
				latinString = latinString + word.substring(i) + word.substring(0, i) + "ay ";
			}
		}
		return latinString.trim();
	}

	public int getFirstVowelIndex(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (vowels.contains(String.valueOf(word.charAt(i)))) {
				return i;
			}
		}
		return -1;
	}

	// ---- Driver (Main) - Entrypoint for tests ---- //

	public static void main(String[] args) {
		StringLatin kata = new StringLatin();

		kata.c0__vowel();

		kata.c1__consonant();

		kata.c2__phrase_constants();
//     kata.c2__phrase_mixed();

		kata.c3__titlecase();
//     kata.c3__titlecase_mixed();

//     kata.c4__punctuations();

//     kata.c5__cluster_vowel();
//     kata.c5__cluster_consonant_simple();
		kata.c5__cluster_consonant();
//     kata.c5__cluster_titlecase();
	}

	// ---- Kata Begins ---- //

	void c0__vowel() {
		assertEquals(testCase(new Object() {
		}), "applesay", translate("apples"));
	}

	void c1__consonant() {
		assertEquals(testCase(new Object() {
		}), "irdbay", translate("bird"));
	}

	void c2__phrase_constants() {
		assertEquals(testCase(new Object() {
		}), "ellowyay irdbay", translate("yellow bird"));
	}

	void c2__phrase_mixed() {
		assertEquals(testCase(new Object() {
		}), "eliciousday applesay", translate("delicious apples"));
	}

	void c3__titlecase() {
		assertEquals(testCase(new Object() {
		}), "Ellohay Orldway", translate("Hello World"));
	}

	void c3__titlecase_mixed() {
		assertEquals(testCase(new Object() {
		}), "Ironay Anmay", translate("Iron Man"));
	}

	void c4__punctuations() {
		assertEquals(testCase(new Object() {
		}), "Ellohay, Orldway!", translate("Hello, World!"));
	}

	void c5__cluster_vowel() {
		assertEquals(testCase(new Object() {
		}), "yttriumay", translate("yttrium"));
	}

	void c5__cluster_consonant_simple() {
		assertEquals(testCase(new Object() {
		}), "ethay eetstray", translate("the street"));
	}

	void c5__cluster_consonant() {
		assertEquals(testCase(new Object() {
		}), "ightsknay ikestray icklyquay", translate("knights strike quickly"));
	}

	void c5__cluster_titlecase() {
		assertEquals(testCase(new Object() {
		}), "Ightsknay ikestray icklyquay", translate("Knights strike quickly"));
	}

	// ---- End of Kata ---- //

	private void assertEquals(String testCase, String expected, String actual) {
		if (!Objects.equals(expected, actual)) {
			System.err.println("FAILED Test ".concat(testCase).concat(" => [ Expected = \"").concat(expected)
					.concat("\", Actual = \"").concat(actual).concat("\" ]"));
		} else {
			System.out.println("PASSED Test ".concat(testCase));
		}
	}

	private String testCase(Object o) {
		return o.getClass().getEnclosingMethod().getName();
	}
}
