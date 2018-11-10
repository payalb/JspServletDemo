package usebeanpack;

public class UseBeanDemo {
	String name;
	String company;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "UseBeanDemo [name=" + name + ", company=" + company + "]";
	}

}
