public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("Rana");
	p.setAlamat("celeng");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Programer");
	Program pr = new Program();
	pr.setNama("Yoga");
	p.setAlamat("Lohbener");
	p.setGaji(85);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Rani");
	d.setAlamat("Widasari");
	d.setGaji(50);
	}
}