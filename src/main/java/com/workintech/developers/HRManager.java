package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(long id, String name, double salary){
        super(id,name,salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }
    @Override
    public void work(){
        setSalary(getSalary() * 1.2);
        System.out.println(getName() + " " + getSalary() + " maaşla HR Manager Pozisyonunda Çalışmaya Başladı.");
    }
    public void addEmployee(JuniorDeveloper juniorDeveloper, int index){
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Lütfen 0 ve " + (juniorDevelopers.length - 1) +" arası bir index numarası giriniz.");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("Bu index numarası " + juniorDevelopers[index].getName() +" tarafından kullanılıyor.");
        } else {
            juniorDevelopers[index] = juniorDeveloper;
            System.out.println(juniorDeveloper.getName() + index + " index numarası ile kaydedildi");
        }
    }
    public void addEmployee(MidDeveloper midDeveloper, int index){
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Lütfen 0 ve " + (midDevelopers.length - 1) +" arası bir index numarası giriniz.");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("Bu index numarası " + midDevelopers[index].getName() +" tarafından kullanılıyor.");
        } else {
            midDevelopers[index] = midDeveloper;
            System.out.println(midDeveloper.getName() + index + " index numarası ile kaydedildi");
        }
    }
    public void addEmployee(SeniorDeveloper seniorDeveloper, int index){
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Lütfen 0 ve " + (seniorDevelopers.length - 1) +" arası bir index numarası giriniz.");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("Bu index numarası " + seniorDevelopers[index].getName() +" tarafından kullanılıyor.");
        } else {
            seniorDevelopers[index] = seniorDeveloper;
            System.out.println(seniorDeveloper.getName() + index + " index numarası ile kaydedildi");
        }
    }
}
