import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Employee> res = createTree();
        findCommonManager(res.get(0), res.get(1), res.get(2));
        findCommonManager(res.get(0), res.get(1), res.get(3));
        findCommonManager(res.get(0), res.get(1), res.get(4));
    }

    private static void findCommonManager(Employee mgr, Employee employee1, Employee employee2) {
        Employee emp = findManager(mgr, employee1, employee2, new HashMap<String, Boolean>());
        System.out.println("Found him, he is :" + emp.getId());
    }

    // Logic
    private static Employee findManager(Employee mgr, Employee employee1, Employee employee2, HashMap<String, Boolean> mem) {
        Employee result = null;
        if (hasChild(mgr, employee1, mem) && hasChild(mgr, employee2, mem)) {
            result = mgr;
        }
        for (Employee m : mgr.getReports()) {
            Employee newMgr = findManager(m, employee1, employee2, mem);
            if (newMgr != null) {
                result = newMgr;
            }
        }

        return result;
    }

    private static boolean hasChild(Employee mgr, Employee employee, HashMap<String, Boolean> mem) {
        String key = mgr.getId() + employee.getId();
        if (mem.containsKey(key)) {
            return mem.get(key);
        }
        if (mgr.getChild(employee.getId()) != null) {
            mem.put(key, true);

            return true;
        } else {
            for (Employee m : mgr.getReports()) {
                if (hasChild(m, employee, mem)) {
                    mem.put(key, true);

                    return true;
                }
            }
        }
        mem.put(key, false);

        return false;
    }


    // Test Helper
    private static class Employee {
        public String id;
        private List<Employee> reports;

        public Employee(String id) {
            this.id = id;
            reports = new ArrayList<>();
        }

        public List<Employee> getReports() {
            return reports;
        }

        public String getId() {
            return id;
        }

        public Employee getChild(String childName) {
            for (Employee emp : reports) {
                if (emp.id.equals(childName)) {
                    return emp;
                }
            }

            return null;
        }
    }

    private static List<Employee> createTree() {
        List<Employee> results = new ArrayList<>();
        Employee ceo = new Employee("ceo");
        createChildren(ceo, "a", 4);
        Employee a1 = ceo.getChild("a1");
            createChildren(a1, "b1", 6);
                Employee b11 = a1.getChild("b11");
                    createChildren(b11, "c11", 2);
                        Employee c111 = b11.getChild("c111");
                        Employee c112 = b11.getChild("c112");

                Employee b12 = a1.getChild("b12");
                    createChildren(b12, "c21", 5);
                        Employee c215 = b12.getChild("c215");

        Employee a2 = ceo.getChild("a2");
            createChildren(a2, "b2", 1);
                Employee b21 = a2.getChild("b21");

        Employee a3 = ceo.getChild("a3");
            createChildren(a3, "b3", 2);

        Employee a4 = ceo.getChild("a4");
            createChildren(a4, "b4", 1);

        results.add(ceo);
        results.add(c111);
        results.add(c112);
        results.add(c215);
        results.add(b21);

        return results;
    }

    private static void createChildren(Employee emp, String prefix, int count) {
        for (int i = 1; i <= count; i++) {
            emp.getReports().add(new Employee(prefix + i));
        }
    }
}
