package me.coley.recaf.ui.pane.pe;

public class TableDword extends TableGeneric {

	public TableDword(String member, String value, String meaning) {
		super(member, value, meaning);
	}

	public TableDword(String member, String value) {
		super(member, value, "");
	}

	public TableDword(String member, int value) {
		this(member, (short) value, "");
	}

	public TableDword(String member, int value, String meaning) {
		this(member, String.format("%04X", value), meaning);
	}
}
