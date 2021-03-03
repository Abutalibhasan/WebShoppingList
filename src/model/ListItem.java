package model;
//All these import statements came in by clicking the red X and using Import option from the javax.persistence package
//If you are asked to create a class, interface, constant, etc, you made a spelling or capitalization error!!
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")


/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Feb 8, 2021
 */
public class ListItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	public ListItem(){
		super();
	}
	
	public ListItem(String store, String item){
		super();
		this.store = store;
		this.item = item;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String returnItemDetails( ) {
		return store + ": " + item;
	}

}
