package midtermq3;

public class q3 {
	public static void main(String[] args) {

		Employee[] e = new Employee[4];
		e[0] = new Employee("name1", 1, "dept1", 5.0, 25);

		e[1] = new Employee("name2", 2, "dept2", 3.0, 2);
		e[2] = new Employee("name3", 3, "dept3", 4.0, 5);

		System.out.println(e[0].getWages());

		Employee emp;
		for (int i = 0; i < 3; i++) {// bubble sort
			for (int j = i + 1; j < 3; j++) {
				if (e[i].getWages() > e[j].getWages()) {
					emp = e[i];
					e[i] = e[j];
					e[j] = emp;
				}

			}

		}
		for (int i = 0; i < 3; i++) {
			e[i].print();
		}

	}

}
