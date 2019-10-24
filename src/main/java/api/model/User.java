package api.model;

public class User {

	private String id;
	private String phone_number;
	private String phone_type;
	private String cuit;
	private String email;
	private String type;
	private String sideba_id;
	private String image_url;
	private boolean blocked;
	private boolean first_login;
	private String created_at;
	private String others;
	private String fee_type;
	private boolean ab_testing;
	private boolean confirmed;
	private String deleted_at = null;
	private String vat_category;
	private String income_tax_id;
	private String income_tax_category = null;
	private String description_vat = null;
	private String first_name;
	private String last_name;
	private String date_of_birth;
	private boolean pep;

	// Getter Methods

	public String getId() {
		return id;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public String getPhone_type() {
		return phone_type;
	}

	public String getCuit() {
		return cuit;
	}

	public String getEmail() {
		return email;
	}

	public String getType() {
		return type;
	}

	public String getSideba_id() {
		return sideba_id;
	}

	public String getImage_url() {
		return image_url;
	}

	public boolean getBlocked() {
		return blocked;
	}

	public boolean getFirst_login() {
		return first_login;
	}

	public String getCreated_at() {
		return created_at;
	}

	public String getOthers() {
		return others;
	}

	public String getFee_type() {
		return fee_type;
	}

	public boolean getAb_testing() {
		return ab_testing;
	}

	public boolean getConfirmed() {
		return confirmed;
	}

	public String getDeleted_at() {
		return deleted_at;
	}

	public String getVat_category() {
		return vat_category;
	}

	public String getIncome_tax_id() {
		return income_tax_id;
	}

	public String getIncome_tax_category() {
		return income_tax_category;
	}

	public String getDescription_vat() {
		return description_vat;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public boolean getPep() {
		return pep;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSideba_id(String sideba_id) {
		this.sideba_id = sideba_id;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public void setFirst_login(boolean first_login) {
		this.first_login = first_login;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public void setAb_testing(boolean ab_testing) {
		this.ab_testing = ab_testing;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}

	public void setVat_category(String vat_category) {
		this.vat_category = vat_category;
	}

	public void setIncome_tax_id(String income_tax_id) {
		this.income_tax_id = income_tax_id;
	}

	public void setIncome_tax_category(String income_tax_category) {
		this.income_tax_category = income_tax_category;
	}

	public void setDescription_vat(String description_vat) {
		this.description_vat = description_vat;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public void setPep(boolean pep) {
		this.pep = pep;
	}
}