
public class DepartmentMain {

	public static void main(String[] args)
	{
		AdminDepartment admindept=new AdminDepartment();
		System.out.println("Welcome to "+admindept.departmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayHoliday());
		System.out.println();
		HrDepartment hrdept=new HrDepartment();
		System.out.println("Welcome to "+hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayHoliday());
		System.out.println();
		TechDepartment techdept=new TechDepartment();
		System.out.println("Welcome to "+techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayHoliday());

	}

}
