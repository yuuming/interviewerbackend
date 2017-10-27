package ca.ciccc.madp202.InterviewerBackend.models;

import java.util.ArrayList;

public class HistoryResponseModelBE {

	private ArrayList<HistoryEntityBE> historyRecords;

	public HistoryResponseModelBE() {

	}

	public HistoryResponseModelBE(ArrayList<HistoryEntityBE> historyRecords) {

		this.historyRecords = historyRecords;
	}

	public ArrayList<HistoryEntityBE> getHistoryRecords() {
		return historyRecords;
	}

	public void setHistoryRecords(ArrayList<HistoryEntityBE> historyRecords) {
		this.historyRecords = historyRecords;
	}

}
