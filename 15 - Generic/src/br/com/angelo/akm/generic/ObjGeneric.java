package br.com.angelo.akm.generic;

public class ObjGeneric<T> {
	private String desc;

	private T objGenerico;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public T getObjGenerico() {
		return objGenerico;
	}

	public void setObjGenerico(T objGenerico) {
		this.objGenerico = objGenerico;
	}

}
