package com.analyser;

import com.opencsv.bean.CsvBindByName;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {
	@CsvBindByName(column = "SrNo", required = true)
    public String srNo;
	
	@CsvBindByName(column = "StateName", required = true)
    public String state;
	
	@CsvBindByName(column = "TIN", required = true)
    public String tin;
    
	@CsvBindByName(column = "StateCode", required = true)
    public String stateCode;
	

	@Override
	public String toString() {
		return "IndiaStateCodeCSV [state=" + state + ", stateCode=" + stateCode + ", srNo=" + srNo + ", tin=" + tin
				+ "]";
	}
}