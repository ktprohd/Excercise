package Controller;

import Model.*;

import java.util.*;

public class QL {
    Scanner scanner = new Scanner(System.in);
    Employee employee;
   // List<Certificate> certificates = employee.getCertificates();
    public static int count;
    HashSet<Employee> lists;

    public QL() {
        lists = new HashSet<>();
    }

    public void show() {
        lists.forEach(employee -> System.out.println(employee.toString()));
    }

    public void add(Employee employee) {
        lists.add(employee);
        count++;
        System.out.println(count);
    }

    public int getCount() {
        return count;
    }

    public void changePer(String id) {
        Employee employee = this.lists.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
        System.out.println("Change name:");
        String name = scanner.nextLine();
        employee.setFullName(name);
        System.out.println("Change birthday:");
        String day = scanner.nextLine();
        employee.setBirthDay(day);
        System.out.println("Change phone:");
        String phone = scanner.nextLine();
        employee.setPhone(phone);
        System.out.println("Change email:");
        String email = scanner.nextLine();
        employee.setEmail(email);
    }

    public void searchByIntern() {
        this.lists.stream().filter(doc -> doc instanceof Intern).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByExperience() {
        this.lists.stream().filter(doc -> doc instanceof Experience).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByFresher() {
        this.lists.stream().filter(doc -> doc instanceof Fresher).forEach(doc -> System.out.println(doc.toString()));
    }

    public void delete(String id) {
        lists.removeIf(lists -> lists.getId().equals(id));
    }
    /********************************************************************************/
    /********************************************************************************/
    public void addCertificateToEmployee(String id) {
        Employee employee = lists.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
        System.out.print("Certificate ID: ");
        int certificatedID = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Certificate Name: ");
        String certificateName = scanner.nextLine();

        System.out.print("Certificate Rank: ");
        String certificateRank = scanner.nextLine();

        System.out.print("Certificate Date: ");
        String certificatedDate = scanner.nextLine();

        Certificate certificate = new Certificate(certificatedID, certificateName, certificateRank, certificatedDate);
        employee.addCertificate(certificate);
    }

//    public void addCertificate(Certificate certificate) {
//        employee.getCertificates().add(certificate);
//    }
}
