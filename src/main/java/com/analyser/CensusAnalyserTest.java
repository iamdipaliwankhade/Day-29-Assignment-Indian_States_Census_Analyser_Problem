package com.analyser;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyserTest {
    @Test
    public void givenIndianStateCSV_ShouldReturnExactCount() {
        try {
        	 final String INDIAN_STATE_CSV_FILE = "C:\\Users\\Dipal\\eclipse12-workspace\\CensusAnalyser\\src\\main\\java\\IndianState.csv";
   		  CensusAnalyser censusAnalyser = new CensusAnalyser();
             int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIAN_STATE_CSV_FILE);
             Assert.assertEquals(37,numOfRecords);
        } catch (CensusAnalyserException e) { }
    }
}