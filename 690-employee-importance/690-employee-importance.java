/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer,Employee> map;
    public int getImportance(List<Employee> employees, int id)
    {
         map= new HashMap<>();
        for(Employee e:employees)
        {
            map.put(e.id,e);
        }
        return importances(id);
    }
    public int importances(int id)
    {
        Employee e= map.get(id);
        int totalImp=e.importance;
        for(int i:e.subordinates)
        {
           totalImp+= importances(i);
        }
        
        return totalImp;
    }
}