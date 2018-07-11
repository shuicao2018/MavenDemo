package com.xuchao.bookmanager02.pojo;

public class BookType {

	int id;
	
	String typeName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	} 
	
	@Override
    public String toString() {
        return this.getId()+"\t"+this.getTypeName();
    }
}
