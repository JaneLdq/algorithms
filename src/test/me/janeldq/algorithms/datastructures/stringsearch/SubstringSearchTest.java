package me.janeldq.algorithms.datastructures.stringsearch;

import org.junit.Assert;
import org.junit.Test;

public class SubstringSearchTest {

    @Test
    public void testBruteForce() {
        String pat = "was";
        String txt = "Alice was beginning to get very tired of sitting by her sister";
        int index = BruteForceSubstringSearch.search(pat, txt);
        Assert.assertEquals(6, index);
        pat = "bro";
        index = BruteForceSubstringSearch.search(pat, txt);
        Assert.assertEquals(62, index);
    }

    @Test
    public void testKMP() {
        String pattern = "AACADA";
        String txt = "AABRAACADABRAACAADABRA";
        KMP kmp = new KMP(pattern);
        int index = kmp.search(txt);
        Assert.assertEquals(4, index);
    }
}