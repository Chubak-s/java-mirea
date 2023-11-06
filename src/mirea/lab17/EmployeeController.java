package mirea.lab17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public String getId() {
        return model.getId();
    }
    public void setId(String id) {
        model.setId(id);
    }
    public String getName() {
        return model.getName();
    }
    public void setName(String name) {
        model.setName(name);
    }
    public String getProfession() {
        return model.getProfession();
    }
    public void setProfession(String profession) {
        model.setProfession(profession);
    }
    public int getSalary() {
        return model.getSalary();
    }
    public void setSalary(int salary) {
        model.setSalary(salary);
    }
    public void updateView(){
        view.printEmployeeDetails(model.getName(),
                model.getId(), model.getProfession(), model.getSalary());
    }
}